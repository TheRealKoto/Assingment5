import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception{
        float inputTemp;
        Scanner Input = new Scanner(System.in);
        while(true){
        System.out.println("please type your mode: 1 is for km to Mi 2 is for L to gallons 3 is for kg to lbs and 4 is for kpa to psi. type -1 to exit");
        inputTemp= Input.nextInt();//we will use the same input for the conversion so it needs to be a long
        
        if(inputTemp==1){
            System.out.println("input km");
            inputTemp = Input.nextFloat(); 
            System.out.println(inputTemp/1.609344F +" Mi");
        }else if(inputTemp==2){
            System.out.println("input L");
            inputTemp = Input.nextFloat(); 
            System.out.println(inputTemp/3.78541178F + " gallons");
        }else if(inputTemp==3){
            System.out.println("input kg");
            inputTemp = Input.nextFloat(); 
            System.out.println(inputTemp*2.20462262F + " lbs");
        }else if(inputTemp==4){
            System.out.println("input kpa");
            inputTemp = Input.nextFloat(); 
            System.out.println(inputTemp/6.89475729F + " Psi");
        }else if (inputTemp==-1){
            break;
        }else{System.out.println("invalid mode");}
        }
        Input.close();
    }
}
