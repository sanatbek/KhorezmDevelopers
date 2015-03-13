package models

case class Presentation(id: Int, name: String, size: String)
object Presentation{
  var presentations = List(
    Presentation(1, "IntellejIdea","742.0 kb"),
    Presentation(2, "Scala", "3.32MB"),
    Presentation(3, ".SBT", "40 MB")
  )
  def findPresentations = presentations.sortBy(_.id)
}

