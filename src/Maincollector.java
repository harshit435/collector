import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Maincollector{
    public static void main(String[] args) {
        Student s1=new Student(11,"fiat","dave");
        Student s2=new Student(15,"volkswagen","MadMax");
        Student s3=new Student(14,"ferrari","paul");

        List<Student>students=new ArrayList<Student>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        //partitioningby
        Map<Boolean,List<Student>> partitionResult=students.stream().collect(Collectors.partitioningBy(student -> student.getGrade()>10));
        partitionResult.forEach((k,v)-> System.out.println("key is"+k+"\n values \n"+v));

        Map<Object,List<Student>> groupingResult=students.stream().collect(Collectors.groupingBy(Student::getCar));
        groupingResult.forEach((k,v)-> System.out.println("key is "+k+"\n values \n"+v));


    }
}