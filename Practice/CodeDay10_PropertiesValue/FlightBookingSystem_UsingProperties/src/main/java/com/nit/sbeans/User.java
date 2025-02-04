package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("${user.id}")
    int userId;
    @Value("${user.name}")
    String userName;
    @Autowired
    Address address;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", address city=" + address+
                '}';
    }
}
