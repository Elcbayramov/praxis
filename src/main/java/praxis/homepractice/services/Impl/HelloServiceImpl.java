package praxis.homepractice.services.Impl;

import praxis.homepractice.services.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String getMessage() {
        return "Hello, user. From service";
    }
}
