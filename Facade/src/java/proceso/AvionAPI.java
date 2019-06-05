package proceso;



public class AvionAPI {

	public String buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino) {
		String todo = "";
                todo = "</Br>"+"=============================="+"</Br>"+"Vuelos encontrados para " + destino + " desde " + origen+
                        "</Br>"+"Fecha IDA: " + fechaIda + " Fecha Vuelta " + fechaVuelta+"</Br>"+"=============================="+"</Br>";

                return todo;
	}

}
