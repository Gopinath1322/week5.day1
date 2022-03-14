package week5.day1;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String word="We learn java basics as part of java sessions in java week1";
		String[] obj = word.split(" ");
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]);
			for (int j = i+1; j < obj.length; j++) {
				if (obj[i].equals(obj[j])) {
					obj[j]="";
					System.out.print(obj[j]);
				
					
					
				}
			
			}
			System.out.print(" ");	
		}
		
	}

}
