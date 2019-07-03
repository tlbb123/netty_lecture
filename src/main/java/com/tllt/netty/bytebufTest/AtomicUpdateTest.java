package com.tllt.netty.bytebufTest;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.IntStream;

public class AtomicUpdateTest {
    public static void main(String[] args) {
        Person person=new Person();
        AtomicIntegerFieldUpdater<Person> atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater
                .newUpdater(Person.class, "age");
        IntStream.rangeClosed(0,10).forEach(i-> new Thread(()->{
                    try {
                        Thread.sleep(20);
                        System.out.println(atomicIntegerFieldUpdater.getAndIncrement(person));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }).start()

        );
    }
}

class Person {
    volatile int age = 1;
}
