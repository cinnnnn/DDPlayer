package top.bilibililike.ddplayer.entity;

import org.litepal.crud.LitePalSupport;

import java.util.List;

public class TokenBean extends LitePalSupport  {

    /**
     * ts : 1564312729
     * code : 0
     * data : {"status":0,"token_info":{"mid":5053396,"access_token":"b7b3ccf0846912a02eee573aa6fe0471","refresh_token":"6e2f13a3a443815f7f621222a2288971","expires_in":2592000},"cookie_info":{"cookies":[{"name":"bili_jct","value":"f9e3d85ae0a59e36769f617c1d1c67a3","http_only":0,"expires":1566904729},{"name":"DedeUserID","value":"5053396","http_only":0,"expires":1566904729},{"name":"DedeUserID__ckMd5","value":"9ad07b1fcba1de08","http_only":0,"expires":1566904729},{"name":"sid","value":"ism21y28","http_only":0,"expires":1566904729},{"name":"SESSDATA","value":"109645e5%2C1566904729%2C44bbfb71","http_only":1,"expires":1566904729}],"domains":[".bilibili.com",".biligame.com",".im9.com",".bigfunapp.cn"]},"sso":["https://passport.bilibili.com/api/v2/sso","https://passport.biligame.com/api/v2/sso","https://passport.im9.com/api/v2/sso","https://passport.bigfunapp.cn/api/v2/sso"]}
     */

    private int ts;
    private int code;
    private DataBean data;
    private String message;




    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }


    public static class DataBean extends LitePalSupport {
        /**
         * status : 0
         * token_info : {"mid":5053396,"access_token":"b7b3ccf0846912a02eee573aa6fe0471","refresh_token":"6e2f13a3a443815f7f621222a2288971","expires_in":2592000}
         * cookie_info : {"cookies":[{"name":"bili_jct","value":"f9e3d85ae0a59e36769f617c1d1c67a3","http_only":0,"expires":1566904729},{"name":"DedeUserID","value":"5053396","http_only":0,"expires":1566904729},{"name":"DedeUserID__ckMd5","value":"9ad07b1fcba1de08","http_only":0,"expires":1566904729},{"name":"sid","value":"ism21y28","http_only":0,"expires":1566904729},{"name":"SESSDATA","value":"109645e5%2C1566904729%2C44bbfb71","http_only":1,"expires":1566904729}],"domains":[".bilibili.com",".biligame.com",".im9.com",".bigfunapp.cn"]}
         * sso : ["https://passport.bilibili.com/api/v2/sso","https://passport.biligame.com/api/v2/sso","https://passport.im9.com/api/v2/sso","https://passport.bigfunapp.cn/api/v2/sso"]
         */

        private int status;
        private TokenInfoBean token_info;
        private CookieInfoBean cookie_info;
        private List<String> sso;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public TokenInfoBean getToken_info() {
            return token_info;
        }

        public void setToken_info(TokenInfoBean token_info) {
            this.token_info = token_info;
        }

        public CookieInfoBean getCookie_info() {
            return cookie_info;
        }

        public void setCookie_info(CookieInfoBean cookie_info) {
            this.cookie_info = cookie_info;
        }

        public List<String> getSso() {
            return sso;
        }

        public void setSso(List<String> sso) {
            this.sso = sso;
        }

        public static class TokenInfoBean extends LitePalSupport {
            /**
             * mid : 5053396
             * access_token : b7b3ccf0846912a02eee573aa6fe0471
             * refresh_token : 6e2f13a3a443815f7f621222a2288971
             * expires_in : 2592000
             */

            private int mid;
            private String access_token;
            private String refresh_token;
            private int expires_in;

            public int getMid() {
                return mid;
            }

            public void setMid(int mid) {
                this.mid = mid;
            }

            public String getAccess_token() {
                return access_token;
            }

            public void setAccess_token(String access_token) {
                this.access_token = access_token;
            }

            public String getRefresh_token() {
                return refresh_token;
            }

            public void setRefresh_token(String refresh_token) {
                this.refresh_token = refresh_token;
            }

            public int getExpires_in() {
                return expires_in;
            }

            public void setExpires_in(int expires_in) {
                this.expires_in = expires_in;
            }
        }

        public static class CookieInfoBean extends LitePalSupport {
            private List<CookiesBean> cookies;
            private List<String> domains;

            public List<CookiesBean> getCookies() {
                return cookies;
            }

            public void setCookies(List<CookiesBean> cookies) {
                this.cookies = cookies;
            }

            public List<String> getDomains() {
                return domains;
            }

            public void setDomains(List<String> domains) {
                this.domains = domains;
            }

            public static class CookiesBean {
                /**
                 * name : bili_jct
                 * value : f9e3d85ae0a59e36769f617c1d1c67a3
                 * http_only : 0
                 * expires : 1566904729
                 */

                private String name;
                private String value;
                private int http_only;
                private int expires;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public int getHttp_only() {
                    return http_only;
                }

                public void setHttp_only(int http_only) {
                    this.http_only = http_only;
                }

                public int getExpires() {
                    return expires;
                }

                public void setExpires(int expires) {
                    this.expires = expires;
                }
            }
        }
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
