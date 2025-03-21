package Fabrica;

import Interface.IBebida;
import Interface.IEntrada;
import Interface.IPostre;
import Interface.IPrincipal;

import java.security.Principal;

public interface IFabricaMenu {
    public IEntrada crearEntrada();
    public IPrincipal crearPlatoPrincipal();
    public IBebida crearBebida();
    public IPostre crearPostre();
    public String tipoMenu();
}