package design_pattens.prototype_pattern;

/**
 * Created by juno on 15-7-2.
 */
public class Client {
    private static int MAX_COUNT = 10;

    public static void main(String[] args) {

        int i = 0;
        Mail mail = new Mail(new ADTemplate());

        // 群发邮件
        while (i<MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setReceiver("收件人"+(i+1));

            sendMail(cloneMail);
            i++;

        }
    }

    public static void sendMail(Mail mail){
        System.out.println("发送邮件："+"收件人"+mail.getReceiver());
    }
}
