package Gabarge;

import java.util.ArrayList;

public class ListCB {
    static ArrayList<CanBo> list = new ArrayList<>();

    public static int find(String hoTen){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getHoTen().equalsIgnoreCase(hoTen)){
                System.out.println("Da thay!" + i);
                return 1;
            }
        }
        return -1;
    }
}
