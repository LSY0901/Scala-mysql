import java.sql.{Connection, DriverManager}
import java.sql

object JDBCUtil {
   def getConnection():Connection = {
      Class.forName("com.mysql.jdbc.Driver")
      val connection : sql.Connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shortvideo","root","")
     return connection
   }
}
