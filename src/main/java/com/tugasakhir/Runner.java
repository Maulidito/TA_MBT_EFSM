package com.tugasakhir;

import com.tugasakhir.Home_Test;
import com.tugasakhir.Vaccine_Test;
import org.graphwalker.java.test.Result;
import org.graphwalker.java.test.TestExecutor;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        TestExecutor executor = new TestExecutor(
                Home_Test.class, Vaccine_Test.class);

        Result result = executor.execute(true);
        System.out.println("Done: [" + result.getResults().toString(2) + "]");
    }
}
