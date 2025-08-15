package cms.user;

public abstract class User {
  /*User.java (abstract) com campos id, nome, email, password, getters e checkPassword.
    AdminUser, EditorUser, GuestUser estendendo User (sem duplicar estado).*/
  int id;
  String nome;
  String email;
  String password;

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
