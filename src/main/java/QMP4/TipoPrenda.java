package main.java.QMP4;

import main.java.QMP4.Categoria;

public enum TipoPrenda{
  ZAPATOS(Categoria.CALZADO), ZAPATILLAS(Categoria.CALZADO), PANTUFLA(Categoria.CALZADO), OJOTAS(Categoria.CALZADO),

  CAMISA(Categoria.PARTESUPERIOR), CAMPERA(Categoria.PARTESUPERIOR), BUZO(Categoria.PARTESUPERIOR),
  REMERA(Categoria.PARTESUPERIOR), CHOMBA(Categoria.PARTESUPERIOR), PANUELO(Categoria.PARTESUPERIOR),

  PANTALON(Categoria.PARTEINFERIOR), SHORT(Categoria.PARTEINFERIOR), PANTALON_PIJAMA(Categoria.PARTEINFERIOR), BERMUDA(Categoria.PARTEINFERIOR);
  public Categoria categoria;

  TipoPrenda(Categoria categoria){
    this.categoria = categoria;
  }

  Categoria getCategoria(){
    return this.categoria;
  }
}
