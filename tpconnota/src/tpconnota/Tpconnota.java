package tpconnota;

public class Tpconnota {

    public static void main(String[] args) {

        Juegos AJuegos[] = new Juegos[5];
        Serie ASeries[] = new Serie[5];

        Juegos j1 = new Juegos("Diablo III", 5, "Accion RPG", "activision");
        Juegos j2 = new Juegos("The binding of isaac", 3, "sub RPG", "no se");
        Juegos j3 = new Juegos("Minecraft", 8, "sandbox", "microsoft");
        Juegos j4 = new Juegos("Castle crashers", 30, "Accion", "Steam");
        Juegos j5 = new Juegos("Papas bakeria", 100, "nose jaja", "tampoco se ");

        Serie s1 = new Serie("Stranger Things", 4, "Ficcion", "Netflix");
        Serie s2 = new Serie("Black Mirror", 11, "Ficcion", "Netflix");
        Serie s3 = new Serie("Arrow", 6, "Accion", "Netflix");
        Serie s4 = new Serie("Big little liars", 2, "Drama", "Amazon");
        Serie s5 = new Serie("Bad Boys", 2, "Accion", "Amazon");

        AJuegos[0] = j1;
        AJuegos[1] = j2;
        AJuegos[2] = j3;
        AJuegos[3] = j4;
        AJuegos[4] = j5;

        ASeries[0] = s1;
        ASeries[1] = s2;
        ASeries[2] = s3;
        ASeries[3] = s4;
        ASeries[4] = s5;

        int i, juegosE = 0, seriesE = 0;
j1.entregar();
        for (i = 0; i < 5; i++) {
            if (AJuegos[i].isEntregado() == true) {
                juegosE++;
            }
        }
        System.out.println("Juegos Entregados: " + juegosE);

        for (i = 0; i < 5; i++) {
            if (ASeries[i].isEntregado() == true) {
                seriesE++;
            }
        }
        System.out.println("Juegos Entregados: " + juegosE);
        
        
    for (i=0; i<5; i++) {
    AJuegos[i].devolver();
}
    for (i=0; i<5; i++) {
    ASeries[i].devolver();
}
    
    Juegos mayorJuego = new Juegos();
    Serie mayorSerie = new Serie ();
    
    for (i=0; i<4; i++){ 
    mayorJuego = mayorJuego.compareToV(AJuegos[i], AJuegos[i++]);
}
    for (i=0; i<4; i++) { 
    mayorSerie = mayorSerie.compareToS(ASeries[i], ASeries[i++]);
}
        
        System.out.println(mayorJuego.getTitulos());
        System.out.println(mayorSerie.getTitulo());
}
}

    