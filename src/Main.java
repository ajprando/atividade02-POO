public class Main {
    public static void main(String[] args) {
        Transportadora trasporteNautico = new TransporteNautico();
        Transportadora transporteTerreste = new TransporteTerrestre();

        int altura = 10;
        int largura = 5;

        double freteNautico = trasporteNautico.calculaFrete(altura, largura);
        double freteTerrestre = transporteTerreste.calculaFrete(altura, largura);

        System.out.println("Frete Náutico: " + freteNautico);
        System.out.println("Frete Terrestre: " + freteTerrestre);
    }
}