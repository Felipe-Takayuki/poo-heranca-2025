package app;

public class Tarefa {
  private long id;
  private String descricao;
  private boolean isConcluido;

  public void setId(long id) {
    this.id = id;
  }

  public long getId() {
    return this.id;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return this.descricao;
  }

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
