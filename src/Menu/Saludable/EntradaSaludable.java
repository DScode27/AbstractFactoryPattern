package Menu.Saludable;

import Interface.IEntrada;

public class EntradaSaludable implements IEntrada {
    @Override
    public String getDescripcion(){
        return "Ensalada de espinaca con fresas y nueces";
    }

    @Override
    public String getPrecio() {
        return "$ 5.00";
    }
}
