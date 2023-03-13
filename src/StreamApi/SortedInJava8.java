package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SortedInJava8 {
    public static void main(String[] args) {
        int[] arr={10,8,7,2,3,5,4,5,8,60};
        List<Integer> list = Arrays.asList(4,5,8,7,2,3,5,4,5,8,6,6,3);
        System.out.println("sorting without comperision");
        list.stream().sorted().forEach(s-> System.out.print(s+" "));
        System.out.println("sum of Array:=");
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        Arrays.stream(arr).sorted().forEach(s-> System.out.print(s+" "));
        System.out.println("sorted with comperision");
        list.stream().sorted((i1,i2)->i1.compareTo(i2)).forEach(s-> System.out.print(s+" "));
        System.out.println("reverse sorted");
        list.stream().sorted((i1, i2) -> i2.compareTo(i1)).forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.print("max value:-");
        System.out.println(list.stream().max((i1, i2) -> i1-i2).get());
        System.out.print("min value:-");
        System.out.println(list.stream().min((i1, i2) -> i1-i2).get());


        Integer[] strings = list.stream().toArray(Integer[]::new);
        Arrays.stream(strings).forEach(s-> System.out.print(s+" "));
        System.out.println();

        Integer[] integers = list.toArray(new Integer[0]);

        Arrays.stream(integers).forEach(s-> System.out.print(s+" "));

        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max);

    }
}

