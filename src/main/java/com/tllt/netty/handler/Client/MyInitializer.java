package com.tllt.netty.handler.Client;

import com.tllt.netty.handler.Util.MyByteToLongDecoder;
import com.tllt.netty.handler.Util.MyByteToLongDecoder2;
import com.tllt.netty.handler.Util.MyLongToByteEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class MyInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline=ch.pipeline();
        pipeline.addLast(new MyByteToLongDecoder2());
        pipeline.addLast(new MyLongToByteEncoder());
        pipeline.addLast(new MyHandler());
    }

}
