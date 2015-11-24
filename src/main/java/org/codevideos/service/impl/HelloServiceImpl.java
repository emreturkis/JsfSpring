package org.codevideos.service.impl;

import org.springframework.stereotype.Service;
import org.codevideos.service.api.HelloService;

/**
 * Created by eturkis on 11/24/2015.
 */
@Service
public class HelloServiceImpl implements HelloService {
    public String getString() {
        return "String";
    }
}
