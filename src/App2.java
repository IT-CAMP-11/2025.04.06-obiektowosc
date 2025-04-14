import java.util.Random;

public class App2 {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Janusz";

        int wynik2 = client.sum(4, 9);

        System.out.println(client.sum(5,7));
        System.out.println(wynik2);


        client.showName();

        int[] tab = new int[10];
        Random losowacz = new Random();
        Client client2 = new Client();
        client2.name = "Zbyszek";

        System.out.println(client.sum(4.4, 8.8));

        System.out.println();
        System.out.println("abc");
        System.out.println(4);
        System.out.println(6.6);
        System.out.println(client);

        Client client3 = new Client("Franek", "Kowalski", 35, 123123);

        System.out.println(client3.name);
        System.out.println(client3.surname);
        System.out.println(client3.age);
        System.out.println(client3.pesel);

        client.showName();
        client2.showName();
        client3.showName();
    }
}
