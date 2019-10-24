public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   private double average(int first, int last)
   {
       double sum = 0;
       for(int x=first;x<=last;x++)
        {
            sum=sum+scores[x];
        }
       int length = (last-first)+1;
       double finalAverage=sum/length;
       return finalAverage;
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   private boolean hasImproved()
   {
       int perfectStreak=0;
       for(int x=0;x<scores.length-1;x++)
           {
               if(scores[x]<=scores[x+1])
                   {
                     perfectStreak=perfectStreak+1; 
                   }
               else
                   {
                     perfectStreak=perfectStreak-1;
                   }
           }
       if(perfectStreak==scores.length-1)
           {
               return true;
           }
       else
           {
               return false;
           }    
       //here so the class compiles
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
       double sum=0;
       if(hasImproved()==true)
           {
               return average(scores.length/2,scores.length-1);
           }        
       else
           {
               return average(0,scores.length-1);
           }
   } 
}