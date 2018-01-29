package cn.hycen.Invoicing.vo;


import lombok.Data;

@Data
public class ResultVO   {

    private  String msg;
    private int code;
    private Object result;

    public ResultVO() {
        super();
        msg="failed";

    }


    public void setSucessRepmsg() {
        this.msg = "sucessed";
        this.code=100000;

    }

    public void setFailRepmsg() {
        this.msg = "unknown failed";
        this.code=110008;
    }

    public void setRepmsg(int repcode, String repmsg) {
        this.msg = repmsg;
        this.code=repcode;
    }

    public void  setResult(Object represult){
        this.result = represult;
    }

}
