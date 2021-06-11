package inventorySystem;


import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;



public class InventorySystem {

	public static void main(String args[]) throws JsonMappingException, IOException, JsonParseException
    {
        
        	String path = "C:/Users/User/eclipse-workspace/JavaPractice/src/main/java/inventorySystem/Inventory.json";
    		String path2 = "C:/Users/User/eclipse-workspace/JavaPractice/src/main/java/inventorySystem/InventoryWrite.json";

    		ObjectMapper mapper = new ObjectMapper();
    		

    		Root root = mapper.readValue(new File(path), Root.class);

    		int total = 0;
    		System.out.println("Rice : " + root.getRice().get(0).getName());
    		System.out.println("Price : " + root.getRice().get(0).getPrice_per_kg());
    		total += root.getRice().get(0).getPrice_per_kg();
    		
    		System.out.println("wheats : " + root.getWheats().get(0).getName());
    		System.out.println("Price : " + root.getWheats().get(0).getPrice_per_kg());
    		total += root.getWheats().get(0).getPrice_per_kg();
    		
    		System.out.println("pulses : " + root.getPulses().get(0).getName());
    		System.out.println("Price : " + root.getPulses().get(0).getPrice_per_kg());
    		total += root.getPulses().get(0).getPrice_per_kg();
    		
    		System.out.println("\nTotal : " + total);

    		// code for writing all details into new file
    		root.setTotal(total);
    		mapper.writeValue(new File(path2), root);
    		System.out.println("\nWrite total into file is completed!!!");
    	}
    }


