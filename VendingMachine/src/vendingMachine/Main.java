package vendingMachine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter Product Code");
				String code=scan.next();
				getProduct(code);
			}
			public static void getProduct(String productCode)
			{
				switch(productCode)
				{
				case "p01":System.out.println("coco cola");
				break;
				case "p02":System.out.println("tilo");
				break;
				case "p03":System.out.println("miranda");
				break;
				default:System.out.println("sodaaaaa");
				}
			}

		}



