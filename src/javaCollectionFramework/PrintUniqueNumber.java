package javaCollectionFramework;

import java.util.ArrayList;

//print unique number from the list

public class PrintUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,5,5,5,4,6,6,9,4};
		
		ArrayList<Integer> ab=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) { //to check present in arraylist or not
			int k=0;
			if(!(ab.contains(a[i]))) {
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) { //comparision to check number repeats or not
					if(a[i]==a[j]) {
						k++;
					}
				}
				System.out.println("value "+a[i]);
				System.out.println("count "+k);
				if(k==1) {
					System.out.println(a[i]+" is unique");
				}
				
			}
		}
		

	}

}