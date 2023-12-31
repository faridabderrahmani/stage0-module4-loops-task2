package school.mjc.stage0.loops.task2;

public class Multiplication {
    public static void main(String[] args) {

    }
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if(Math.abs(multiplyByAndToInclusive) > 0) {
            while (counter <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(counter * Math.abs(multiplyByAndToInclusive));
                counter++;
            }
        }
    }
}
