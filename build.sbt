import org.nlogo.build.{ NetLogoExtension, ExtensionDocumentationPlugin }

enablePlugins(NetLogoExtension, ExtensionDocumentationPlugin)

name := "bitmap"
version := "1.1.1"
isSnapshot := true

javaSource in Compile := baseDirectory.value / "src"
javacOptions ++= Seq("-g", "-deprecation", "-Xlint:all", "-Xlint:-serial", "-Xlint:-path", "-encoding", "us-ascii", "--release", "11")

netLogoVersion := "6.2.2"
netLogoClassManager := "org.nlogo.extensions.bitmap.BitmapExtension"
