package com.github.seratch.jslack.api.methods.request.team;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeamAccessLogsRequest {

    private String token;
    private Integer count;
    private Integer page;
}