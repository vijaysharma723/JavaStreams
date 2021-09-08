import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FP03FunctionalInterfaces {
    public static void main(String[] args){


        /*
        *
        * Finding the sum of first 10 even numbers starting from 2
        *
        * */

        System.out.println("=>"+IntStream.iterate(2,even -> even + 2).limit(10).peek(System.out::println).sum());


        /*
        *
        * O/P - 2
        * 4
        * 6
        * 8
        * 10
        * 12
        * 14
        * 16
        * 18
        * 20
        * =>110
        *
        * */



        /*
        *
        * Finding the sum of 2^10 and adding it
        *
        * */

        System.out.println("power =>"+IntStream.iterate(2, e-> e*2).limit(10).peek(System.out::println).sum());


        /* O/P -
        * 2
        * 4
        * 8
        * 16
        * 32
        * 64
        * 128
        * 256
        * 512
        * 1024
        * power =>2046
        *
        */




        /*
        *
        * boxed -> is used to convert primitive type to list else it will provide an error
        *
        * */
        System.out.println("power =>"+IntStream.iterate(2, e-> e*2).limit(10).boxed().collect(Collectors.toList()));

        /*
        *
        * O/P - power =>[2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
        *
        * */



        /*
         *
         * BigInteger - Is used for very large operations
         *
         * */

        System.out.println(LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply));

        /*
        *
        * O/P - Optional[30414093201713378043612608166064768844377641568960512000000000000]
        *
        * */
    }






}
