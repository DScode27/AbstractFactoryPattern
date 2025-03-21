import Cliente.PedirMenu;
import Fabrica.FabricaMenuGourmet;
import Fabrica.FabricaMenuSaludable;
import Fabrica.FabricaMenuVegetariano;

public class Main {
    public static void main(String[] args) {
        System.out.println("Menú Vegetariano:");
        PedirMenu menuVegetariano = new PedirMenu(new FabricaMenuVegetariano());
        menuVegetariano.mostrarMenu();

        System.out.println("\nMenú Gourmet:");
        PedirMenu menuGourmet = new PedirMenu(new FabricaMenuGourmet());
        menuGourmet.mostrarMenu();

        System.out.println("\nMenú Saludable:");
        PedirMenu menuSaludable = new PedirMenu(new FabricaMenuSaludable());
        menuSaludable.mostrarMenu();
    }
}