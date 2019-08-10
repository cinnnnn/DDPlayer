package top.bilibililike.ddplayer.entity.avPlay;

import java.util.List;

public class AVUrlBean {

    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"from":"local","result":"suee","quality":32,"format":"flv480","timelength":192706,"accept_format":"hdflv2,flv,flv720,flv480,flv360","accept_description":["高清 1080P+","高清 1080P","高清 720P","清晰 480P","流畅 360P"],"accept_quality":[112,80,64,32,16],"video_codecid":7,"fnver":0,"fnval":16,"video_project":true,"seek_param":"start","seek_type":"offset","dash":{"video":[{"id":16,"base_url":"http://223.111.106.197/upgcxcode/94/96/108379694/108379694-1-30011.m4s?expires=1565193600&platform=android&ssig=j06F1EmEzNP6cJjFUTiq5Q&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://upos-hz-mirrorcosu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=cosu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=8e5e82b71afb7be4136470998899a476&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":181727,"codecid":12},{"id":32,"base_url":"http://upos-hz-mirrorkodou.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=kodou&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=bace26ae476944d7d3d5b54e940fa627&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396","bandwidth":257492,"codecid":12},{"id":64,"base_url":"http://223.111.106.197/upgcxcode/94/96/108379694/108379694-1-30066.m4s?expires=1565193600&platform=android&ssig=JOjkVOEmWM8iGQc_BQ00dg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://upos-hz-mirrorks3u.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=ks3u&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=65b90bd7f37507f1eed0e38df566d8c2&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":408000,"codecid":12},{"id":80,"base_url":"http://223.111.106.199/upgcxcode/94/96/108379694/108379694-1-30077.m4s?expires=1565193600&platform=android&ssig=_BPMTY_NtDGLSup4eov1NA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://upos-hz-mirrorwcsu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30077.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=wcsu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=f182f664de231287832043300de20b9c&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":556865,"codecid":12},{"id":16,"base_url":"http://111.47.237.11/upgcxcode/94/96/108379694/108379694-1-30015.m4s?expires=1565193600&platform=android&ssig=XNP2eAYBZzcM3H_Srd2aOA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://223.85.58.79/upgcxcode/94/96/108379694/108379694-1-30015.m4s?expires=1565193600&platform=android&ssig=XNP2eAYBZzcM3H_Srd2aOA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://111.32.138.135/upgcxcode/94/96/108379694/108379694-1-30015.m4s?expires=1565193600&platform=android&ssig=XNP2eAYBZzcM3H_Srd2aOA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":255304,"codecid":7},{"id":32,"base_url":"http://111.47.237.9/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565193600&platform=android&ssig=0G72CXfLPOrfJdRQheunwQ&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://111.6.190.196/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565193600&platform=android&ssig=0G72CXfLPOrfJdRQheunwQ&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://223.111.106.199/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565193600&platform=android&ssig=0G72CXfLPOrfJdRQheunwQ&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":363670,"codecid":7},{"id":64,"base_url":"http://223.111.106.199/upgcxcode/94/96/108379694/108379694-1-30064.m4s?expires=1565193600&platform=android&ssig=7k1rg3zsVZauoQ3685ebwg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://112.5.217.135/upgcxcode/94/96/108379694/108379694-1-30064.m4s?expires=1565193600&platform=android&ssig=7k1rg3zsVZauoQ3685ebwg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://120.192.82.68/upgcxcode/94/96/108379694/108379694-1-30064.m4s?expires=1565193600&platform=android&ssig=7k1rg3zsVZauoQ3685ebwg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":579211,"codecid":7},{"id":80,"base_url":"http://111.47.237.5/upgcxcode/94/96/108379694/108379694-1-30080.m4s?expires=1565193600&platform=android&ssig=uKOgd1NqdH2kmDVhxrbqgA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://111.6.190.166/upgcxcode/94/96/108379694/108379694-1-30080.m4s?expires=1565193600&platform=android&ssig=uKOgd1NqdH2kmDVhxrbqgA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://183.201.219.198/upgcxcode/94/96/108379694/108379694-1-30080.m4s?expires=1565193600&platform=android&ssig=uKOgd1NqdH2kmDVhxrbqgA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":793659,"codecid":7}],"audio":[{"id":30280,"base_url":"http://111.47.237.6/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565193600&platform=android&ssig=wlW90cmHGUzs4MXwBxEjxA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://183.232.201.3/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565193600&platform=android&ssig=wlW90cmHGUzs4MXwBxEjxA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://upos-hz-mirrorbsyu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=bsyu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=75e1376e55682c4e08549e8e3a3f05fd&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":319268,"codecid":0},{"id":30216,"base_url":"http://112.5.217.130/upgcxcode/94/96/108379694/108379694-1-30216.m4s?expires=1565193600&platform=android&ssig=u_nCFtdTQ9-torPT70TfyA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://120.192.82.100/upgcxcode/94/96/108379694/108379694-1-30216.m4s?expires=1565193600&platform=android&ssig=u_nCFtdTQ9-torPT70TfyA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://upos-hz-mirrorwcsu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=wcsu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=cb321face98ad324ad2a34b14f7337b7&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":67207,"codecid":0}]},"no_rexcode":1}
     */

    private int code;
    private String message;
    private int ttl;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * from : local
         * result : suee
         * quality : 32
         * format : flv480
         * timelength : 192706
         * accept_format : hdflv2,flv,flv720,flv480,flv360
         * accept_description : ["高清 1080P+","高清 1080P","高清 720P","清晰 480P","流畅 360P"]
         * accept_quality : [112,80,64,32,16]
         * video_codecid : 7
         * fnver : 0
         * fnval : 16
         * video_project : true
         * seek_param : start
         * seek_type : offset
         * dash : {"video":[{"id":16,"base_url":"http://223.111.106.197/upgcxcode/94/96/108379694/108379694-1-30011.m4s?expires=1565193600&platform=android&ssig=j06F1EmEzNP6cJjFUTiq5Q&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://upos-hz-mirrorcosu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=cosu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=8e5e82b71afb7be4136470998899a476&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":181727,"codecid":12},{"id":32,"base_url":"http://upos-hz-mirrorkodou.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30033.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=kodou&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=bace26ae476944d7d3d5b54e940fa627&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396","bandwidth":257492,"codecid":12},{"id":64,"base_url":"http://223.111.106.197/upgcxcode/94/96/108379694/108379694-1-30066.m4s?expires=1565193600&platform=android&ssig=JOjkVOEmWM8iGQc_BQ00dg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://upos-hz-mirrorks3u.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30066.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=ks3u&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=65b90bd7f37507f1eed0e38df566d8c2&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":408000,"codecid":12},{"id":80,"base_url":"http://223.111.106.199/upgcxcode/94/96/108379694/108379694-1-30077.m4s?expires=1565193600&platform=android&ssig=_BPMTY_NtDGLSup4eov1NA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://upos-hz-mirrorwcsu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30077.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=wcsu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=f182f664de231287832043300de20b9c&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":556865,"codecid":12},{"id":16,"base_url":"http://111.47.237.11/upgcxcode/94/96/108379694/108379694-1-30015.m4s?expires=1565193600&platform=android&ssig=XNP2eAYBZzcM3H_Srd2aOA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://223.85.58.79/upgcxcode/94/96/108379694/108379694-1-30015.m4s?expires=1565193600&platform=android&ssig=XNP2eAYBZzcM3H_Srd2aOA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://111.32.138.135/upgcxcode/94/96/108379694/108379694-1-30015.m4s?expires=1565193600&platform=android&ssig=XNP2eAYBZzcM3H_Srd2aOA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":255304,"codecid":7},{"id":32,"base_url":"http://111.47.237.9/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565193600&platform=android&ssig=0G72CXfLPOrfJdRQheunwQ&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://111.6.190.196/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565193600&platform=android&ssig=0G72CXfLPOrfJdRQheunwQ&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://223.111.106.199/upgcxcode/94/96/108379694/108379694-1-30032.m4s?expires=1565193600&platform=android&ssig=0G72CXfLPOrfJdRQheunwQ&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":363670,"codecid":7},{"id":64,"base_url":"http://223.111.106.199/upgcxcode/94/96/108379694/108379694-1-30064.m4s?expires=1565193600&platform=android&ssig=7k1rg3zsVZauoQ3685ebwg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://112.5.217.135/upgcxcode/94/96/108379694/108379694-1-30064.m4s?expires=1565193600&platform=android&ssig=7k1rg3zsVZauoQ3685ebwg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://120.192.82.68/upgcxcode/94/96/108379694/108379694-1-30064.m4s?expires=1565193600&platform=android&ssig=7k1rg3zsVZauoQ3685ebwg&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":579211,"codecid":7},{"id":80,"base_url":"http://111.47.237.5/upgcxcode/94/96/108379694/108379694-1-30080.m4s?expires=1565193600&platform=android&ssig=uKOgd1NqdH2kmDVhxrbqgA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://111.6.190.166/upgcxcode/94/96/108379694/108379694-1-30080.m4s?expires=1565193600&platform=android&ssig=uKOgd1NqdH2kmDVhxrbqgA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://183.201.219.198/upgcxcode/94/96/108379694/108379694-1-30080.m4s?expires=1565193600&platform=android&ssig=uKOgd1NqdH2kmDVhxrbqgA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396"],"bandwidth":793659,"codecid":7}],"audio":[{"id":30280,"base_url":"http://111.47.237.6/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565193600&platform=android&ssig=wlW90cmHGUzs4MXwBxEjxA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://183.232.201.3/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565193600&platform=android&ssig=wlW90cmHGUzs4MXwBxEjxA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://upos-hz-mirrorbsyu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=bsyu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=75e1376e55682c4e08549e8e3a3f05fd&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":319268,"codecid":0},{"id":30216,"base_url":"http://112.5.217.130/upgcxcode/94/96/108379694/108379694-1-30216.m4s?expires=1565193600&platform=android&ssig=u_nCFtdTQ9-torPT70TfyA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","backup_url":["http://120.192.82.100/upgcxcode/94/96/108379694/108379694-1-30216.m4s?expires=1565193600&platform=android&ssig=u_nCFtdTQ9-torPT70TfyA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://upos-hz-mirrorwcsu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30216.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=wcsu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=cb321face98ad324ad2a34b14f7337b7&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"],"bandwidth":67207,"codecid":0}]}
         * no_rexcode : 1
         */

        private String from;
        private String result;
        private int quality;
        private String format;
        private int timelength;
        private String accept_format;
        private int video_codecid;
        private int fnver;
        private int fnval;
        private boolean video_project;
        private String seek_param;
        private String seek_type;
        private DashBean dash;

        private int no_rexcode;
        private List<String> accept_description;
        private List<DurlBean> durl;


        private List<Integer> accept_quality;

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public int getTimelength() {
            return timelength;
        }

        public void setTimelength(int timelength) {
            this.timelength = timelength;
        }

        public String getAccept_format() {
            return accept_format;
        }

        public void setAccept_format(String accept_format) {
            this.accept_format = accept_format;
        }

        public int getVideo_codecid() {
            return video_codecid;
        }

        public void setVideo_codecid(int video_codecid) {
            this.video_codecid = video_codecid;
        }

        public int getFnver() {
            return fnver;
        }

        public void setFnver(int fnver) {
            this.fnver = fnver;
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

        public String getSeek_param() {
            return seek_param;
        }

        public void setSeek_param(String seek_param) {
            this.seek_param = seek_param;
        }

        public String getSeek_type() {
            return seek_type;
        }

        public void setSeek_type(String seek_type) {
            this.seek_type = seek_type;
        }

        public DashBean getDash() {
            return dash;
        }

        public void setDash(DashBean dash) {
            this.dash = dash;
        }

        public List<DurlBean> getDurl() {
            return durl;
        }

        public void setDurl(List<DurlBean> durl) {
            this.durl = durl;
        }


        public int getNo_rexcode() {
            return no_rexcode;
        }

        public void setNo_rexcode(int no_rexcode) {
            this.no_rexcode = no_rexcode;
        }

        public List<String> getAccept_description() {
            return accept_description;
        }

        public void setAccept_description(List<String> accept_description) {
            this.accept_description = accept_description;
        }

        public List<Integer> getAccept_quality() {
            return accept_quality;
        }

        public void setAccept_quality(List<Integer> accept_quality) {
            this.accept_quality = accept_quality;
        }

        public static class DashBean {
            private List<VideoBean> video;
            private List<AudioBean> audio;

            public List<VideoBean> getVideo() {
                return video;
            }

            public void setVideo(List<VideoBean> video) {
                this.video = video;
            }

            public List<AudioBean> getAudio() {
                return audio;
            }

            public void setAudio(List<AudioBean> audio) {
                this.audio = audio;
            }

            public static class VideoBean {
                /**
                 * id : 16
                 * base_url : http://223.111.106.197/upgcxcode/94/96/108379694/108379694-1-30011.m4s?expires=1565193600&platform=android&ssig=j06F1EmEzNP6cJjFUTiq5Q&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396
                 * backup_url : ["http://upos-hz-mirrorcosu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30011.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=cosu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=8e5e82b71afb7be4136470998899a476&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"]
                 * bandwidth : 181727
                 * codecid : 12
                 */

                private int id;
                private String base_url;
                private int bandwidth;
                private int codecid;
                private List<String> backup_url;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getBase_url() {
                    return base_url;
                }

                public void setBase_url(String base_url) {
                    this.base_url = base_url;
                }

                public int getBandwidth() {
                    return bandwidth;
                }

                public void setBandwidth(int bandwidth) {
                    this.bandwidth = bandwidth;
                }

                public int getCodecid() {
                    return codecid;
                }

                public void setCodecid(int codecid) {
                    this.codecid = codecid;
                }

                public List<String> getBackup_url() {
                    return backup_url;
                }

                public void setBackup_url(List<String> backup_url) {
                    this.backup_url = backup_url;
                }
            }

            public static class AudioBean {
                /**
                 * id : 30280
                 * base_url : http://111.47.237.6/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565193600&platform=android&ssig=wlW90cmHGUzs4MXwBxEjxA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396
                 * backup_url : ["http://183.232.201.3/upgcxcode/94/96/108379694/108379694-1-30280.m4s?expires=1565193600&platform=android&ssig=wlW90cmHGUzs4MXwBxEjxA&oi=614314702&trid=566faa418e61428a9c02057ceca76b76&nfb=maPYqpoel5MI3qOUX6YpRA==&nfc=1&mid=5053396","http://upos-hz-mirrorbsyu.acgvideo.com/upgcxcode/94/96/108379694/108379694-1-30280.m4s?e=ig8euxZM2rNcNbdlhoNvNC8BqJIzNbfqXBvEuENvNC8aNEVEtEvE9IMvXBvE2ENvNCImNEVEIj0Y2J_aug859r1qXg8xNEVE5XREto8GuFGv2U7SuxI72X6fTr859IB_&deadline=1565193809&gen=playurl&nbs=1&oi=614314702&os=bsyu&platform=android&trid=566faa418e61428a9c02057ceca76b76&uipk=5&upsig=75e1376e55682c4e08549e8e3a3f05fd&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=5053396"]
                 * bandwidth : 319268
                 * codecid : 0
                 */

                private int id;
                private String base_url;
                private int bandwidth;
                private int codecid;
                private List<String> backup_url;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getBase_url() {
                    return base_url;
                }

                public void setBase_url(String base_url) {
                    this.base_url = base_url;
                }

                public int getBandwidth() {
                    return bandwidth;
                }

                public void setBandwidth(int bandwidth) {
                    this.bandwidth = bandwidth;
                }

                public int getCodecid() {
                    return codecid;
                }

                public void setCodecid(int codecid) {
                    this.codecid = codecid;
                }

                public List<String> getBackup_url() {
                    return backup_url;
                }

                public void setBackup_url(List<String> backup_url) {
                    this.backup_url = backup_url;
                }
            }
        }

        public static class DurlBean{

            /**
             * order : 1
             * length : 270164
             * size : 28094374
             * url : http://upos-hz-mirrorks3u.acgvideo.com/upgcxcode/10/51/11295110/11295110-1-32.flv?e=ig8euxZM2rNcNbNB7zUVhoMg7WuBhwdEto8g5X10ugNcXBlqNCNEto8g5gNvNE3DN0B5tZlqNxTEto8BTrNvN05fqx6S5ahE9IMvXBvE2ENvNCImNEVEK9GVqJIwqa80WXIekXRE9IB5QK==&deadline=1565442427&gen=playurl&nbs=1&oi=614315316&os=ks3u&platform=android&trid=4ea35d2324834e6e931f6251678f035c&uipk=5&upsig=00e91220351ece6e160c9e2c45b9f813&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=0
             * backup_url : ["http://upos-hz-mirrorcosu.acgvideo.com/upgcxcode/10/51/11295110/11295110-1-32.flv?e=ig8euxZM2rNcNbNB7zUVhoMg7WuBhwdEto8g5X10ugNcXBlqNCNEto8g5gNvNE3DN0B5tZlqNxTEto8BTrNvN05fqx6S5ahE9IMvXBvE2ENvNCImNEVEK9GVqJIwqa80WXIekXRE9IB5QK==&deadline=1565442427&gen=playurl&nbs=1&oi=614315316&os=cosu&platform=android&trid=4ea35d2324834e6e931f6251678f035c&uipk=5&upsig=4b4340c388712e28cddb199329d33ac8&uparams=e,deadline,gen,nbs,oi,os,platform,trid,uipk&mid=0"]
             */

            private int order;
            private int length;
            private int size;
            private String url;
            private List<String> backup_url;

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getLength() {
                return length;
            }

            public void setLength(int length) {
                this.length = length;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<String> getBackup_url() {
                return backup_url;
            }

            public void setBackup_url(List<String> backup_url) {
                this.backup_url = backup_url;
            }
        }
    }
}
