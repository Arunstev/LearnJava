public class FindGene{
    public String FindGeneandTest(String dna){
        String result = "";
    //find the start occurrence of gene.
        int startIndex = dna.indexOf("ATG");
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        result = dna.substring(startIndex ,stopIndex + 3);
        
        return result;
    }
    public void testGene(){
        String dna = "ATGCGTCTTGCTATCTCTTAATCT";
        System.out.println("DNA is" + dna );
        String gene = FindGeneandTest(dna);
        System.out.println("Gene is " + gene);
    }
    public static void main(String [] args){
        FindGene fg = new FindGene();
        fg.testGene();
    }
}