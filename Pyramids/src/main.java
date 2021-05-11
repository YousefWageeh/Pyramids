import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("F:\\youssef lap\\ITI\\7 Java\\pyramids.csv");
        
        //Print all the pyramids
        int i = 0;
        for(Pyramid p: pyramids)
        {
            System.out.println("#"+(i++)+" "+p.getPharaoh() +", "+p.getModernName()+", "+p.getSite()+", "+p.getHeight());
        }
        
        //Sorting the pyramids by height
        pyramids.sort(Comparator.comparingDouble(Pyramid::getHeight));
        System.out.println("After sorting");
        i=0;
        for(Pyramid p: pyramids) {
            System.out.println("#"+(i++)+" "+p.getPharaoh() +", "+p.getModernName()+", "+p.getSite()+", "+p.getHeight());
        }
        
        //Building a map of sites with number of pyramids
        Map<String, Integer> pyramidsPerSite = new LinkedHashMap < >();
        
        for(Pyramid p: pyramids) {
        	String site = p.getSite();
        	Integer numOfPyramids = pyramidsPerSite.get(site);
        	
        	if(numOfPyramids == null) {
        		numOfPyramids = 1;
        	}else {
        		numOfPyramids++;
        	}
        	
        	pyramidsPerSite.put(site, numOfPyramids);
        }
        System.out.println("Pyramids per site");
        System.out.println(pyramidsPerSite);

	}

}
