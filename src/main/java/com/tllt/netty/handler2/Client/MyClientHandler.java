package com.tllt.netty.handler2.Client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.nio.charset.Charset;

public class MyClientHandler extends SimpleChannelInboundHandler<ByteBuf> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        byte[] buffer=new byte[msg.readableBytes()];
        msg.readBytes(buffer);
        String message=new String(buffer, Charset.defaultCharset());
        System.out.println("客户端收到的："+message);

    }
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for(int i=0;i<10;i++){
            ByteBuf byteBuf= Unpooled.copiedBuffer("sernd for client", CharsetUtil.UTF_8);
            ctx.writeAndFlush(byteBuf);
        }
    }
}
