import java.io.*;

public class ReadTextFileLineByLine {
	public static void main(String args[]) {
		try{
			FileInputStream fstream = new FileInputStream("map.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader( new InputStreamReader(in));
			String line = "";
			while((line  = br.readLine()) !=null){
				line.replaceAll("\\s+", "'");
				if (br.readLine().contains("78")) 
					System.out.println("water");
				else if(br.readLine().contains("106"))
					System.out.println("mountain");
				else if (br.readLine().contains("76"))
					System.out.println("grass");
				else if (br.readLine().contains("77"))
					System.out.println("dirt");
				else 
					System.out.println(line);
				
					



				}
				
			
			in.close();
			
		}catch(Exception e){
			System.out.println("Error reading file");
		}

	}
}