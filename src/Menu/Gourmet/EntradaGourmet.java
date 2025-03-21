package Menu.Gourmet;

import Interface.IEntrada;

public class EntradaGourmet implements IEntrada {
    @Override
    public String getDescripcion(){
        return "Foie gras con reducción de frutos rojos";
    }

    @Override
    public String getPrecio() {
        return "$ 9.50";
    }
}
