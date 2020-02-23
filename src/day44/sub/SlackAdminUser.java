package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {

    int adminID;

    public SlackAdminUser(String nameUser, String statusUser, int adminID){
        this.nameUser=nameUser;
        this.statusUser=statusUser;
        this.adminID=adminID;

    }

    public static void main(String[] args) {

        SlackAdminUser user1 = new SlackAdminUser("Okan","Working Intensively",1234567);
        System.out.println("user1.toString() = " + user1.toString());

        // --- inherited methods we are calling
        user1.sendMessage();
        user1.callSomeone();
        user1.addEmoji();
        // --- our own methods we are calling
        user1.addChannel();
        user1.deleteMessage();
        user1.sendAtChannelMessage();
        System.out.println("user1 = " + user1);



    }



    public void sendAtChannelMessage(){
        System.out.println(nameUser + " sending channel message");

    }


    public void deleteMessage(){
        System.out.println(nameUser + " deleting slack messages");

    }

    public void addChannel(){
        System.out.println(nameUser + " adding new channels");

    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminID=" + adminID +
                ", nameUser='" + nameUser + '\'' +
                ", statusUser='" + statusUser + '\'' +
                '}';
    }
}
