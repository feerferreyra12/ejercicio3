public class Main {

    public static int sumarTresNumeros(int a, int b, int c){
        int suma = a + b + c;
        return suma;
    }
    public static void main(String[] args) {
        int resultado = sumarTresNumeros(5,10 ,15 );
        System.out.println(resultado);
    }
}

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
