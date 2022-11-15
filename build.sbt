import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name := "bitmap"
version := "1.1.1"
isSnapshot := true

Compile / javaSource := baseDirectory.value / "src" / "main"
javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path", "-encoding", "us-ascii", "--release", "11")

Test / scalaSource := baseDirectory.value / "src" / "test"
Test / scalaVersion := "2.12.17"

netLogoVersion := "6.3.0"
netLogoClassManager := "org.nlogo.extensions.bitmap.BitmapExtension"
netLogoTestExtras += baseDirectory.value / "test-images"
