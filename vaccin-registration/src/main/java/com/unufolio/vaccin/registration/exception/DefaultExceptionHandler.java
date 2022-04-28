package com.unufolio.vaccin.registration.exception;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author yeke yeke@healthych.com
 * @since 2022/04/26
 */
@Provider
public class DefaultExceptionHandler implements ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {

        String msg = "";

        switch (exception) {
            case BadRequestException e -> msg = "b" + exception.getMessage();
        }


        String msg = "XException: " + exception.getMessage();
        return Response.status(Response.Status.BAD_REQUEST).entity(msg).build();
    }

}
