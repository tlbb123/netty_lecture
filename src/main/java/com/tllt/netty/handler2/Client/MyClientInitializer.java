package com.tllt.netty.handler2.Client;


import com.tllt.netty.handler2.Util.MyPersonDecoder;
import com.tllt.netty.handler2.Util.MyPersonEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

public class MyClientInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline=ch.pipeline();
        //pipeline.addLast(new MyPersonDecoder());
        pipeline.addLast(new MyPersonEncoder());
        pipeline.addLast("MyLengthFieldFrameDecoder",new LengthFieldBasedFrameDecoder(4096,0,4,0,4));
        pipeline.addLast(new MyClientHandler());
    }

}
