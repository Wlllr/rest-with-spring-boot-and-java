package com.github.wlllr.exceptions;

import java.util.Date;

public record ExceptionReponse(Date timestamp, String message, String details) {}