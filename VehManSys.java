import java.io.*;
import java.util.Scanner;
class DataCache{
	protected String password="ProgDev5"; 
	protected int numberVehi;
	protected int slotsEmpty;
	protected float rateHour=3.5f;
	protected float revenueGather;
	boolean verPassword(String chCache){
	  if(chCache.equals(password)){
	  	return true;
	  }
	  return false;
	}

	int getVehiNum(){
		return numberVehi;
	}
	float getRevenue(){
		return revenueGather;
	}
}
class VehManSys{
	private static int  newChoice;
	protected static void adminPort(){
		int choice;
		System.out.println("Welcome, Admin!");
		System.out.println("What do you want to do?");
		System.out.println("1. View revenue collected");
		System.out.println("2. Number of vehicles");
		System.out.println("3. Change hourly rate");
		Scanner sc2=new Scanner(System.in);
		DataCache dc=new DataCache();
		choice=sc2.nextInt();
		switch(choice){
			case 1:System.out.println("Revenue collected in INR is "+dc.getRevenue());
			break;
			case 2:System.out.println("Cars in parking space "+ dc.getVehiNum());
			break;
			case 3: S
		}

	}
	protected static void adminLoginPort(){
		boolean chAccess;
		String password=new String();
	    Scanner sc1=new Scanner(System.in);
	    password=sc1.nextLine();
	    DataCache verPass=new DataCache();
	    chAccess=verPass.verPassword(password);
	    if(chAccess){
	    	adminPort();
	    }

	}
	public static void main(String[] args){
		System.out.println("Welcome to the Vehicle Management System!");
		Scanner sc=new Scanner(System.in);
		newChoice=sc.nextInt();
		if(newChoice==1){
			adminLoginPort();
		}

	}
}