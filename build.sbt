name := "MetaDocs"

organization := "pl.metastack"

version := "0.1.2-SNAPSHOT"

scalaVersion := "2.11.8"

pomExtra in Global := {
  <url>https://github.com/MetaStack-pl/MetaDocs</url>
  <licenses>
    <license>
    <name>Apache-2.0</name>
    <url>https://www.apache.org/licenses/LICENSE-2.0.html</url>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:MetaStack-pl/MetaDocs.git</url>
  </scm>
  <developers>
    <developer>
    <id>tindzk</id>
    <name>Tim Nieradzik</name>
    <url>http://github.com/tindzk</url>
    </developer>
  </developers>
}

libraryDependencies ++= Seq(
  "pl.metastack" %% "metaweb" % "0.2.0",
  "com.lihaoyi" %% "fastparse" % "0.3.7",
  "joda-time" % "joda-time" % "2.9.4",
  "org.joda" % "joda-convert" % "1.8.1",
  "org.pegdown" % "pegdown" % "1.6.0",
  "io.monix" %% "minitest" % "0.22" % "test"
)

testFrameworks += new TestFramework("minitest.runner.Framework")

enablePlugins(BuildInfoPlugin)

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "pl.metastack.metadocs"
