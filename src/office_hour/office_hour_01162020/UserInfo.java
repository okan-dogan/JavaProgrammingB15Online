package office_hour.office_hour_01162020;

public class UserInfo {

    // attributes ==>> instance variables

    private String userName, passWord, ssn;


    public UserInfo(){
        setUserName("Unknown Person");
        setPassWord("9999999");
        setSsn("0000000");
    }

    public UserInfo(String userName, String passWord, String ssn){
        this.userName=userName;
        this.passWord=passWord;
        this.ssn=ssn;
    }

    // to read-only object
    public String getUserName(){
        return userName;
    }

    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getSsn(){
        return ssn;
    }

    public void setSsn(String ssn){
        this.ssn=ssn;
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassWord(String passWord){
        this.passWord=passWord;
    }



}
