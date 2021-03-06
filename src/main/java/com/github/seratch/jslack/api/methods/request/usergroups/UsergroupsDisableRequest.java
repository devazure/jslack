package com.github.seratch.jslack.api.methods.request.usergroups;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsergroupsDisableRequest {

    private String token;
    private String usergroup;
    private Integer includeCount;
}