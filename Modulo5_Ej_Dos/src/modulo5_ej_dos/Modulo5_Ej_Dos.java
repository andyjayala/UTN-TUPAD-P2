/*
2. Celular - Batería - Usuario
a. Agregación: Celular → Batería
b. Asociación bidireccional: Celular ↔ Usuario
Clases y atributos:
i. Celular: imei, marca, modelo
ii. Batería: modelo, capacidad
iii. Usuario: nombre, dni
 */
package modulo5_ej_dos;


public class Modulo5_Ej_Dos {

    public static void main(String[] args) {

        // Para poder hacer la agregación, tengo que instanciar primero la bateria y después asociarla 
        // al celular correspondiente:
        
        Bateria bateriaUno = new Bateria("S23", 3000);
        Celular celuUno = new Celular("ImeiUno", "Samsung", "S23", bateriaUno);

        Bateria bateriaDos = new Bateria("Sony Ericsson", 2000);
        Celular celuDos = new Celular("ImeiDos", "Sony", "SonyEric", bateriaDos);
        
        System.out.println("Probamos el metodo para mostrar los datos del Celular 1: ");
        celuUno.mostrarCelular();
        System.out.println("");
        System.out.println("Probamos el metodo para mostrar los datos de la Bateria 2: ");
        celuDos.getBateria().mostrarBateria();
        
        System.out.println("----------------------------------------------");
        System.out.println("");
        
        // Ahora para hacer la relación bidireccional voy a crear dos usuarios
        
        Usuario usuarioUno = new Usuario("Junito Gonzalez", "67892332");
        Usuario usuarioDos = new Usuario("Mr. Spiderman", "22334455");
        
        // Asocio desde cada lado:
        
        usuarioUno.setCelular(celuUno);
        celuDos.setUsuario(usuarioDos);
        
        // Muestro mediante metodos distintos, accediendo desde ambos objetos:
        
        usuarioUno.mostrarUsuarioConCelu();
        System.out.println("");
        celuDos.mostrarCelularConUsuario();
         
    }
    
}
