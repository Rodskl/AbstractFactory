package AbstractFactory;

public class Emprestimo {

private Livro livro;
private Revista revista;

public Emprestimo(FabricaAcervo fabrica) {
    this.livro = fabrica.createLivro();
    this.revista = fabrica.createRevista();
}

public String realizarLeituraLivro() {
    return this.livro.ler();
}

public String realizarLeituraRevista() {
    return this.revista.ler();
}
}