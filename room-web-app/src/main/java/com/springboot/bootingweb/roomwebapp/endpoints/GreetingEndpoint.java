package com.springboot.bootingweb.roomwebapp.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

/**
 * @author Mohammed Amr
 * @created 01/06/2021 - 10:06
 * @project booting-web
 */

@Component
@Endpoint(id = "greeting")
public class GreetingEndpoint {

    @ReadOperation
    public String getGreeting() {
        return "Hello from actuator!";
    }
}
