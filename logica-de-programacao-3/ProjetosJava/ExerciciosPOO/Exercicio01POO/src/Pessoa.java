import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {
    private String nome;
    private Date dataNasc;
    private float altura;

    public Pessoa(String nome, Date dataNasc, float altura) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdataNasc() {
        return dataNasc;
    }

    public void setDataNascimento(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int calcularIdade(java.util.Date dataNasc) {
        
        Calendar dataNascimento = new GregorianCalendar();
        dataNascimento.setTime(dataNasc);

        Calendar dataAtual = Calendar.getInstance();

        int idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

        dataNascimento.add(Calendar.YEAR, idade);

        if (dataAtual.before(dataNascimento)) {
            idade--;
        } else {
            return idade;
        }
        
        return idade;
    }

}
