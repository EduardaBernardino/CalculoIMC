package imcvirtual;

public class Main {

		 public static void main(String[] args) {
		        Pessoa objPessoa = new Pessoa("Fabio",57.80, 1.80);
		        objPessoa.calcularIMC(0, 0);
		        
		        Atleta objAtleta = new Atleta("Julia", 60.25, 1.55, "natacao");
		        objAtleta.calcularIMC(0, 0);
		        
		        System.out.println(objPessoa.getNome() + " - IMC: " + objPessoa.calcularIMC(0, 0));
		        System.out.println(objAtleta.getNome() + " - IMC: " + objAtleta.calcularIMC(0, 0));
	}

}
