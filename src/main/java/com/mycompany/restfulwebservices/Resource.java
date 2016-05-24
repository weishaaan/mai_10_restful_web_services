package com.mycompany.restfulwebservices;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import javax.activation.MimetypesFileTypeMap;
import javax.imageio.ImageIO;
import javax.management.monitor.Monitor;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import static javax.ws.rs.HttpMethod.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import static javax.ws.rs.client.Entity.json;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.StreamingOutput;
import org.eclipse.jetty.server.Request;
import static org.glassfish.jersey.server.model.Parameter.Source.PATH;

@Path("home")

public class Resource {
    /* (1)if we input this website: http://localhost:2222/home/hello
       we will get "Hello, world!".
    
    
    @GET
    @Path("hello")
    @Produces({MediaType.APPLICATION_JSON})
    public String helloWorld() {
       return "Hello, world!";
     }    
    */ 
    
    /*(2) if we input this website: http://localhost:2222/home/param?name=Me 
       we will get "Hello, Me".  
    
    @GET
    @Path("param")
    @Produces(MediaType.TEXT_PLAIN)
    public String paramMethod(@QueryParam("name") String name) {
        return "Hello, " + name;
    }
    */
    /* (3)There is another way to get values from the URI-path is to use the annotation @PathParam.
        we input this website for this methode: http://localhost:2222/home/path/Me
    
    @GET
    @Path("path/{var}")
    @Produces(MediaType.TEXT_PLAIN)
    public String pathMethod(@PathParam("var") String name) {
        return "Hello, " + name;     
    }
    */
  
    MessageService messageService = new MessageService();
    
    @GET
    @Produces(MediaType.APPLICATION_XML) //MediaType.APPLICATION_XML
    public List<Message> getMessages(){
        return messageService.getAllMessagges();
    }
    
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Message getMessage(@PathParam("messageId") long messageId){
        return messageService.getMessage(messageId);
    }
    
    /*
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public List<Message> addMessage(Message message){
        messageService.addMessage(message);
        return messageService.getAllMessagges();
    }
    */
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void create(final String a){
        System.out.println("author = " + a);
        //System.out.println("message = " + input.getMessage());
    }
    
    @PUT
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public Message updateMessage(@PathParam("messageId") long messageId,Message message){
        message.setId(messageId);
        return messageService.updateMessage(message);
    }
    
    @DELETE
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public Message delectMessage(@PathParam("messageId") long messageId){
        return messageService.removeMessage(messageId);
    }
}
    
    
 

