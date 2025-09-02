package app;

public class Tarefa extends Atividade {
  private boolean isConcluido;

  public void setConcluido(boolean isConcluido) {
    this.isConcluido = isConcluido;
  }

  public boolean getConcluido() {
    return this.isConcluido;
  }

  public Tarefa(long id, String descricao, boolean isConcluido) {
    this.setId(id);
    this.setDescricao(descricao);
    this.setConcluido(isConcluido);
  }

  public Tarefa() {
  }
}
