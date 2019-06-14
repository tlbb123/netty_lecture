package com.tllt.netty.ProtobufTest.Client;

import com.tllt.netty.ProtobufTest.DataInfo;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class TestClientHandler extends SimpleChannelInboundHandler<DataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randomInt=new Random().nextInt(3);
        DataInfo.MyMessage message=null;
        switch (randomInt){
            case 0:message=DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.StudentType)
                    .setStudent(DataInfo.Student.newBuilder()
                            .setName("tllt").setAge(21).setAddress("cq").build())
                    .build();break;
            case 1:message=DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.DogType)
                    .setDog(DataInfo.Dog.newBuilder()
                            .setName("pz").setAge(21).build())
                    .build();break;

            case 2:message=DataInfo.MyMessage.newBuilder()
                    .setDataType(DataInfo.MyMessage.DataType.CatType)
                    .setCat(DataInfo.Cat.newBuilder()
                            .setName("ppx").setCity("yn").build())
                    .build();break;
        }
        ctx.channel().writeAndFlush(message);
    }

}
