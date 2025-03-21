package Menu.Vegetariano;

import Interface.IBebida;

public class BebidaVegetariano implements IBebida {
    @Override
    public String getDescripcion(){
        return "Limonada con albahaca";
    }

    @Override
    public String getPrecio() {
        return "$ 3.00";
    }
}
