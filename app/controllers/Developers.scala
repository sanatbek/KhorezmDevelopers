package controllers
import models.Presentation
import play.api.mvc._
object Developers extends Controller{
  def prList = Action {
    Ok(views.html.presentations(Presentation.findPresentations))
  }
}
