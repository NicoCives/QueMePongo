package main.java.QMP4;



public class BorradorPrenda{
  TipoPrenda tipo;
  Categoria categoria;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;
  Trama trama = Trama.LISA;

  void setTipo(TipoPrenda tipo){
    this.tipo = tipo;
  }

  void setCategoria(Categoria categoria){
    this.categoria = categoria;
  }

  void setMaterial(Material material){
    this.material = material;
  }

  void setColorPrincipal(Color colorPrincipal){
    this.colorPrincipal = colorPrincipal;
  }

  void setColorSecundario(Color colorSecundario){
    this.colorSecundario = colorSecundario;
  }

  void setTrama(Trama trama){
    this.trama = trama;
  }

  Prenda generarPrenda(TipoPrenda tipoPrenda, Categoria categoria, Material material, Trama trama, Color colorPrincipal, Color colorSecundario){
    return new Prenda(tipoPrenda, categoria, material, trama, colorPrincipal, colorSecundario);
  }
}
