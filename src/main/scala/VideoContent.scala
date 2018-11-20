
import java.sql.Date

import scala.beans.BeanProperty
class VideoContent {


  @BeanProperty
   var vcId :String = null
  @BeanProperty
   var vcAuthor :String  = null
  @BeanProperty
   var vcDetail :String  = null
  @BeanProperty
   var vcShareurl  :String = null
  @BeanProperty
  var vcFrom  :String = null
  @BeanProperty
  var vcType  :String = null
  @BeanProperty
  var vcCreatetime :Date= null
  @BeanProperty
  var reservedField01  :String = null
  @BeanProperty
  var reservedField02  :String = null
  @BeanProperty
  var reservedField03  :String = null
  @BeanProperty
  var reservedField04  :String = null
  @BeanProperty
  var reservedField05 :String  = null


  override def toString = s"VideoContent(vcId=$vcId, vcAuthor=$vcAuthor, vcDetail=$vcDetail, vcShareurl=$vcShareurl, vcFrom=$vcFrom, vcType=$vcType, vcCreatetime=$vcCreatetime, reservedField01=$reservedField01, reservedField02=$reservedField02, reservedField03=$reservedField03, reservedField04=$reservedField04, reservedField05=$reservedField05)"


}
