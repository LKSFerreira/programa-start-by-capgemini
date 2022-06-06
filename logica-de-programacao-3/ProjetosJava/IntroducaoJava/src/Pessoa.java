public class Pessoa {
    // Atribultos
    private float peso;
    private float altura;

    public Pessoa(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
        System.out.println("O método executor foi executado");
    }

    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}