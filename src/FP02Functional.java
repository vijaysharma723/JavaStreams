import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args){
        List<Integer> numbers = List.of(1,2,2,3,3,5,5,4,4,2);
        List<String> courses = Arrays.asList("spring boot","spring","boot","AWS");
        //        int sum = addList(numbers);
//        System.out.println(sum);
//        System.out.println(findGreatestNumberInList(numbers));
//        System.out.println(findSmallestNumberInList(numbers));
//        System.out.println(squareEveryNumberInListAndFindSum(numbers));
//        System.out.println(cubeEveryNumberInListAndFindSum(numbers));
//        System.out.println(sumOfOddInList(numbers));
//         printDistinctNumbers(numbers);
//        printSortedList(numbers);
//        printListInReverseSorted(courses);
//      List<Integer> listofNumbers =  returningListofNumbers(numbers);
//      System.out.println(listofNumbers);
//        List<Integer> listofNumbers = returningListofEvenNumbers(numbers);
//        System.out.println(listofNumbers);
        System.out.println(creatingListOfLengthsOfString(courses));
    }

    private static List<Integer> creatingListOfLengthsOfString(List<String> courses) {
        return courses.stream().map(course -> course.length()).collect(Collectors.toList());
    }

    private static List<Integer> returningListofEvenNumbers(List<Integer> numbers) {
       return  numbers.stream().filter(number -> number%2 ==0).distinct().collect(Collectors.toList());
    }

    private static List<Integer> returningListofNumbers(List<Integer> numbers) {
        return numbers.stream().map(x -> x*x).collect(Collectors.toList());
    }

    private static void printListInReverseSorted(List<String> courses) {
        courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    private static void printSortedList(List<Integer> numbers) {
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }

    private static void printDistinctNumbers(List<Integer> numbers) {
         numbers.stream().distinct().forEach(System.out::println);
    }

    private static Integer sumOfOddInList(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 != 0).reduce(0,Integer::sum);
    }

    private static Integer cubeEveryNumberInListAndFindSum(List<Integer> numbers) {
        return numbers.stream().map(x-> x*x*x).reduce(0,Integer::sum);
    }

    private static Integer squareEveryNumberInListAndFindSum(List<Integer> numbers) {
        return numbers.stream().map(x -> x*x).reduce(0,Integer::sum);
    }

    private static int findSmallestNumberInList(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE,(x,y)-> x<y ? x:y);
    }

    private static int findGreatestNumberInList(List<Integer> numbers) {
       return  numbers.stream().reduce(Integer.MIN_VALUE,(num1,num2)->num1>num2 ?num1:num2);
    }



//   private static Integer addNumbers(int a,int b){
//        System.out.println("a= "+a+" b= "+b);
//        return a + b;
//    }

    private static int addList(List<Integer> numbers) {
        return numbers.stream().reduce(0,Integer::sum);
    }
}
