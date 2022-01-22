package Loops.forLoop;

public class InfiniteForLoop {
    public static void main(String[] args) {
        for(int k=0;k<5;k++){
            System.out.println("David");
        }
        // infinite loop
        for(;;){         // no variable, no condition, no update
            System.out.println("Zack");
        }
        // System.out.println(x); this statement will not be reached out since there is infinite loop before it
    }
}
