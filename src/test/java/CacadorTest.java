import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CacadorTest {

    @Test
    void deveRetornarExpericienciaFaltanteAprendiz(){
        Nivel nivel = new Aprendiz();
        Jogador jogador = new Cacador(400);
        jogador.setNivel(nivel);

        assertEquals(375, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteBasico(){
        Nivel nivel = new Basico();
        Jogador jogador = new Cacador(400);
        jogador.setNivel(nivel);

        assertEquals(1425, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteIntermediario(){
        Nivel nivel = new Intermediario();
        Jogador jogador = new Cacador(400);
        jogador.setNivel(nivel);

        assertEquals(4280, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteMestre(){
        Nivel nivel = new Mestre();
        Jogador jogador = new Cacador(400);
        jogador.setNivel(nivel);

        assertEquals(11100, jogador.getExperienciaFaltante(), 0.01F);

    }
}
