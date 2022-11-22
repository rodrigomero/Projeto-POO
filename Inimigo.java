//ROdrigo Mero de Omena 2209152
public class Inimigo {
    private int hp;
    private int danoBase;
    private int experiencia;

    public Inimigo(){
        this.hp = 20;
        this.danoBase = 5;
        this.experiencia = 20;
    }

    public Inimigo(int hp, int danoBase, int experiencia) {
        this.hp = hp;
        this.danoBase = danoBase;
        this.experiencia = experiencia;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getDanoBase() {
        return danoBase;
    }
    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}
