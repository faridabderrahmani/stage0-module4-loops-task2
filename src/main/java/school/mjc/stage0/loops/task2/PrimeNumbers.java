package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {

    }
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        while(counter <= printToInclusive){
            if(counter <= 1){

            } else if (counter  == 2 || counter == 3){
                System.out.println(counter);
            }else if (counter % 2 == 0 || counter % 3 == 0 || counter % 5 == 0){

            }else{
                System.out.println(counter);
            }
            counter++;
        }
    }
}

