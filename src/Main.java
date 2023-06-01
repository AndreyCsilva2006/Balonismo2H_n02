public class Main {
    public static void main(String[] args) {
        // Aula introdutoria de Orientação e Objetos
        // Declaração de objeto
        Pessoa p1;
        Pessoa p2;
        Piloto plt1;
        // Instanciação do objeto
        p1 = new Pessoa();
        p2 = new Pessoa();
        plt1 = new Piloto();
        // Ao mesmo tempo
        Pessoa qualquer = new Pessoa();
        // Definir formato do objeto
        p1.nome = "Letícia";
        p1.CPF = "079.793.100-71";
        p1.RG = "34.965.577-7";
        p2.RG = "22.502.230-8";
        p2.nome = "Roberto";
        p2.CPF = "970.962.250-13";
        plt1.nome = "Mário";
}