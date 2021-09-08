import java.util.ArrayList;
import java.util.List;

public class FPS01Functional {
    public static void main(String[] args){
        String str = "123456312";
        Integer val = Integer.parseInt(str);
        List<Integer> numbers = List.of(12,7,9,4,5,3,2,3,4);
        List<String> courses = List.of("spring","spring boot","Api","Microservices","Aws","Azure","Docker","Kubernatives");
//        printListOfNumbersForFunctionalApproach(numbers);
//        printListOfEvenNumbersForFunctionalApproach(numbers);
//        printListOfEvenOddForFunctionalApproach(numbers);
//        printAllCoursesIndividually(courses);
//        printCoursesThatContainSpringKeyword(courses);
//        printCoursesThatContainFourLetters(courses);
//        printCoursesSquareOfEvenNumbers(numbers);
//        printCoursesCubeOfOddNumbers(numbers);
//        printNumberOfCharactersInEachCourseName(courses);
//        sortingIntergerValues(val);
    }

//    private static void sortingIntergerValues(Integer val) {
//        List<Integer> unorderedList = new ArrayList<>() ;
//
//    }

    private static void printNumberOfCharactersInEachCourseName(List<String> courses) {
        courses.stream().map(course -> course.length()).forEach(System.out::println);
    }

    private static void printCoursesCubeOfOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).map(num -> num * num * num).forEach(System.out::println);
    }

    private static void printCoursesSquareOfEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 == 0).map(n -> n*n).forEach(System.out::println);
    }

    private static void printCoursesThatContainFourLetters(List<String> courses) {
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }

    private static void printCoursesThatContainSpringKeyword(List<String> courses) {
        courses.stream().filter(course -> course.contains("spring")).forEach(System.out::println);
    }

    private static void printAllCoursesIndividually(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printListOfEvenOddForFunctionalApproach(List<Integer> numbers) {
        numbers.stream().filter(number -> number%2 == 1).forEach(System.out::println);
    }

    private static void printListOfEvenNumbersForFunctionalApproach(List<Integer> numbers) {
        numbers.stream().
                filter(number-> number%2 == 0)  //Lambda expression
                .forEach(System.out::println);
    }

//    private static boolean isEven(Integer num){
//        return num%2 == 0;
//    }

//    private static void print(int numbers){
//    System.out.println(numbers);
//    }

    private  static void printListOfNumbersForFunctionalApproach(List<Integer> numbers){
        numbers.stream().forEach(System.out::println); //static Method reference
    }
}
