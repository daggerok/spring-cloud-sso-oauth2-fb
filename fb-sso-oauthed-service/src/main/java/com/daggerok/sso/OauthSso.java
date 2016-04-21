package com.daggerok.sso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@EnableOAuth2Sso
@SpringCloudApplication
public class OauthSso {

    @Autowired
    private ResourceServerProperties resourceServerProperties;

    @Autowired
    private OAuth2RestTemplate oauth2RestTemplate;

    @RequestMapping("/")
    public Map<String, Object> index(Principal principal) throws IOException {
        return new LinkedHashMap<String, Object>() {{
            put("principal", principal);
            put("userInfoUri", resourceServerProperties.getUserInfoUri());
            put("resourceServerProperties", resourceServerProperties);
            put("token", oauth2RestTemplate.getOAuth2ClientContext().getAccessToken());
        }};
    }

    public static void main(String[] args) {
        SpringApplication.run(OauthSso.class, args);
    }
}
