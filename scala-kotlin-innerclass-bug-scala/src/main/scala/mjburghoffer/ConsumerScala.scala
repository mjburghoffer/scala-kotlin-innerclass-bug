package mjburghoffer

import mjburghoffer.ParentSealedJava.ChildSealedJava
import mjburghoffer.ParentSealedKotlin.ChildSealedKotlin

object ConsumerScala {
  def main(args: Array[String]): Unit = {
    val childSealedJava = new ChildSealedJava()
    new ConsumerJava(childSealedJava)

    val childSealedKotlin = new ChildSealedKotlin()
    new ConsumerKotlin(childSealedKotlin)
  }
}
