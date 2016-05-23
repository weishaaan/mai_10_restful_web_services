package com.mycompany.restfulwebservices;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;

/* the tutorial is on https://www.acando.no/thedailypassion/200555/a-rest-service-with-jetty-and-jersey
 this one example is different from project"restprj",pay attention to set 
the config.packages("HERE"). HERE should contain App.java and Resource.java.
In the pom.xml, pay attention to the dependency,not to cause "jar hell" situation.
*****10 May,2016********
*/
public class App {
    public static void main( String[] args ) throws Exception {
   
        ResourceConfig config = new ResourceConfig();
        config.packages("com.mycompany.restfulwebservices");
        ServletHolder servlet = new ServletHolder(new ServletContainer(config));


        Server server = new Server(3333);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");

        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
        
    }
}
