/*
Selles ülesandes on vaatluse all õppeained. Koostage klass Aine, milles on
privaatsed isendiväljad koodi (String), nimetuse (String) ja ainepunktide
arvu (int) jaoks (näiteks, meie aine kood on „RT – 016”, nimetus on
“Objektorienteeritud programmeerimine”, ainepunktide arv on 5).

Klassis on vähemalt järgmised meetodid:

-Kõigi isendiväljade jaoks on vastavad get- ja set-meetodid. On ka meetod
toString, mis võimaldab aine infot mõistlikult ekraanil kujutada.

-Ilma argumentideta isendimeetod (int-tüüpi), mis leiab ainepunktide järgi
selle aine sooritamiseks vajaliku klassi tundide arvu (1 ainepunkt on 8 tundi).
Testige konstruktori ja meetodite kasutamist test-klassis.

Koostada klass Oppekava, klassi väljad on :

-String oppekavaKood; Aine [] ained;

-Lisadada konstruktor, getterid ja setterid, toString().

Testige konstruktori ja meetodite kasutamist test-klassis.
*/
public class ylesanne4 {
    public static void main(String[] args) {
        //class Aine
        //Constructor & Methods testing
        Aine aine = new Aine();

        aine.setKood("RT – 016");
        System.out.println(aine.getKood());

        aine.setNimetus("Objektorienteeritud programmeerimine");
        System.out.println(aine.getNimetus());

        aine.setAinepunktideArv(5);
        System.out.println(aine.getAinepunktideArv());

        //toString method
        System.out.println(aine);
        //Instance method
        aine.tundideArv();
        //class Oppekava
        // Constructor & Methods testing
        Oppekava oppekava = new Oppekava();

        oppekava.setOppekavaKood("209702");
        System.out.println(oppekava.getOppekavaKood());

        Aine[] ained = {new Aine("RT-010","OPERATSIOONISÜSTEEMID",3),
                new Aine("RT-011","ARVUTID JA ARVUTIVÕRGUD",2),
                new Aine("RT-012","PROGRAMMEERIMISE ALUSED",5)};
        oppekava.setAined(ained);
        System.out.println(oppekava.getAined()[0]);
        System.out.println(oppekava.getAined()[1]);
        System.out.println(oppekava.getAined()[2]);
        //toString method
        System.out.println(oppekava);
    }
}
