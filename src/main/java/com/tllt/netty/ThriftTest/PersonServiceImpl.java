package com.tllt.netty.ThriftTest;

import org.apache.thrift.TException;
import thrift.generated.DataException;
import thrift.generated.Person;
import thrift.generated.PersonService;

public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPerson(String username) throws DataException, TException {
        System.out.println("get client param: "+username);
        Person person=new Person().setUsername(username).setAge(20).setMarried(false);
        return person;
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println("get client param");
        System.out.println(person);
    }
}
