public class ProjektTest {

    public static void main (String [] args){

       /* Projekt [] p = new Projekt[5];
        p [0] = new Projekt(" PSD2 "," gitAdorsys ", " Adorsys Office ", "15.11" ,"30.12",15);*/
       Mitarbeiter [] m = new Mitarbeiter[3];
       m[0] = new Mitarbeiter("Noubi Simeu, Christian", ", Keßlerplatz 12, 90461 Nuernberg "," 016311111 "," Nuernberg Fuetherstr.");
       m[1] = new Mitarbeiter("Noubi Simeu, Christian", ", Keßlerplatz 12, 90461 Nuernberg "," 016311111 "," Nuernberg Fuetherstr.");
       m[2] = new Mitarbeiter("Noubi Simeu, Christian", ", Keßlerplatz 12, 90461 Nuernberg "," 016311111 "," Nuernberg Fuetherstr.");

            System.out.println(m[0].toString());
            System.out.println(m[1].toString());
            System.out.println(m[2].toString());
    }
}
