package top.bilibililike.ddplayer.entity.search;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchLiveBean {

    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"trackid":"16813620448616115709","pages":16,"total":0,"live_master":{"trackid":"","pages":0,"total":0},"live_room":{"trackid":"","pages":16,"total":306,"items":[{"title":"神乐坂口的投稿视频","name":"神乐坂口","cover":"https://i0.hdslb.com/bfs/live/0477300d2adf65062a3d1fb7ef92122b82213b0f.png","uri":"bilibili://live/3285783?broadcast_type=0","param":"3285783","goto":"live","roomid":3285783,"mid":37922578,"type":"live_room","attentions":2,"live_status":2,"region":12,"online":7,"badge":"直播"},{"title":"神樂坂東葉的直播间","name":"神樂坂東葉","cover":"https://i0.hdslb.com/bfs/live/3618fe81df7f5b5e92c2c73476f328d333337137.jpg","uri":"bilibili://live/2388139?broadcast_type=0","param":"2388139","goto":"live","roomid":2388139,"mid":45599813,"type":"live_room","attentions":1370,"tags":"使命召唤13,天涯明月刀,女装大佬","region":1,"online":31,"badge":"直播"}]}}
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
         * trackid : 16813620448616115709
         * pages : 16
         * total : 0
         * live_master : {"trackid":"","pages":0,"total":0}
         * live_room : {"trackid":"","pages":16,"total":306,"items":[{"title":"神乐坂口的投稿视频","name":"神乐坂口","cover":"https://i0.hdslb.com/bfs/live/0477300d2adf65062a3d1fb7ef92122b82213b0f.png","uri":"bilibili://live/3285783?broadcast_type=0","param":"3285783","goto":"live","roomid":3285783,"mid":37922578,"type":"live_room","attentions":2,"live_status":2,"region":12,"online":7,"badge":"直播"},{"title":"神樂坂東葉的直播间","name":"神樂坂東葉","cover":"https://i0.hdslb.com/bfs/live/3618fe81df7f5b5e92c2c73476f328d333337137.jpg","uri":"bilibili://live/2388139?broadcast_type=0","param":"2388139","goto":"live","roomid":2388139,"mid":45599813,"type":"live_room","attentions":1370,"tags":"使命召唤13,天涯明月刀,女装大佬","region":1,"online":31,"badge":"直播"}]}
         */

        private String trackid;
        private int pages;
        private int total;
        private LiveMasterBean live_master;
        private LiveRoomBean live_room;

        public String getTrackid() {
            return trackid;
        }

        public void setTrackid(String trackid) {
            this.trackid = trackid;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public LiveMasterBean getLive_master() {
            return live_master;
        }

        public void setLive_master(LiveMasterBean live_master) {
            this.live_master = live_master;
        }

        public LiveRoomBean getLive_room() {
            return live_room;
        }

        public void setLive_room(LiveRoomBean live_room) {
            this.live_room = live_room;
        }

        public static class LiveMasterBean {
            /**
             * trackid :
             * pages : 0
             * total : 0
             */

            private String trackid;
            private int pages;
            private int total;

            public String getTrackid() {
                return trackid;
            }

            public void setTrackid(String trackid) {
                this.trackid = trackid;
            }

            public int getPages() {
                return pages;
            }

            public void setPages(int pages) {
                this.pages = pages;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }
        }

        public static class LiveRoomBean {
            /**
             * trackid :
             * pages : 16
             * total : 306
             * items : [{"title":"神乐坂口的投稿视频","name":"神乐坂口","cover":"https://i0.hdslb.com/bfs/live/0477300d2adf65062a3d1fb7ef92122b82213b0f.png","uri":"bilibili://live/3285783?broadcast_type=0","param":"3285783","goto":"live","roomid":3285783,"mid":37922578,"type":"live_room","attentions":2,"live_status":2,"region":12,"online":7,"badge":"直播"},{"title":"神樂坂東葉的直播间","name":"神樂坂東葉","cover":"https://i0.hdslb.com/bfs/live/3618fe81df7f5b5e92c2c73476f328d333337137.jpg","uri":"bilibili://live/2388139?broadcast_type=0","param":"2388139","goto":"live","roomid":2388139,"mid":45599813,"type":"live_room","attentions":1370,"tags":"使命召唤13,天涯明月刀,女装大佬","region":1,"online":31,"badge":"直播"}]
             */

            private String trackid;
            private int pages;
            private int total;
            private List<ItemsBean> items;

            public String getTrackid() {
                return trackid;
            }

            public void setTrackid(String trackid) {
                this.trackid = trackid;
            }

            public int getPages() {
                return pages;
            }

            public void setPages(int pages) {
                this.pages = pages;
            }

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * title : 神乐坂口的投稿视频
                 * name : 神乐坂口
                 * cover : https://i0.hdslb.com/bfs/live/0477300d2adf65062a3d1fb7ef92122b82213b0f.png
                 * uri : bilibili://live/3285783?broadcast_type=0
                 * param : 3285783
                 * goto : live
                 * roomid : 3285783
                 * mid : 37922578
                 * type : live_room
                 * attentions : 2
                 * live_status : 2
                 * region : 12
                 * online : 7
                 * badge : 直播
                 * tags : 使命召唤13,天涯明月刀,女装大佬
                 */

                private String title;
                private String name;
                private String cover;
                private String uri;
                private String param;
                @SerializedName("goto")
                private String gotoX;
                private int roomid;
                private int mid;
                private String type;
                private int attentions;
                private int live_status;
                private int region;
                private int online;
                private String badge;
                private String tags;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCover() {
                    return cover;
                }

                public void setCover(String cover) {
                    this.cover = cover;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public String getParam() {
                    return param;
                }

                public void setParam(String param) {
                    this.param = param;
                }

                public String getGotoX() {
                    return gotoX;
                }

                public void setGotoX(String gotoX) {
                    this.gotoX = gotoX;
                }

                public int getRoomid() {
                    return roomid;
                }

                public void setRoomid(int roomid) {
                    this.roomid = roomid;
                }

                public int getMid() {
                    return mid;
                }

                public void setMid(int mid) {
                    this.mid = mid;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public int getAttentions() {
                    return attentions;
                }

                public void setAttentions(int attentions) {
                    this.attentions = attentions;
                }

                public int getLive_status() {
                    return live_status;
                }

                public void setLive_status(int live_status) {
                    this.live_status = live_status;
                }

                public int getRegion() {
                    return region;
                }

                public void setRegion(int region) {
                    this.region = region;
                }

                public int getOnline() {
                    return online;
                }

                public void setOnline(int online) {
                    this.online = online;
                }

                public String getBadge() {
                    return badge;
                }

                public void setBadge(String badge) {
                    this.badge = badge;
                }

                public String getTags() {
                    return tags;
                }

                public void setTags(String tags) {
                    this.tags = tags;
                }
            }
        }
    }
}
