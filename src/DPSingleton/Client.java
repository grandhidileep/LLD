package DPSingleton;

public class Client {
    public static void main(String[] args) {
        Database db = Database.getDatabaseInstance();
        System.out.println(db);
        Database db2 = Database.getDatabaseInstance();
        System.out.println(db2);
        Client2 c2 = new Client2();
        System.out.println(c2.db);
    }
}
