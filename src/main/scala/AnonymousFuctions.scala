/*Au lieu d’utiliser des définitions de fonctions nommées pour ces paramètres, nous pouvons les formuler
plus simplement à l’aide de fonctions anonymes. Une fonction anonyme est une expression dont
l'évaluation produit une fonction – cette fonction est définie sans qu’on lui donne un nom.*/
class AnonymousFuctions { (x: Int) => x * x

  def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)

  def sumInts(a: Int, b: Int): Int = sum((x: Int) => x, a, b)

  def sumSquares(a: Int, b: Int): Int = sum((x: Int) => x * x, a, b)

  //def sumInts(a: Int, b: Int): Int = sum(x => x, a, b)
  //def sumSquares(a: Int, b: Int): Int = sum(x => x * x, a, b)
}


object AnonymousFuctions {

  def main(args: Array[String]): Unit = {
    

  }
}