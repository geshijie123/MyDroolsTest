package cn.cango.util;

import cn.hutool.http.HttpUtil;

public class HtmlTool {
    public String getStr(){
        return HttpUtil.get("https://cdn.bootcdn.net/ajax/libs/vue/3.0.11/vue.cjs.min.js");
    }
}
