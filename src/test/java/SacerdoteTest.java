import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SacerdoteTest {

    @Test
    void deveRetornarExpericienciaFaltanteAprendiz(){
        Nivel nivel = new Aprendiz();
        Jogador jogador = new Sacerdote(300);
        jogador.setNivel(nivel);

        assertEquals(600, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteBasico(){
        Nivel nivel = new Basico();
        Jogador jogador = new Sacerdote(300);
        jogador.setNivel(nivel);

        assertEquals(2025, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteIntermediario(){
        Nivel nivel = new Intermediario();
        Jogador jogador = new Sacerdote(300);
        jogador.setNivel(nivel);

        assertEquals(5760, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteMestre(){
        Nivel nivel = new Mestre();
        Jogador jogador = new Sacerdote(300);
        jogador.setNivel(nivel);

        assertEquals(14700, jogador.getExperienciaFaltante(), 0.01F);

    }
}
