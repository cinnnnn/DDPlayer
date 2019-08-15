package top.bilibililike.ddplayer.utils;

public class Util {
    public static String bigoWebToJson(String http) {
        StringBuilder httpContent = new StringBuilder(http);
        try {
            int startPosition = httpContent.indexOf("= {");
            httpContent = new StringBuilder(httpContent.substring(startPosition));
            httpContent = new StringBuilder(httpContent.toString().split("[}\n]" +
                    "[</script>]")[0].substring(4));
            String[] singleItem = httpContent.toString().split(",");
            for (int i = 0; i < singleItem.length; i++) {
                if (i != singleItem.length - 1) {
                    singleItem[i] = singleItem[i] + ",";
                }
                singleItem[i] = singleItem[i].replaceAll(": ", "\":")
                        .replaceAll(" ", "")
                        .replaceAll("\n", "\n\t\"");
            }
            StringBuilder builder = new StringBuilder();
            builder.append("{\n\t\"");
            singleItem[singleItem.length - 1] = singleItem[singleItem.length - 1].substring(0, singleItem[singleItem.length - 1].length() - 3);
            for (int i = 0; i < singleItem.length; i++) {
                builder.append(singleItem[i]);
            }
            builder.append("}");
            return builder.toString();
        } catch (Exception e) {

        }

        return http;
    }
}
