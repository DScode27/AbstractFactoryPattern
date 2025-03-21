package Menu.Gourmet;

import Interface.IBebida;

public class BebidaGourmet implements IBebida {
    @Override
    public String getDescripcion(){
        return "Copa de vino blanco Chardonnay";
    }

    @Override
    public String getPrecio() {
        return "$ 6.00";
    }
}
