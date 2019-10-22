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
       int currentNum=scores[0];
       boolean stillTrue=true;
       while(stillTrue==true)
           {
               for(int x=0;x<=scores.length-1;x++)
                   {
                       if(scores[x]>=scores[x-1]);
                           {
                               stillTrue=true;
                           }
                       else
                           {
                               stillTrue=false
                           }    
                   }
               
           }
        
       return false; //here so the class compiles
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      return 0; //here so the class compiles
   } 
}