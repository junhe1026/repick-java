package design_pattens.prototype_pattern;

/**
 * Created by juno on 15-7-2.
 * 广告邮件内容模板
 */
public class ADTemplate {

    private String adsubject = "银行广告";
    private String adcontent = "广告内容";

    public String getAdsubject() {
        return adsubject;
    }

    public void setAdsubject(String adsubject) {
        this.adsubject = adsubject;
    }

    public String getAdcontent() {
        return adcontent;
    }

    public void setAdcontent(String adcontent) {
        this.adcontent = adcontent;
    }
}
