package UD9_Herencias.UD9ej2;

public class Main {
    public static void main(String[] args) {
        Serie[] series = new Serie[5];
        series[0] = new Serie("Breaking Bad", "Vince Gilligan");
        series[1] = new Serie("Game of Thrones", "David Benioff");
        series[2] = new Serie("Friends", "David Crane");
        series[3] = new Serie("Stranger Things", "The Duffer Brothers");
        series[4] = new Serie("The Crown", "Peter Morgan");

        Videojuego[] videojuegos = new Videojuego[5];
        videojuegos[0] = new Videojuego("The Last of Us", 20);
        videojuegos[1] = new Videojuego("Red Dead Redemption 2", 50);
        videojuegos[2] = new Videojuego("The Witcher 3", 100);
        videojuegos[3] = new Videojuego("GTA V", 30);
        videojuegos[4] = new Videojuego("Assassin's Creed Odyssey", 40);

        series[0].entregar();
        series[1].entregar();
        series[4].entregar();
        videojuegos[2].entregar();
        videojuegos[4].entregar();

        int seriesEntregadas = contarEntregados(series);
        int videojuegosEntregados = contarEntregados(videojuegos);

        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

        Serie serieMasTemporadas = (Serie) obtenerMasEntregado(series);
        Videojuego videojuegoMasHoras = (Videojuego) obtenerMasEntregado(videojuegos);

        System.out.println("Serie con más temporadas: " + serieMasTemporadas);
        System.out.println("Videojuego con más horas estimadas: " + videojuegoMasHoras);
    }

    // Método para contar elementos entregados
    public static int contarEntregados(Entregable[] entregables) {
        int count = 0;
        for (Entregable entregable : entregables) {
            if (entregable.isEntregado()) {
                count++;
            }
        }
        return count;
    }

    // Método para obtener el elemento más entregado
    public static Entregable obtenerMasEntregado(Entregable[] entregables) {
        Entregable masEntregado = entregables[0];
        for (Entregable entregable : entregables) {
            if (entregable.compareTo(masEntregado) > 0) {
                masEntregado = entregable;
            }
        }
        return masEntregado;
    }
}
