import java.util.List;

public class FPS01Structured {

    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,3,4,5,3,2,3,4);
//       printListOfNumbers(numbers);
       int sum = sumOfNumbers(numbers);
       System.out.println(sum);
    }

    private static int sumOfNumbers(List<Integer> numbers) {
        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
        return sum;
    }

    private static void printListOfNumbers(List<Integer> numbers){
        for(int num:numbers){
            System.out.println(num);
        }
    }
}
