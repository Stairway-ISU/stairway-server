package com.start.common.oauth;

import com.start.common.oauth.kakao.KakaoTokenResponse;

public interface OAuthApiClient {
    OAuthProvider oAuthProvider();
    KakaoTokenResponse requestAccessToken(OAuthLoginParams params);
    OAuthInfoResponse requestOauthInfo(String accessToken);
}
