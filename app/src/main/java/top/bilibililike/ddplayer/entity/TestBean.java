package top.bilibililike.ddplayer.entity;

import java.util.List;

public class TestBean {

    /**
     * accept_format : hdflv2,flv,flv720,flv480,mp4
     * code : 0
     * seek_param : start
     * is_preview : 0
     * fnval : 0
     * video_project : true
     * fnver : 0
     * type : FLV
     * bp : 0
     * result : suee
     * seek_type : offset
     * vip_type : 2
     * from : local
     * video_codecid : 7
     * durl : [{"size":495510671,"ahead":"","length":1420094,"vhead":"","backup_url":["https://cn-hnzz2-cmcc-v-06.acgvideo.com/upgcxcode/86/05/106650586/106650586-1-112.flv?expires=1565449200&platform=android&ssig=HLJABC7vnyXcXa9n8rpHxw&oi=614317459&trid=fd162bef7ffd4c658118b3be173e5320p&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=5053396","https://cn-jxnc-cmcc-v-02.acgvideo.com/upgcxcode/86/05/106650586/106650586-1-112.flv?expires=1565449200&platform=android&ssig=HLJABC7vnyXcXa9n8rpHxw&oi=614317459&trid=fd162bef7ffd4c658118b3be173e5320p&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=5053396"],"url":"https://cn-jxnc2-cmcc-v-03.acgvideo.com/upgcxcode/86/05/106650586/106650586-1-112.flv?expires=1565449200&platform=android&ssig=HLJABC7vnyXcXa9n8rpHxw&oi=614317459&trid=fd162bef7ffd4c658118b3be173e5320p&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=5053396","order":1,"md5":""}]
     * no_rexcode : 0
     * format : hdflv2
     * message :
     * accept_quality : [112,80,64,32,16]
     * quality : 112
     * timelength : 1420094
     * has_paid : true
     * vip_status : 1
     * accept_description : ["高清 1080P+","高清 1080P","高清 720P","清晰 480P","流畅 360P"]
     * status : 2
     */

    private String accept_format;
    private int code;
    private String seek_param;
    private int is_preview;
    private int fnval;
    private boolean video_project;
    private int fnver;
    private String type;
    private int bp;
    private String result;
    private String seek_type;
    private int vip_type;
    private String from;
    private int video_codecid;
    private int no_rexcode;
    private String format;
    private String message;
    private int quality;
    private int timelength;
    private boolean has_paid;
    private int vip_status;
    private int status;
    private List<DurlBean> durl;
    private List<Integer> accept_quality;
    private List<String> accept_description;

    public String getAccept_format() {
        return accept_format;
    }

    public void setAccept_format(String accept_format) {
        this.accept_format = accept_format;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSeek_param() {
        return seek_param;
    }

    public void setSeek_param(String seek_param) {
        this.seek_param = seek_param;
    }

    public int getIs_preview() {
        return is_preview;
    }

    public void setIs_preview(int is_preview) {
        this.is_preview = is_preview;
    }

    public int getFnval() {
        return fnval;
    }

    public void setFnval(int fnval) {
        this.fnval = fnval;
    }

    public boolean isVideo_project() {
        return video_project;
    }

    public void setVideo_project(boolean video_project) {
        this.video_project = video_project;
    }

    public int getFnver() {
        return fnver;
    }

    public void setFnver(int fnver) {
        this.fnver = fnver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBp() {
        return bp;
    }

    public void setBp(int bp) {
        this.bp = bp;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getSeek_type() {
        return seek_type;
    }

    public void setSeek_type(String seek_type) {
        this.seek_type = seek_type;
    }

    public int getVip_type() {
        return vip_type;
    }

    public void setVip_type(int vip_type) {
        this.vip_type = vip_type;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public int getVideo_codecid() {
        return video_codecid;
    }

    public void setVideo_codecid(int video_codecid) {
        this.video_codecid = video_codecid;
    }

    public int getNo_rexcode() {
        return no_rexcode;
    }

    public void setNo_rexcode(int no_rexcode) {
        this.no_rexcode = no_rexcode;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getTimelength() {
        return timelength;
    }

    public void setTimelength(int timelength) {
        this.timelength = timelength;
    }

    public boolean isHas_paid() {
        return has_paid;
    }

    public void setHas_paid(boolean has_paid) {
        this.has_paid = has_paid;
    }

    public int getVip_status() {
        return vip_status;
    }

    public void setVip_status(int vip_status) {
        this.vip_status = vip_status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DurlBean> getDurl() {
        return durl;
    }

    public void setDurl(List<DurlBean> durl) {
        this.durl = durl;
    }

    public List<Integer> getAccept_quality() {
        return accept_quality;
    }

    public void setAccept_quality(List<Integer> accept_quality) {
        this.accept_quality = accept_quality;
    }

    public List<String> getAccept_description() {
        return accept_description;
    }

    public void setAccept_description(List<String> accept_description) {
        this.accept_description = accept_description;
    }

    public static class DurlBean {
        /**
         * size : 495510671
         * ahead :
         * length : 1420094
         * vhead :
         * backup_url : ["https://cn-hnzz2-cmcc-v-06.acgvideo.com/upgcxcode/86/05/106650586/106650586-1-112.flv?expires=1565449200&platform=android&ssig=HLJABC7vnyXcXa9n8rpHxw&oi=614317459&trid=fd162bef7ffd4c658118b3be173e5320p&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=5053396","https://cn-jxnc-cmcc-v-02.acgvideo.com/upgcxcode/86/05/106650586/106650586-1-112.flv?expires=1565449200&platform=android&ssig=HLJABC7vnyXcXa9n8rpHxw&oi=614317459&trid=fd162bef7ffd4c658118b3be173e5320p&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=5053396"]
         * url : https://cn-jxnc2-cmcc-v-03.acgvideo.com/upgcxcode/86/05/106650586/106650586-1-112.flv?expires=1565449200&platform=android&ssig=HLJABC7vnyXcXa9n8rpHxw&oi=614317459&trid=fd162bef7ffd4c658118b3be173e5320p&nfc=1&nfb=maPYqpoel5MI3qOUX6YpRA==&mid=5053396
         * order : 1
         * md5 :
         */

        private int size;
        private String ahead;
        private int length;
        private String vhead;
        private String url;
        private int order;
        private String md5;
        private List<String> backup_url;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getAhead() {
            return ahead;
        }

        public void setAhead(String ahead) {
            this.ahead = ahead;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getVhead() {
            return vhead;
        }

        public void setVhead(String vhead) {
            this.vhead = vhead;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public List<String> getBackup_url() {
            return backup_url;
        }

        public void setBackup_url(List<String> backup_url) {
            this.backup_url = backup_url;
        }
    }
}
