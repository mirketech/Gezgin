package com.mirketech.gezgin.comm;

/**
 * Created by yasin.avci on 22.4.2016.
 */
public class GResponse {


    public enum RequestTypes {
        Direction,
        Places_Autocomplete,
        Places_GetDetails,
        Places_NearbySearch
    }


    public enum ResponseStatus {
        Success,
        Error,
        Log,
        SuccessfullyCompleted
    }


    public Object Data;
    public RequestTypes RequestType;
    public ResponseStatus Status;

    public GResponse(RequestTypes _type, Object _data, ResponseStatus _status) {
        RequestType = _type;
        Data = _data;
        Status = _status;
    }


}
