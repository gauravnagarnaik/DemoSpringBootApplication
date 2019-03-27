package com.firstdata.gcs.service;

import com.firstdata.gcs.model.Message;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class DemoService {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();



    public Message getMessage(String name) {
        return new Message(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
