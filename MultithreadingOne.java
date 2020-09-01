import java.io.*;
import java .util.*;
import java.lang.Thread;

class Multithreads extends Thread{

    public void run(){
        try {
            System.out.println ("Thread " +  Thread.currentThread().getId() +  " is running");
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println ("Exception is caught"); 
        }
    }
}
public class MultithreadingOne{
    public static void main(String[] args) {
        int get_studentcount = 10;
        System.out.println("Extends Thread example");
        for(int i = 0; i < get_studentcount; i++){
            Multithreads obj = new Multithreads();
            obj.start();
        }
    }
}