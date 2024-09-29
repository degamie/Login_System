package com.spring_login_web_page.Springmvc_login_system.model;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

//import static jdk.internal.misc.OSEnvironment.initialize;

public class keypairGenerator {
    public Integer getKeypairgenerator(){
        KeyPair keyPair;


        try{
            KeyPairGenerator keyPairgenerate = null;
//            initialize();
            keyPair = keyPairgenerate.generateKeyPair();
        }
        catch(Exception e){
           throw  new IllegalStateException();
//         e.printStackTrace();
        }
        return null;
    }
}
