addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "1.10.1")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.4.7")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "1.2.0")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"                       % "0.4.3")
val sbtTypelevelVersion = "0.4.17"
addSbtPlugin("org.typelevel" % "sbt-typelevel"      % sbtTypelevelVersion)
addSbtPlugin("org.typelevel" % "sbt-typelevel-site" % sbtTypelevelVersion)
