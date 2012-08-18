
public class Part1
{
    
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