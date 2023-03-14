package com.example.jenkins.config;

import com.example.jenkins.api.HelloService;
import jakarta.ws.rs.core.UriBuilder;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

/**
 * @author: FSL
 * @date: 2023/3/14
 * @description: TODO
 */
public class JettyServer {

    public static void start() throws Exception {
        URI build = UriBuilder.fromUri("http://localhost/").port(8080).build();
        ResourceConfig config = new ResourceConfig(HelloService.class);
        Server server = JettyHttpContainerFactory.createServer(build, config);
        server.start();
    }
}
