package Menu.Vegetariano;

import Interface.IPrincipal;

public class PrincipalVegetariano implements IPrincipal {
    @Override
    public String getDescripcion(){
        return "Magret de pato con puré de batata y espárragos";
    }

    @Override
    public String getPrecio() {
        return "$ 18.00";
    }
}
