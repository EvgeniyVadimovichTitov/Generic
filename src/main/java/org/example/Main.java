package org.example;
import java.util.Objects;
public class Main {

    public static <T1> boolean compareArrays(T1[]ar1,T1[]ar2){
//        Напишите обобщенный метод compareArrays(), который принимает
//        два массива и возвращает true, если они одинаковые, и false
//        в противном случае. Массивы могут быть любого типа данных,
//        но должны иметь одинаковую длину и содержать элементы одного типа.
        if(ar1 == null || ar2 == null){
            throw new NullPointerException();
        }
        if(ar1.length!= ar2.length) {
            return false;
        }
        if(ar1.length==0){
            return true;
        }
        for(int i = 0;i<ar1.length; i++){
            if(!Objects.equals(ar1[i],ar2[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

    }
}