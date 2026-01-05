package Poo;

public class Aluno {

    private String aluno_nome;
    private String materia;
    private Double aluno_nota1;
    private Double aluno_nota2;

    public Aluno(String nome,String materia, Double nota1, Double nota2){
        this.aluno_nome =  nome;
        this.materia = materia;
        this.aluno_nota1 =  nota1;
        this.aluno_nota2 =  nota2;
    }
    public double  calcularmedia(){
        return (aluno_nota1 + aluno_nota2) /2;
    }

    public void condicao(){
        Double media = calcularmedia();
        if (media <= 3) {
            System.out.println("Sua media foi: " + calcularmedia() + " Reprovado automaticamente");
        }
        else if (media >= 4 && media< 6){
        System.out.println("Sua media foi: " + media + " Recuperação");
        }
        else{
            System.out.println("Aluno aprovado");
        }
    }

    public String getNome(){
        return aluno_nome;
    }
    public String getMateria(){
        return materia;
    }
    public Double getNota1(){
        return  aluno_nota1;
    }
    public Double getNota2(){
        return aluno_nota2;
    }



}
