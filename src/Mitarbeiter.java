public class Mitarbeiter {

    private String name;
    private String adresse;
    private String telefonnummer;
    private String standort;

    public Mitarbeiter(String name, String adresse, String telefonnummer, String standort){
        this.name = name;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.standort = standort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }
}