import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class PyramidCSVDAO extends Thread {
	
	public List<Pyramid> readPyramidsFromCSV(String filePath){
		List<Pyramid> pyramids = new ArrayList<>();
        try {
        	//anonymous subclass of Thread with lambda expression
            Thread fileReading = new Thread(() -> {
                try {

                	FileReader fr = new FileReader(filePath);
                	BufferedReader bufferedReader = new BufferedReader(fr);
                    String line = bufferedReader.readLine();
                    while ((line = bufferedReader.readLine()) != null) {
                        pyramids.add(createPyramid(line.split(",")));
                    }
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            });
            fileReading.start();
            //use join to insure the thread is terminated
            fileReading.join();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return pyramids;
	}
	
	public Pyramid createPyramid(String[] data)
    {
		if(data[7].equals("")) {
			data[7] = "0";
		}
		
		return new Pyramid(data[0], data[2], data[4], Float.parseFloat(data[7]));
        
    }

	
}
