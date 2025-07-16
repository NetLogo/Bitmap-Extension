import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name := "bitmap"
version := "1.2.1"
isSnapshot := true

scalaVersion := "3.7.0"

Compile / javaSource := baseDirectory.value / "src" / "main"
javacOptions ++= Seq("-g", "-deprecation", "-encoding", "us-ascii", "--release", "11")

Test / scalaSource := baseDirectory.value / "src" / "test"

netLogoVersion      := "7.0.0-beta2-8cd3e65"
netLogoClassManager := "org.nlogo.extensions.bitmap.BitmapExtension"
netLogoTestExtras += baseDirectory.value / "test-images"
