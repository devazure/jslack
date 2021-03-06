package com.github.seratch.jslack.api.methods.response.rtm;

import com.github.seratch.jslack.api.methods.SlackApiResponse;
import lombok.Data;

@Data
public class RTMStartResponse implements SlackApiResponse {

    private boolean ok;
    private String warning;
    private String error;

    private String url;
}
