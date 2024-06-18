package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
	public static void main(String arg[]) {
		List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("List of Non empty Strings:");
		listStrings.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);

	}
}
