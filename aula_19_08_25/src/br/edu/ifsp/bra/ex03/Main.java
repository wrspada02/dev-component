package br.edu.ifsp.bra.ex03;

public class Main {
   public static void drawAllShapes(List<IShape> shapes) {
     for (IShape s : shapes) {
     	s.draw();
     }	
   }
 
   public static void main(String[] args) {
     List<IShape> shapes = Arrays.asList(new Circle(), new Square());
     drawAllShapes(shapes);
   }
}

//
// ex.03
// conseguimos adicionar o triangle sem modificar a main devido
// as classes dependerem da abstracao IShape ao inves de classes
// concretas, que facilita o desenvolvimento e garante o principio
// open, closed (aberto a adicoes, fechado a modificacoes
//
//
// ex.04
// para alcancar a ordenacao, so seria necessario modificar o metodo main
// da classe main que declara a lista de shapes, para que possam ser
// iterados e desenhados na ordem desejada, mas, nao precisa modificar 
// o source code ja existente.
//
