
import org.eclipse.jetty.server.Server;

import org.eclipse.jetty.webapp.WebAppContext;

public class WebApplication
{

    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);

        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setResourceBase("webapp");
        webAppContext.setDescriptor("webapp/WEB-INF/web.xml");
        webAppContext.setContextPath("/");
        //server.setHandler(webAppContext);
        server.setHandler(new HelloWorld());

        server.start();
        server.join();
    }
}

