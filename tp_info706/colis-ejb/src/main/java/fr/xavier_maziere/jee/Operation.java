package fr.xavier_maziere.jee;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

@Path("colis")
public interface Operation {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional 
    Colis creeColis(@QueryParam("poids") float poids,
                    @QueryParam("dest") String destination,
                    @QueryParam("orig") String origine,
                    @QueryParam("val") float valeur,
                    @QueryParam("long") double longitude,
                    @QueryParam("lat") double latitude);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    Colis getColis(@PathParam("id") long id);

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("update/{id}")
    Colis updatePositionColis(@PathParam("id") long id,
                              @QueryParam("long") double longitude,
                              @QueryParam("lat") double latitude,
                              @QueryParam("emp") String emplacement,
                              @QueryParam("etat") String etat);

    @DELETE
    @Path("delete/{id}")
    void deleteColis(@PathParam("id") long id);
}
