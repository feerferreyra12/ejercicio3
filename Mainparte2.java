public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puerta);
    }


    static class Coche {
        public int puerta = 3;

        public void SumarPuerta() {
            this.puerta += 1;
        }
    }
}