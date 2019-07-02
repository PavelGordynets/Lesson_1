package com.Gord.homework.homework_6;

import javax.naming.ldap.LdapContext;

public class Avto {
    boolean pedalStart = false;


    Motor mot = new Motor(true);
    Transmission transmission = new Transmission();

    void pushPedal() {
        pedalStart = true;
        System.out.println("Педаль нажата");
    }


}

