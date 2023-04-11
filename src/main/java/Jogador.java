public abstract class Jogador {

    protected Nivel nivel;
    protected Integer experiencia;

    protected Float multiplicadorClasse;

    public Jogador(Integer experiencia){
        this.experiencia = experiencia;
    }

    public void setNivel(Nivel nivel){
        this.nivel = nivel;
    }

    public void setExperiencia(Integer experiencia){
        this.experiencia = experiencia;
    }

    public abstract Float getExperienciaFaltante();
}
