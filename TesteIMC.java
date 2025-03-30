package imcvirtual;

public class TesteIMC {
	public static void main(String[] args) {
		Pessoa objPessoa = new Pessoa("Fabio",57.80, 1.80);
        objPessoa.calcularIMC(0, 0);
        
        Atleta objAtleta = new Atleta("Julia", 60.25, 1.55, "natacao");
        objAtleta.calcularIMC(0, 0);
        
        System.out.println(objPessoa.getNome() + " - IMC: " + objPessoa.calcularIMC(0, 0));
        System.out.println(objAtleta.getNome() + " - IMC: " + objAtleta.calcularIMC(0, 0));
        
       objPessoa.setPeso(57);
       objAtleta.setAltura(1.85);
       objAtleta.setEsportePraticado("natacao");
       
       System.out.println(objPessoa.getNome() + " - Calc IMC" + objPessoa.getPeso()+ " kg - Novo IMC: " + objPessoa.calcularIMC(1.80, 57.80));
       System.out.println(objAtleta.getNome() + " (" + objAtleta.getesportePraticado()+ ") - Nova altura: " + objAtleta.getAltura()+ " m - Novo IMC Ajustado: " + objAtleta.calcularIMC(1.55, 60.25));
}

}

