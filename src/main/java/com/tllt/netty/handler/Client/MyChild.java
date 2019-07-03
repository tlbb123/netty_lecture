package com.tllt.netty.handler.Client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;


public class MyChild  {
    public static void main(String[] args) {
        EventLoopGroup workGroup=new NioEventLoopGroup();
        try {
            Bootstrap bootstrap=new Bootstrap();
            bootstrap.group(workGroup).handler(new MyInitializer()).channel(NioSocketChannel.class);
            ChannelFuture future=bootstrap.connect("localhost",8899).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workGroup.shutdownGracefully();
        }



    }
}
