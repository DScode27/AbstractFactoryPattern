package Menu.Vegetariano;

import Interface.IPostre;

public class PostreVegetariano implements IPostre {
    @Override
    public String getDescripcion(){
        return "Tarta de manzana con canela";
    }

    @Override
    public String getPrecio() {
        return "$ 2.49";
    }
}
