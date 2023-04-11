public class Mago extends Jogador{

    public Mago(Integer experiencia){
        super(experiencia);
        this.multiplicadorClasse = 1F;
    };

    public Float getExperienciaFaltante() {
        return (this.nivel.getExperienciaProximoNivel() * this.multiplicadorClasse - experiencia)
                * (1 - this.nivel.getPercentualGanhoExperiencia());
    }

}
