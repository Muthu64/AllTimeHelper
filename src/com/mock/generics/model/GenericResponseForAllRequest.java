package com.mock.generics.model;

public class GenericResponseForAllRequest
{
    private String id;
    private Object Response;

    public GenericResponseForAllRequest( String id, Object response )
    {
        this.id = id;
        Response = response;
    }

    public String getId()
    {
        return id;
    }

    public Object getResponse()
    {
        return Response;
    }
}
