/*
 * This programs purpose is to input a CSV file seperated by commas and newlines and returns a list of
 * comma-only seperated values.
 * 
 * run on command line(CL) as "$ scala NewLineSep.scala *input file path* *output file name* 
 */

import scala.io.Source
import java.io._


val text = io.Source.fromFile(args(0)).getLines.map(line => line.dropRight(1)).toList //grab contents of file from CL argument, then grab each line,
																					 // then drop off the comma and convert to list
var out_file = new java.io.FileOutputStream(args(1))  // Java for getting the output file path
var out_stream = new java.io.PrintStream(out_file)   // more java for outputing the contents to a file

text.foreach(x => out_stream.print(x+",")) // For each item in the List, print the item + a "," for seperator.
out_stream.close // close output stream (Java)
