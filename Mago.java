//ROdrigo Mero de Omena 2209152
public class Mago extends Humano implements Perfil{
    private int manaMax;
    private int mana;
    private int danoDaMagia;
    

    public Mago() {
        super();
        this.manaMax = 100;
        this.mana = this.manaMax;
    }
    public Mago(String nome, String username, String email, int idade, String nomeUser) {
        super(nome, username, email, idade, nomeUser);
        this.manaMax = 100;
        this.mana = this.manaMax;
        this.danoDaMagia= 40;
    }
    
    public void imprimePerfil(){
        System.out.println("=====Perfil=====\nnome: "+this.getNome()+"\nhp: "+this.getHp()+"/"+this.getMaxHp()+"\nMana: "+this.mana+ "/"+ this.manaMax+"\nExperiencia: "+this.getExperiencia()+"\nnivel: "+ this.getNivel()+"\nDano base: "+this.getDanoBase());
    }
    public int getDanoDaMagia() {
        return danoDaMagia;
    }
    public void setDanoDaMagia(int danoDaMagia) {
        this.danoDaMagia = danoDaMagia;
    }
    
    public int getManaMax() {
        return manaMax;
    }
    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public void levelUp(){
        if(this.getExperiencia()>=100){
            this.setExperiencia(this.getExperiencia()-100);
            this.setNivel(this.getNivel()+1);
            System.out.println("O personagem "+this.getNome()+" subiu de nivel!");
            this.setMaxHp(this.getMaxHp() + 20);
            this.setHp(this.getMaxHp());
            this.setDanoDaMagia(this.getDanoDaMagia()+10);
            this.setManaMax(this.getManaMax()+25);
            this.setMana(this.getManaMax());
        }else{
            System.out.println("Experiencia insuficiente pra subir de nivel");
        }
    }

    private int soltarMagia(){
        if(this.mana > 25){
            this.setMana(this.getMana() - 25);
            System.out.println("Bola de Fogo!");
            return this.danoDaMagia;
        }else{
            this.setMana(this.getManaMax());
            return 0;
        }
    }
    //sobrescrita
    public void lutar(Inimigo inimigo){
        
        while(this.getHp()> 0 && inimigo.getHp() < 0){
            inimigo.setHp(inimigo.getHp() - this.soltarMagia());
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
