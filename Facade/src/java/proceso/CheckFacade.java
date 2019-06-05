package proceso;



//import com.mitocode.api.AvionAPI;
//import com.mitocode.api.HotelAPI;

public class CheckFacade {

	private AvionAPI avionAPI;
	private HotelAPI hotelAPI;	
	
	public CheckFacade() {
		avionAPI = new AvionAPI();
		hotelAPI = new HotelAPI();
	}
	
	public String buscar(String fechaIda, String fechaVuelta, String origen, String destino) {
		String A = avionAPI.buscarVuelos(fechaIda, fechaVuelta, origen, destino);
		String B = hotelAPI.buscarHoteles(fechaIda, fechaVuelta, origen, destino);
                
                return A+B;
	}		
}
