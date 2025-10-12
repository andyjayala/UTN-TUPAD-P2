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

public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular() !=this){
            usuario.setCelular(this);
        }
    }
    
    
    public void mostrarCelular(){
        System.out.println("Datos del celular: ");
        System.out.println("Imei: "+imei+ ", Marca: "+marca+ ", Modelo: "+ modelo+", Capacidad Bateria: "+ bateria.getCapacidad());
    }
    
     public void mostrarCelularConUsuario(){
        System.out.println("Datos del Usuario viendolo desde el Celu: ");
        System.out.println("Nombre: "+usuario.getNombre()+ ", con Dni "+ usuario.getDni()+ " tiene un celular "+ modelo);
        
                }
    }
 
