package com.start.common.oauth;

import org.springframework.util.MultiValueMap;

public interface OAuthLoginParams {
    OAuthProvider oAuthProvider();
    MultiValueMap<String, String> makeBody();
}
