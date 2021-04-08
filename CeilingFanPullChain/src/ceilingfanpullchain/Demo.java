/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceilingfanpullchain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Demo {
    public static void main(String[] args) {
        TrafficLight chain = new TrafficLight();
        while (true) {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }
    }

    static String getLine() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return line;
    }
}

