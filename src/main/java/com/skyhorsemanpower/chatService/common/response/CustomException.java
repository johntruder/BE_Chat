package com.skyhorsemanpower.chatService.common.response;

import com.skyhorsemanpower.chatService.common.response.ResponseStatus;

public class CustomException extends RuntimeException {
    private final ResponseStatus responseStatus;

    public CustomException(ResponseStatus responseStatus) {
        super(responseStatus.getMessage());
        this.responseStatus = responseStatus;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }
}
