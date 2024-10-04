package aplicacao;


import java.util.Scanner;
import entidade.Pessoa;
import entidade.Aluno;
public class Principal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Deseja instanciar uma pessoa ou um aluno? (pessoa/aluno)");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("pessoa")) {

                System.out.println("Digite o nome da pessoa:");
                String nome = scanner.nextLine();
                System.out.println("Digite a idade da pessoa:");
                int idade = scanner.nextInt();


                Pessoa pessoa = new Pessoa(nome, idade);
                pessoa.mostrarDados();

            } else if (escolha.equalsIgnoreCase("aluno")) {

                System.out.println("Digite o nome do aluno:");
                String nome = scanner.nextLine();
                System.out.println("Digite a idade do aluno:");
                int idade = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o número da matrícula:");
                int matricula = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o nome do curso:");
                String curso = scanner.nextLine();


                Aluno aluno = new Aluno(nome, idade, matricula, curso);
                aluno.mostrarDados();

            }



            else {
                System.out.println("Opção inválida.");
            }

            scanner.close();
        }
    }
