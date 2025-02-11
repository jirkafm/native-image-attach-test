package com.github.jirkafm;

import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException, AttachNotSupportedException {
        System.out.println("Attaching to: " + args[0]);
        VirtualMachine vm = VirtualMachine.attach(args[0]);
        Properties properties = vm.getSystemProperties();
        System.out.println("Props: " + properties);

        try {
            Class<?> clazz = Class.forName("sun.tools.attach.HotSpotVirtualMachine");
            System.out.println("Available: " + clazz.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}