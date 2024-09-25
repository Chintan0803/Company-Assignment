public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;

    private DatabaseConnectionPool() {
        
    }

    public static DatabaseConnectionPool getInstance() {

        if (instance == null) {
            synchronized(DatabaseConnectionPool.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionPool();
                }
            }
        }
        return instance;
    }

    public void getConnection() {
        System.out.println("Returning a database connection");
    }

    public static void main(String[] args) {
        DatabaseConnectionPool pool1 = DatabaseConnectionPool.getInstance();
        DatabaseConnectionPool pool2 = DatabaseConnectionPool.getInstance();
        System.out.println(pool1.hashCode());
        System.out.println(pool2.hashCode());

        pool1.getConnection();
    }
}
