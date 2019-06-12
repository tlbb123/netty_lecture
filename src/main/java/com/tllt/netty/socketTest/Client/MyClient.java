package com.tllt.netty.socketTest.Client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class MyClient  {
    public static void main(String[] args) throws Exception {
        EventLoopGroup eventExecutors=new NioEventLoopGroup();
        try {
            Bootstrap bootstrap=new Bootstrap();
            bootstrap.group(eventExecutors)
                    .channel(NioSocketChannel.class)
                    .handler(new MyClientInitializer());

            Channel channel=bootstrap.connect("localhost",8899).sync().channel();

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in, Charset.forName("utf-8")));
            while (true){
                channel.writeAndFlush(br.readLine()+"\n");
            }


        }finally {
            eventExecutors.shutdownGracefully();
        }
    }
}
