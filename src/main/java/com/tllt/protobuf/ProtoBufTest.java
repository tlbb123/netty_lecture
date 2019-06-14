package com.tllt.protobuf;

public class ProtoBufTest {
    public static void main(String[] args) throws  Exception {
        DataInfo.Student student=DataInfo.Student.newBuilder().setName("tllt")
                .setAge(20).setAddress("cq").build();
        byte[] studentByteArray=student.toByteArray();

        DataInfo.Student student1=DataInfo.Student.parseFrom(studentByteArray);
        System.out.println(student1);

    }
}
