import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer","Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(new Curso("curso java", "descrição curso java", 8));
        bootcamp.getConteudos().add(new Curso("curso js", "descrição curso js", 4));
        bootcamp.getConteudos().add(new Mentoria("mentoria de java","descrição mentoria java",LocalDate.now()));

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.printInscritos();
        devCamila.progredir();
        devCamila.progredir();
        devCamila.printFinal();

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        devJoao.printInscritos();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        devJoao.printFinal();
    }

}
