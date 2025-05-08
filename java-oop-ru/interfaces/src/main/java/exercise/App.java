package exercise;

import java.util.List;
import java.util.stream.Collectors;

import exercise.model.Home;

public class App {

    public static List<String> buildApartmentsList(List<Home> apartments, Integer num) {
        return apartments.stream().sorted(Home::compareTo).limit(num).map((v) -> v.toString())
                .collect(Collectors.toList());
    }
}
