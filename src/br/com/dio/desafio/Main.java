package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

  public static void main(String[] args) {

    Curso curso1 = new Curso("curso java", "descri��o curso java", 8);

    Curso curso2 = new Curso("curso js", "descri��o curso js", 4);

    Mentoria mentoria = new Mentoria("mentoria de java", "descri��o mentoria java", LocalDate.now());

    Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descri��o Bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conte�dos Inscritos Camila:"
        + devCamila.getConteudosInscritos());
    devCamila.progredir();
    devCamila.progredir();
    System.out.println("-");
    System.out.println("Conte�dos Inscritos Camila:"
        + devCamila.getConteudosInscritos());
    System.out.println("Conte�dos Conclu�dos Camila:"
        + devCamila.getConteudosConcluidos());
    System.out.println("XP:" + devCamila.calcularTotalXp());

    System.out.println("-------");

    Dev devJoao = new Dev("Joao");
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conte�dos Inscritos Jo�o:"
        + devJoao.getConteudosInscritos());
    devJoao.progredir();
    devJoao.progredir();
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conte�dos Inscritos Jo�o:"
        + devJoao.getConteudosInscritos());
    System.out.println("Conte�dos Concluidos Jo�o:"
        + devJoao.getConteudosConcluidos());
    System.out.println("XP:" + devJoao.calcularTotalXp());

  }

}
