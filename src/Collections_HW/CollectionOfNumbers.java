package Collections_HW;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionOfNumbers {
    public static void main(String[] args) {
        // Example usage of pow2 method
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(40);
        Collection<Integer> squares = pow2(numbers);
        System.out.println(squares);
    }

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        ArrayList<Integer> squares = new ArrayList<>();
        for (int num : numbers) {
            squares.add(num * num);
        }
        return squares;
    }
}
