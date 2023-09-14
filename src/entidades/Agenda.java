package entidades;

import static executavel.app.agendas;

public class Agenda {
    private String nome;
    private Endereco endereco;

    public Agenda(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void remover(String nome){
        for(int i = 0; i < agendas.size();i++){
            if (agendas.get(i).getNome().equalsIgnoreCase(nome)){
                agendas.remove(i);
                System.out.println("Removido com sucesso.");
            }
        }
    }
    @Override
    public String toString() {
        return "Agenda{" +
                "nome='" + nome + '\'' +
                ", endereco:" +'\''+"rua= "+ endereco.getRua() +'\''+" cep= "+endereco.getCep()+'\''+"numero= "+endereco.getNumero()+
                '}';
    }
}
