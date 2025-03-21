package Fabrica;

import Interface.*;
import Menu.Vegetariano.*;

public class FabricaMenuVegetariano implements IFabricaMenu{
    @Override
    public IEntrada crearEntrada() {
        return new EntradaVegetariano();
    }

    @Override
    public IPrincipal crearPlatoPrincipal() {
        return new PrincipalVegetariano();
    }

    @Override
    public IBebida crearBebida() {
        return new BebidaVegetariano();
    }

    @Override
    public IPostre crearPostre() {
        return new PostreVegetariano();
    }

    @Override
    public String tipoMenu() {
        return "MENU VEGETARIANO";
    }
}
