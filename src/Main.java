import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

          ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

            list.removeIf(x -> x <= 0);
            list.removeIf(i -> i % 2 != 0);
            Collections.sort(list);

            System.out.println(list);
        }
    }
