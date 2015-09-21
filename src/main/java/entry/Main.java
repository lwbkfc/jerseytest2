package entry;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.net.URI;

/**
 * Created by lwb on 2015/9/20.
 */
public class Main {
    public static final String BASE_URI = "http://localhost:8080/myapp";

    public static HttpServer startServer(){
        final ResourceConfig rc = new ResourceConfig().packages("com.bl.resource");
        return GrizzlyHttpServerFactory.createHttpServer(URI.create(Main.BASE_URI),rc);
    }

    public static void main(String[] args) {
        final HttpServer server = Main.startServer();
    }
}






































