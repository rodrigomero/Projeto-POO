//ROdrigo Mero de Omena 2209152
public class Guerreiro extends Humano implements Perfil{
    private String reinoDeOrigem;
    private int armadura;

    
    public Guerreiro() {
        super();
        this.reinoDeOrigem = "Tao tao distante";
        this.armadura = 50;
    }

    public Guerreiro(String nome, String username, String email, int idade, String nomeUser, String reinoDeOrigem) {
        super(nome, username, email, idade, nomeUser);
        this.reinoDeOrigem = reinoDeOrigem;
        this.armadura = 50;
        this.setMaxHp(this.getMaxHp()+ this.armadura);
        this.setHp(this.getMaxHp());
    }

    public void imprimePerfil(){
        System.out.println("=====Perfil=====\nnome: "+this.getNome()+"\nhp: "+this.getHp()+"/"+this.getMaxHp()+"\nArmadura: "+this.armadura +"\nExperiencia: "+this.getExperiencia()+"\nnivel: "+ this.getNivel()+"\nDano base: "+this.getDanoBase());
    }

    public String getReinoDeOrigem() {
        return reinoDeOrigem;
    }
    public void setReinoDeOrigem(String reinoDeOrigem) {
        this.reinoDeOrigem = reinoDeOrigem;
    }
    public int getArmadura() {
        return armadura;
    }
    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
    //sobrescrita
    public void lutar(Inimigo inimigo){
        
        while(this.getHp()> 0 && inimigo.getHp() < 0){
            inimigo.setHp(inimigo.getHp() - this.getDanoBase());
            setHp(this.getHp() - inimigo.getDanoBase());
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
