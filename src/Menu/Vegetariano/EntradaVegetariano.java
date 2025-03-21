package Menu.Vegetariano;

import Interface.IEntrada;

public class EntradaVegetariano implements IEntrada {
    @Override
    public String getDescripcion(){
        return "Crema de calabaza con croutones integrales";
    }

    @Override
    public String getPrecio() {
        return "$ 4.50";
    }
}
