package sec11_Datas;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TrabalhandoComCalendar {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date nascimento = Date.from(Instant.parse("1990-07-22T12:00:00Z"));
		Date now = new Date();
		
		System.out.println("SEM FORMATAÇÃO = " + nascimento);
		System.out.println("COM FORMATAÇÃO = " + sdf.format(nascimento));
		System.out.println("AGORA = " + sdf.format(now));
		
		// USANDO O 'CALENDAR' PARA ACRESCENTAR UM PERÍODO DE TEMPO À DATA.
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(now);
		int minutos = calendario.get(Calendar.MINUTE);
		int mes = 1 + calendario.get(Calendar.MONTH);
		calendario.add(Calendar.HOUR_OF_DAY, 6);
		now = calendario.getTime();
		
		System.out.println("AGORA ACRESCIDO DE 6hrs = " + sdf.format(now));
		System.out.println("MINUTOS = " + minutos);
		System.out.println("MÊS = " + mes);
		
	} 

}
