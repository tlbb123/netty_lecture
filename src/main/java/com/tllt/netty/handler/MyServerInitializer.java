package com.tllt.netty.handler;
import com.tllt.netty.handler.Util.MyByteToLongDecoder;
import com.tllt.netty.handler.Util.MyByteToLongDecoder2;
import com.tllt.netty.handler.Util.MyLongToByteEncoder;
import com.tllt.netty.handler.Util.MyLongToStringDecoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class MyServerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline=ch.pipeline();
        pipeline.addLast(new MyByteToLongDecoder2());
        pipeline.addLast(new MyLongToByteEncoder());
        pipeline.addLast(new MyLongToStringDecoder());
        pipeline.addLast(new MyServerHandler());
    }
}
