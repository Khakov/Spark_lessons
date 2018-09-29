package control.first

/**
  * @author Rustam Khakov
  */
class Hero(var id: Int, var name: String, var killedEnemies: Int) {

}

object Hero {
  def fromString(value: String) = {
    val res = value.split(",")
    new Hero(id = res(0) toInt, res(1), res(2) toInt)
  }
}
