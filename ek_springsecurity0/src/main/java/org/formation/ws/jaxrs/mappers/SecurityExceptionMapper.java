package org.formation.ws.jaxrs.mappers;

import java.nio.file.AccessDeniedException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class SecurityExceptionMapper implements ExceptionMapper<AccessDeniedException> {

	@Override
	public Response toResponse(AccessDeniedException exception) {
		return Response.status(Response.Status.FORBIDDEN).build();
	}

}
