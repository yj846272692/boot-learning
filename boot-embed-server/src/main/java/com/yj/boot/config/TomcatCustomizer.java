package com.yj.boot.config;


import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: YG.
 * @Description:
 * @Date: create in 2022/4/8
 */
//@Configuration
public class TomcatCustomizer {
    @Bean
    public ConfigurableServletWebServerFactory configurableServletWebServerFactory() {
        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
        factory.addConnectorCustomizers(new MyTomcatConnectionCustomizer());
        return factory;
    }

    static class MyTomcatConnectionCustomizer implements TomcatConnectorCustomizer {
        public MyTomcatConnectionCustomizer() {

        }

        @Override
        public void customize(Connector connector) {
            connector.setPort(Integer.parseInt("8889"));
            connector.setProperty("maxConnections", "8192");
            connector.setProperty("acceptorThreadCount", "100");
            connector.setProperty("minSpareThreads", "10");
            connector.setProperty("maxThreads", "200");
        }


    }
}
