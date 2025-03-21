package Menu.Saludable;

import Interface.IPrincipal;

public class PrincipalSaludable implements IPrincipal {
    @Override
    public String getDescripcion(){
        return "Salmón a la parrilla con vegetales al vapor";
    }

    @Override
    public String getPrecio() {
        return "$ 12.00";
    }
}
