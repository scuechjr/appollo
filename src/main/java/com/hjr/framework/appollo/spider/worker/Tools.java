package com.hjr.framework.appollo.spider.worker;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.ArrayUtils;
import org.jooq.tools.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * TODO
 *
 * @author zhangdequan
 * @date 2019/2/21 9:50 AM
 */
public class Tools {
    // DQUOTE *(TEXTDATA / COMMA / CR / LF / 2DQUOTE) DQUOTE
    private static final String DQUOTE = "\"";
    private static final String D_DQUOTE = "\"\"";
    private static final String COMMA = ",";
    private static final String CR = "\r";
    private static final String LF = "\n";

    public static String JsonToCsv(JSONArray jsonArray, String... titleList) {
        return JsonToCsv(jsonArray, Arrays.asList(titleList));
    }

    public static String JsonToCsv(JSONArray jsonArray, List<String> titleList) {
        StringBuilder sb = new StringBuilder();

        // 标题
        titleList.forEach(title -> {
            sb.append(wrap(title));
            sb.append(",");
        });

        // 内容
        sb.setLength(sb.length() - 1);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            sb.append("\r\n");
            titleList.forEach(title -> {
                sb.append(wrap(json.getString(title)));
                sb.append(",");
            });
            sb.setLength(sb.length() - 1);
        }

        return sb.toString();
    }

    public static String wrap(String content) {
        if (StringUtils.isBlank(content)) {
            return "";
        }
        if (content.contains(DQUOTE)) {
            content = content.replaceAll(DQUOTE, D_DQUOTE);
        }

        if (content.contains(DQUOTE)
                || content.contains(COMMA)
                || content.contains(CR)
                || content.contains(LF)) {
            return DQUOTE + content + DQUOTE;
        }

        return content;
    }
}
