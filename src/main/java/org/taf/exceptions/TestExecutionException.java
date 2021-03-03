package org.taf.exceptions;

public class TestExecutionException extends RuntimeException {

    public TestExecutionException(final String message) {
        super(message);
    }

    public TestExecutionException(final Throwable cause) {
        super(cause);
    }
}
