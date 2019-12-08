package com.mock.generics.processor;

import com.mock.generics.model.CreateRecordRequest;
import com.mock.generics.model.GenericResponseForAllRequest;
import com.mock.generics.model.RequestType;

public class CreateRecordProcessor implements ApplicationRequestProcessor<CreateRecordRequest>
{
    private static final RequestType requestName = RequestType.CREATE_RECORD;

    @Override
    public RequestType getRequestName()
    {
        return CreateRecordProcessor.requestName;
    }

    @Override
    public GenericResponseForAllRequest processRequest( CreateRecordRequest createRecordRequest )
    {
        //Create record logic goes here
        System.out.println( "create record logic " );
        return null;
    }

    @Override
    public Class<CreateRecordRequest> getRequestType()
    {
        return CreateRecordRequest.class;
    }
}
