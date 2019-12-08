package com.mock.generics;

import com.mock.generics.Factory.ApplicationRequestProcessorFactory;
import com.mock.generics.model.CreateRecordRequest;
import com.mock.generics.model.GenericResponseForAllRequest;
import com.mock.generics.model.ModifyRecordRequest;
import com.mock.generics.model.RequestType;
import com.mock.generics.processor.ApplicationRequestProcessor;
import com.mock.generics.processor.CreateRecordProcessor;
import com.mock.generics.processor.ModifyRecordProcessor;

import java.util.ArrayList;
import java.util.List;

public class MainClassToTestGenerics
{
    private static ApplicationRequestProcessorFactory applicationRequestProcessorFactory;

    public static void main( String[] args )
    {
        MainClassToTestGenerics mainClassToTestGenerics = new MainClassToTestGenerics();
        applicationRequestProcessorFactory = mainClassToTestGenerics.initializeProcessorMap();

        CreateRecordRequest createRecordRequest = new CreateRecordRequest( 1, "Database Management System" );
        ModifyRecordRequest modifyRecordRequest = new ModifyRecordRequest( 1, "Database Management System", "modified String" );

        mainClassToTestGenerics.createRecord( createRecordRequest );
        mainClassToTestGenerics.modifyRequest( modifyRecordRequest );

        //ApplicationRequestProcessor applicationRequestProcessor = new CreateRecordProcessor();
        //applicationRequestProcessor.processRequest( modifyRecordRequest );
    }

    public GenericResponseForAllRequest createRecord( CreateRecordRequest createRecordRequest )
    {
        ApplicationRequestProcessor applicationRequestProcessor = applicationRequestProcessorFactory.getApplicationRequestProcessor( RequestType.CREATE_RECORD );
        applicationRequestProcessor.processRequest( createRecordRequest );
        return null;
    }

    public GenericResponseForAllRequest modifyRequest( ModifyRecordRequest modifyRecordRequest )
    {
        ApplicationRequestProcessor applicationRequestProcessor = applicationRequestProcessorFactory.getApplicationRequestProcessor( RequestType.MODIFY_RECORD );
        applicationRequestProcessor.processRequest( modifyRecordRequest );
        return null;
    }

    private ApplicationRequestProcessorFactory initializeProcessorMap()
    {
        List<ApplicationRequestProcessor> applicationRequestProcessors = new ArrayList<>();
        applicationRequestProcessors.add( new CreateRecordProcessor() );
        applicationRequestProcessors.add( new ModifyRecordProcessor() );

        ApplicationRequestProcessorFactory applicationRequestProcessorFactory = new ApplicationRequestProcessorFactory( applicationRequestProcessors );
        return applicationRequestProcessorFactory;

    }
}
