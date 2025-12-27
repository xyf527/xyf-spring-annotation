package com.xin.spring.annotation.springmvc.starter;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Server;
import org.apache.catalina.Service;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * @author XYF
 * @date 2025-12-27 13:57
 */

public class TomcatStarter {

    public static void start(int port) {
        try {
            Tomcat tomcat = new Tomcat();
            Server server = tomcat.getServer();
            Service service = tomcat.getService();
            Connector connector = new Connector();
            connector.setPort(port);
            service.addConnector(connector);
            String baseDir = System.getProperty("java.io.tmpdir");
            tomcat.setBaseDir(baseDir);

            System.out.println("Tomcat baseDir set to: " + baseDir);
            tomcat.addWebapp("/", baseDir);
            tomcat.start();
            server.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
