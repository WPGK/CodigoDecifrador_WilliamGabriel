import java.util.Scanner;

class Main {
        System.out.println("-------------------------------------------------");
        Scanner scan=new Scanner (System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Digite aqui:");

        pala p1= new pala(); 
             p1.setpala(scan.next());

        System.out.println("Digite aqui:");
        pala p2= new pala(); p2.setpala(scan.next());
        System.out.println("Digite aqui:");
        pala p3= new pala(); p3.setpala(scan.next());
        System.out.println("Digite aqui:");
        pala p4= new pala(); p4.setpala(scan.next());
        
        p1.setnumLetras(p1.getpala().length());
        p2.setnumLetras(p2.getpala().length());
        p3.setnumLetras(p3.getpala().length());
        p4.setnumLetras(p4.getpala().length());
        
        System.out.println("_____________________________________________________");
        
        ArrayList<String> palavras = new ArrayList<>();
        pala.add(p1.getnumletras()+" - "+p1.getpala());
        pala.add(p2.getnumLetras()+" - "+np2.getpala());
        pala.add(p3.getnumLetras()+" - "+p3.getpala());
        pala.add(p4.getnumLetras()+" - "+p4.getpala());

        Collections.reverse(pala);
        
        for (String pala : pala){
            System.out.println(pala);
        }
        System.out.println("======= END =======");
   }
}
}