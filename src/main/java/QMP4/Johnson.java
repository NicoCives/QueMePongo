package main.java.QMP4;

public class Johnson implements Institucion{
  public Prenda parteSuperior(){
    return new Prenda(TipoPrenda.CAMISA,Categoria.PARTESUPERIOR,Material.TELA,Trama.LISA,new Color(255,255,255));
  }

  public Prenda parteInferior(){
    return new Prenda(TipoPrenda.PANTALON, Categoria.PARTEINFERIOR, Material.TELA,Trama.LISA,new Color(0,0,0));
  }

  public Prenda calzado(){
    return new Prenda(TipoPrenda.ZAPATOS, Categoria.CALZADO, Material.CUERO, Trama.LISA, new Color(0,0,0));
  }
}
