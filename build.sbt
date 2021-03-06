name := """scala-http-clients"""

version := "1.2.13.0"

val scalaV = "2.13.1"

lazy val dispatch =
  (project in file("dispatch"))
    .settings(
      scalaVersion := scalaV,
      libraryDependencies ++= Seq(
        "org.dispatchhttp" %% "dispatch-core" % "1.1.0"
      )
    )

// lazy val httpc =
//   (project in file("httpc"))
//     .settings(
//       scalaVersion := scalaV,
//       libraryDependencies ++= Seq(
//         "io.github.amrhassan" %% "httpc" % "0.3.2"
//       )
//     )

lazy val gigahorse =
  (project in file("gigahorse"))
    .settings(
      scalaVersion := scalaV,
      libraryDependencies ++= Seq(
        "com.eed3si9n" %% "gigahorse-core" % "0.5.0",
        "com.eed3si9n" %% "gigahorse-asynchttpclient" % "0.5.0"
      )
    )

lazy val http4s =
  (project in file("http4s"))
    .settings(
      scalaVersion := scalaV,
      libraryDependencies ++= Seq(
        "org.http4s" %% "http4s-dsl" % "0.18.0",
        "org.http4s" %% "http4s-blaze-client" % "0.18.0"
      )
    )

// lazy val featherbed =
//   (project in file("featherbed"))
//     .settings(
//       scalaVersion := scalaV,
//       libraryDependencies ++= Seq(
//         "io.github.finagle" %% "featherbed-core" % "0.2.1-SNAPSHOT" exclude("io.netty", "netty"),
//         "io.github.finagle" %% "featherbed-circe" % "0.2.1-SNAPSHOT"
//       ),
//       resolvers += Resolver.sonatypeRepo("snapshots")
//     )

 lazy val play =
   (project in file("play"))
     .settings(
       scalaVersion := scalaV,
       libraryDependencies ++= Seq(
          "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.1.2",
          "com.typesafe.play" %% "play-ws-standalone-json" % "2.1.2"
       )
     )

lazy val scalaj =
  (project in file("scalaj"))
    .settings(
      scalaVersion := scalaV,
      libraryDependencies ++= Seq(
         "org.scalaj" %% "scalaj-http" % "2.4.2"
      )
    )

// lazy val roshttp =
//   (project in file("roshttp"))
//     .settings(
//       scalaVersion := scalaV,
//       libraryDependencies ++= Seq(
//          "fr.hmil" %% "roshttp" % "2.1.0"
//       )
//     )

// lazy val `naive-http` =
//   (project in file("naive-http"))
//     .settings(
//       scalaVersion := scalaV,
//       libraryDependencies ++= Seq(
//          "io.shaka" %% "naive-http" % "104"
//       ),
//       resolvers += "Tim Tennant's repo" at "http://dl.bintray.com/timt/repo/"
//     )

// lazy val `fs2-http` =
//   (project in file("fs2-http"))
//     .settings(
//       scalaVersion := scalaV,
//       libraryDependencies ++= Seq(
//         "com.spinoco" %% "fs2-http" % "0.4.0"
//       )
//     )

// lazy val hammock =
//   (project in file("hammock"))
//     .settings(
//       resolvers += Resolver.jcenterRepo,
//       scalaVersion := scalaV,
//       libraryDependencies ++= Seq(
//         "com.pepegar" %% "hammock-core" % "0.9.0",
//         "com.pepegar" %% "hammock-apache-http" % "0.9.0",
//         "com.pepegar" %% "hammock-circe" % "0.9.0"
//       )
//     )

lazy val `lolhttp` =
  (project in file("lolhttp"))
    .settings(
      scalaVersion := scalaV,
      libraryDependencies ++= Seq(
        "com.criteo.lolhttp" %% "lolhttp" % "0.4.0"
      )
    )

lazy val sttp =
  (project in file("sttp"))
    .settings(
      scalaVersion := scalaV,
      libraryDependencies ++= Seq(
        "com.softwaremill.sttp" %% "core" % "1.7.2"
      )
    )

lazy val requests =
    (project in file("requests-scala"))
      .settings(
        scalaVersion := scalaV,
          libraryDependencies ++= Seq(
              "com.lihaoyi" %% "requests" % "0.5.2"
          )
        )

lazy val root = project.in(file(".")).
  aggregate(gigahorse, scalaj, sttp, play, requests)


// reformatOnCompileSettings
