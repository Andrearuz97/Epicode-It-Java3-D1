package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		// Configura le informazioni di connessione al database
		String url = "jdbc:postgresql://localhost:5432/first";
		String user = "nomeutente";
		String password = "password";

		// Crea una connessione al database
		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			// Esegui le query qui

			// Ricorda di gestire eventuali eccezioni
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
