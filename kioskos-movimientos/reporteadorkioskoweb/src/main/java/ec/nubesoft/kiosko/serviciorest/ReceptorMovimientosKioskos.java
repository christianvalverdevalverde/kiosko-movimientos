/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.nubesoft.kiosko.serviciorest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.validation.Valid;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import reportemovimientokioskoutils.MovimientoBean;

/**
 * REST Web Service
 *
 * @author chrisvv
 */
@Path("movimientos")
@RequestScoped
public class ReceptorMovimientosKioskos {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ReceptorMovimientosKioskos
     */
    public ReceptorMovimientosKioskos() {
        
    }
    public Response registrarMovimiento(@Valid MovimientoBean movimiento ){
        
        return Response.ok().build();
    }
}

  

