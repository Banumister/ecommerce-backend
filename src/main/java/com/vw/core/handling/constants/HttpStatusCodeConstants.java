package com.vw.core.handling.constants;

public class HttpStatusCodeConstants {


    // 2xx Success
    public static final Integer SUCCESS = 200;
    public static final Integer CREATED = 201;
    public static final Integer ACCEPTED = 202;
    public static final Integer NO_CONTENT = 204;

    // 4xx Client Errors
    public static final Integer BAD_REQUEST = 400;
    public static final Integer UNAUTHORIZED = 401;
    public static final Integer FORBIDDEN = 403;
    public static final Integer NOT_FOUND = 404;
    public static final Integer CONFLICT = 409;
    public static final Integer UNPROCESSABLE_ENTITY = 422;

    // 5xx Server Errors
    public static final Integer INTERNAL_SERVER_ERROR = 500;
    public static final Integer NOT_IMPLEMENTED = 501;
    public static final Integer SERVICE_UNAVAILABLE = 503;
}
