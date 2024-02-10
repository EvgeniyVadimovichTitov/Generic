package org.example;

//Написать класс Калькулятор (необобщенный), который содержит обобщенные
//        статические методы: sum(), multiply(), divide(), subtract().
//        Параметры этих методов – два числа разного типа, над которыми
//        должна быть произведена операция.
public class Calculate {
    public static <T1 extends Number,T2 extends Number>  Number sum(T1 a, T2 b){
        return new Number(){
            @Override
            public int intValue() {
                return a.intValue()+b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue()+b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue()+b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue()+b.doubleValue();
            }
        };
    }
    public static <T1 extends Number,T2 extends Number>  Number divide(T1 a, T2 b){
        if (b.intValue() == 0||b.doubleValue()==0d||b.longValue()==0l||b.floatValue()==0f){
            throw new ArithmeticException();
        }
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue()/b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue()/b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue()/b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue()/b.doubleValue();
            }
        };
    }
    public static <T1 extends Number,T2 extends Number>  Number multiply(T1 a, T2 b){
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue()*b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue()*b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue()*b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue()*b.doubleValue();
            }
        };
    }
    public static <T1 extends Number,T2 extends Number>  Number subtract(T1 a, T2 b){
        return new Number() {
            @Override
            public int intValue() {
                return a.intValue()-b.intValue();
            }

            @Override
            public long longValue() {
                return a.longValue()-b.longValue();
            }

            @Override
            public float floatValue() {
                return a.floatValue()-b.floatValue();
            }

            @Override
            public double doubleValue() {
                return a.doubleValue()-b.doubleValue();
            }
        };
    }

}
