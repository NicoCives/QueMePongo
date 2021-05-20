package main.java.QMP4;

import main.java.QMP4.Institucion;

public class Uniforme{
  Prenda parteSuperior;
  Prenda parteInferior;
  Prenda calzado;
  Uniforme(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado){
    if(prendaSuperior.tipo.categoria != Categoria.PARTESUPERIOR){
      throw new CategoriaInvalidaException("Categoria del Tipo de Prenda invalida. Debe ser una Prenda Superior...");
    }
    if(prendaInferior.tipo.categoria != Categoria.PARTEINFERIOR){
      throw new CategoriaInvalidaException("Categoria del Tipo de Prenda invalida. Debe ser una Prenda Inferior...");
    }
    if(calzado.tipo.categoria != Categoria.CALZADO){
      throw new CategoriaInvalidaException("Categoria del Tipo de Prenda invalida. Debe ser un Calzado...");
    }
  }

  Uniforme generarUniforme(Institucion institucion){
    return new Uniforme(institucion.parteSuperior(), institucion.parteInferior(), institucion.calzado());}
}
