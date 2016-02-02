package models.entities

import org.bson.types.ObjectId
import org.mongodb.morphia.annotations._

@Entity(value = "chats", noClassnameStored = true)
case class Chat(var title: String,
                @Reference
                var history: java.util.List[Message],
                var users: java.util.List[ObjectId]) {
  @Id
  var id: ObjectId = _

  def this() = this("", new java.util.ArrayList(), new java.util.ArrayList())
}
