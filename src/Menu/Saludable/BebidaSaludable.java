package Menu.Saludable;

import Interface.IBebida;

public class BebidaSaludable implements IBebida {
    @Override
    public String getDescripcion(){
        return "Jugo de zanahoria, naranja y jengibre";
    }

    @Override
    public String getPrecio() {
        return "$ 3.50";
    }
}
