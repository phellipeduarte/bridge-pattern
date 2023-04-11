public class Sacerdote extends Jogador{

    public Sacerdote(Integer experiencia){
        super(experiencia);
        this.multiplicadorClasse = 1.5F;
    };

    public Float getExperienciaFaltante() {
        return (this.nivel.getExperienciaProximoNivel() * this.multiplicadorClasse - this.experiencia)
                * (1 - this.nivel.getPercentualGanhoExperiencia());
    }
}
