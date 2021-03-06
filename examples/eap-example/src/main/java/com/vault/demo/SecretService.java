package com.vault.demo;


import com.vault.demo.config.Property;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class SecretService {

    @Inject
    @Property
    String password;


    public String secret() {
        return "My secret " + password + "!";
    }

}
