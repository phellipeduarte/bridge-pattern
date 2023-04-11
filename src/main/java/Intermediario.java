public class Intermediario implements Nivel{


    private Integer experienciaProximoNivel = 5000;

    public float getPercentualGanhoExperiencia(){
        return 0.20f;
    }

    public Integer getExperienciaProximoNivel() {
        return experienciaProximoNivel;
    }

}


