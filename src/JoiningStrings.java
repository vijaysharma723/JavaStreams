import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String args[]){

        List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernatives");

        /*
        *
        * Combine all elements in list seperated by comma
        * joining
        * */

        String data = courses.stream().collect(Collectors.joining(","));
        System.out.println(data);
        /*
        *
        * O/P - Spring,Spring Boot,API,Microservices,AWS,PCF,Azure,Docker,Kubernatives
        *
        * */


        /*
        *
        * flatmap - helps in flattening a stream of values
        *
        * */

        System.out.println(courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

        /*
        *
        * O/P - [S, p, r, i, n, g,  , B, o, t, A, P, I, M, c, s, e, v, W, C, F, z, u, D, k, K, b, a]
        *
        * */


        /*
        *
        * Mapping one list to another using floatmap
        *
        * */

        List<String> courses2 = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernatives");
        System.out.println(courses.stream().flatMap(course -> courses2.stream().map(course2 ->List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList()));
    }
}
