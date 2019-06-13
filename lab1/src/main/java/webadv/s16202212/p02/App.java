package webadv.s16202212.p02;

import java.util.Scanner;

import org.apache.commons.codec.digest.DigestUtils;
public class App {
    public static void main(String[] args) {
    	String account="16202212";
    	String password="123456";
    	String lockpassword=sha256hex(password);
    	System.out.println("账号:");
    	Scanner in =new Scanner(System.in);
        String hex_account=in.next();
        System.out.println("密码:");
        String inpassword=in.next();
        String deal_password=sha256hex(password);
        if(account.equals(account)&&deal_password.equals(lockpassword)) {
        	System.out.println("登陆成功");
        	System.out.println("您的账号是"+account+"\n"+"您的密码是"+lockpassword);
        }else {
        	System.out.println("登陆失败");
        	System.exit(0); 
        }
       
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}