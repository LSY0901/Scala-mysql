import java.sql.{Connection, PreparedStatement, ResultSet}

object test {
  def main(args: Array[String]): Unit = {
    var conn:Connection = null
    var pstm:PreparedStatement = null
    var rs:ResultSet = null
    conn = JDBCUtil.getConnection()
    var sql:String = "select * from video_content"
    pstm = conn.prepareStatement(sql)
    rs = pstm.executeQuery()
    while(rs.next()){
      var videoContent: VideoContent = new VideoContent


      videoContent.setVcId(rs.getString(1))
      videoContent.setVcAuthor(rs.getString(2))
      videoContent.setVcDetail(rs.getString(3))
      videoContent.setVcShareurl(rs.getString(4))
      videoContent.setVcFrom(rs.getString(5))
      videoContent.setVcType(rs.getString(6))
      videoContent.setVcCreatetime(rs.getDate(7))
      videoContent.setReservedField01(rs.getString(8))


      println(videoContent)
    }
  }
}
