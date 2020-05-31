import java.util.Random;

public class Matice {
    public static void main(String[] args) {
        Matice m = new Matice(10);
        m.R();
        m.Transpozice();
    }
    
    Random r = new Random();
    int x;
    int[][] pole;
    
    public Matice(int x) {
        this.x = x;
        pole = new int[x][x];
    }
    
    public void R(){
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                pole[i][j] = r.nextInt(10);
            }
        }
        System.out.println(ShowMatice());
    }
    public void Transpozice(){
        int n;
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                if (i != j && i > j) {
                    n = pole[i][j];
                    pole[i][j] = pole[j][i];
                    pole[j][i] = n;
                }
            }
        }
        System.out.println(ShowMatice());
    }
    
    public String ShowMatice(){
        String text = "";
        for (int i = 0; i < pole.length; i++) {
            text += '\n';
            for (int j = 0; j < pole.length; j++) {
                text += " " + pole[i][j];
            }
        }
        return text;
    }
}
