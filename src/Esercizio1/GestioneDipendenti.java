package Esercizio1;

public class GestioneDipendenti {

    public static void main(String[] args) {
        // istanzia 4 dipendenti
        Dipendente operaio1 = new Dipendente(1, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente operaio2 = new Dipendente(2, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente impiegato1 = new Dipendente(3, 1500, 40, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente1 = new Dipendente(4, 2000, 50, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);
        
        // promuove un operaio a impiegato
        operaio1.promuovi();
        // promuove l'impiegato a quadro
        impiegato1.promuovi();
        
        // stampa lo stato di tutti i dipendenti
        System.out.println("Stato dei dipendenti:");
        System.out.println("---------------------");
        operaio1.stampaDatiDipendente();
        System.out.println();
        operaio2.stampaDatiDipendente();
        System.out.println();
        impiegato1.stampaDatiDipendente();
        System.out.println();
        dirigente1.stampaDatiDipendente();
        System.out.println();
        
        // calcola la somma di tutti gli stipendi comprendendo per ciascuno 5 ore di straordinario e stampa l'importo
        double sommaStipendi = Dipendente.calcolaPaga(operaio1, 5) + Dipendente.calcolaPaga(operaio2, 5) +
                Dipendente.calcolaPaga(impiegato1, 5) + Dipendente.calcolaPaga(dirigente1, 5);
        System.out.println("Totale stipendi: " + sommaStipendi + " euro");
    }
}
