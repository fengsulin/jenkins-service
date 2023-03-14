package com.example.jenkins.api;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


/**
 * @author: FSL
 * @date: 2023/3/14
 * @description: TODO
 */
@Path("/hello")
public class HelloService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(){
        return "hello jersey";
    }
}
