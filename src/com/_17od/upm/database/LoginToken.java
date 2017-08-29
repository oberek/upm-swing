package com._17od.upm.database;

import org.springframework.data.annotation.Id;

public class LoginToken {
	@Id
	String id;
	String username;
	String password;
	
    public LoginToken() {}

    public LoginToken(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format(
                "LoginToken[id=%s, firstName='%s', lastName='%s']",
                id, username, password);
    }
}
