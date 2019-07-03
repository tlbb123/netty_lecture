package com.tllt.netty.bytebufTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.Charset;

public class ByteBufTest1 {
    public static void main(String[] args) {
        ByteBuf byteBuf= Unpooled.copiedBuffer("唐hello world", Charset.forName("utf-8"));
        if(byteBuf.hasArray()){
            System.out.println(byteBuf.toString(Charset.forName("utf-8")));
        }
        System.out.println(byteBuf.arrayOffset());
        System.out.println(byteBuf.readerIndex());
        System.out.println(byteBuf.writerIndex());
        System.out.println(byteBuf.capacity());

        System.out.println(byteBuf.readableBytes());


        for(int i=0;i<byteBuf.readableBytes();i++)
            System.out.println((char) byteBuf.getByte(i));

        System.out.println(byteBuf.getCharSequence(0,4 ,Charset.forName("utf-8")));

        System.out.println(byteBuf.getCharSequence(4,6,Charset.forName("utf-8")));
    }
}
