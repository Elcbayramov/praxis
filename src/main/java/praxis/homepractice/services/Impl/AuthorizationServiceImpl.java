package praxis.homepractice.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import praxis.homepractice.model.User;
import praxis.homepractice.services.AuthorizationService;
import praxis.homepractice.services.UserService;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class AuthorizationServiceImpl implements AuthorizationService {



    @Autowired
    private Map<String, User> authenticatedUsers;

    @Autowired
    private UserService userService;

    @Override

    public String getToken(User user) {
        User search = userService.getUser(user.getUsername());

        if(Objects.nonNull(search) && Objects.equals(search.getPassword(), user.getPassword())){

            String key = UUID.randomUUID().toString();
            authenticatedUsers.put(key, search);
            return  key;
        }

        return "";
    }

    @Override
    public boolean isAuthorizad(String token) {
        return authenticatedUsers.containsKey(token);
    }

    @Override
    public User getAuthorizedUser(String token) {
        return authenticatedUsers.get(token);
    }
}
