package com.salesforceiq

import com.salesforceiq.ParentSealedJava.ChildSealedJava
import com.salesforceiq.ParentSealedKotlin.ChildSealedKotlin

class ConsumerScala {
  def main(): Unit = {
    val childSealedJava = new ChildSealedJava()
    new ConsumerJava(childSealedJava)

    val childSealedKotlin = new ChildSealedKotlin()
    new ConsumerKotlin(childSealedKotlin)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val consumer = new ConsumerScala()
    consumer.main()
  }
}
