package testing;

public class ThreadLearning {

    public static void main(String[] args) {

        //1st i will create a object
        PrintNumber printNumber = new PrintNumber();
        //this should go inside a Thread
        // printNumber.printNumber();

        Thread printNumberThread1 = new Thread(new PrintNumberRunnable(printNumber));
        printNumberThread1.start();
        Thread printNumberThread2 = new Thread(new PrintNumberRunnable(printNumber));
        printNumberThread2.start();



    }
}
