package com.example.alan2.tarjeterov2;

import java.util.ArrayList;

public class OrigenDeDatos
{
    public ArrayList<Tarjeta> showAll()
    {
        ArrayList<Tarjeta> resultado=new ArrayList<Tarjeta>();
        Tarjeta uno = new Tarjeta();
        uno.setNombre("Raúl");
        uno.setEdad("22");
        uno.setDescripcion("Amante de los perros. Su sueño es tener un perro de cada raza.");
        uno.ID=1;
        resultado.add(uno);

        Tarjeta dos = new Tarjeta();
        dos.setNombre("Sofía");
        dos.setEdad("18");
        dos.setDescripcion("Le gusta cantar y bailar");
        dos.ID=2;
        resultado.add(dos);

        Tarjeta tres = new Tarjeta();
        tres.setNombre("Jimmy");
        tres.setEdad("15");
        tres.setDescripcion("Juega videojuegos todo el día y le grita a todos en el online");
        tres.ID=3;
        resultado.add(tres);

        Tarjeta cuatro = new Tarjeta();
        cuatro.setNombre("Juana");
        cuatro.setEdad("29");
        cuatro.setDescripcion("Le gusta escuchar a Luis Miguel mientras se baña");
        cuatro.ID=4;
        resultado.add(cuatro);

        Tarjeta cinco = new Tarjeta();
        cinco.setNombre("Alejandro");
        cinco.setEdad("22");
        cinco.setDescripcion("Es todo un misterio, es extremadamente callado y serio.");
        cinco.ID=5;
        resultado.add(cinco);

        Tarjeta seis = new Tarjeta();
        seis.setNombre("Edgar");
        seis.setEdad("17");
        seis.setDescripcion("Le gustan las zanahorias, las ama, no puede vivir sin ellas.");
        seis.ID=6;
        resultado.add(seis);

        Tarjeta siete = new Tarjeta();
        siete.setNombre("María");
        siete.setEdad("45");
        siete.setDescripcion("Siempre saca a sus sobrinos a bailar en las fiestas.");
        siete.ID=7;
        resultado.add(siete);

        Tarjeta ocho = new Tarjeta();
        ocho.setNombre("Sergio");
        ocho.setEdad("27");
        ocho.setDescripcion("No le gusta salir con nadie, prefiere estar solo.");
        ocho.ID=8;
        resultado.add(ocho);

        Tarjeta nueve = new Tarjeta();
        nueve.setNombre("Laura");
        nueve.setEdad("19");
        nueve.setDescripcion("Le gusta salir a todos lados, rara vez está en su casa por lo mismo.");
        nueve.ID=9;
        resultado.add(nueve);

        Tarjeta diez = new Tarjeta();
        diez.setNombre("Pablo");
        diez.setEdad("20");
        diez.setDescripcion("Vende tacos en el puesto de su papá.");
        diez.ID=10;
        resultado.add(diez);
        return resultado;
    }
}
