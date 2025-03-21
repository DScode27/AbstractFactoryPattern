package Fabrica;

import Interface.*;
import Menu.Gourmet.*;

public class FabricaMenuGourmet implements IFabricaMenu {
    @Override
    public IEntrada crearEntrada() {
        return new EntradaGourmet();
    }

    @Override
    public IPrincipal crearPlatoPrincipal() {
        return new PrincipalGourmet();
    }

    @Override
    public IBebida crearBebida() {
        return new BebidaGourmet();
    }

    @Override
    public IPostre crearPostre() {
        return new PostreGourmet();
    }

    @Override
    public String tipoMenu() {
        return "MENU GOURMET";
    }
}
