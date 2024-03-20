import java.util.Scanner;

class Hello{
    public static void main(String[] args){
     

int dec=12;
String binary=Integer.toBinaryString(dec);
String hexa=Integer.toHexString(dec);
String octal=Integer.toOctalString(dec);

int decimal=Integer.parseInt(octal,8);
int decimal2=Integer.parseInt(hexa,16);
int decimal3=Integer.parseInt(binary,2);



System.out.println(decimal3);
    }
}