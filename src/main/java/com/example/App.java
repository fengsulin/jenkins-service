package com.example;

import com.example.bind.WebServerModule;
import com.example.jenkins.config.JettyServer;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App {

    private static Injector injector;

    public static void main(String[] args) throws Exception {
        injector = Guice.createInjector(new WebServerModule());
        JettyServer instance = injector.getInstance(JettyServer.class);
        instance.start();
    }

}