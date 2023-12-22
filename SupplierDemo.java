package TDIT_JAVA8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> sup=()->"This is supplier";
        List<String> li= Arrays.asList();
        System.out.println(li.stream().findAny().orElseGet(sup));
    }
}
