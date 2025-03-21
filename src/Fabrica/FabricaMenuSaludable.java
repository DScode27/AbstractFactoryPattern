package Fabrica;

import Interface.IBebida;
import Interface.IEntrada;
import Interface.IPostre;
import Interface.IPrincipal;
import Menu.Saludable.BebidaSaludable;
import Menu.Saludable.EntradaSaludable;
import Menu.Saludable.PostreSaludable;
import Menu.Saludable.PrincipalSaludable;

public class FabricaMenuSaludable implements IFabricaMenu {
    @Override
    public IEntrada crearEntrada() {
        return new EntradaSaludable();
    }

    @Override
    public IPrincipal crearPlatoPrincipal() {
        return new PrincipalSaludable();
    }

    @Override
    public IBebida crearBebida() {
        return new BebidaSaludable();
    }

    @Override
    public IPostre crearPostre() {
        return new PostreSaludable();
    }

    @Override
    public String tipoMenu() {
        return "MENU SALUDABLE";
    }
}
