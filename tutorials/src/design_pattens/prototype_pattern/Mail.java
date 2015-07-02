package design_pattens.prototype_pattern;

import mooc.java3.map_examples.MapTest;

/**
 * Created by juno on 15-7-2.
 *  原型模式
 *  发送邮件类
 */
public class Mail implements Cloneable {

    private String receiver;
    private String Subject;
    private String content;


    public Mail(ADTemplate tpl){
        this.Subject = tpl.getAdsubject();
        this.content = tpl.getAdcontent();
    }

    @Override
    public Mail clone(){
        Mail mail = null;
        try{
            mail = (Mail) super.clone();
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
