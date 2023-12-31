package TDIT_JAVA8;
import java.util.*;
import java.util.stream.Collectors;

class Student
{

    List<Student> li=new ArrayList<Student>();
    int id;

    String name;

    double percentage;

    String specialization;

    public Student(int id, String name, double percentage, String specialization)
    {
        this.id = id;

        this.name = name;

        this.percentage = percentage;

        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString()
    {
        return id+"-"+name+"-"+percentage+"-"+specialization;
    }

    public static void main(String[] args) {


    List<Student> listOfStudents = new ArrayList<Student>();

listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));


        System.out.println("=============Sorted by Percentage ===============");
        List<Student> sortedByPercentage = listOfStudents.stream()
                .sorted(Comparator.comparingDouble(Student::getPercentage))
                .collect(Collectors.toList());

        // Display the sorted list
        sortedByPercentage.forEach(System.out::println);

        System.out.println("=============Sorted by Name ===============");
        List<Student> sortedByname=listOfStudents.stream().sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        sortedByname.forEach(System.out::println);

        System.out.println("=============Sorted by id ===============");
        List<Student> liobj=listOfStudents.stream().sorted(Comparator.comparing(Student::getId))
                .collect(Collectors.toList());
        liobj.forEach(System.out::println);

        Comparator<Student> obj= (o1, o2) -> {
            Integer i1=(Integer) o1.getId();
            Integer i2=(Integer) o2.getId();
            return i2.compareTo(i1);
        };
        Collections.sort(listOfStudents,obj);
        System.out.println(listOfStudents);
}}
