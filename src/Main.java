import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args){

      Curso curso1 = new Curso();
      curso1.setTitulo("Curso java");
      curso1.setDescricao("descrição curso java");
      curso1.setCargaHoraria(8);

      Curso curso2 = new Curso();
      curso2.setTitulo("Curso js");
      curso2.setDescricao("descrição curso js");
      curso2.setCargaHoraria(4);

      Mentoria mentoria = new Mentoria();
      mentoria.setTitulo("mentoria java");
      mentoria.setDescricao("descrição mentoria java");
      mentoria.setData(LocalDate.now());


      /*System.out.println(curso1);
      System.out.println(curso2);
      System.out.println(mentoria);*/

      Bootcamp bootcamp = new Bootcamp();
      bootcamp.setNome("Bootcamp Java Developer");
      bootcamp.setDescricao("Descrição Bootcamp Java Developer");
      bootcamp.getConteudos().add(curso1);
      bootcamp.getConteudos().add(curso2);
      bootcamp.getConteudos().add(mentoria);

      Dev devcassio = new Dev();
      devcassio.setNome("cassio");
      devcassio.inscreverBootcamp(bootcamp);
      System.out.println("conteudo Inscritos" + devcassio.getConteudoInscrito());
      devcassio.progredir();
      devcassio.progredir();
      System.out.println(".");
      System.out.println("conteudo Inscritos" + devcassio.getConteudoInscrito());
      System.out.println("conteudo concluidos" + devcassio.getConteudoConcluido());
      System.out.println("XP: "+ devcassio.calcularTotalXp());
      
      System.out.println("...................................");

      Dev devjoao = new Dev();
      devjoao.setNome("Joao");
      devjoao.inscreverBootcamp(bootcamp);
      System.out.println("conteudo Inscritos " + devjoao.getConteudoInscrito());
      devjoao.progredir();
      devjoao.progredir();
      devjoao.progredir();
      System.out.println(".");
      System.out.println("conteudo Inscritos " + devjoao.getConteudoInscrito());
      System.out.println("conteudo concluidos" + devjoao.getConteudoConcluido());
      System.out.println("XP: "+ devjoao.calcularTotalXp());

    }
}
