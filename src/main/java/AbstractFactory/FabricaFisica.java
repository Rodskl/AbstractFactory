package AbstractFactory;

public class FabricaFisica implements FabricaAcervo {
    public Livro createLivro() { 
        return new Enciclopedia(); 
    }
    public Revista createRevista() { 
        return new Gibi(); 
    }
}