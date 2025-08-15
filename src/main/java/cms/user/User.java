package cms.user;

public abstract class User {
  /*User.java (abstract) com campos id, nome, email, password, getters e checkPassword.
    AdminUser, EditorUser, GuestUser estendendo User (sem duplicar estado).*/
  private final int id;
  private final String nome;
  private final String email;
  private final String password;

  public User(int id, String nome, String email, String password) {
    this.id = id;
    this.nome = nome;
    this.email = email;
    this.password = password;
  }

  public abstract boolean checkPassword(String p);

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }
}
