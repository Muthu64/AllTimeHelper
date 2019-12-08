package com.mock.generics.processor;

import com.mock.generics.model.GenericResponseForAllRequest;
import com.mock.generics.model.RequestType;

public interface ApplicationRequestProcessor<API_REQUEST>
{
    RequestType getRequestName();

    GenericResponseForAllRequest processRequest( API_REQUEST api_request );

    Class<API_REQUEST> getRequestType();
}
