package LinkedHashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEg {
    public static void main(String[] args) {
        Integer[] prices={100,500,300,800};
        List<Integer> new_prices=Arrays.asList(prices);
        Collections.sort(new_prices);
        System.out.println(new_prices);
    }


}
