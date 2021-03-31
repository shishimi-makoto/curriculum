/**
 * バブルソート
 * チェックテスト-Java1章
 *
 */
public class Check{
    public static void main(String[] args){
        /*
        * 問1
        * int型の配列dataを作成し、値を3,1,2,7,5で初期化しなさい
        */
        int data[] = {3,1,2,7,5};

        /*
        * 問2
        * 以下のfor文を完成させなさい
        */
        for(int i = 0; i < 5; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                /*
                * 問3
                * 以下、配列の添字を入れてソートを完成させなさい
                */
                if(data[j] < data[j - 1]){
                  int box = data[j - 1];
                  data[j - 1] = data[j];
                  data[j] = box;
                }

            } 
        }
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
}