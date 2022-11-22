//ROdrigo Mero de Omena 2209152
public class Jogador {
    private String username;
    private String email;
    private int idade;
    private String nome;

    public Jogador(){
        username= "username padrao";
        email= "email@padrao.com";
        idade= 18;
        nome= "Nome Padrao";
    }

    //Polimorfismo por sobrecarga
    public Jogador(String username, String email, int idade, String nome) {
        this.username = username;
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }


    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
