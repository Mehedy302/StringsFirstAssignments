
public class Part1
{
    
      public static void main(String[] args)
      
{    Part2 ob1 = new Part2();
    
    ob1.testSimpleGene();
    
    
    
    
    
}
    
   public  String findSimpleGene(String dna)
    {
        String result  = "";
        int startIndex = dna.indexOf("ATG");
        
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        
        if((stopIndex - startIndex) % 3 == 0)
            result = dna.substring(startIndex , stopIndex + 3);
        
        return result;
        
    }
    
    
       public void testSimpleGene()
   {
       String dna = "TAATTTATGCTGCATGCCTAA";
       
       System.out.println("STRAND :"+dna);
       System.out.println("GENE :"+findSimpleGene(dna));
       
       
       
    }
    
}
    
 class Part2
    {
       
        
        
        public  String findSimpleGene(String dna,int startCodon,int stopCodon)
    {
        String result  = "";
         
        
        if((stopCodon - startCodon) % 3 == 0)
            result = dna.substring(startCodon , stopCodon + 3);
        
        return result;
        
    }
    
    
       public void testSimpleGene()
   {
       String dna = "atgtaa"; 
       
       int startIndex =dna.toUpperCase(). indexOf("ATG");
       int stopIndex = dna.toUpperCase().indexOf("TAA",startIndex);
     
       System.out.println("STRAND :"+dna);
       System.out.println("GENE :"+findSimpleGene(dna , startIndex , stopIndex));
       
       
       
    } 
    
    public int startCodon(String dna)
       {
          return dna.indexOf("ATG"); 
          
        }
        
    public int stopCodon(String dna,int startIndex)
       {
          return dna.indexOf("TAA", startIndex + 3); 
          
        }
        
        
        
        
        
        
    
    
    
    }