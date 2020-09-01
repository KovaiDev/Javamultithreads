
import java.io.*;
import java .util.*;
import java.lang.Thread;

class MultithreadingThree extends Thread{  
    public void run(){  
     for(int i=1;i<5;i++){  
       try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
       System.out.println(i);  
     }  
    }  

    public static void main(String args[]){  
        MultithreadingThree t1=new MultithreadingThree();  
        MultithreadingThree t2=new MultithreadingThree();  
      
     t1.start();  
     t2.start();  
    }  
   }