package cn.cango.bean;


import cn.cango.util.HtmlTool;
import cn.hutool.json.JSONObject;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

@Data
public class CanGoCardBean {

    private BigInteger card;

    private Integer type;

    private Integer cardSize;

    private String cardName;

    private BigDecimal point;

    private BigDecimal price;

    private BigDecimal payPoint;

    private BigDecimal payPrice;

    private BigDecimal residuePrice;

}
