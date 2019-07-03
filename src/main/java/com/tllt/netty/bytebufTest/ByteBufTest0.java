package com.tllt.netty.bytebufTest;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class ByteBufTest0 {
    public static void main(String[] args) {
        ByteBuf byteBuf= Unpooled.buffer(10);

        for(int i=0;i<10;i++)
            byteBuf.writeByte(i);

        System.out.println(byteBuf.bytesBefore((byte) 4));
    }
}
