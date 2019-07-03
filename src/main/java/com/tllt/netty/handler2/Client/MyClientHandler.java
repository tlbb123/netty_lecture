package com.tllt.netty.handler2.Client;

import com.tllt.netty.handler2.Util.PersonProtocol;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.nio.charset.StandardCharsets;

public class MyClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    private int count;
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        for(int i=0;i<10;i++){
           String messageToBeSend="send from message";
           byte[] content=messageToBeSend.getBytes(StandardCharsets.UTF_8);
           int length=content.length;
           PersonProtocol personProtocol=new PersonProtocol();
           personProtocol.setLength(length);
           personProtocol.setContent(content);
           ctx.writeAndFlush(personProtocol);
        }
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        byte[] bytes=new byte[msg.readableBytes()];
        msg.readBytes(bytes);
        String message=new String(bytes,CharsetUtil.UTF_8);
        System.out.println(message);
    }

//    @Override
//    protected void channelRead0(ChannelHandlerContext ctx, PersonProtocol msg) throws Exception {
//        int length=msg.getLength();
//        byte[] content=msg.getContent();
//        System.out.println("客户端接受的消息 :");
//        System.out.println("长度: "+length);
//        System.out.println("内容: "+new String(content,CharsetUtil.UTF_8));
//        System.out.println("客户端接受到的消息数量 :"+(++this.count));
//    }
}
