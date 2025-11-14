package Computer;

public class Computer {

    public void playMusic(){
        System.out.println("Playing music");
    }
    public String getMePen(int cost){
        if(cost<=10)
        return "Pen";
        else
            return "Nothing";
    }

    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String str=comp.getMePen(12);
        System.out.println(str);


        //Arrays

        int num[]={1,2,3,4,5};
        System.out.println(num[0]);

        //creating array
        int arr[]=new int[4];
        arr[0]=4;
        arr[1]=8;
        arr[2]=56;
        arr[3]=79;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);

       // how to iterate
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }

        //2 d array
        int array[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        for(int n[]: array){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
