package jp.ac.it_college.std.s23022.practice.chap3;

import ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap3.CompanyConstants;
import ip.ac.it_college.std.s23022.jp.ac.it_college.std.s23022.practice.chap3.HelloByKotlin;

public class JavaMain {
    public static void main(String[] args) {
        HelloByKotlin helloByKotlin = new HelloByKotlin();
        helloByKotlin.printHello();

        System.out.println(CompanyConstants.Companion.getMaxEmployeeCount());

        System.out.println(CompanyConstants.getMaxEmployeeCount());
    }
}
