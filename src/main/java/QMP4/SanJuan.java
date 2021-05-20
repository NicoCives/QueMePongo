package main.java.QMP4;

public class SanJuan implements Institucion{
  public Prenda parteSuperior(){
    return new Prenda(TipoPrenda.CHOMBA,Categoria.PARTESUPERIOR,Material.PIQUE, Trama.LISA,null,new Color(0,0,255));
  }

  public Prenda parteInferior(){
    return new Prenda(TipoPrenda.PANTALON, Categoria.PARTEINFERIOR, Material.ACETATO, Trama.ESTAMPADO,null,new Color(155,155,155));
  }

  public Prenda calzado(){
    return new Prenda(TipoPrenda.ZAPATILLAS, Categoria.CALZADO,Material.CUERO, Trama.LISA,new Color(255,255,255));
  }
}
