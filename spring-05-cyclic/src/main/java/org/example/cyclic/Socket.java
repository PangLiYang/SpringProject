package org.example.cyclic;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Socket {
    @Resource
    private Pin pin;

//    @Autowired
//    @Lazy
//    public Socket(Pin pin) {
//        this.pin = pin;
//    }

    public Pin getPin() {
        return pin;
    }
}
