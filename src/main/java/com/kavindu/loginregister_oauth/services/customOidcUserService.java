package com.kavindu.loginregister_oauth.services;

import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserRequest;
import org.springframework.security.oauth2.client.oidc.userinfo.OidcUserService;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Service;

@Service
public class customOidcUserService extends OidcUserService {

    @Override
    public OidcUser loadUser(OidcUserRequest userRequest) throws OAuth2AuthenticationException {
        OidcUser oidcUser = super.loadUser(userRequest);

        String accessToken = userRequest.getAccessToken().getTokenValue();
        System.out.println(accessToken);

        String Email=oidcUser.getAttribute("Email");
        String name=oidcUser.getAttribute("name");

        saveUserToDatabase(Email,name);

        return oidcUser;
    }

    private void saveUserToDatabase(String email, String name) {
        System.out.println("Saving user to database"+email+" "+name);
    }
}
