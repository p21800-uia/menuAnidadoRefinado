package uia.com.menu;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws Exception
    {
        System.out.println("Hola, iniciando prueba de concepto de menu, buena suerte");

        String[] opcionesMenuMain ={"Salir", "Contactos", "Eventos", "Recordatorios"};
        String[] opcionesMenuContactos ={"Salir", "Nuevo", "Modificar", "Borrar"};
        String[] opcionesMenuNuevoContacto ={"Salir", "Nombre", "Telefono"};
        NodoMenu menuPrincipal = new NodoMenu("Principal", "Introduzca la opción deseada ?:",  opcionesMenuMain, "", "", 0);
        menuPrincipal.setMenu("Contactos", "Contactos", "Introduzca la opción deseada ?:",  opcionesMenuContactos, "", "", 0);
        menuPrincipal.getNodoMenu("Contactos")
                    .getNodoMenu("Nuevo")
                    .setMenu("Nuevo", "Nuevo", "Introduzca la opción deseada ?:",  opcionesMenuNuevoContacto, "", "", 1);

        /*
        String[] opcionesMenuNuevoContactoNombre ={"Salir", "Introduzca el nombre del contacto ?"};
        menuPrincipal.getNodoMenu("Contactos")
                .getNodoMenu("Nuevo")
                .getNodoMenu("Nombre")
                .setMenu("Nombre", "Nombre", "Introduzca el nombre del contacto ?:",  opcionesMenuNuevoContactoNombre, "", "", 1);
         */
        menuPrincipal.pregunta();

    }
}
