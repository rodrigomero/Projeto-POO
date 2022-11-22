//ROdrigo Mero de Omena 2209152
public class Principal {
    public static void main(String arg[]) {
        Atirador atirador = new Atirador("Rodolfo","rodolfin2000","rodolfin200@gmail.com", 18,"Rodolfo", "O Maioral");
        Guerreiro guerreiro = new Guerreiro("Rafael", "rafaelao", "rafaeal@gmail.com", 19, "rafael1999", "Tao tao distante");;
        Mago mago= new Mago("Gandalf", "magaotop", "robertomago@gmail.com", 25, "Roberto");
        atirador.imprimePerfil();
        guerreiro.imprimePerfil();
        mago.imprimePerfil();
        
        Inimigo goblin = new Inimigo();
        atirador.lutar(goblin);
        atirador.imprimePerfil();

        System.out.println("Cadastro de Personagem atirador: \n");
        String nome= Leitura.entDados("nome do personagem: ");
        String username= Leitura.entDados("username: ");
        String email= Leitura.entDados("email: ");
        int idade= Integer.parseInt(Leitura.entDados("idade: "));
        String nomeUser= Leitura.entDados("nome do usuario: ");
        String titulo= Leitura.entDados("titulo: ");
        Atirador atiradorUser= new Atirador(nome, username, email, idade, nomeUser, titulo);
        int controle = 99;
        while(controle!=0){
            System.out.println("=====MENU=====\n1- lutar contra goblin fraco\n2-lutar contra lobo\n3-lutar contra boss\n0-sair do jogo");
            controle= Integer.parseInt(Leitura.entDados("Escolha uma opção: "));
            switch(controle){
                case 1:
                    Inimigo goblinFraco = new Inimigo();
                    atiradorUser.lutar(goblinFraco);
                    break;
                case 2:
                    Inimigo lobo= new Inimigo(60, 15, 60);
                    atiradorUser.lutar(lobo);
                    break;
                case 3:
                    Inimigo boss= new Inimigo(200, 35, 100);
                    atiradorUser.lutar(boss);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida!");  
            }
        }
        System.out.println("Obrigado por Jogar!");
        atiradorUser.imprimePerfil();
    }
}