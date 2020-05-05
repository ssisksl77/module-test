package main;

import member.Member;

public class PortMain {
    public static void hi () {
        System.out.println("Hi This is Port Main");
        System.out.println("My Name = " + new Member().getMyName());
    }
}
