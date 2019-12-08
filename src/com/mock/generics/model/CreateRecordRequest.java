package com.mock.generics.model;

public class CreateRecordRequest
{
    private int recordId;
    private String recordName;

    public CreateRecordRequest( int recordId, String recordName )
    {
        this.recordId = recordId;
        this.recordName = recordName;
    }

    public int getRecordId()
    {
        return recordId;
    }

    public String getRecordName()
    {
        return recordName;
    }

}
