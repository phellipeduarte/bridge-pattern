import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagoTest {

    @Test
    void deveRetornarExpericienciaFaltanteAprendiz(){
        Nivel nivel = new Aprendiz();
        Jogador jogador = new Mago(100);
        jogador.setNivel(nivel);

        assertEquals(450, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteBasico(){
        Nivel nivel = new Basico();
        Jogador jogador = new Mago(100);
        jogador.setNivel(nivel);

        assertEquals(1425, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteIntermediario(){
        Nivel nivel = new Intermediario();
        Jogador jogador = new Mago(100);
        jogador.setNivel(nivel);

        assertEquals(3920, jogador.getExperienciaFaltante(), 0.01F);

    }

    @Test
    void deveRetornarExpericienciaFaltanteMestre(){
        Nivel nivel = new Mestre();
        Jogador jogador = new Mago(100);
        jogador.setNivel(nivel);

        assertEquals(9900, jogador.getExperienciaFaltante(), 0.01F);

    }
}
