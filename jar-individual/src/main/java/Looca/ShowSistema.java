package Looca;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.sistema.Sistema;

/**
 *
 * @author kayap
 */
public class ShowSistema {
    Looca looca = new Looca();

    Sistema sistema = looca.getSistema();

    public Sistema showSistema(){
        return sistema;
    }
    
    
}
