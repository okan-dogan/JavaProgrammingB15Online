package repl_it;
/*
A database (DB), in the most general sense, is an organized collection of data. ... In other words, a database is used by an organization as a method of storing, managing and retrieving information.
When you work data in databases, you can read, add, edit, delete data.

Lame database.

This method gets 4 strings and returns a string.
This method creates a very basic database interaction.
you can add, edit and remove data from the database.
all this using only String and string methods.
an example database may look like this:
1data#2moredata#3yet more data

if we use split("#") it will turn into an array.

as a database table it will look like this:
1data
2moredata
3yet more data

each row has a number id (1, 2 ,3) in above example.
each row of data is separated by #
data in each row is right after id

parameters:

String db : holds the whole lame database as a string. You will modify
this parameter value depending on operation requested

String op : op is short for operation, the operation the method will do on the database,
there are 3 : add, edit and delete. For any other operation, return the database as is.

String id : holds the id of the database row we want to manipulate, we use the id to find the
database row we want to manipulate

String data : holds a string of data we will use for the add or edit operations

example use of the method:

m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
returns:  1etsy#2wooden#3spoon#4aaa
(since operation is 'add', we added '#4aaa' to the end and return)

m.lameDb("1test#2bla#3foo","edit","2","bbb")
returns:  1test#2bbb#3foo
(since operation is 'edit', we edited id 2 to '#2bbb' to the end and return)


m.lameDb("1tst#2bla#3foo","delete","1","")
returns:  #2bla#3foo

m.lameDb("1tst#2bla#3foo","none","1","")
returns:  1tst#2bla#3foo
 */


import java.util.Arrays;

public class Repl_It_187_MethodsWithString_LameDB_Array {

    public static void main(String[] args) {

        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n");

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n");

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","2","")+"\n");

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n");

    }

    public static String lameDb(String db, String op,String id,String data){
        String[] parts = db.split("#");
        Integer idInt = Integer.valueOf(id);
        String result="";
        switch (op){
            case "add":
                return db+"#"+id+data;
            case "edit":
                parts[idInt-1]=id+data;
                return Arrays.toString(parts).replace("[","").replace(", ","#").replace("]","");
            case "delete":
                parts[idInt-1]="";
                if(idInt-1==0){
                    return Arrays.toString(parts).replace("[","").replace(", ","#").replace("]","");
                }else if(idInt-1==2){
                    return Arrays.toString(parts).replace("[","").replace(", ","#").replace("]","");
                }else{
                    return Arrays.toString(parts).replace("[","").replace(", ","#").replace("]","");
                }

            default:
                return db;
        }

    }//end lameDb

}




