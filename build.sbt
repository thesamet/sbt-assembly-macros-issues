scalaVersion := "2.13.7"

ThisBuild / organization := "com.thesamet.assemblyissue"

val base = (project in file("base"))
    .settings(
      libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.9",

      version := "1.0.0",
      assembly / assemblyShadeRules := Seq(
        ShadeRule.rename("shapeless.**" -> "shadeshapeless.@1").inAll
      )
    )

val dep = (project in file("dep"))
    .settings(
    )
