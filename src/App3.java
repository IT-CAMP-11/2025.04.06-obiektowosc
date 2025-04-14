import baza.sql.Connection;

import java.util.Random;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Connection connection = new Connection();
        baza.redis.Connection connection2 = new baza.redis.Connection();

        connection.sqlAddress = "abc";
        connection2.redisAddress = "abc";

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
    }
}
