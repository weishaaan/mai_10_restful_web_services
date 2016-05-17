package com.mycompany.restfulwebservices;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
 
@Path("home")
public class Resource {
    /* (1)if we input this website: http://localhost:2222/home/hello
       we will get "Hello, world!".

    @GET
    @Path("hello")
    @Produces(MediaType.TEXT_PLAIN)
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
    */
    
    /* (3)There is another way to get values from the URI-path is to use the annotation @PathParam.
    we input this website for this methode: http://localhost:2222/home/path/Me
    
    @GET
    @Path(“path/{var}”)
    @Produces(MediaType.TEXT_PLAIN)
    public String pathMethod(@PathParam(“var”) String name) {
        return “Hello, “ + name;     
    }
    */
    
    /* we need to first run, and open index.html to realize this fonction
    this part of codes corresponds to the first <form> part of index.html .
    @POST
    @Path("post")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public String postMethod(@FormParam("name") String name) {
        return "<h2>" + name + "</h2>";
    }  
    */
    
    
    
    
    
 }

