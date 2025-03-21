package Fabrica;

import Interface.IBebida;
import Interface.IEntrada;
import Interface.IPostre;
import Interface.IPrincipal;
import Menu.Vegetariano.BebidaVegetariano;
import Menu.Vegetariano.EntradaVegetariano;
import Menu.Vegetariano.PostreVegetariano;
import Menu.Vegetariano.PrincipalVegetariano;

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
