package SingletonPatternImplementation;


import junit.framework.TestCase;

public class DatabaseConnectorTest extends TestCase {

    public void testSingletonInstance() {
        // Obtenir la première instance
        DatabaseConnector firstInstance = DatabaseConnector.getInstance();

        // Obtenir la seconde instance
        DatabaseConnector secondInstance = DatabaseConnector.getInstance();

        // Vérifier que les deux instances sont identiques
        assertSame("Les deux instances devraient être les mêmes", firstInstance, secondInstance);
    }

   
}
