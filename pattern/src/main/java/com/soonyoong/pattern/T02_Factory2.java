package com.soonyoong.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.soonyoong.pattern.model.Computer;
import com.soonyoong.pattern.model.Plan;

public class T02_Factory2 {
    public static void main(String args[]) throws IOException {
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
