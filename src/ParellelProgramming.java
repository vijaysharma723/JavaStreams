import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.LongStream;

public class ParellelProgramming {

    public static void main(String[] args){

        long time = System.currentTimeMillis();

//        System.out.println(LongStream.range(0,1000000000).sum());
//        System.out.println(LongStream.range(0,1000000000).parallel().sum());
//        System.out.println(System.currentTimeMillis() - time);



        /*
        *
        * replaceAll - used to replace all elements of list and set
        *
        * */

        //List.of is immutable collection and in immutable collection we cannot modify anything therefore if we use courses
        //directly instead of putting it in new arraylist it will throw error
        List<String> courses = List.of("spring","spring boot","Api","Microservices","Aws","Azure","Docker","Kubernatives");
        List<String> updatedList = new ArrayList(courses);
        updatedList.replaceAll(str -> str.toUpperCase());
        System.out.println(updatedList);

    }
}
