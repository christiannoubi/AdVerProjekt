import java.util.Date;

public class Projekt {

    private static  int ANZMITARBEITERZAEHLER = 0;
    private String nameProjekt;
    private String sourceProjekt;
    private Mitarbeiter mitarbeiter;
    private String lageProjekt;
    private Date dateBiginn;
    private Date dateEnde;
    private int anzahlMitarbeiter;



    public Projekt(String nameProjekt, String sourceProjekt, String lageProjekt, Date dateBiginn, Date dateEnde, int anzahlMitarbeiter){
        this.nameProjekt = nameProjekt;
        this.sourceProjekt = sourceProjekt;
       anzahlMitarbeiter = ANZMITARBEITERZAEHLER++;
        this.lageProjekt = lageProjekt;
        this.dateBiginn = dateBiginn;
        this.dateEnde = dateEnde;
    }
    public void status(){

    }
    public void prioritaet(){

    }
    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }
    public String getNameProjekt() {
        return nameProjekt;
    }

    public void setNameProjekt(String nameProjekt) {
        this.nameProjekt = nameProjekt;
    }

    public String getSourceProjekt() {
        return sourceProjekt;
    }

    public void setSourceProjekt(String sourceProjekt) {
        this.sourceProjekt = sourceProjekt;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public String getLageProjekt() {

        return lageProjekt;
    }

    public void setLageProjekt(String lageProjekt) {
        this.lageProjekt = lageProjekt;
    }

    public Date getDateBiginn() {
        return dateBiginn;
    }

    public void setDateBiginn(Date dateBiginn) {
        this.dateBiginn = dateBiginn;
    }

    public Date getDateEnde() {
        return dateEnde;
    }

    public void setDateEnde(Date dateEnde) {
        this.dateEnde = dateEnde;
    }
}
