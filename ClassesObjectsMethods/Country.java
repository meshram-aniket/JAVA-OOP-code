package ClassesObjectsMethods;

public class Country {
    String name;
    int population;

    public void countryName() {
        System.out.println(name+" "+population);
    }

    public static void main (String[] args) {
        Country c1 = new Country ();
        c1.name = "India";
        c1.population = 1350000000;
        c1.countryName();
    }
}
