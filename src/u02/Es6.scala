package u02
import Math._

object Es6
  /*Ex6
  Non è una ricorsione tail perché non fibo non viene richiamata solo alla fine. Inoltre utilizzando la libreria tailrec
  viene segnalata come non ricorsiva
  */
  def fibo (n:Int): Int = n match
    case n if n<= 1 => n
    case _ => fibo(n-1) + fibo(n-2)