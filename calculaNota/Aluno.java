package calculaNota;

public class Aluno {
	public String nome;
	public double mediaEscola;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double notaFinal() {
	
	return (nota1 + nota2 + nota3) / 3;
	}
	
	public  double pontosFaltantes() {
		if (notaFinal() < mediaEscola) {
			return mediaEscola - notaFinal()  ;
		}
		else {
			return 0;
		}
	}
}

