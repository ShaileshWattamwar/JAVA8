package TDIT_JAVA8;


import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<String> li= new ArrayList<>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        li.add("five");
        System.out.println("Normal print: "+li);

        System.out.println("By for each loop: ");
        for (String str:li) {
            System.out.println(str);
        }
        System.out.println("Print By stream ");
        li.stream().forEach(t-> System.out.println(t));
    }
}
