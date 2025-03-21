package Menu.Gourmet;

import Interface.IPostre;

public class PostreGourmet implements IPostre {
    @Override
    public String getDescripcion(){
        return "Soufflé de chocolate con salsa de frambuesa";
    }

    @Override
    public String getPrecio() {
        return "$ 2.49";
    }
}
