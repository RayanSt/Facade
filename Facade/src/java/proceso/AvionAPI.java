package proceso;



public class AvionAPI {

	public String buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		String todo = "";
                todo = "</Br>"+"=============================="+"</Br>"+"Vuelos encontrados para " + destino + " desde " + origen+
                        "</Br>"+"Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta+"</Br>"+"=============================="+"</Br>";
//                System.out.println("==============================");
//		System.out.println("Vuelos encontrados para " + destino + " desde " + origen);
//		System.out.println("Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta);
//		System.out.println("==============================");
                return todo;
	}

}
