resolvers += Classpaths.sbtPluginReleases
resolvers += "sonatype staging" at "https://oss.sonatype.org/content/repositories/staging"

addSbtPlugin("io.get-coursier"      % "sbt-coursier"            % "1.1.0-M14-4")
addSbtPlugin("com.typesafe"         % "sbt-mima-plugin"         % "0.5.0")
addSbtPlugin("org.skinny-framework" % "sbt-servlet-plugin"      % "3.0.8")
addSbtPlugin("org.scalariform"      % "sbt-scalariform"         % "1.8.3")
addSbtPlugin("com.jsuereth"         % "sbt-pgp"                 % "1.1.2")
addSbtPlugin("org.xerial.sbt"       % "sbt-sonatype"            % "2.5")
addSbtPlugin("net.virtual-void"     % "sbt-dependency-graph"    % "0.9.2")
addSbtPlugin("com.timushev.sbt"     % "sbt-updates"             % "0.4.1")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
