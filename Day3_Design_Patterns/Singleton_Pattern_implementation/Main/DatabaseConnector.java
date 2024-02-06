package SingletonPatternImplementation;


public class DatabaseConnector {
    // Instance unique de la classe
    private static DatabaseConnector instance;

    // Constructeur privé pour empêcher l'instanciation
    private DatabaseConnector() {
        // Initialisation de la connexion
    }

    // Méthode publique statique pour obtenir l'instance unique
    public static DatabaseConnector getInstance() {
        if (instance == null) {
            // Si l'instance n'existe pas, en créer une nouvelle
            instance = new DatabaseConnector();
        }
        // Retourner l'instance existante ou la nouvelle
        return instance;
    }

    // Méthode pour interagir avec la base de données
    public void connect() {
        // Logique de connexion à la base de données
        System.out.println("Connexion à la base de données...");
    }
}
