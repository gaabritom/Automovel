
public class Automovel {

    private String modelo;
    private String marca;
    private int ano;
    private int velocidade;

    // Construtor padrão
    Automovel() {
        modelo = "Civic";
        marca = "Honda";
        ano = 2020;
        velocidade = 0;
    }

    // Construtor com parâmetros
    Automovel(String m, String ma, int a, int v) {
        modelo = m;
        marca = ma;
        ano = a;
        velocidade = v;
    }

    // Métodos get
    String getModelo() {
        return modelo;
    }

    String getMarca() {
        return marca;
    }

    int getAno() {
        return ano;
    }

    int getVelocidade() {
        return velocidade;
    }

    // Métodos para controlar a velocidade
    public void acelerar(int incremento) {
        velocidade += incremento;
        System.out.println("Acelerando... Nova velocidade: " + velocidade + " km/h");
    }

    public void frear(int decremento) {
        velocidade -= decremento;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println("Freando... Nova velocidade: " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Automovel carro1 = new Automovel();
        Automovel carro2 = new Automovel("Corolla", "Toyota", 2021, 50);

        System.out.println("O carro 1 é um " + carro1.getMarca() + " " + carro1.getModelo() + ", ano " + carro1.getAno());
        System.out.println("O carro 2 é um " + carro2.getMarca() + " " + carro2.getModelo() + ", ano " + carro2.getAno());

        carro1.acelerar(120);
        carro2.frear(130);
    }
}
