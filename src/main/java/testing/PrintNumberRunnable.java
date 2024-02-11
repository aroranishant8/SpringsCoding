package testing;

public class PrintNumberRunnable implements Runnable{

    private final PrintNumber printNumber;

    PrintNumberRunnable(PrintNumber printNumber)
    {
       this.printNumber=printNumber;
    }

    @Override
    public void run() {
    printNumber.printNumber();
    }
}
