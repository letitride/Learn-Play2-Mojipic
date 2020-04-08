package domain.entity

import java.time.LocalDateTime

import com.google.common.net.MediaType

case class PictureProperty(id: PictureId, value: PictureProperty.Value)

object PictureProperty {

  sealed abstract class Status(val value: String)

  object Status{
    case object Success extends Status("success")
    case object Failure extends Status("failure")
    case object Converting extends Status("converting")

    def parse(value: String): Option[Status] =
      value match {
        case Success.value => Some(Success)
        case Failure.value => Some(Failure)
        case Converting.value => Some(Converting)
        case _ => None
      }
  }

  case class Value(
                  status: Status,
                  twitterId: TwitterId,
                  fileName: String,
                  contentType: MediaType,
                  overlayText: String,
                  overlayTextSize: Int,
                  originalFilepath: Option[String],
                  convertedFilepath: Option[String],
                  createdTime: LocalDateTime
                  )
}
