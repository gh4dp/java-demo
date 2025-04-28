package com.example;

/**
 * Provides two methods to show imperative vs. declarative
 * style of programming
 */
class ImpVsDeclProgLoop {

    /**
     * showImperative : This is "how" style of programming
     * Developer tells what to do to achieve the results
     * Task: Do sum of first 1000 integers
     */
    protected  int showImperative() {
        long stTime = System.nanoTime();

        int sum = 0;
        for (int i = 0; i < 1001; i++)
            sum += i;
        System.out.println("Total Sum for 0 to 1000 inclusive: " + sum);
        long enTime = System.nanoTime();
        long elapsedTime = enTime - stTime;
        System.out.println("Elapsed time in mSecs: " + elapsedTime/1_000_000);

        return 0;
    }






}
