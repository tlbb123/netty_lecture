package com.tllt.netty.handler.Util;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

public class MyLongToStringDecoder extends MessageToMessageDecoder<Long> {
    @Override
    protected void decode(ChannelHandlerContext ctx, Long msg, List<Object> out) throws Exception {
        System.out.println("LongToString is invoke");
        out.add(String.valueOf(msg));
    }
}
