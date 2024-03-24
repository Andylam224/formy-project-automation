public abstract class AbstractTableManager<D> {


    //abstract method, no method body
    public abstract String getTableName();

    // public abstract DynamoBD getDBCClient();

    //regular method
    public void putItem(D value){
        System.out.println("Adding item to "+ getTableName());
    }

}
