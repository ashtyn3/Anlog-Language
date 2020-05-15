package parser

import scala.io.Source
import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

class parser()  {
  val filename = (readLine + ".nex")
  var lines = new ListBuffer[String]()
   // Each line is the file is an element in the ListBuffer
  def file_content (filename: String): Unit = {
    var numlines = Source.fromFile(filename).getLines.size
    while (numlines >= 1) {
    var content = Source.fromFile(filename).getLines.next()
    numlines -= 1
    lines(0) = content
    // Takes in a file name and adds each line to a ListBuffer
    }
  }
}
