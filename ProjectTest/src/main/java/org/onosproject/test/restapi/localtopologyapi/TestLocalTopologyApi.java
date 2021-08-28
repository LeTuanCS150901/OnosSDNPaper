package org.onosproject.test.restapi.localtopologyapi;

import org.onlab.rest.BaseResource;

import org.json.JSONArray;
import org.json.JSONObject;

import org.onosproject.test.handledata.HandleData;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

/**
 * Test Local Topology API.
 */
@Path("localTopology")
public class TestLocalTopologyApi extends BaseResource {

    /**
     * Test Api.
     *
     * @return response code OK
     */
    @GET
    @Path("exampleAPI")
    @Produces(MediaType.APPLICATION_JSON)
    public Response exampleApi() {
        TestLocalTopologyApiService service = get(TestLocalTopologyApiService.class);
        return Response.ok(service.exampleApi().toString()).build();
    }

    /**
     * Get list of Devices on local topology.
     *
     * @return response code OK
     */
    @GET
    @Path("getDevices")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDevices() {
        TestLocalTopologyApiService service = get(TestLocalTopologyApiService.class);
        return Response.ok(service.getDevices().toString()).build();
    }

    /**
     * Get list of Ports on local topology.
     *
     * @return response code OK
     */
    @GET
    @Path("getPorts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPorts() {
        TestLocalTopologyApiService service = get(TestLocalTopologyApiService.class);
        return Response.ok(service.getPorts().toString()).build();
    }

    /**
     * Get list of Hosts on local topology.
     *
     * @return response code OK
     */
    @GET
    @Path("getHosts")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHosts() {
        TestLocalTopologyApiService service = get(TestLocalTopologyApiService.class);
        return Response.ok(service.getHosts().toString()).build();
    }

    /**
     * Get list of Links on local topology.
     *
     * @return response code OK
     */
    @GET
    @Path("getLinks")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getLinks() {
        TestLocalTopologyApiService service = get(TestLocalTopologyApiService.class);
        return Response.ok(service.getLinks().toString()).build();
    }

    /**
     * get topo.
     * 
     * @return response code OK
     */
    @GET
    @Path("get-topo")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTopo() {

        HandleData ha = new HandleData();
        ha.getTopo();

        JSONObject jsonDevice = new JSONObject();
        jsonDevice.put("msg", "ok");
        return Response.ok(jsonDevice.toString()).build();
    }

    /**
     * write topo.
     * 
     * @return response code OK
     */
    @GET
    @Path("set-Routing")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response setRouting(@QueryParam("src") String src, @QueryParam("dst") String dst) {

        TestLocalTopologyApiService service = get(TestLocalTopologyApiService.class);
        return Response.ok(service.setRouting(src, dst).toString()).build();
    }

}
