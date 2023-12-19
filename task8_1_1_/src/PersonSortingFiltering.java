import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

public class PersonSortingFiltering {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Trang", 28, "Helsinki"));
        people.add(new Person("Tam", 30, "Ho Chi Minh City"));
        people.add(new Person("Anna", 32, "Dubai"));
        people.add(new Person("Heejin", 31, "Seoul"));
        people.add(new Person("Brandon", 22, "Panama City"));

        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted by age (ascending order):");
        people.forEach(System.out::println);

        List<Person> HelsinkiPeople = filterByCity(people, "Helsinki");

        System.out.println("\nFiltered by city (Helsinki):");
        HelsinkiPeople.forEach(System.out::println);
    }

    private static List<Person> filterByCity(List<Person> people, String city) {
        List<Person> filteredList = new ArrayList<>();
        for (Person person : people) {
            if (person.getCity().equals(city)) {
                filteredList.add(person);
            }
        }
        return filteredList;
    }
}
