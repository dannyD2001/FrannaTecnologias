package Util;
import modelo.usuario;
/**
 *
 * @author Danny Dominguez
 */
public class AppContext {
        private static usuario usuarioActual;

    public static usuario getUsuarioActual() {
        return usuarioActual;
    }

    public static void setUsuarioActual(usuario usuario) {
        usuarioActual = usuario;
    }    
}
