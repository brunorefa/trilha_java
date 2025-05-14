public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        System.out.println("Ligando a TV");
        smartTv.mudarCanal(10);
        System.out.println("Mudando canal para 10"); 
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Aumentando volume");
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.mostrarStatus();
        System.out.println("Status da TV:");
        smartTv.mudarCanal(20);
        System.out.println("Canal: " + smartTv.canal);
        smartTv.ligar();
        System.out.println("Ligando a TV");
    }
}
