package com.example.bind;

import com.example.jenkins.config.JettyServer;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import org.eclipse.jetty.server.Server;

/**
 * @author: FSL
 * @date: 2023/3/14
 * @description: TODO
 */
public class WebServerModule extends AbstractModule {
    private Server jetty;

    public WebServerModule() throws Exception {
        this.jetty = new Server();
    }

    @Override
    protected void configure() {
        bind(Server.class).in(Scopes.SINGLETON);
        bind(JettyServer.class).in(Scopes.SINGLETON);
    }
}