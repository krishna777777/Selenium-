import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;



public class ListNames {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//printing the names starting with Alphabet A 
		
		 List<String> names=new ArrayList<String>(); 
		 
		 names.add("Aparna");
		 names.add("Arun");
		 names.add("krishna");
		 names.add("Arivu");
		 names.add("Gayathri");
		 
		 int count =0 ;
		 
	for (int i=0 ;i<names.size();i++) {
		String s = names.get(i);
		if(s.startsWith("A")) {
			count ++;
			System.out.println(s);
		}
	}
	ListNames.Streams();
	ListNames.PrintStreams();
	ListNames.StreamMap();
	ListNames.StreamSort();
	ListNames.ListCombination();
	ListNames.CollectionEG();
	ListNames.Assignment();

	}
	
	
	public static void Streams() {
		List<String> names=new ArrayList<String>(); 
		 
		 names.add("Aparna");
		 names.add("Arun");
		 names.add("krishna");
		 names.add("Arivu");
		 names.add("Gayathri");
		 
		 //Assign it to streams 
		long c =  names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		// no output will be printed because there is no Termination operation
		// we can also write like this as well .
		// it will return 0 because we are hardcoding as false eventhough the 
		//count is matching with A character .
	long d =Stream.of("Aparna","Arun","Krishna").filter(s->
		{
			s.startsWith("A");
			return true ;
		}).count();
	System.out.print(d);
	//print all the names of ArrayList where the character is > 4 .
	//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	// print only the first index of it 
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
				
//Terminal operation will be performed only if the Intermediate operator returns true
		
		
		 
		
	}
	
	// print all the values present in the Stream 
	 public static void PrintStreams() {
		 
	Stream<String> stream= Stream.of("Krishna","Ram","Aparna");	
	stream.forEach(s-> System.out.println(s));
		 
	 
	 }

	 
	 //Map 
	 // Map is used in Manipulating the Strings 
	 //getting the names ending with M and converting them to UpperCase .
	 public static void StreamMap() {
		 Stream.of("krishna","Ram","LAKS","sriram").filter(s->s.endsWith("m")).map(s->s.toUpperCase())
		 .forEach(s->System.out.println(s));
	 }
	 
	 //Print names with firt Letter A and print in uppercase and sort it .
	 public static void StreamSort() {
		 
		 List<String> names = Arrays.asList("Krishna","Azbi","Aparna");
		 //sort() is also one of the terminal Operation . 
		 
		 names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		 
	 }
	 
	 public static void ListCombination() {
		 List<String> name1 = Arrays.asList("Krishna","Azbi","Aparna");
		 
		 List<String> name2 = Arrays.asList("Mandra","Manoj","Murali");
		 
		 //Concat Lists 
		 
Stream<String> combi=Stream.concat(name1.stream(),name2.stream());

//combi.forEach(s->System.out.println(s));

// checking if a particular string is present or not 

boolean answer = combi.anyMatch(s->s.equalsIgnoreCase("Krishna"));
// it returns true 
System.out.println(answer);

		 
	 }
	 // used to convert the stream back to the list 
	 public static void CollectionEG() {
		 
Stream.of("Krishna","Rasna","Sriram").filter(s->s.startsWith("K")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
// collecting the result and converting the stream back to List 
List<String> convert =   Stream.of("Krishna","Rasna","Sriram").filter(s->s.startsWith("K")).map(s->s.toUpperCase())
.collect(Collectors.toList());

System.out.println(convert.get(0));



		 
	 }


	 public static void Assignment() {
		 List<Integer> number = Arrays.asList(1,1,2,3,4,5,9,9,6);
		 // print unique number in the array  
		 
		// 
		 // sort the values 
		 
		 number.stream().sorted().distinct().forEach(s->System.out.println(s));
		 
		 // print only the 3 rd index from the sorted value 
		 
List<Integer> limit =number.stream().sorted().distinct().collect(Collectors.toList());

System.out.println(limit.get(3));
		 
	 
}
}
