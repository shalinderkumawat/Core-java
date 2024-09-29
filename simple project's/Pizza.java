import java.util.Scanner;
class Pizza{
    private int price;

    private boolean veg;

    private int Extracheese=100;

    private int ExtraTopping=100;

    private int Begpacke=20;

    private int basepizzaprice=300;

    private boolean isExtracheeseadd=false;

    private boolean isExtraToppingsAdd=false;

    private boolean isOptedForaway=false;

    Pizza(boolean veg)
    {
        this.veg=veg;
        if(this.veg)
        {
            this.price=500;
        }
        else{
            this.price=1000;
        }
        this.basepizzaprice=this.price;
    }
    public void addExtrachease(){

        isExtracheeseadd=true;

        this.price=this.price+this.Extracheese;
        
    }
    public void addExteraTopping(){
        
        isExtraToppingsAdd=true;
 
        this.price=this.price+this.ExtraTopping;
        
    }
    public void addbag(){

        isOptedForaway=true;
      
        this.price=this.price+this.Begpacke;
    }
    public void bill()
    {
        String isbill="";
        System.out.println("Pizza : "+this.basepizzaprice+"\n");
        if(isExtraToppingsAdd)
        {
            isbill="Extra topping added : "+ ExtraTopping +"\n"  ;
            System.out.println(isbill);
        }
        if(isExtracheeseadd){
            isbill="Extra cheese added : "+ Extracheese  +"\n";
            System.out.println(isbill);
        }
        if(isOptedForaway)
        {
            isbill="Extra bag packe added : " + Begpacke + "\n";
            System.out.println(isbill); 
        }
        System.out.println("Tottel bill : "+price);
    }
}
public class Main{
    
    public static void main(String [] args)
    {   Scanner input=new Scanner(System.in);
        System.out.println("------------------------------------MAINU--------------------------------------------");
        System.out.println("1. VEG PIZZA "+"\n"+"2. NON VEG PIZZA");
        System.out.println("You want veg pizza : ");
        String want=input.nextLine();
        System.out.println();
        boolean thiss=false;
        if(want.equals("yes")|| want.equals("YES"))
        {
            thiss=true;
        }
        else
        {
            thiss=false;
        }
        Pizza sc=new Pizza(thiss);
        System.out.println("you want add more like "+" \n"+"1. Extera topping press 1 "+"\n"+"2. Extera cheese press 2 "+"\n"+"3. pick on the way press 3 ");
        
        int extera=input.nextInt();
    
        if(extera==1)
        {
        sc.addExteraTopping();
        System.out.println("if you want extera cheese press 2 :"+"\n"+"else press 0");
        extera=input.nextInt();
        }
        if(extera==2)
        { 
            sc.addExtrachease();
            System.out.println("you want on the way :"+"\n"+"else press 0");
            extera=input.nextInt();
        }
        if(extera==3)
        {    
            sc.addbag();
        }
           sc.bill();
        
    }
}