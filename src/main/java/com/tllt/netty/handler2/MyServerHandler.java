package com.tllt.netty.handler2;

import com.tllt.netty.handler2.Util.PersonProtocol;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class MyServerHandler extends SimpleChannelInboundHandler<PersonProtocol> {

   private int count;

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, PersonProtocol msg) throws Exception {
        int length=msg.getLength();
        byte[] content=msg.getContent();
        System.out.println("服务器收到的消息: ");
        System.out.println("长度: "+length);
        System.out.println("内容: "+new String(content, CharsetUtil.UTF_8));
        System.out.println("服务器接受的数量 :"+(++count));

        String responseMessage=UUID.randomUUID().toString();

        byte[] responseContent=responseMessage.getBytes(StandardCharsets.UTF_8);
        int responseLength=responseContent.length;
        PersonProtocol personProtocol=new PersonProtocol();
        personProtocol.setLength(responseLength);
        personProtocol.setContent(responseContent);
        ctx.writeAndFlush(personProtocol);
     }
}
