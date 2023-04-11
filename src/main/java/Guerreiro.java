public class Guerreiro extends Jogador {

    public Guerreiro(Integer experiencia){
        super(experiencia);
        this.multiplicadorClasse = 1.2F;
    };

    public Float getExperienciaFaltante() {
        return (this.nivel.getExperienciaProximoNivel() * this.multiplicadorClasse - this.experiencia)
                * (1 - this.nivel.getPercentualGanhoExperiencia());
    }
}
