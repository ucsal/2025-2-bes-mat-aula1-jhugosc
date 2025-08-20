package cms.user;

public abstract class User {
    private String id;
    private String nome;
    private String email;
    private String password;

    public User(String id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String senha) {
        return this.password.equals(senha);
    }
}
