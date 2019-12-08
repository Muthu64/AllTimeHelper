package com.mock.generics.Factory;

import com.mock.generics.model.RequestType;
import com.mock.generics.processor.ApplicationRequestProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationRequestProcessorFactory
{
    Map<RequestType, ApplicationRequestProcessor> applicationRequestProcessorMap = new HashMap<>();

    public ApplicationRequestProcessorFactory( List<ApplicationRequestProcessor> applicationRequestProcessorList )
    {
        applicationRequestProcessorList.stream().forEach( requestProcessor -> applicationRequestProcessorMap.put( requestProcessor.getRequestName(), requestProcessor ) );
    }

    public ApplicationRequestProcessor getApplicationRequestProcessor( RequestType requestType )
    {
        return applicationRequestProcessorMap.get( requestType );
    }
}
