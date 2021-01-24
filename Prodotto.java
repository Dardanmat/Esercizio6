
package es6.esercizio6;


public class Prodotto {
    
    public static int codiceProd = 0;
    
    private int codice;
    private String descrizione;
    private float prezzo;

    
    public Prodotto(String descrizione, float prezzo) {
      
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        codice = codiceProd;
        codiceProd++;
        
    }

    public Prodotto(Prodotto p) {
        this.codice = p.getCodice();
        this.descrizione = p.getDescrizione();
        this.prezzo = p.getPrezzo();
    }
    
    
    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }
    
    
    public String toString(){
        
        String inform = "Codice Prodotto: " + codice + " Descrizione: " + descrizione + " Prezzo: " + prezzo;
        return inform;
    }
    
}
