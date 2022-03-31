import java.util.HashMap;
import java.util.Set;

public class Hasmap{
    public static void main(String[] args) 
    {
        HashMap<String,String> trackList = new HashMap<String,String>();

        trackList.put("la bamba","Para bailar la bamba, para bailar la bamba se necesita una poca de gracia,una poca de gracia y otra cosita. Y arriba y arriba");
        trackList.put("mil horas","Hace frío y estoy lejos de casa Hace tiempo que estoy sentado sobre esta piedra Yo me pregunto ¿Para qué sirven las guerras?");
        trackList.put("un beso y una flor","Al partir un beso y una flor Un te quiero una caricia y un adiós Es ligero equipaje Para un tan largo viaje");
        trackList.put("color esperanza","Pintarse la cara Color esperanza Tentar al futuro Con el corazón");

        Set<String> tracks = trackList.keySet();

        System.out.println("Encuentra la letra de las canciones");
        System.out.println("Lista de canciones");

        for(String track : tracks)
        {
            System.out.println(track);
        }

        System.out.print("Por favor, ingresa el nombre de la cancion a buscar: ");
        String cancion = System.console().readLine();

        for(String track : tracks)
        {
            if(cancion.equals(track))
            {
                System.out.println("La letra de la cancion de "+track+" es: "+trackList.get(track));
            }
        }

    }
}