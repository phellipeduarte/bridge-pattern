public class Cacador extends Jogador{

    public Cacador(Integer experiencia){
        super(experiencia);
        this.multiplicadorClasse = 1.15F;
    };

    public Float getExperienciaFaltante() {
        return (this.nivel.getExperienciaProximoNivel() * this.multiplicadorClasse - this.experiencia)
                * (1 - this.nivel.getPercentualGanhoExperiencia());
    }
}
