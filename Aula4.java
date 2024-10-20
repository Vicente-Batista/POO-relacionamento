package AulaEstudo.CursoPOO;

public class Aula4 {
    public static void main(String[]args){

        Carro carro = new Carro();
        
        carro.setCor("Preto");
        carro.setPortas(4);
        carro.setPlaca("MHX 1453");
        carro.setTipo("Esportivo");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Camila");
        pessoa.setIdade(27);
        carro.setDono(pessoa);

        System.out.println("Cor: " + carro.getCor());
        System.out.println("Portas: " + carro.getPortas());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Modelo: " + carro.getTipo());
        System.out.println("Pertence a: " + carro.getDono().getNome());
    }
}
