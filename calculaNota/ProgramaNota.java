package calculaNota;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaNota {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		System.out.print("Média da escola: ");
		aluno.mediaEscola = sc.nextDouble();
		System.out.print("Nota primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Nota segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Nota terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());
		
		if (aluno.notaFinal() < 60) {
			System.out.println("Não Passou");
			System.out.printf("Faltam %.2f pontos%n", aluno.pontosFaltantes());
		}
			
		else {
			System.out.println("Passou");
		}
		sc.close();	
	}
	
}


