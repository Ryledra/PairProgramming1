
public class Doggo {
	public int[] Placings (int skip) {
	  int[] array= new int[99];
	  
	  int position = 0;
	  
	  for (int i = 1; i <= 100; i++){
		 if (i == skip) continue; 
		  array [position] = i;
		  position ++;
	  }
		return array;
	}
		
	public String position (int pos) {
		switch (pos) {
		case 1:
		case 21:
		case 31:
		case 41:	
		case 51:
		case 61:
		case 71:
		case 81:
		case 91:
			return (pos + "st, ");
		
		case 2:
		case 22:
		case 32:
		case 42:	
		case 52:
		case 62:
		case 72:
		case 82:
		case 92:
			return (pos + "nd, ");
			
			
		case 3:
		case 23:
		case 33:
		case 43:	
		case 53:
		case 63:
		case 73:
		case 83:
		case 93:
			return (pos + "rd, ");
			
		case 100:
			return (pos + "th");
			
		default: 
			return (pos + "th, ");
		}
		
		
	}

}
