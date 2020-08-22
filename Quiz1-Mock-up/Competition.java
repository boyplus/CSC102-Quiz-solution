import java.util.Scanner;
public class Competition{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String aname = sc.nextLine();
         int a1 = sc.nextInt();
         int a2 = sc.nextInt();
         int a3 = sc.nextInt();
         String bname = sc.nextLine();
         bname = sc.nextLine();
         int b1 = sc.nextInt();
         int b2 = sc.nextInt();
         int b3 = sc.nextInt();
         int suma = a1+a2+a3;
         int maxa = Math.max(a1,Math.max(a2,a3));
         int mina = Math.min(a1,Math.min(a2,a3));
         int meda = suma-maxa-mina;
         int sumb = b1+b2+b3;
         int maxb = Math.max(b1,Math.max(b2,b3));
         int minb = Math.min(b1,Math.min(b2,b3));
         int medb = sumb-maxb-minb;
         int wina = 0;
         int winb = 0;
         boolean win = false;
         if(maxa > maxb){
            wina +=1;
         } else if(maxa < maxb){
            winb +=1;
         }
         if(mina > minb){
            wina +=1;
         } else if(mina < minb){
            winb +=1;
         }
         if(wina == 2){
             System.out.println("Perfect Win ("+aname+")");
             win = true;
         }
         else if(winb == 2){
             System.out.println("Perfect Win ("+bname+")");
             win = true;
         }
         if(!win){
            if(meda > medb){
               wina +=1;
            } else if(meda < medb){
               winb +=1;
            }
            if(wina > winb){
               System.out.println("Win ("+aname+")");
            }
            else if(wina < winb){
               System.out.println("Win ("+bname+")");
            } else{
               System.out.println("Draw");
            }
         }
    }
}
