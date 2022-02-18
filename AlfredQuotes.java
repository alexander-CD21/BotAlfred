import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // No necesitas codificar aquí, este es un método de ejemplo
        return "Hola, encantado de verte. ¿Cómo estás?";
    }
    
    public String guestGreeting(String name) {
         String saludo = String.format("Hola , %s. Encantado de verte",name);
        return saludo;
    }

    public String guestGreeting(String name, String dayPeriod){
        String saludo1=String.format("Buenas %s,%s.Encantado de verte",dayPeriod,name);
        return saludo1;
    }

    public String respuestaEnfadada(String respuesta ) {
         String respuestaBot = String.format("AHHHHHH PARA ESO VIVES HUMANO %s",respuesta);
        return respuestaBot;
    }

    public String guestGreeting(){

        String nombre="BETH kAne";
        Date date = new Date();  
        SimpleDateFormat periodoDia = new SimpleDateFormat("H");  
        String strDate= periodoDia.format(date); 
        int hora=Integer.parseInt(strDate); 

        if ( hora > 0 && hora < 12){
             return "Buenas dias"+ nombre +".Encantado de verte";
        }
        if ( hora > 12 && hora < 19){
            return "Buenas tardes"+ nombre+ ".Encantado de verte";
        }
        if ( hora > 19 && hora < 24){
           return "Buenas noches"+ nombre +".Encantado de verte";
        }
        return "";
    }

    public String dateAnnouncement() {
        Date date = new Date() ; 
        return "Actualmente es, " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if ( conversation.indexOf("Alexis") > -1){
            return "De inmediato,señor";
        }
        if( conversation.indexOf("Alfred") > -1){
            return "A su servicio.Como desee.";
        }
        return "Bien. Y con eso me retirare";
    }
    
	
}
