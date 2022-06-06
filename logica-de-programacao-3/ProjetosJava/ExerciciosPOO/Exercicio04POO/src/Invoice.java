/**
 * Invoice
 */
public class Invoice {

    private int codigoItem;
    private String descricaoItem;
    private int quantidadeItem;
    private float precoUnitario;

    public Invoice(int codigoItem, String descricaoItem, int quantidadeItem, float precoUnitario) {
        this.setCodigoItem(codigoItem);
        this.setDescricaoItem(descricaoItem);
        this.setQuantidadeItem(quantidadeItem);
        this.setPrecoUnitario(precoUnitario);
    }

    public double getInvoiceAmount() {
        return quantidadeItem * precoUnitario;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {

        if (quantidadeItem < 0) {
            this.quantidadeItem = 0;
        } else {
            this.quantidadeItem = quantidadeItem;
        }
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

}