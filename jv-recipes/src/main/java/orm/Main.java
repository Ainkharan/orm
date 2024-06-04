package orm;


public class Main {
    public static void main(String[] args) {

        Database.getSessionFactory()
                .getSchemaManager() // A SchemaManager with the same default catalog and schema as pooled connections belonging to this factory. Intended mostly as a convenience for writing tests.
                .exportMappedObjects(true); // exports database objects mapped by Hibernate entities. If true, attempt to create schemas, otherwise, assume the schemas already exist


    }
}
