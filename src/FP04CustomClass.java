import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;


    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore='" + reviewScore + '\'' +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

public class FP04CustomClass {
    public static void main(String args[]){

        List<Course> courseList =  List.of(
                new Course("Spring","Framework",98,42000),
                new Course("Spring Boot","Framework",95,18000),
                new Course("Api","Microservices",97,22000),
                new Course("Fullstack","Fullstack",91,91000),
                new Course("AWS","Cloud",92,11000),
                new Course("Azure","Cloud",99,22000),
                new Course("Docker","Cloud",92,20000),
                new Course("Kubernatives","Cloud",91,20000)
        );

        /*
        *
        * For returning the courselist on the basis of course review score more the 95
        *
        * */

        Predicate<Course> coursePredicate = course -> course.getReviewScore() > 95;
//        System.out.println(courseList.stream().allMatch(coursePredicate));

        /*
        *
        * for returning a list on the basis of number of students in reverse order
        * */
//        Comparator<Course> comparator = Comparator.comparing(Course::getNoOfStudents);
//        Comparator<Course> decreasingComparator = Comparator.comparing(Course::getNoOfStudents).reversed();
//        System.out.println(
//                courseList.stream().sorted(comparator).collect(Collectors.toList())
//        );
//
//        System.out.println(
//                courseList.stream().sorted(decreasingComparator).collect(Collectors.toList())
//        );

        /*
        * comparing on the basis of two fields
        *
        * */
//        Comparator<Course> comparator2 = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);
//
//        System.out.println(
//                courseList.stream().sorted(comparator2).collect(Collectors.toList())
//        );


        /*
        *
        * Using sorted to sort list
        *
        * */
        Comparator<Course> cours = Comparator.comparing(Course::getReviewScore);
        List<Course> courses = courseList.stream().sorted(cours).collect(Collectors.toList());
//        System.out.println(courses);

        /*
        * Data - 30/Aug/2021
        * Using limit in sort
        * limit(number of limit) is used to return the number of results
        *
        * */

//        System.out.println(
//                courses.stream().sorted(cours).limit(5).collect(Collectors.toList())
//        );

        /*
        *
        * o/p - [Course{name='Fullstack', category='Fullstack', reviewScore='91', noOfStudents=91000}, Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}, Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore='95', noOfStudents=18000}]
         *
        * */



        /*
        *
        * Date - 30/Aug/2021
        * Skip - skip is used to skip any element in list
        *
        * */

//        System.out.println(courses.stream().sorted(cours).skip(1).collect(Collectors.toList()));


        /*
        *
        * o/p - [Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}, Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore='95', noOfStudents=18000}, Course{name='Api', category='Microservices', reviewScore='97', noOfStudents=22000}, Course{name='Spring', category='Framework', reviewScore='98', noOfStudents=42000}, Course{name='Azure', category='Cloud', reviewScore='99', noOfStudents=22000}]
        *
        * */

        /*
        *
        * Date - 30/Aug/2021
        * Using skip and limit togeather
        *
        */

//        System.out.println(courses.stream().sorted(cours).limit(4).skip(1).collect(Collectors.toList()));


        /*
        *
        * o/p - [Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}, Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}]
        *
        * */

        /*
        * Date - 30/Aug/2021
        * take while - similar to while but here is the condition doesnt met then it comes out irrespective of the
        * number of elements left
        *
        * */

//        System.out.println(courseList.stream().takeWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

        /*
        *
        *
        * o/p - [Course{name='Fullstack', category='Fullstack', reviewScore='91', noOfStudents=91000}, Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}, Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}, Course{name='Spring Boot', category='Framework', reviewScore='95', noOfStudents=18000}, Course{name='Api', category='Microservices', reviewScore='97', noOfStudents=22000}, Course{name='Spring', category='Framework', reviewScore='98', noOfStudents=42000}, Course{name='Azure', category='Cloud', reviewScore='99', noOfStudents=22000}]
        *
        * */

        /*
        * Date - 30/Aug/2021
        * drop while - keeps checks the condition if the condition is true it will skip the element
        *
        * */

//        System.out.println(courseList.stream().dropWhile(course -> course.getReviewScore() >= 95).collect(Collectors.toList()));

        /*
        *
        * o/p - [Course{name='Fullstack', category='Fullstack', reviewScore='91', noOfStudents=91000}, Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Azure', category='Cloud', reviewScore='99', noOfStudents=22000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}, Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}]
        *
        * */


        /*
        * Date - 30/Aug/2021
        * max -  to find max on the basis of some condition
        *
        * */

        Comparator<Course> findingmax = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore)
                        .reversed();
        System.out.println(courseList.stream().max(findingmax));

