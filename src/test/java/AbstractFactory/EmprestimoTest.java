package AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    @Test
    void deveLerLivro() {
        FabricaAcervo fabrica = new FabricaFisica(); 
        Emprestimo emprestimo = new Emprestimo(fabrica);
        
        assertEquals("Lendo uma enciclopédia pesada de capa dura", emprestimo.realizarLeituraLivro());
    }

    @Test
    void deveLerRevista() {
        FabricaAcervo fabrica = new FabricaFisica();
        Emprestimo emprestimo = new Emprestimo(fabrica);
        
        assertEquals("Lendo um gibi em quadrinhos", emprestimo.realizarLeituraRevista());
    }
}