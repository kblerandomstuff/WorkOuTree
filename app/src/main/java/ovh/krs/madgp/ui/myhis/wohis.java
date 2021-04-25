package ovh.krs.madgp.ui.myhis;

public class wohis {
    private String ts = "";
    private String woname = "";

    public wohis(String a, String b){
        this.ts=a;
        this.woname=b;
    }

    String gett(){
        return ts;
    }
    String getn(){
        return woname;
    }
}
