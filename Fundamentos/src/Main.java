import modelo.Auto;
import modelo.Moto;
import modelo.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        Vehiculo miVehiculo = new Vehiculo("Audi", "Blanco", 203);
//        miVehiculo.setMarca("Honda");
//       miVehiculo.mostrarInfo();
//
//        Auto miAuto = new Auto("Subaru", "`Rojo", 230,4);
//       miAuto.mostrarInfo();
//
//        Moto moto = new Moto("Yamaha", "Negro", 140, "Deportivo");
//        moto.mostrarInfo();

        Vehiculo v1 = new Auto("Subaru", "`Rojo", 230,4);
        Vehiculo v2 = new Moto("Yamaha", "Negro", 140, "Deportivo");

//        v1.mostrarInfo();
//        v2.mostrarInfo();

        List<Vehiculo> flota = new ArrayList<>();

        flota.add(new Vehiculo("Honda","Blanco",200));
        flota.add(v1);
        flota.add(v2);

        System.out.println("Total de vehiculos: " + flota.size());

//        for(Vehiculo v : flota){
//            v.mostrarInfo();
//            System.out.println("----");
//        }

//        Vehiculo primero = flota.get(0);
//        primero.mostrarInfo();

//        Vehiculo encontrado = null;
//
//        for (Vehiculo v : flota){
//            if (v.getMarca().equals("Yamahaa")){
//                encontrado = v;
//                break;
//            }
//        }
//
//        if (encontrado != null){
//            System.out.println("Encontrado: " + encontrado.getMarca());
//        }else{
//            System.out.println("No se encontro el vehiculo");
//        }


//        flota.get(0).setMarca("Audi");
//
//        System.out.println(flota.get(0).getMarca());
//
//        flota.remove(1);
//
//        System.out.println("Total de vehiculos: " + flota.size());

        Map<String,Vehiculo> registro = new HashMap<>();

        registro.put("ABC-123",v1);
        registro.put("XYZ-789", v2);
        registro.put("DEF-456",new Moto("Suzuki","Gris",240,"Deportivo"));

        System.out.println("Vehiculos registrados: " + registro.size());


        Vehiculo encontrado = registro.get("XYZ-789");
        encontrado.mostrarInfo();

        if (registro.containsKey("ABC-123")){
            System.out.println("El vehicuol existe");
        }else {
            System.out.println("El vehiculo no existe");
        }

        registro.get("ABC-123").setColor("Verde");
        registro.put("DEF-456",new Moto("Honda","Gris",240,"Clasico"));
        System.out.println(registro.get("DEF-456").getMarca());

        registro.remove("ABC-123");
        System.out.println("Eliminado: " + registro.size());

        for (String placa : registro.keySet()){
            System.out.println("Placa:" + placa);
        }

        for (String placa : registro.keySet()){
            System.out.println("Placa:" + placa + "|Marca: " + registro.get(placa).getMarca());
        }
    }
}
