package com.tllt.netty.ThriftTest;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class ThriftClient {
    public static void main(String[] args) {
        TTransport tTransport=new TFramedTransport(new TSocket("localhost",8899),600);
        TProtocol protocol =new TCompactProtocol(tTransport);
        PersonService.Client client=new PersonService.Client(protocol);
        try {
            tTransport.open();
            Person person=client.getPerson("tllt");
            System.out.println(person);
            System.out.println("----------");
            person.setUsername("ppx").setAge(22).setMarried(false);
            client.savePerson(person);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage(),e);
        }finally {
            tTransport.close();
        }
    }
}
