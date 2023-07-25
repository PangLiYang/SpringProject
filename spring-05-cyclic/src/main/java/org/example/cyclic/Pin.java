package org.example.cyclic;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Pin {
    @Resource
    private Socket socket;

//    @Autowired
//    @Lazy
//    public Pin(Socket socket) {
//        this.socket = socket;
//    }

    public void peek() {
        System.out.println(socket);
        System.out.println(socket.getPin());
        System.out.println(this);
        System.out.println(this.socket);
    }
}
