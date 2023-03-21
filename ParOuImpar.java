/*  Atividade de: Angelo Gabriel Nunes Pinheiro da Silva 
	Dia: 21/03/2023
	Tutora: Raquel Santos
	Disciplina de: Analise e Desenvolvimento de Sistemas
	Faculdade: Anhanguera
	

	Nota pessoal: Já estudei um pouco de JAVA no passado, então ainda me lembro de algumas coisas então decidi por a pratica

	Uma simples calculadora utilizando if, else e comparativos booleanos
*/



import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {

		int num1, num2, total;
		String op;

		System.out.println("Escolha uma operação para começar");
		System.out.println("+ / - / * / %");
		Scanner scanner = new Scanner(System.in);
		op = scanner.nextLine();
		if (op.equals("+")) {

			System.out.println("Insira o primeiro valor");
			Scanner scanner1 = new Scanner(System.in);
			num1 = scanner1.nextInt();
			System.out.println("Insira o segundo valor");
			Scanner scanner2 = new Scanner(System.in);
			num2 = scanner2.nextInt();
			total = num1 + num2;
			System.out.println("a soma total é: " + total);

		} else {
			if (op.equals("-")) {
				System.out.println("Insira o valor maior");
				Scanner scanner1 = new Scanner(System.in);
				num1 = scanner1.nextInt();
				System.out.println("Insira o valor menor");
				Scanner scanner2 = new Scanner(System.in);
				num2 = scanner2.nextInt();
				total = num1 - num2;
				System.out.println("sobrou apenas : " + total);

			} else {
				if (op.equals("*")) {
					System.out.println("Insira o primeiro maior");
					Scanner scanner1 = new Scanner(System.in);
					num1 = scanner1.nextInt();
					System.out.println("Insira o segundo valor");
					Scanner scanner2 = new Scanner(System.in);
					num2 = scanner2.nextInt();
					total = num1 * num2;
					System.out.println("o resultado da multiplicação é : " + total);

				} else {
					if (op.equals("%")) {
						System.out.println("Insira o primeiro maior");
						Scanner scanner1 = new Scanner(System.in);
						num1 = scanner1.nextInt();
						System.out.println("Insira o segundo valor");
						Scanner scanner2 = new Scanner(System.in);
						num2 = scanner2.nextInt();
						total = num1 % num2;
						System.out.println("o resto é : " + total);

					}
				}
			}

		}
	}
}
