import java.util.Scanner;
class TransposeofMatrix{
    int arr1[][]=new int[10][10];
    int arr2[][]=new int[10][10];
    int m,n;
    Scanner sc=new Scanner(System.in);
    void Read(){
        System.out.println("Enter row size:");
        m=sc.nextInt();
        System.out.println("Enter column size:");
        n=sc.nextInt();
        System.out.println("Enter "+m*n+" elements of the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("matrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    void Transpose(){
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[j][i]=arr1[i][j];
            }
        }
        System.out.println("transpose of the matrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class matrix3{
    public static void main(String args[]){
        TransposeofMatrix a=new TransposeofMatrix();
        a.Read();
        a.Transpose();
    }
}