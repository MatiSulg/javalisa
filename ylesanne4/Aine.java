public class Aine {
    private String kood;
    private String nimetus;
    private int ainepunktideArv;

    public Aine(){

    }

    public Aine(String kood, String nimetus, int ainepunktideArv){
        this.kood = kood;
        this.nimetus = nimetus;
        this.ainepunktideArv = ainepunktideArv;
    }

    public String getKood() {
        return kood;
    }

    public void setKood(String kood) {
        this.kood = kood;
    }

    public String getNimetus() {
        return nimetus;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public int getAinepunktideArv() {
        return ainepunktideArv;
    }

    public void setAinepunktideArv(int ainepunktideArv) {
        this.ainepunktideArv = ainepunktideArv;
    }

    public String toString(){
        return "Kood: " + kood + ", Nimetus: " + nimetus + ", Ainepunktide Arv: " + ainepunktideArv;
    }

    public void tundideArv(){
        System.out.println("Tundide arv: " + ainepunktideArv * 8);
    }

}
