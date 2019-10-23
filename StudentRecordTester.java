
/**
 * Driver for the class StudentRecord
 *
 * @JKim 
 * @version (0.1)
 */
public class StudentRecordTester
{
    public static void main(String[] args)
    {
        int[] a={50,50,20,80,30};
        int[] b={20,50,50,53,80};
        int[] c={20,50,50,80};
        
        StudentRecord[] students;
        StudentRecord[] sr = new StudentRecord[3];
        sr [0] = new StudentRecord(a);
        sr [1] = new StudentRecord(b);
        sr [2] = new StudentRecord(c);
        
        System.out.println (sr [0].hasImproved());
        System.out.println (sr [1].hasImproved());
        System.out.println (sr [2].hasImproved());
        
        
        
    }
    
}
