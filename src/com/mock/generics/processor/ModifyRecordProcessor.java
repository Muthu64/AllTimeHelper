package com.mock.generics.processor;

import com.mock.generics.model.GenericResponseForAllRequest;
import com.mock.generics.model.ModifyRecordRequest;
import com.mock.generics.model.RequestType;

public class ModifyRecordProcessor implements ApplicationRequestProcessor<ModifyRecordRequest>
{
    private static final RequestType requestName = RequestType.MODIFY_RECORD;

    @Override
    public RequestType getRequestName()
    {
        return ModifyRecordProcessor.requestName;
    }

    @Override
    public GenericResponseForAllRequest processRequest( ModifyRecordRequest modifyRecordRequest )
    {
        //Modify record logic goes here
        System.out.println( "modify record logic " );
        return null;
    }

    @Override
    public Class<ModifyRecordRequest> getRequestType()
    {
        return ModifyRecordRequest.class;
    }

}
