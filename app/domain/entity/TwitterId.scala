package domain.entity

import play.api.libs.json.{JsString, Writes}

case class TwitterId (value: Long)

object TwitterId {
  implicit val writes: Writes[TwitterId] = Writes(id => JsString(id.value.toString))
}