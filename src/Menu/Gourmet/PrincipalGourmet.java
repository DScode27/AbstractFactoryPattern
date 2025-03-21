package Menu.Gourmet;

import Interface.IPrincipal;

public class PrincipalGourmet implements IPrincipal {
    @Override
    public String getDescripcion(){
        return "Solomillo Wellingtons";
    }

    @Override
    public String getPrecio() {
        return "$ 32.00";
    }
}
