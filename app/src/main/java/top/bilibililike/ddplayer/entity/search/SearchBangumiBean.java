package top.bilibililike.ddplayer.entity.search;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SearchBangumiBean {

    /**
     * code : 0
     * message : 0
     * ttl : 1
     * data : {"trackid":"6198570338684904883","pages":1,"total":1,"items":[{"title":"欢迎来到实力至上主义的教室","cover":"https://i0.hdslb.com/bfs/bangumi/a79e331b7443ed5df5a2acd345dc41d598d46ff9.jpg","uri":"https://www.bilibili.com/bangumi/play/ss6339/","param":"6339","goto":"bangumi","ptime":1499875200,"season_id":6339,"season_type":1,"season_type_name":"番剧","media_type":1,"style":"小说改/校园","cv":"堀北铃音：鬼头明里\n绫小路清隆：千叶翔也\n佐仓爱里：M・A・O\n栉田桔梗：久保ユリカ\n一之濑帆波：东山奈央\n龙园翔：水中雅章\n神崎隆二：若山晃久\n伊吹澪：小松未可子\n橘茜：小原好美","rating":8.6,"vote":40459,"area":"日本","staff":"导演：橋本裕之、岸誠二\n人物设定：森田和明\n主题歌演出：ZAQ\n原作：衣笠彰梧\n角色设计：森田和明\n系列构成：朱白あおい\n动画制作：Lerche","is_selection":1,"badge":"番剧","episodes":[{"uri":"https://www.bilibili.com/bangumi/play/ep113353","param":"113353","index":"1"},{"uri":"https://www.bilibili.com/bangumi/play/ep113354","param":"113354","index":"2"},{"uri":"https://www.bilibili.com/bangumi/play/ep113355","param":"113355","index":"3"},{"uri":"https://www.bilibili.com/bangumi/play/ep113356","param":"113356","index":"4"},{"uri":"https://www.bilibili.com/bangumi/play/ep113357","param":"113357","index":"5"},{"uri":"https://www.bilibili.com/bangumi/play/ep113358","param":"113358","index":"6"},{"uri":"https://www.bilibili.com/bangumi/play/ep113359","param":"113359","index":"7"},{"uri":"https://www.bilibili.com/bangumi/play/ep113360","param":"113360","index":"8"},{"uri":"https://www.bilibili.com/bangumi/play/ep113361","param":"113361","index":"9"},{"uri":"https://www.bilibili.com/bangumi/play/ep113362","param":"113362","index":"10"},{"uri":"https://www.bilibili.com/bangumi/play/ep113363","param":"113363","index":"11"},{"uri":"https://www.bilibili.com/bangumi/play/ep113364","param":"113364","index":"12"}],"label":"小说改/校园","watch_button":{"title":"立即观看","link":"https://www.bilibili.com/bangumi/play/ss6339"},"follow_button":{"icon":"http://i0.hdslb.com/bfs/bangumi/154b6898d2b2c20c21ccef9e41fcf809b518ebb4.png","texts":{"0":"追番","1":"已追番"},"status_report":"bangumi"},"selection_style":"grid","episodes_new":[{"title":"1","uri":"https://www.bilibili.com/bangumi/play/ep113353","param":"113353","is_new":0},{"title":"2","uri":"https://www.bilibili.com/bangumi/play/ep113354","param":"113354","is_new":0},{"title":"3","uri":"https://www.bilibili.com/bangumi/play/ep113355","param":"113355","is_new":0},{"title":"4","uri":"https://www.bilibili.com/bangumi/play/ep113356","param":"113356","is_new":0},{"title":"5","uri":"https://www.bilibili.com/bangumi/play/ep113357","param":"113357","is_new":0},{"title":"6","uri":"https://www.bilibili.com/bangumi/play/ep113358","param":"113358","is_new":0},{"title":"7","uri":"https://www.bilibili.com/bangumi/play/ep113359","param":"113359","is_new":0},{"title":"8","uri":"https://www.bilibili.com/bangumi/play/ep113360","param":"113360","is_new":0},{"title":"9","uri":"https://www.bilibili.com/bangumi/play/ep113361","param":"113361","is_new":0},{"title":"10","uri":"https://www.bilibili.com/bangumi/play/ep113362","param":"113362","is_new":0},{"title":"11","uri":"https://www.bilibili.com/bangumi/play/ep113363","param":"113363","is_new":0},{"title":"12","uri":"https://www.bilibili.com/bangumi/play/ep113364","param":"113364","is_new":0}]}]}
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
         * trackid : 6198570338684904883
         * pages : 1
         * total : 1
         * items : [{"title":"欢迎来到实力至上主义的教室","cover":"https://i0.hdslb.com/bfs/bangumi/a79e331b7443ed5df5a2acd345dc41d598d46ff9.jpg","uri":"https://www.bilibili.com/bangumi/play/ss6339/","param":"6339","goto":"bangumi","ptime":1499875200,"season_id":6339,"season_type":1,"season_type_name":"番剧","media_type":1,"style":"小说改/校园","cv":"堀北铃音：鬼头明里\n绫小路清隆：千叶翔也\n佐仓爱里：M・A・O\n栉田桔梗：久保ユリカ\n一之濑帆波：东山奈央\n龙园翔：水中雅章\n神崎隆二：若山晃久\n伊吹澪：小松未可子\n橘茜：小原好美","rating":8.6,"vote":40459,"area":"日本","staff":"导演：橋本裕之、岸誠二\n人物设定：森田和明\n主题歌演出：ZAQ\n原作：衣笠彰梧\n角色设计：森田和明\n系列构成：朱白あおい\n动画制作：Lerche","is_selection":1,"badge":"番剧","episodes":[{"uri":"https://www.bilibili.com/bangumi/play/ep113353","param":"113353","index":"1"},{"uri":"https://www.bilibili.com/bangumi/play/ep113354","param":"113354","index":"2"},{"uri":"https://www.bilibili.com/bangumi/play/ep113355","param":"113355","index":"3"},{"uri":"https://www.bilibili.com/bangumi/play/ep113356","param":"113356","index":"4"},{"uri":"https://www.bilibili.com/bangumi/play/ep113357","param":"113357","index":"5"},{"uri":"https://www.bilibili.com/bangumi/play/ep113358","param":"113358","index":"6"},{"uri":"https://www.bilibili.com/bangumi/play/ep113359","param":"113359","index":"7"},{"uri":"https://www.bilibili.com/bangumi/play/ep113360","param":"113360","index":"8"},{"uri":"https://www.bilibili.com/bangumi/play/ep113361","param":"113361","index":"9"},{"uri":"https://www.bilibili.com/bangumi/play/ep113362","param":"113362","index":"10"},{"uri":"https://www.bilibili.com/bangumi/play/ep113363","param":"113363","index":"11"},{"uri":"https://www.bilibili.com/bangumi/play/ep113364","param":"113364","index":"12"}],"label":"小说改/校园","watch_button":{"title":"立即观看","link":"https://www.bilibili.com/bangumi/play/ss6339"},"follow_button":{"icon":"http://i0.hdslb.com/bfs/bangumi/154b6898d2b2c20c21ccef9e41fcf809b518ebb4.png","texts":{"0":"追番","1":"已追番"},"status_report":"bangumi"},"selection_style":"grid","episodes_new":[{"title":"1","uri":"https://www.bilibili.com/bangumi/play/ep113353","param":"113353","is_new":0},{"title":"2","uri":"https://www.bilibili.com/bangumi/play/ep113354","param":"113354","is_new":0},{"title":"3","uri":"https://www.bilibili.com/bangumi/play/ep113355","param":"113355","is_new":0},{"title":"4","uri":"https://www.bilibili.com/bangumi/play/ep113356","param":"113356","is_new":0},{"title":"5","uri":"https://www.bilibili.com/bangumi/play/ep113357","param":"113357","is_new":0},{"title":"6","uri":"https://www.bilibili.com/bangumi/play/ep113358","param":"113358","is_new":0},{"title":"7","uri":"https://www.bilibili.com/bangumi/play/ep113359","param":"113359","is_new":0},{"title":"8","uri":"https://www.bilibili.com/bangumi/play/ep113360","param":"113360","is_new":0},{"title":"9","uri":"https://www.bilibili.com/bangumi/play/ep113361","param":"113361","is_new":0},{"title":"10","uri":"https://www.bilibili.com/bangumi/play/ep113362","param":"113362","is_new":0},{"title":"11","uri":"https://www.bilibili.com/bangumi/play/ep113363","param":"113363","is_new":0},{"title":"12","uri":"https://www.bilibili.com/bangumi/play/ep113364","param":"113364","is_new":0}]}]
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
             * title : 欢迎来到实力至上主义的教室
             * cover : https://i0.hdslb.com/bfs/bangumi/a79e331b7443ed5df5a2acd345dc41d598d46ff9.jpg
             * uri : https://www.bilibili.com/bangumi/play/ss6339/
             * param : 6339
             * goto : bangumi
             * ptime : 1499875200
             * season_id : 6339
             * season_type : 1
             * season_type_name : 番剧
             * media_type : 1
             * style : 小说改/校园
             * cv : 堀北铃音：鬼头明里
             绫小路清隆：千叶翔也
             佐仓爱里：M・A・O
             栉田桔梗：久保ユリカ
             一之濑帆波：东山奈央
             龙园翔：水中雅章
             神崎隆二：若山晃久
             伊吹澪：小松未可子
             橘茜：小原好美
             * rating : 8.6
             * vote : 40459
             * area : 日本
             * staff : 导演：橋本裕之、岸誠二
             人物设定：森田和明
             主题歌演出：ZAQ
             原作：衣笠彰梧
             角色设计：森田和明
             系列构成：朱白あおい
             动画制作：Lerche
             * is_selection : 1
             * badge : 番剧
             * episodes : [{"uri":"https://www.bilibili.com/bangumi/play/ep113353","param":"113353","index":"1"},{"uri":"https://www.bilibili.com/bangumi/play/ep113354","param":"113354","index":"2"},{"uri":"https://www.bilibili.com/bangumi/play/ep113355","param":"113355","index":"3"},{"uri":"https://www.bilibili.com/bangumi/play/ep113356","param":"113356","index":"4"},{"uri":"https://www.bilibili.com/bangumi/play/ep113357","param":"113357","index":"5"},{"uri":"https://www.bilibili.com/bangumi/play/ep113358","param":"113358","index":"6"},{"uri":"https://www.bilibili.com/bangumi/play/ep113359","param":"113359","index":"7"},{"uri":"https://www.bilibili.com/bangumi/play/ep113360","param":"113360","index":"8"},{"uri":"https://www.bilibili.com/bangumi/play/ep113361","param":"113361","index":"9"},{"uri":"https://www.bilibili.com/bangumi/play/ep113362","param":"113362","index":"10"},{"uri":"https://www.bilibili.com/bangumi/play/ep113363","param":"113363","index":"11"},{"uri":"https://www.bilibili.com/bangumi/play/ep113364","param":"113364","index":"12"}]
             * label : 小说改/校园
             * watch_button : {"title":"立即观看","link":"https://www.bilibili.com/bangumi/play/ss6339"}
             * follow_button : {"icon":"http://i0.hdslb.com/bfs/bangumi/154b6898d2b2c20c21ccef9e41fcf809b518ebb4.png","texts":{"0":"追番","1":"已追番"},"status_report":"bangumi"}
             * selection_style : grid
             * episodes_new : [{"title":"1","uri":"https://www.bilibili.com/bangumi/play/ep113353","param":"113353","is_new":0},{"title":"2","uri":"https://www.bilibili.com/bangumi/play/ep113354","param":"113354","is_new":0},{"title":"3","uri":"https://www.bilibili.com/bangumi/play/ep113355","param":"113355","is_new":0},{"title":"4","uri":"https://www.bilibili.com/bangumi/play/ep113356","param":"113356","is_new":0},{"title":"5","uri":"https://www.bilibili.com/bangumi/play/ep113357","param":"113357","is_new":0},{"title":"6","uri":"https://www.bilibili.com/bangumi/play/ep113358","param":"113358","is_new":0},{"title":"7","uri":"https://www.bilibili.com/bangumi/play/ep113359","param":"113359","is_new":0},{"title":"8","uri":"https://www.bilibili.com/bangumi/play/ep113360","param":"113360","is_new":0},{"title":"9","uri":"https://www.bilibili.com/bangumi/play/ep113361","param":"113361","is_new":0},{"title":"10","uri":"https://www.bilibili.com/bangumi/play/ep113362","param":"113362","is_new":0},{"title":"11","uri":"https://www.bilibili.com/bangumi/play/ep113363","param":"113363","is_new":0},{"title":"12","uri":"https://www.bilibili.com/bangumi/play/ep113364","param":"113364","is_new":0}]
             */

            private String title;
            private String cover;
            private String uri;
            private String param;
            @SerializedName("goto")
            private String gotoX;
            private int ptime;
            private int season_id;
            private int season_type;
            private String season_type_name;
            private int media_type;
            private String style;
            private String cv;
            private double rating;
            private int vote;
            private String area;
            private String staff;
            private int is_selection;
            private String badge;
            private String label;
            private WatchButtonBean watch_button;
            private FollowButtonBean follow_button;
            private String selection_style;
            private List<EpisodesBean> episodes;
            private List<EpisodesNewBean> episodes_new;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
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

            public int getPtime() {
                return ptime;
            }

            public void setPtime(int ptime) {
                this.ptime = ptime;
            }

            public int getSeason_id() {
                return season_id;
            }

            public void setSeason_id(int season_id) {
                this.season_id = season_id;
            }

            public int getSeason_type() {
                return season_type;
            }

            public void setSeason_type(int season_type) {
                this.season_type = season_type;
            }

            public String getSeason_type_name() {
                return season_type_name;
            }

            public void setSeason_type_name(String season_type_name) {
                this.season_type_name = season_type_name;
            }

            public int getMedia_type() {
                return media_type;
            }

            public void setMedia_type(int media_type) {
                this.media_type = media_type;
            }

            public String getStyle() {
                return style;
            }

            public void setStyle(String style) {
                this.style = style;
            }

            public String getCv() {
                return cv;
            }

            public void setCv(String cv) {
                this.cv = cv;
            }

            public double getRating() {
                return rating;
            }

            public void setRating(double rating) {
                this.rating = rating;
            }

            public int getVote() {
                return vote;
            }

            public void setVote(int vote) {
                this.vote = vote;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getStaff() {
                return staff;
            }

            public void setStaff(String staff) {
                this.staff = staff;
            }

            public int getIs_selection() {
                return is_selection;
            }

            public void setIs_selection(int is_selection) {
                this.is_selection = is_selection;
            }

            public String getBadge() {
                return badge;
            }

            public void setBadge(String badge) {
                this.badge = badge;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public WatchButtonBean getWatch_button() {
                return watch_button;
            }

            public void setWatch_button(WatchButtonBean watch_button) {
                this.watch_button = watch_button;
            }

            public FollowButtonBean getFollow_button() {
                return follow_button;
            }

            public void setFollow_button(FollowButtonBean follow_button) {
                this.follow_button = follow_button;
            }

            public String getSelection_style() {
                return selection_style;
            }

            public void setSelection_style(String selection_style) {
                this.selection_style = selection_style;
            }

            public List<EpisodesBean> getEpisodes() {
                return episodes;
            }

            public void setEpisodes(List<EpisodesBean> episodes) {
                this.episodes = episodes;
            }

            public List<EpisodesNewBean> getEpisodes_new() {
                return episodes_new;
            }

            public void setEpisodes_new(List<EpisodesNewBean> episodes_new) {
                this.episodes_new = episodes_new;
            }

            public static class WatchButtonBean {
                /**
                 * title : 立即观看
                 * link : https://www.bilibili.com/bangumi/play/ss6339
                 */

                private String title;
                private String link;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }
            }

            public static class FollowButtonBean {
                /**
                 * icon : http://i0.hdslb.com/bfs/bangumi/154b6898d2b2c20c21ccef9e41fcf809b518ebb4.png
                 * texts : {"0":"追番","1":"已追番"}
                 * status_report : bangumi
                 */

                private String icon;
                private TextsBean texts;
                private String status_report;

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public TextsBean getTexts() {
                    return texts;
                }

                public void setTexts(TextsBean texts) {
                    this.texts = texts;
                }

                public String getStatus_report() {
                    return status_report;
                }

                public void setStatus_report(String status_report) {
                    this.status_report = status_report;
                }

                public static class TextsBean {
                    /**
                     * 0 : 追番
                     * 1 : 已追番
                     */

                    @SerializedName("0")
                    private String _$0;
                    @SerializedName("1")
                    private String _$1;

                    public String get_$0() {
                        return _$0;
                    }

                    public void set_$0(String _$0) {
                        this._$0 = _$0;
                    }

                    public String get_$1() {
                        return _$1;
                    }

                    public void set_$1(String _$1) {
                        this._$1 = _$1;
                    }
                }
            }

            public static class EpisodesBean implements Parcelable {
                /**
                 * uri : https://www.bilibili.com/bangumi/play/ep113353
                 * param : 113353
                 * index : 1
                 */

                private String uri;
                private String param;
                private String index;

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

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.uri);
                    dest.writeString(this.param);
                    dest.writeString(this.index);
                }

                public EpisodesBean() {
                }

                protected EpisodesBean(Parcel in) {
                    this.uri = in.readString();
                    this.param = in.readString();
                    this.index = in.readString();
                }

                public static final Parcelable.Creator<EpisodesBean> CREATOR = new Parcelable.Creator<EpisodesBean>() {
                    @Override
                    public EpisodesBean createFromParcel(Parcel source) {
                        return new EpisodesBean(source);
                    }

                    @Override
                    public EpisodesBean[] newArray(int size) {
                        return new EpisodesBean[size];
                    }
                };
            }

            public static class EpisodesNewBean implements Parcelable {
                /**
                 * title : 1
                 * uri : https://www.bilibili.com/bangumi/play/ep113353
                 * param : 113353
                 * is_new : 0
                 */

                private String title;
                private String uri;
                private String param;
                private int is_new;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
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

                public int getIs_new() {
                    return is_new;
                }

                public void setIs_new(int is_new) {
                    this.is_new = is_new;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeString(this.title);
                    dest.writeString(this.uri);
                    dest.writeString(this.param);
                    dest.writeInt(this.is_new);
                }

                public EpisodesNewBean() {
                }

                protected EpisodesNewBean(Parcel in) {
                    this.title = in.readString();
                    this.uri = in.readString();
                    this.param = in.readString();
                    this.is_new = in.readInt();
                }

                public static final Parcelable.Creator<EpisodesNewBean> CREATOR = new Parcelable.Creator<EpisodesNewBean>() {
                    @Override
                    public EpisodesNewBean createFromParcel(Parcel source) {
                        return new EpisodesNewBean(source);
                    }

                    @Override
                    public EpisodesNewBean[] newArray(int size) {
                        return new EpisodesNewBean[size];
                    }
                };
            }
        }
    }
}
