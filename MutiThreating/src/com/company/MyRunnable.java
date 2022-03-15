package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MyRunnable implements Runnable {
    private String fileName;
    private String key;
    public MyRunnable(String arg,String key)
    {
        fileName = arg;
        this.key = key;
    }
    public void run(){
        try {
            File file = new File(fileName);
            //file.createNewFile();
            Scanner in = new Scanner(file);
            while (in.hasNextLine())
            {
                String line = in.nextLine();
                if(line.contains(key))System.out.println(fileName + ": " + line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("File Pai nai");
        }

    }
}
