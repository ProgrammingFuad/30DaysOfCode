
import java.util.*;
public class DictionaryPractice {

	
	
		public static void main(String[] args){
			
			//English to spanish dictionary
			
			Map<String,String> englSpanDictionary= new HashMap<String,String>();
			
			englSpanDictionary.put("Monday", "Lunes");
			englSpanDictionary.put("Tuesday", "Martes");
			englSpanDictionary.put("Wednesday", "Miercoles");
			englSpanDictionary.put("Thursday", "Jueves");
			englSpanDictionary.put("Friday", "Viernes");
			englSpanDictionary.put("Saturday", "Sabado");
			englSpanDictionary.put("Sunday", "Domingo");
			
	
			//retrieve things from our dictionary
			
			System.out.println(englSpanDictionary.get("Monday"));
			System.out.println(englSpanDictionary.get("Tuesday"));
			System.out.println(englSpanDictionary.get("Wednesday"));
			System.out.println(englSpanDictionary.get("Thursday"));
			System.out.println(englSpanDictionary.get("Friday"));
			
			//Print out all keys
			System.out.println(englSpanDictionary.keySet());
			System.out.println(englSpanDictionary.values());
			
			System.out.println("The size of our dictionary is "+englSpanDictionary.size());
			
			System.out.println();
			System.out.println();
			
			//Shopping List
			Map<String,Boolean> shoppingList= new HashMap<String,Boolean>();
			//put some stuff in dictionary
			
			shoppingList.put("Ham", true);
			shoppingList.put("Bread", true);
			shoppingList.put("Oreos", true);
			shoppingList.put("Eggs", false);
			shoppingList.put("Sugar", false);
			
			//retrieve items
			System.out.println(shoppingList.get("Ham"));
			System.out.println(shoppingList.get("Oreos"));
			
			//key value pairs print out
			System.out.println(shoppingList.toString());
			//is it empty?
			shoppingList.remove("Eggs");
			System.out.println(shoppingList.isEmpty());
			System.out.println(shoppingList.toString());
			
			
			
			shoppingList.put("Bread", Boolean.FALSE);
			//clear out dictionary
			
			System.out.println(shoppingList.toString());
			
			
			shoppingList.clear();
			
			System.out.println(shoppingList.toString());
			//is it empty?
			System.out.println(shoppingList.isEmpty());
			
		}
	
	
	
}
