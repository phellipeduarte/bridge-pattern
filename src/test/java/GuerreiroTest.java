import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuerreiroTest {

    @Test
    void deveRetornarExpericienciaFaltanteAprendiz(){
        Nivel nivel = new Aprendiz();
        Jogador jogador = new Guerreiro(200);
        jogador.setNivel(nivel);

        assertEquals(500, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteBasico(){
        Nivel nivel = new Basico();
        Jogador jogador = new Guerreiro(200);
        jogador.setNivel(nivel);

        assertEquals(1650, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteIntermediario(){
        Nivel nivel = new Intermediario();
        Jogador jogador = new Guerreiro(200);
        jogador.setNivel(nivel);

        assertEquals(4640, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteMestre(){
        Nivel nivel = new Mestre();
        Jogador jogador = new Guerreiro(200);
        jogador.setNivel(nivel);

        assertEquals(11800, jogador.getExperienciaFaltante(), 0.01F);

    }
}
