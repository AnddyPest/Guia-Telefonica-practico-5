package guia.telefonica;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

    int dni;
    String nombre;
    String apellido;
    String ciudad;
    String direccion;
    //TreeSet<Cliente> clientes;

    public Cliente(int dni, String nombre, String apellido, String ciudad, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
        //this.clientes = new TreeSet();

    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   /* public TreeSet<Cliente> getPersona() {
        return clientes;
    }

    public void setPersona(TreeSet<Cliente> persona) {
        this.clientes = persona;
    }

    public boolean addCliente(Cliente cliente) {
        if (clientes.contains(cliente)) {
            return false;
        } else {
            clientes.add(cliente);
            return true;
        }
    }*/



@Override
public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.dni;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.apellido);
        hash = 83 * hash + Objects.hashCode(this.ciudad);
        hash = 83 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }

    @Override
public String toString() {
        
        return "DNI: "+dni+" - "+"Apellido: "+apellido+" - "+"Nombre: "+nombre+" - "+"Ciudad: "+ciudad+" - "+"Direccion: "+direccion;
    }
   ;

    @Override

public int compareTo(Cliente o) {
        if(this.apellido.equalsIgnoreCase(o.apellido)){
            return this.nombre.compareTo(o.nombre);
        }else{
        return this.apellido.compareTo(o.getApellido());
        
        }
    }
}