        /*
        *
        *
        * o/p - Optional[Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}]
        *
        * */

        /*
        * Date - 30/Aug/2021
        * min
        *
        * */
        System.out.println(courseList.stream().min(findingmax));

        /*
        *
        * o/p - Optional[Course{name='Fullstack', category='Fullstack', reviewScore='91', noOfStudents=91000}]
        *
        *
        * */

        /*
        * Date - 30/Aug/2021
        * average
        *
        * */

        System.out.println(
                courseList.stream().filter(coursePredicate).
                        mapToInt(course -> course.getNoOfStudents()).average()
        );

        /*
        *
        * o/p - OptionalDouble[28666.666666666668]
        *
        * */


        /*
        *
        * Date - 30/Aug/2021
        * count
        *
        * */

        System.out.println(
                courseList.stream().filter(coursePredicate).
                        mapToInt(course -> course.getNoOfStudents()).count()
        );

        /*
        *
        * o/p - 3
        *
        * */



        /*
        * Date - 30/Aug/2021
        * groupBy
        *
        * */

        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory)));

        /*
        *
        * o/p -  {Cloud=[Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Azure', category='Cloud', reviewScore='99', noOfStudents=22000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}, Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}], Fullstack=[Course{name='Fullstack', category='Fullstack', reviewScore='91', noOfStudents=91000}], Microservices=[Course{name='Api', category='Microservices', reviewScore='97', noOfStudents=22000}], Framework=[Course{name='Spring', category='Framework', reviewScore='98', noOfStudents=42000}, Course{name='Spring Boot', category='Framework', reviewScore='95', noOfStudents=18000}]}
        *
        * */


        /*
        * Date - 30/Aug/2021
        * counting number of courses
        *
        * */


        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.counting())));

        /*
        *
        *
        * o/p - {Cloud=[Course{name='AWS', category='Cloud', reviewScore='92', noOfStudents=11000}, Course{name='Azure', category='Cloud', reviewScore='99', noOfStudents=22000}, Course{name='Docker', category='Cloud', reviewScore='92', noOfStudents=20000}, Course{name='Kubernatives', category='Cloud', reviewScore='91', noOfStudents=20000}], Fullstack=[Course{name='Fullstack', category='Fullstack', reviewScore='91', noOfStudents=91000}], Microservices=[Course{name='Api', category='Microservices', reviewScore='97', noOfStudents=22000}], Framework=[Course{name='Spring', category='Framework', reviewScore='98', noOfStudents=42000}, Course{name='Spring Boot', category='Framework', reviewScore='95', noOfStudents=18000}]}
           {Cloud=4, Fullstack=1, Microservices=1, Framework=2}
        *
        * */



        /*
         *  Date - 30/Aug/2021
         *  grouping by courseName
         *
         *
         * */


        System.out.println(courseList.stream().collect(Collectors.groupingBy(Course::getCategory,Collectors.mapping(Course::getName,Collectors.toList()))));


        /*
        *
        * o/p - {Cloud=[AWS, Azure, Docker, Kubernatives], Fullstack=[Fullstack], Microservices=[Api], Framework=[Spring, Spring Boot]}
        *
        * */


    }





}
