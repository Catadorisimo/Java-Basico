package tema5;

public class CocheCRUDImpl implements CocheCRUD{


    @Override
    public void save() {
        System.out.println("Guardado");
    }

    @Override
    public void findAll() {
        System.out.println("Lista de Coches:");
    }

    @Override
    public void delete() {
        System.out.println("Eliminado");
    }
}
