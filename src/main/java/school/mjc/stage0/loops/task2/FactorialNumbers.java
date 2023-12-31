package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public static void main(String[] args) {

    }
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int factorial = 1;
        System.out.println(factorial);
        while(counter < printToInclusive){
            factorial *= (counter + 1);
            System.out.println(factorial);
            counter++;
        }

    }
}
