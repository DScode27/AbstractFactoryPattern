package Fabrica;

import Interface.IBebida;
import Interface.IEntrada;
import Interface.IPostre;
import Interface.IPrincipal;
import Menu.Gourmet.BebidaGourmet;
import Menu.Gourmet.EntradaGourmet;
import Menu.Gourmet.PostreGourmet;
import Menu.Gourmet.PrincipalGourmet;

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
