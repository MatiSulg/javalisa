public class Oppekava {
    private String oppekavaKood;
    private Aine[] ained;

    public Oppekava(){

    }

    public String getOppekavaKood() {
        return oppekavaKood;
    }

    public void setOppekavaKood(String oppekavaKood) {
        this.oppekavaKood = oppekavaKood;
    }

    public Aine[] getAined() {
        return ained;
    }

    public void setAined(Aine[] ained) {
        this.ained = ained;
    }

    public String toString(){
        return "Õppekava Kood: " + oppekavaKood + "\nAined: \n" + ainedToString(ained);
    }

    private String ainedToString(Aine[] ained){
        String s = "";
        for(Aine a: ained){
            s = s + a +"\n";
        }
        return s;
    }
}
