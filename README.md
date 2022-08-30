Steps to reproduce:

```
$ sbt base/assembly

$ cp base/target/scala-2.12/base-assembly-1.0.0.jar dep/lib/

$ sbt dep/compile
```

Observed error:
```
[error] /tmp/fff/dep/src/main/scala/use.scala:4:43: macro implementation not found: mkLazy
[error] (the most common reason for that is that you cannot use macro
implementations in the same compilation run that defines them)
[error]   val lzFails = shadeshapeless.Lazy.mkLazy[base.TC[Int]]
```
