public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client(String name, String surname, int age, long pesel) {
        this(name, surname);
        this.age = age;
        this.pesel = pesel;
    }

    Client(String name, String surname) {
        this();
        this.name = "Nazwisko: " + name;
        this.surname = surname;
    }

    Client() {
        System.out.println("Ktos wlasnie stworzyl klienta !!");
    }

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    void showName() {
        if(this.name.equals("Pankracy")) {
            return;
        }
        System.out.println(this.name);
    }
}