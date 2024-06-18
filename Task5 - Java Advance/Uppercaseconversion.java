package Task5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Uppercaseconversion {
	public static void main(String arg[]) {
		Stream<String> names = Stream.of("aBc", "d", "ef");
		System.out.println("List of Strings in Uppercae:" + names.map(x -> {
			return (x.toUpperCase());
		}).collect(Collectors.toList()));

	}
}
