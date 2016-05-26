package com.mycompany.restfulwebservices;
import Model.Test_property;
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
    
    MessageService messageService = new MessageService();   
    Test_property r = new Test_property();  
    
    /* (1)if we input this website: http://localhost:2222/home/hello
       we will get "Hello, world!".  
    
    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld() {
       return "Hello, world!";
    }    
        
    (2) if we input this website: http://localhost:2222/home/param?name=Me 
       we will get "Hello, Me".  
    
    @GET
    @Path("param")
    @Produces(MediaType.TEXT_PLAIN)
    public String paramMethod(@QueryParam("name") String name) {
        return "Hello, " + name;
    }

    (3)There is another way to get values from the URI-path is to use the annotation @PathParam.
        we input this website for this methode: http://localhost:2222/home/path/Me
    
    @GET
    @Path("path/{var}")
    @Produces(MediaType.TEXT_PLAIN)
    public String pathMethod(@PathParam("var") String name) {
        return "Hello, " + name;     
    }

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
*/
    @POST
    @Path="message"
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    public List<Message> addMessage(Message message){
        messageService.addMessage(message);
        return messageService.getAllMessagges();
    }   
  /*  
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
    */
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String doGetBat(){            
        //r.createProperties();        
        String filepath = r.readProperties();
        //System.out.println(filepath);
        String result = r.runBatFile(filepath);                        
	return result + " ! it works!!! ";      
   }
    
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public void create(final String a){
        System.out.println("author = " + a);
        //System.out.println("message = " + input.getMessage());
    }


    @GET
    @Path("message")
    @Produces(MediaType.APPLICATION_XML) //MediaType.APPLICATION_XML
    public List<Message> getMessages(){
        return messageService.getAllMessagges();
    }
    
    @GET
    @Path("getTest")
    @Produces(MediaType.TEXT_PLAIN) //MediaType.APPLICATION_XML
    public String returnGetRequest(){
        return "12345";
    }
    
    @POST
    @Path("postTest")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String returnPostRequest(String str){
        return "$POST works, str is "+str;
    }
    
    
    
    
    
    
    
    
}
    
    
 

