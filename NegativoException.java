//Rodrigo Mero de Omena 2209152
public class NegativoException extends Exception {
    public NegativoException(){
    }
    public void impErro(String atributo){
        System.out.println(atributo+" nao pode ser negativo.");
    }
}
