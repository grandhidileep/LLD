package DPSingleton;

public class DbEagerLoaded {
    private static DbEagerLoaded instance = new DbEagerLoaded();
    private DbEagerLoaded(){}

    public DbEagerLoaded getDbInstance(){
        return instance;
    }
}
