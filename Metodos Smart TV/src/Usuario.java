public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTV stv = new SmartTV();

        System.out.println("Canal atual: " + stv.canal);
        stv.mudarCanal(13);
        System.out.println("Canal atual: " + stv.canal);
        
        System.out.println("TV ligada? " + stv.ligada);
        
        System.out.println("Volume atual: " + stv.volume);

        stv.ligar();
        System.out.println("Novo status da TV ligada? " + stv.ligada);

        stv.desligar();
        System.out.println("Novo status da TV ligada? " + stv.ligada);

        stv.dimunirVolume();
        stv.dimunirVolume();
        stv.dimunirVolume();
        stv.aumentarVolume();
        System.out.println("Volume atual: " +stv.volume);
    }
}
