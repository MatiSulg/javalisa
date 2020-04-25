public class Vendor {
    private String companyName;
    private String companyAddress;
    private String companyRepresentative;
    private String companyPhoneNumber;

    public Vendor(String companyName, String companyAddress,
                  String companyRepresentative, String companyPhoneNumber){
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyRepresentative = companyRepresentative;
        this.companyPhoneNumber = companyPhoneNumber;
    }
    public Vendor(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyRepresentative() {
        return companyRepresentative;
    }

    public void setCompanyRepresentative(String companyRepresentative) {
        this.companyRepresentative = companyRepresentative;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String toString(){
        return "Company name: " + companyName + ", Company address: " + companyAddress +
                ", Company representative: " + companyRepresentative +
                ", Company phone number: " + companyPhoneNumber;
    }
}
