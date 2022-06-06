/**
 * Vendedor
 */
public class Vendedor extends Funcionario {

    private int totalItensVendido;
    private float comissaoPorItens;

    public Vendedor() {
        super();

    }

    public float calcularSalario() {
        return super.getSalario() + (this.comissaoPorItens * totalItensVendido);
    }

    public int getTotalItensVendido() {
        return totalItensVendido;
    }

    public void setTotalItensVendido(int totalItensVendido) {
        this.totalItensVendido = totalItensVendido;
    }

    public float getComissaoPorItens() {
        return comissaoPorItens;
    }

    public void setComissaoPorItens(float comissaoPorItens) {
        this.comissaoPorItens = comissaoPorItens;
    }

    

}