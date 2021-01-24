
package es6.esercizio6;

public class DettaglioOrdine {
    
    private Prodotto prodotto;
    private int qta;

    public DettaglioOrdine(Prodotto prodotto, int qta) {
        this.prodotto = prodotto;
        this.qta = qta;
    }

    
    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public int getQta() {
        return qta;
    }

    public void setQta(int qta) {
        this.qta = qta;
    }
    
    
    
}
