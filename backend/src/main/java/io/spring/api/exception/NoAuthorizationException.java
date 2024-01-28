package io.spring.api.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(code = HttpStatusCode.FORBIDDEN)
public class NoAuthorizationException extends RuntimeException {}
