//ROdrigo Mero de Omena 2209152
public class Atirador extends Humano implements Perfil{
    private int arma;
    private String titulo;
    public Atirador() {
        super();
        this.arma = 20;
        this.titulo = "do maiorais";
        this.setDanoBase(this.getDanoBase()+ this.arma);
    }
    public Atirador(String nome, String username, String email, int idade, String nomeUser, String titulo) {
        super(nome, username, email, idade, nomeUser);
        this.arma = 20;
        this.setDanoBase(this.getDanoBase()+ this.arma);
        this.titulo = titulo;
    }

    public void imprimePerfil(){
        System.out.println("=====Perfil=====\nnome: "+this.getNome()+" "+this.titulo+"\nhp: "+this.getHp()+"/"+this.getMaxHp()+"\nExperiencia: "+this.getExperiencia()+"\nnivel: "+ this.getNivel()+"\nDano base: "+this.getDanoBase()+"\nArma: "+this.arma);
    }


    public int getArma() {
        return arma;
    }
    public void setArma(int arma) {
        this.arma = arma;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //sobrescrita
    public void lutar(Inimigo inimigo){
        
        while(this.getHp()> 0 && inimigo.getHp() > 0){
            inimigo.setHp(inimigo.getHp() - this.getDanoBase());
            setHp(this.getHp() - inimigo.getDanoBase());
            System.out.println("Vida atual: "+this.getHp()+"\nvida do inimigo:" + inimigo.getHp());
            
        }
        if (this.getHp() < 0){
            System.out.println("O personagem morreu!");
            this.setNivel(0);
            this.setHp(this.getMaxHp());
        }else{
            System.out.println("Voce ganhou "+ inimigo.getExperiencia()+" de Experiencia!");
            this.expGain(inimigo.getExperiencia());
            if(this.getHp()+20 > this.getMaxHp()){
                this.setHp(this.getMaxHp());
            }else{
                this.setHp(this.getHp()+20);
            }
            
        }
    };
    
}
