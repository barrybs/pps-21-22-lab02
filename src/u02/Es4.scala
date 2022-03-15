package u02

object Es4 

  val curriedIntervalVal: Double => Double => Double => Boolean = x => y => z => x<=y && y<=z

  //val notCurriedIntervalVal: (Double, Double, Double) => Boolean = (x: Double, y: Double, z: Double) => x<=y && y<=z
  val notCurriedIntervalVal: (Double, Double, Double) => Boolean = (x, y, z) => x<=y && y<=z

  def curriedIntervalDef(x: Double)(y: Double)(z: Double): Boolean =
    x<=y && y<=z

  def notCurriedIntervalDef(x: Double, y: Double, z: Double): Boolean =
    x<=y && y<=z

