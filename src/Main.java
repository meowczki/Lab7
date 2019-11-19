import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //stream pipeline
        int sum = IntStream.rangeClosed(1, 10)
                           .sum();//redukcja strumienia, sum jest metoda terminalna
        //zsumuj liczby parzyste od 2-20
        int evenSum = IntStream.rangeClosed(1, 10)
                               .map((x) -> 2 * x)
                               .sum();
        //sumujemy l. nieparzyste od 1-10
        int oddSum = IntStream.rangeClosed(1, 10)
                              .filter(i -> i % 2 != 0)
                              .sum();
        IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 != 0)
                .forEach(System.out::println);//referencja do metody

        //distinct- unikatowe el strumienia, limit-okreslona l pocz el. strumienia, map, sorted, foreach
        //metody redukujace, average, count, max, min, reduce- wlasna metoda zeby zredukowac strumien
        List<Integer> oddNumbersList= IntStream.rangeClosed(1, 10)
                .filter(i -> i % 2 != 0).boxed().collect(Collectors.toList());
        Integer[]values={1,2,2,2,3,3,3,1,1,2};
        List<Integer> data=new ArrayList<>(Arrays.asList(values));
        data.stream().distinct().forEach(System.out::println);

        //srednia z tablicy dane2
        int []dane2={1,2,3,4};
        double avg=Arrays.stream(dane2).average().getAsDouble();

        Student[] students={
                new Student("Richard","Feynam",4.5),
                new Student("Rudyard","Kipling",3.5),
                new Student("Marie","Curie",3.7)
        };
        Arrays.stream(students)
                .filter(x->x.getGpa()>3.&&x.getGpa()<4.)
                .sorted(Comparator.comparing(Student::getLastName))
                .forEach(System.out::println);
        //wyswietl liste tenisisistow w 3 dzieisiatce posortowqnych ze wzgledu na kraj

    }
}
