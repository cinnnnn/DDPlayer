package top.bilibililike.ddplayer.entity;

import org.litepal.crud.LitePalSupport;

public class UserInfoBean   {


    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"mid":5053396,"name":"夏色まつり0fficial","face":"http://i1.hdslb.com/bfs/face/7831c1cecb9f9acd6a86ea94be58de03c501c893.jpg","coin":104.7,"bcoin":0,"sex":0,"rank":10000,"silence":0,"show_videoup":1,"show_creative":1,"level":5,"vip_type":2,"audio_type":0,"dynamic":19,"following":511,"follower":11,"new_followers":0,"official_verify":{"type":-1,"desc":""},"pendant":{"image":"http://i1.hdslb.com/bfs/face/5ac24fa22208f48126bfacb42901e932946f6aa3.png"},"vip_section":{"title":"畅看番剧国创","url":"https://big.bilibili.com/mobile/home","start_time":1553702400,"end_time":1572537600},"vip_section_v2":{"title":"我的年度大会员","subtitle":"2021-06-10到期","desc":"畅看番剧国创","url":"https://big.bilibili.com/mobile/home"},"vip":{"type":2,"status":1,"due_date":1623254400000,"vip_pay_type":0,"theme_type":0,"label":{"path":""}}}
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

    public static class DataBean extends LitePalSupport {
        /**
         * mid : 5053396
         * name : 夏色まつり0fficial
         * face : http://i1.hdslb.com/bfs/face/7831c1cecb9f9acd6a86ea94be58de03c501c893.jpg
         * coin : 104.7
         * bcoin : 0
         * sex : 0
         * rank : 10000
         * silence : 0
         * show_videoup : 1
         * show_creative : 1
         * level : 5
         * vip_type : 2
         * audio_type : 0
         * dynamic : 19
         * following : 511
         * follower : 11
         * new_followers : 0
         * official_verify : {"type":-1,"desc":""}
         * pendant : {"image":"http://i1.hdslb.com/bfs/face/5ac24fa22208f48126bfacb42901e932946f6aa3.png"}
         * vip_section : {"title":"畅看番剧国创","url":"https://big.bilibili.com/mobile/home","start_time":1553702400,"end_time":1572537600}
         * vip_section_v2 : {"title":"我的年度大会员","subtitle":"2021-06-10到期","desc":"畅看番剧国创","url":"https://big.bilibili.com/mobile/home"}
         * vip : {"type":2,"status":1,"due_date":1623254400000,"vip_pay_type":0,"theme_type":0,"label":{"path":""}}
         */

        private int mid;
        private String name;
        private String face;
        private double coin;
        private int bcoin;
        private int sex;
        private int rank;


        private int level;
        private int vip_type;

        private int dynamic;
        private int following;
        private int follower;




        public int getMid() {
            return mid;
        }

        public void setMid(int mid) {
            this.mid = mid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFace() {
            return face;
        }

        public void setFace(String face) {
            this.face = face;
        }

        public double getCoin() {
            return coin;
        }

        public void setCoin(double coin) {
            this.coin = coin;
        }

        public int getBcoin() {
            return bcoin;
        }

        public void setBcoin(int bcoin) {
            this.bcoin = bcoin;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }



        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public int getVip_type() {
            return vip_type;
        }

        public void setVip_type(int vip_type) {
            this.vip_type = vip_type;
        }



        public int getDynamic() {
            return dynamic;
        }

        public void setDynamic(int dynamic) {
            this.dynamic = dynamic;
        }

        public int getFollowing() {
            return following;
        }

        public void setFollowing(int following) {
            this.following = following;
        }

        public int getFollower() {
            return follower;
        }

        public void setFollower(int follower) {
            this.follower = follower;
        }



    }
}
