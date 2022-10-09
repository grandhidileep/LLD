package DPSingleton;

public class Client2 {
    public Database db;
    public Client2(){
        db = Database.getDatabaseInstance();
    }
}
