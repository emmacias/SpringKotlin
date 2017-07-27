package com.example.demo

import org.springframework.stereotype.Service

/**
 * Created by josediaz on 7/27/17.
 */

@Service
class HelloService{

    fun getHello(): String {
        return "hello service"
    }
}