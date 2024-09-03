

package guia.telefonica;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author mauri
 */
/*public class GuiaTelefonica {
    
    
    public TreeMap<Long, Cliente> clienteTel = new TreeMap();

     public TreeMap<Long, Cliente> getCliente() {
        return clienteTel;
    }

    public void setCliente(TreeMap<Long, Cliente> cliente) {
        this.clienteTel = cliente;
    }
    
    public Cliente getTelefono(Long telefono){
        return clienteTel.get(telefono);
    }
    
    public Set<Long> getTodoTelefonos(){
        return clientes.keySet();
    }
    
    public void putCliente(Long telefono, Cliente cliente) {
        if(!clienteTel.containsKey(telefono)){
            clienteTel.put(telefono, cliente);
        }
}

    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.clienteTel);
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
        final GuiaTelefonica other = (GuiaTelefonica) obj;
        return Objects.equals(this.clienteTel, other.clienteTel);
    }

    @Override
    public String toString() {
        
        return Map.entry(this, this).getKey().toString();
    }

    
}

   
    
    

