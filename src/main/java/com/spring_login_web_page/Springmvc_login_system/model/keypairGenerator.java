package com.spring_login_web_page.Springmvc_login_system.model;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import static jdk.internal.misc.OSEnvironment.initialize;

public class keypairGenerator {
    public static void getKeypairgenerator(){
        KeyPair keyPair;


        try{
            KeyPairGenerator keyPairgenerate.initialize(2048);
            keyPair = keyPairgenerate.generateKeyPair();
        }
        catch(Exception e){
           throw  new IllegalStateException();
//           e.printStackTrace();
        }
        return keypairGenerator;
    }
}
