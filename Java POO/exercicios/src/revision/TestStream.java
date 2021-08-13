package revision;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class TestStream {
	
			
	public static void main(String[] args) {
		String[] arrayLangs = {"Java", "Python", "JavaScript", "CSharp", "Go"};
		List<Number> notas = Arrays.asList(8.0, 6.0, 5.0, 7);
		Consumer<String> print = System.out::println;
		
		
		Stream<String> langs = Stream.of("Java", "Python", "JavaScript", "CSharp");
		
		langs.forEach(print);
		System.out.println("---------------");
		Arrays.stream(arrayLangs, 0, 3).forEach(print);
		
		notas.stream().forEach(System.out::println);
		
		
	}

}
