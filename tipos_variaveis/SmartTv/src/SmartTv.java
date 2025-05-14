public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void aumentarVolume() {
        System.out.println("Aumentando volume: " + volume);
        volume++;
        }
    

    void diminuirVolume(){
        System.out.println("Diminuindo volume: " + volume);
        volume--;
        
    }

    
    void mudarCanal(int novoCanal) {
        System.out.println("Mudando canal de " + canal + " para " + novoCanal);
        canal = novoCanal;
    }

    void mostrarStatus() {
        System.out.println("TV " + (ligada ? "ligada" : "desligada"));
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }
}
