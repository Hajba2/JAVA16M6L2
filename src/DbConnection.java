public class DbConnection {

    private volatile static DbConnection dbConnection;

    private DbConnection() {

    }

    public DbConnection getDbConnection() {
        if (dbConnection == null) {
            synchronized (this) {
                if (dbConnection == null) {
                    dbConnection = new DbConnection();
                }
            }
        }
        return dbConnection;
    }
}
