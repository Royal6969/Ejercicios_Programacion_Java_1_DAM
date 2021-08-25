package Aviones;

public class Prueba_Vuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Motor miavion = new Motor(1, "seriA", 3, 9);
        Helice tuavion = new Helice(2, "SpaceX", 8, "Gucci");
        Aeropuerto primer = new Aeropuerto(123, "Sevilla", "Sevilla");
        Aeropuerto segundo = new Aeropuerto(321, "Madrid", "Madrid");
        Aeropuerto tercer = new Aeropuerto(432, "Malaga", "Malaga");
        Aeropuerto cua = new Aeropuerto(567, "Sevilla", "Sevilla");
        Aeropuerto cinc = new Aeropuerto(598, "Madrid", "Madrid");
        Aeropuerto six = new Aeropuerto(197, "Malaga", "Malaga");
        Aeropuerto[] conjaeropuerto = {primer,segundo,tercer};
        Aeropuerto[] conjaeropuerto1 = {cua,cinc,six};
        Vuelo Londres = new Vuelo(conjaeropuerto, miavion);
        Vuelo Londres1 = new Vuelo(conjaeropuerto1, tuavion);

        System.out.println("Vuelo 1");
        System.out.println(Londres);
        System.out.println("Vuelo 2");
        System.out.println(Londres1);
        
        if(conjaeropuerto[0].getNombre().equals(conjaeropuerto1[0].getNombre())) {
            if(conjaeropuerto[1].getNombre().equals(conjaeropuerto1[1].getNombre())) {
                if(conjaeropuerto[2].getNombre().equals(conjaeropuerto1[2].getNombre())) {
                    System.out.println("Pasan por los mismos en el mismo orden");
                }else {
                    System.out.println("No");
                }
            }
            else {
                System.out.println("No");
            }
        }
        else {
            System.out.println("No");
        }
	}

}
