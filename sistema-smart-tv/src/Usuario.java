public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " +smartTv.canal);
        System.out.println("Volume Atual: " +smartTv.volume);     
        
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);

        System.out.println("diminuindo volume em 2 pontos");
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " +smartTv.volume); 
        System.out.println("aumentando volume em 4 pontos");    
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " +smartTv.volume); 
        
        smartTv.mudarCanal(13);
        System.out.println("Alterando Canal para 13: " +smartTv.canal);
        
    }
}
