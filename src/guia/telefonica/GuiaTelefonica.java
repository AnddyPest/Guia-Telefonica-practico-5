

package guia.telefonica;

import java.util.Objects;
import java.util.TreeMap;

/**
 *
 * @author mauri
 */
public class GuiaTelefonica {

    public static TreeMap<Long, Cliente> cliente = new TreeMap();

    public TreeMap<Long, Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(TreeMap<Long, Cliente> cliente) {
        this.cliente = cliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.cliente);
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
        return Objects.equals(this.cliente, other.cliente);
    }

   
    
    
}
