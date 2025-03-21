package Fabrica;

import Interface.*;
import Menu.Saludable.*;

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
