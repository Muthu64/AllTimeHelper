package com.mock.generics.model;

public class ModifyRecordRequest
{
    private int recordId;

    private String recordName;

    private String modifiedRecord;

    public ModifyRecordRequest( int recordId, String recordName, String modifiedRecord )
    {
        this.recordId = recordId;
        this.recordName = recordName;
        this.modifiedRecord = modifiedRecord;
    }

    public int getRecordId()
    {
        return recordId;
    }

    public String getRecordName()
    {
        return recordName;
    }

    public String getModifiedRecord()
    {
        return modifiedRecord;
    }

}
