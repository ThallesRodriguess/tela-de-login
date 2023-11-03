import java.util.HashMap;
import java.util.Map;

/**
 * A simple login screen implementation with user authentication and user management.
 */
/**
 * 
 * @author Thalles Rodrigues
 *
 */

public class LoginScreen {
	// Armazena os pares de nome de usuário e senha.
	private Map<String, String> userDatabase;
	
	/**
     * Construtor da classe LoginScreen que inicializa o banco de dados de usuários
     * com alguns valores padrão.
     */

	public LoginScreen() {
		userDatabase=new HashMap<>();
		userDatabase.put("john", "password123");
		userDatabase.put("alice", "securepass");
	}

	/**
     * Verifica se um nome de usuário e senha correspondem a uma entrada válida no banco de dados.
     *
     * @param username O nome de usuário a ser verificado.
     * @param password A senha associada ao nome de usuário fornecido.
     * @return true se a autenticação for bem-sucedida, caso contrário, false.
     */
	
	public boolean login(String username, String password) {
		
		if (userDatabase.containsKey(username)) {
			String storedPassword=userDatabase.get(username);
			if (storedPassword.equals(password)) {
				return true;
			}
		}
		return false;
	}

	/**
     * Adiciona um novo usuário ao banco de dados.
     *
     * @param username O nome de usuário do novo usuário a ser adicionado.
     * @param password A senha associada ao novo nome de usuário.
     */
	public void addUser(String username, String password) {
		userDatabase.put(username, password);
	}
}
