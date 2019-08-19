package com.company.homework10.ExeptionTree;

public class MethodExeption {
    public void methExc(int number) {
        if (number <10) {
            try {
                throw new MyE1();
            } catch (MyE1 myE1) {
                System.out.println("Exeption number < 10");
            }
        }
        else if (number>10&&number<20) {
            try {
                throw new MyE2();
            } catch (MyE2 myE2) {
                System.out.println("Exeption number > 10 and <20");
            }
        }
        else if (number>100&&number<1000) {
            try {
                throw new MyE3();
            } catch (MyE3 myE3) {
                System.out.println("Exeption number >100");
            }
        }
        else if (number>1000) {
            try {
                throw new MyE4();
            } catch (MyE4 myE4) {
                System.out.println("Exeption number >1000");
            }
        }
    }

    public void methProcess(int number){
        MethodExeption methodExeption = new MethodExeption();
        int i = number;
        methodExeption.methExc(number);
    }
}
