import java.util.ArrayList;
import Poo.Aluno;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listAlunos = new ArrayList<>();
        while (true){
            String nome,materia;
            Double nota1,nota2;

            System.out.println("Medias de notas por materias");

            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Matéria: ");
            materia = sc.nextLine();
            System.out.println("Digite a primeira nota: ");
            nota1 = sc.nextDouble();
            System.out.println("Digite a segunda nota: ");
            nota2 = sc.nextDouble();

            sc.nextLine();

            Aluno aluno = new Aluno(nome,materia,nota1,nota2);

            listAlunos.add(aluno);
            System.out.println("Deseja cadastrar mais alguma matéria? [SIM - S] [NÃO - N]");
            String sair = sc.nextLine().toLowerCase();

            if (sair.equals("s")){
                System.out.println("Continuando");
            }
            else {
                for (Aluno exibir:listAlunos){
                    System.out.println("======INFORMAÇÕES======");
                    System.out.println("NOME: " + exibir.getNome());
                    System.out.println("MATÉRIA: " + exibir.getMateria());
                    System.out.println("PRIMEIRA NOTA: " + exibir.getNota1());
                    System.out.println("SEGUNDA NOTA: " + exibir.getNota2());
                    System.out.println("SUA MÉDIA: " + exibir.calcularmedia());
                    exibir.condicao();

                }
                break;
            }
        }
    }


}
