package Cliente;

import Fabrica.IFabricaMenu;
import Interface.*;

public class PedirMenu {
    private IEntrada entrada;
    private IPrincipal principal;
    private IBebida bebida;
    private IPostre postre;

    private IFabricaMenu fabrica;

    public PedirMenu(IFabricaMenu fabrica) {
        this.entrada = fabrica.crearEntrada();
        this.principal = fabrica.crearPlatoPrincipal();
        this.bebida = fabrica.crearBebida();
        this.postre = fabrica.crearPostre();
    }

    public void mostrarMenu() {
        System.out.println("Entrada: " + entrada.getDescripcion() + " - Precio: " + entrada.getPrecio());
        System.out.println("Plato Principal: " + principal.getDescripcion()  + " - Precio: " + principal.getPrecio());
        System.out.println("Bebida: " + bebida.getDescripcion()  + " - Precio: " + bebida.getPrecio());
        System.out.println("Postre: " + postre.getDescripcion()  + " - Precio: " + postre.getPrecio());
    }

    public IFabricaMenu getFabrica() {
        return fabrica;
    }

    public void setFabrica(IFabricaMenu fabrica) {
        this.fabrica = fabrica;
    }
}
