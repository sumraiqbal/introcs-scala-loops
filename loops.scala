import scala.math.min


object loops {
    def main( args: Array[String])
    {
     printReps( "gotcha", 9)
     printReps("cool", 10)
     print(Factorial(8)) 
 
       
        def stringOfReps( s: String, n: Int) {
        
             
            for(i <-0 to n) 
            {
                print(s)
               
            } 
           
        }
        
        
        def PrintReps1( s: String, n: Int) : String = { 
            var MyString = ""
            for (i <-0 to n)
            { 
                MyString = MyString + s
            }
            return MyString
     
        }
        def Factorial(n: Int): Int = {
            var newvalue=0
            var factor=1        
        
            for (n <-1 until (n+1)) { 
                 factor = n*factor
            } 
                factor  
           
        }
  // Return a string containing n copies of s, end to end.
  // For example StringOfReps("Ok", 9) returns: "OkOkOkOkOkOkOkOkOk"
  def stringOfReps(s: String, n: Int): String = {
    "unknown"
  }

  // Return n! (n factorial: 1*2*3 *...* n if n >=1; 0! is 1.).  
  //For example Factorial(4) returns 1*2*3*4 = 24.
  def factorial(n: Int): Int = {
    0
  }


   // Return a string containing a filled rectange, where the filling is 
   // the specified number of columns and rows of the character inChar,
   // surrounded by a border made of the character edgeChar.
   // For example printRectangle(3, 2, 'i', 'e') prints
   //    eeeee
   //    eiiie
   //    eiiie
   //    eeeee
   def printRectangle(columns:Int, rows:Int, inChar:String, edgeChar:String): String = {
     "unknown"
   }

}
