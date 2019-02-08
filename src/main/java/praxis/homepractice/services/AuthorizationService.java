package praxis.homepractice.services;

import praxis.homepractice.model.User;

public interface AuthorizationService {
        String getToken(User user);
        boolean isAuthorizad(String token);
        User getAuthorizedUser (String token);
}
