import java.util.Date;

public class Projekt {

    private String nameProjekt;
    private String sourceProjekt;
    private Mitarbeiter mitarbeiter;
    private AufgabeMitarbeiter aufgabeMitarbeiter;
    private String lageProjekt;
    private Date dateBiginn;
    private Date dateEnde;

    public Projekt(String nameProjekt, String sourceProjekt, Mitarbeiter mitarbeiter, String lageProjekt, Date dateBiginn, Date dateEnde, AufgabeMitarbeiter aufgabeMitarbeiter){
        this.nameProjekt = nameProjekt;
        this.sourceProjekt = sourceProjekt;
        this.mitarbeiter = mitarbeiter;
        this.lageProjekt = lageProjekt;
        this.dateBiginn = dateBiginn;
        this.dateEnde = dateEnde;
        this.aufgabeMitarbeiter = aufgabeMitarbeiter;
    }
    public void status(){

    }
    public void prioritaet(){

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

    public AufgabeMitarbeiter getAufgabeMitarbeiter() {
        return aufgabeMitarbeiter;
    }

    public void setAufgabeMitarbeiter(AufgabeMitarbeiter aufgabeMitarbeiter) {
        this.aufgabeMitarbeiter = aufgabeMitarbeiter;
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
