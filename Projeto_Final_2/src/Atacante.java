public class Atacante extends MeioCampista{

    private int numeroDeGols;
    private int numeroFinalizacoes;

    public Atacante() {
        super();
        this.numeroDeGols = numeroDeGols;
        this.numeroFinalizacoes = numeroFinalizacoes;
    }

    @Override
    public TipoEvento registrarEvento(TipoEvento tipoEvento) {
        switch (tipoEvento){
            case GOL: setNumeroDeGols(getNumeroDeGols()+1);
                System.out.println("Goool do Mengão, " + getNome() + " é deleeeee");
                break;
            case FINALIZACAO: setNumeroFinalizacoes(getNumeroFinalizacoes()+1);
                System.out.println("Foi quasee " + getNome() + ", quase altera o placar");
                break;
        }
        return super.registrarEvento(tipoEvento);
    }

    public int getNumeroDeGols() {
        return numeroDeGols;
    }

    public void setNumeroDeGols(int numeroDeGols) {
        this.numeroDeGols = numeroDeGols;
    }

    public int getNumeroFinalizacoes() {
        return numeroFinalizacoes;
    }

    public void setNumeroFinalizacoes(int numeroFinalizacoes) {
        this.numeroFinalizacoes = numeroFinalizacoes;
    }
}