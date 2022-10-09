package DPSingleton;

public class DBWithDoubleCheckLocking {
    private static DBWithDoubleCheckLocking databaseInstance = null;
    private DBWithDoubleCheckLocking(){

    }

    public static DBWithDoubleCheckLocking getDatabaseInstance(){
        if(databaseInstance == null) {
            synchronized (databaseInstance) {
                if (databaseInstance == null) {
                    databaseInstance = new DBWithDoubleCheckLocking();
                }
            }
        }
        return databaseInstance;
    }
}
