package PrincípiodaResponsabilidadeÚnica;

public interface RepositorioUsuario {
    User getUserById(int userId);
    void saveUser(User user);
    void deleteUser(int userId);
}