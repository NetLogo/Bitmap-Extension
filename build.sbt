import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name := "bitmap"
version := "1.2.1"
isSnapshot := true

scalaVersion := "2.13.16"

Compile / javaSource := baseDirectory.value / "src" / "main"
javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path", "-encoding", "us-ascii", "--release", "11")

Test / scalaSource := baseDirectory.value / "src" / "test"

netLogoVersion := "7.0.0-internal1"
netLogoClassManager := "org.nlogo.extensions.bitmap.BitmapExtension"
netLogoTestExtras += baseDirectory.value / "test-images"
