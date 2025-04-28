package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Process;
import com.consulthkm.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        long stTime = System.nanoTime();
        execOSProcess();

        ImpVsDeclProgLoop idpl = new ImpVsDeclProgLoop();
        idpl.showImperative();

        // ExecutionTimer et = new ExecutionTimer();
        int val1 = ExecutionTimer.measureExecutionTime( ()->idpl.showImperative());

        long enTime = System.nanoTime();
        long elapsedTime = enTime - stTime;
        System.out.println("Elapsed time in mSecs: " + elapsedTime/1000000);



    }

    private static void execOSProcess() {
        String aLine="-".repeat(40);
        System.out.println(aLine);
        System.out.println("Hello World!");
        System.out.println(aLine);


        try {
            Process process = Runtime.getRuntime().exec("java -version");
            int exitCode = process.waitFor();
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Output from process: " + line);
            }
            br.close();
            System.out.println("Exited with code: " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
