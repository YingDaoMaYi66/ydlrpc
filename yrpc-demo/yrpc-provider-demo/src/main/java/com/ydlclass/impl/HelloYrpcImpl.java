package com.ydlclass.impl;

import com.ydlclass.HelloYrpc;

public class HelloYrpcImpl implements HelloYrpc {
    @Override
    public String sayHi(String msg) {
        return "Hi consumer:" + msg;
    }
}
