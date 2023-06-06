package biblioteca.repository;
import biblioteca.model.Usuario;
import java.util.ArrayList;
import java.util.List;
public class UsuarioRepository {
    private final List<Usuario> usuarios = new ArrayList<>();
    private int proximoId = 1;
    
    public void cadastrar(Usuario usuario) {
        usuario.setId(proximoId++); //falta o set no usuario
        usuarios.add(usuario);
    }
    
    public List<Usuario> buscarTodos() {
        return usuarios;
    }
    
    public Usuario buscarPorId(int id) {
        for (Usuario usuario : usuarios){
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
    
    public void atualizar (Usuario usuario) {
        for(int i=0; i<usuario.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i,usuario);
                break;
            }
        }
    }
    
    public void excluir(int id){
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
