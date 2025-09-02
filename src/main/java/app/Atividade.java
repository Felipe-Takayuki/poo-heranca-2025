package app;

public class Atividade {
  protected long id;
  protected String descricao;

  // protected serve para que seja privado para classes que não são descendentes.
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

}
