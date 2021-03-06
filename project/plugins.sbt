resolvers += Classpaths.sbtPluginReleases

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.2.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.1")

addSbtPlugin("com.sksamuel.scoverage" % "sbt-scoverage" % "0.95.9")

addSbtPlugin("com.sksamuel.scoverage" %% "sbt-coveralls" % "0.0.5")
