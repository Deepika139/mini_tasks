package Assesment;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class ArrayShuffling {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));

	}

}
