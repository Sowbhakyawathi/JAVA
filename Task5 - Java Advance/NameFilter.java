package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameFilter {
public static void main(String arg[]) {
	List<String> names = Arrays.asList("Akila","Meghu","Akalya","Asina","Ananya","Kavi","Vijay","Deepak","Sugu","Gandhi");
	
	System.out.println("Students whose names start wit “A” :");
	names.stream().filter(x->x.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
	
}
}
