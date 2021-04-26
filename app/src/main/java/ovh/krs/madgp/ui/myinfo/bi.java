package ovh.krs.madgp.ui.myinfo;

public class bi {
    private int w = -1;
    private int h = -1;
    private String t = "";

    public bi(String a, int b,int c){
        this.t=a;
        this.w=b;
        this.h=c;
    }

    int geth(){
        return h;
    }
    int getw(){
        return w;
    }
    String gett(){
        return t;
    }
}
