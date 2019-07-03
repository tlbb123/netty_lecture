package com.tllt.netty.handler2;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.nio.charset.Charset;
import java.util.UUID;

public class MyServerHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private int count;
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        byte[] buffer=new byte[msg.readableBytes()];
        msg.readBytes(buffer);
        String message=new String(buffer, Charset.defaultCharset());
        System.out.println("服务器接受到的消息: "+message);
        System.out.println("服务端接受的消息数量 "+(++this.count));

        ByteBuf byteBuf= Unpooled.copiedBuffer(UUID.randomUUID().toString(),Charset.defaultCharset());
        ctx.writeAndFlush(byteBuf);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
