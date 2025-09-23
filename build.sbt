import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name := "bitmap"
version := "1.3.0"
isSnapshot := true

scalaVersion := "3.7.0"

Compile / javaSource := baseDirectory.value / "src" / "main"
javacOptions ++= Seq("-g", "-deprecation", "-encoding", "us-ascii", "--release", "11")

Test / scalaSource := baseDirectory.value / "src" / "test"

netLogoVersion      := "7.0.0-424b50b"
netLogoClassManager := "org.nlogo.extensions.bitmap.BitmapExtension"
netLogoTestExtras += baseDirectory.value / "test-images"
