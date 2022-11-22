//ROdrigo Mero de Omena 2209152
public abstract class Humano {
    private String nome;
    private int maxHp;
    private int hp;
    private Jogador jogador;
    private int experiencia;
    private int nivel;
    private int danoBase;

    public Humano(){
        nome= "nome padrao";
        maxHp= 100;
        hp= maxHp;
        jogador=new Jogador();
        experiencia= 0;
        nivel= 1;
        danoBase=20;
    }

    public Humano(String nome, String username, String email, int idade, String nomeUser) {
        this.nome = nome;
        this.maxHp = 100;
        this.hp = this.maxHp;
        this.jogador = new Jogador( username,  email,  idade, nomeUser);
        this.experiencia = 0;
        this.nivel = 1;
        this.danoBase = 20;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMaxHp() {
        return maxHp;
    }
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;   
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getDanoBase() {
        return danoBase;
    }
    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }
    public void levelUp(){
        if(experiencia>=100){
            this.setExperiencia(this.getExperiencia()-100);
            this.setNivel(this.getNivel()+1);
            System.out.println("O personagem "+this.nome+" subiu de nivel!");
            this.setMaxHp(this.maxHp + 20);
            this.setHp(this.getMaxHp());
            this.setDanoBase(this.getDanoBase()+10);
            
        }else{
            System.out.println("Experiencia insuficiente pra subir de nivel");
        }
    }
    public void expGain(int xp){
        int xpAtual = this.experiencia;
        setExperiencia(xpAtual+xp);
        levelUp();
    }
    public void lutar(Inimigo inimigo){
        
        while(this.getHp()> 0 && inimigo.getHp() > 0){
            inimigo.setHp(inimigo.getHp() - this.danoBase);
            setHp(this.hp - inimigo.getDanoBase());
        }
        if (this.hp < 0){
            System.out.println("O personagem morreu!");
            this.setNivel(0);
            this.setHp(this.maxHp);
        }else{
            System.out.println("Voce ganhou "+ inimigo.getExperiencia()+" de Experiencia!");
            this.expGain(inimigo.getExperiencia());
            
        }
    };

    
}
