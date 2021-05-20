package main.java.QMP4;

public class Prenda {
  TipoPrenda tipo;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama = Trama.LISA;

  public Prenda(TipoPrenda tipo, Categoria categoria, Material material, Trama trama, Color colorPrincipal) {

    if (tipo == null || categoria == null || material == null || colorPrincipal == null) {
      throw new PrendaInvalidaException("Faltan datos de la prenda.");
    }

    if (tipo.getCategoria() != categoria) {
      throw new PrendaInvalidaException("Categoría inválida");
    }

    if (trama != null && material != Material.TELA) {
      throw new PrendaInvalidaException("Este material no lleva trama");
    }

    if (trama == null && material == Material.TELA) {
      this.trama = Trama.LISA;
    }

    if (trama != null && material == Material.TELA) {
      this.trama = trama;

    }

    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;

  }

  public Prenda(TipoPrenda tipo, Categoria categoria, Material material, Trama trama, Color colorPrincipal, Color colorSecundario) {
    if (tipo == null || categoria == null || material == null || colorPrincipal == null) {
      throw new PrendaInvalidaException("Faltan datos de la prenda.");
    }

    if (tipo.getCategoria() != categoria) {
      throw new PrendaInvalidaException("Categoría inválida");
    }

    if (trama != null && material != Material.TELA) {
      throw new PrendaInvalidaException("Este material no lleva trama");
    }

    if (trama == null && material == Material.TELA) {
      this.trama = Trama.LISA;
    }

    if (trama != null && material == Material.TELA) {
      this.trama = trama;

    }

    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public Categoria getCategoria() {
    return this.tipo.getCategoria();
  }
}

