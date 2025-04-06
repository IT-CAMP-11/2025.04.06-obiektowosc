import java.util.Random;

public class App {
    public static void main(String[] args) {
        Client c1 = new Client();
        Random losowacz = new Random();
        int[] tab = new int[10];
        int x = 7;

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 44;
        c1.pesel = 1234;

        System.out.println(c1.name);
        System.out.println(c1.surname);
        System.out.println(c1.age);
        System.out.println(c1.pesel);

        Client[] clients = new Client[1000];

        Client c2 = new Client();

        c2.name = "Zbyszek";
        c2.surname = "Malinowski";
        c2.age = 50;
        c2.pesel = 3456;

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);
        System.out.println(c2.pesel);

        System.out.println(c1.name);
        System.out.println(c1.surname);
        System.out.println(c1.age);
        System.out.println(c1.pesel);

        Client c3 = new Client();

        System.out.println(c3.name);
        System.out.println(c3.surname);
        System.out.println(c3.age);
        System.out.println(c3.pesel);
        //System.out.println(c3.address.street);

        System.out.println(clients[0]);
        System.out.println(clients[1]);
        System.out.println(clients[2]);

        clients[0] = new Client();
        c3.address = new Address();

        System.out.println(x);
        System.out.println(c1);
        System.out.println(clients);

        System.out.println(c3.address);

        System.out.println(c2.name);

        Client c4 = new Client();
        Client c5 = c4;

        c4.name = "Janusz";
        System.out.println(c5.name);

        Client client1 = new Client();
        Client client2 = new Client();

        client1.name = "Janusz";
        client1.surname = "Kowalski";
        client1.age = 30;
        client1.pesel = 1234;

        client2.name = "Janusz";
        client2.surname = "Kowalski";
        client2.age = 30;
        client2.pesel = 1234;

        System.out.println(client1 == client2);

        System.out.println(c4 == c5);

        //System.out.println(client1.equals(client2));

        /* sortowanie - sortCos()
        k1
        k2
        k3
        k4
        k5
        k6
        k7
        k8
        k9
        k10
         */
    }
}
