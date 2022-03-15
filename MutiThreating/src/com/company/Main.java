package com.company;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < args.length; i++)
        {
            Runnable r = new MyRunnable(args[i],args[0]);
            //System.out.println(args[i]);
            Thread t = new Thread(r);
            t.start();
        }
    }
}
