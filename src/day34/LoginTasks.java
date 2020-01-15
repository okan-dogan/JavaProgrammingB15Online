package day34;
/*
1, login1 :  static void method
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		print login successful
	else
		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)
 */
/*
2, login2 :  static method boolean return type
	it has two String method paramters
			called username and password
	(it accept 2 String object as argument when being called)
	it check whther username and password  "user" and "abc123"
	if yes
		return true
	else
		return false
 */
public class LoginTasks {

    public static void main(String[] args) {

        login1("okan","dogan");
        login1("okan","abc123");
        login1("user","dogan");
        login1("user","abc123");

        System.out.println(login2("okan","dogan"));
        System.out.println(login2("okan","abc123"));
        System.out.println(login2("user","dogan"));
        System.out.println(login2("user","abc123"));

        if(login2("user","abc123")){
            System.out.println("Hello World");
            System.out.println("Go Shopping");
        }else{
            System.out.println("No shopping unless you sign in succesfully");
        }



    }

    public static void login1(String userName1, String password1){
        if(userName1.equals("user")&&password1.equals("abc123")){
            System.out.println("login successful");
        }
        if(!userName1.equals("user")&&!password1.equals("abc123")){
            System.out.println("both invalid username and password");
        }else if(!userName1.equals("user")){
            System.out.println("invalid username");
        }else if(!password1.equals("abc123")){
            System.out.println("invalid password");
        }
    }

    public static boolean login2(String userName1, String password1){
        if(userName1.equals("user")&&password1.equals("abc123")){
            return true;
        }
        return false;
    }

}
