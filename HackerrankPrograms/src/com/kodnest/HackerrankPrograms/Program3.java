package com.kodnest.HackerrankPrograms;

public class Program3 {
public static void main(String[] args) {

solve(100,15,8);
}
public static void solve(double meal_cost,int tip_percentage,int tax_percentage) {
	double m1=meal_cost;
    int t1=(int)((tip_percentage/100.0)*(meal_cost));
    int tax1=(int)((tax_percentage/100.0)*(meal_cost));
    int total=(int)(m1+t1+tax1);
   System.out.println(total);
}
}
 