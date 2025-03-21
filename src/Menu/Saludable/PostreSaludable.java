package Menu.Saludable;

import Interface.IPostre;

public class PostreSaludable implements IPostre {
    @Override
    public String getDescripcion(){
        return "Pudín de chía con leche de coco y mango";
    }

    @Override
    public String getPrecio() {
        return "$ 2.49";
    }
}
