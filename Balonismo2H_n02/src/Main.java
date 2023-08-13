public class Main {
    public static void main(String[] args) {
        // Declaração de objeto
        Pessoa p1;
        Pessoa p2;
        Piloto plt1;
        Balao b1;
        // Instanciação do objeto
        p1 = new Pessoa();
        p2 = new Pessoa();
        plt1 = new Piloto();
        b1 = new Balao();
        // Definir formato do objeto
        // Pessoa 1
        p1.nome = "Letícia";
        p1.CPF = "079.793.100-71";
        p1.RG = "34.965.577-7";
        p1.telefone = "(11) 2522-5531";
        p1.telefoneFamiliar = "(11) 2134-5198";
        p1.assinaturaTermo = true;
        p1.endereco = "Jardim Belval";

        // Pessoa 2
        p2.nome = "Roberto";
        p2.CPF = "970.962.250-13";
        p2.RG = "22.502.230-8";
        p2.telefone = "(11) 2282-3441";
        p2.telefoneFamiliar = "(11) 3553-5775";
        p2.assinaturaTermo = true;
        p2.endereco = "Jardim Belval";

        // Piloto 1
        plt1.nome = "Mário";
        plt1.CPF = "347.522.128-46";
        plt1.RG = "41.177.161-9";
        plt1.telefone = "(11) 3143-1969";
        plt1.telefoneFamiliar = "(11) 3553-5775";
        plt1.endereco = "Rua Belarmino Antônio";
        plt1.num_reg_anac = 033;

        // Balão 1
        b1.capacidade = 4;
        b1.ID = 02;
        b1.reg_regularidade = 01;
        
        // Combustivel
        b1.marcaComb = "Balonês";
        b1.tipoComb = "Gás propano";
        b1.precoComb = 300;
        b1.quantidadeComb = 1.000;
        
        // chamada do método voar()
        String resposta = b1.voar(b1.tipoComb);

        // Apresentação do retorno
        System.out.println(resposta);
    } 
}