Demonstrating the Scala compiler bug when using Kotlin sealed classes as constructor parameters.  Shows that java will work under the same conditions.

To test:

`mvn clean compile`

The output will contain an error message like: 

```
[INFO] Compiling 1 source files to /Users/mburghoffer/projects/scala-kotlin-innerclass-bug/scala-kotlin-innerclass-bug-scala/target/classes at 1474994823442
[ERROR] /Users/mburghoffer/projects/scala-kotlin-innerclass-bug/scala-kotlin-innerclass-bug-scala/src/main/scala/mjburghoffer/ConsumerScala.scala:12: error: type mismatch;
[ERROR]  found   : mjburghoffer.ParentSealedKotlin.ChildSealedKotlin
[ERROR]  required: mjburghoffer.mjburghoffer.
[ERROR]     new ConsumerKotlin(childSealedKotlin)
[ERROR]                        ^
[ERROR] one error found
```
