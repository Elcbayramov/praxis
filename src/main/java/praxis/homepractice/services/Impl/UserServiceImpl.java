package praxis.homepractice.services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import praxis.homepractice.model.User;
import praxis.homepractice.services.UserService;

import java.util.List;
import java.util.Objects;

public class UserServiceImpl implements UserService {

    private List<User> users;

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(String userName) {
        return users.stream().filter(u -> Objects.equals(userName, u.getUsername()))
                .findFirst()
                .orElse(null);
    }


    @Override
    public void saveUser(User user) {
        if (checkExist(user.getUsername()))
            return;

        users.add(user);

    }


    @Override
    public void deleteUser(User user) {
        users.removeIf(u ->
                Objects.equals(u.getUsername(), user.getUsername())
                        && Objects.equals(u.getPassword(), user.getPassword())
                        && Objects.equals(u.getEmail(), user.getEmail())
        );

    }


        @Override
        public void updateUser (User user){
            for (int i = 0; i < users.size(); i++) {
                User u = users.get(i);
                if (Objects.equals(user.getUsername(), u.getUsername())) {
                    u.setPassword(user.getPassword());
                    u.setEmail(user.getEmail());

                }
                
            }

        }

        /**
         * True if username exists in list of users
         * Else false
         *
         * @param username
         * @return exist or not
         */
        private boolean checkExist (String username){
//        for (User user : users) {
//            if(Objects.equals(username, user.getUsername())) {
//                return true;
//            }
//        }
//        return false;


            return users
                    .stream()
                    .anyMatch(u -> Objects.equals(username, u.getUsername()));
        }

        @Autowired
        public void setUsers (List < User > users) {
            this.users = users;
        }
    }
