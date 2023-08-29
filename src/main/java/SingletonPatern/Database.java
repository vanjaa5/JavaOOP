package SingletonPatern;

public class Database {
    private String name;

    public static synchronized Database getInstance(String name) {
       if(null == instance){
           instance = new Database(name);

       }
       return instance;
    }

    public static void setInstance(Database instance) {
        Database.instance = instance;
    }

    private static Database instance;

    @Override
    public String toString() {
        String text = "Database class\n" +
                "Name: " + this.name;

        return text;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
