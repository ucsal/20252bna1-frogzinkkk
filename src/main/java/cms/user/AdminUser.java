package cms.user;

public class AdminUser extends User {
	public AdminUser(int id, String nome, String email, String password) {
		super(id, nome, email, password);
	}

	@Override
	public boolean checkPassword(String p) {
		return getPassword().equals(p);
	}

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
