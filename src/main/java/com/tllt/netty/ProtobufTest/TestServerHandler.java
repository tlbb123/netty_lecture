package com.tllt.netty.ProtobufTest;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyMessage msg) throws Exception {
        DataInfo.MyMessage.DataType dataType=msg.getDataType();
        switch (dataType){
            case StudentType:
                DataInfo.Student student=msg.getStudent();
                System.out.println(student);
                break;
            case DogType:
                DataInfo.Dog dog=msg.getDog();
                System.out.println(dog);
                break;
            case CatType:
                DataInfo.Cat cat=msg.getCat();
                System.out.println(cat);
                break;

        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
