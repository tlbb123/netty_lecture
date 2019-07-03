package com.tllt.netty.handler2;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class MyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        System.out.println("客户端连接");
        ChannelPipeline pipeline=ch.pipeline();
        pipeline.addLast(new MyServerHandler());
    }
}
