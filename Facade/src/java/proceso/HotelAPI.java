package proceso;



public class HotelAPI {

	public String buscarHoteles(String fechaEntrada, String fechaSalida, String origen, String destino) {
            String todo = "";
            todo = "</Br>"+ "=============================="
                    +"</Br>"+"Hoteles encontrados"
                    +"</Br>"+"Entrada: " + fechaEntrada + " Salida: " + fechaSalida
                    +"</Br>"+"Hotel A"+"</Br>"+"Hotel B"+"</Br>"+"Hotel C"+"</Br>"+"==============================";
//		System.out.println("==============================");
//		System.out.println("Hoteles encontrados");
//		System.out.println("Entrada: " + fechaEntrada + " Salida: " + fechaSalida);
//		System.out.println("Hotel A");
//		System.out.println("Hotel B");
//		System.out.println("Hotel C");
//		System.out.println("==============================");
            return todo;
	}

}
