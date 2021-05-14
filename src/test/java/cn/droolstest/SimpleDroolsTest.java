package cn.droolstest;

import cn.cango.bean.CanGoCardBean;
import cn.cango.util.HtmlTool;
import org.drools.core.base.RuleNameEqualsAgendaFilter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigInteger;

public class SimpleDroolsTest {


    private KieSession kieSession;
    
    @Before
    public void before(){
        //用工厂构建一个kie服务
        KieServices kieServices = KieServices.Factory.get();
        //获取kie的drools的容器单利
        KieContainer kieClasspathContainer = kieServices.getKieClasspathContainer();
        //使用容器单例 新生成一个kie session
         kieSession = kieClasspathContainer.newKieSession();
    }
    @After
    public void after(){
        //用完销毁session
        kieSession.destroy();
    }

    @Test
    public void test(){
        CanGoCardBean canGoCardBean=new CanGoCardBean();
        canGoCardBean.setCardName("金卡");
        canGoCardBean.setCard(new BigInteger("1300000000000"));
        kieSession.insert(canGoCardBean);
        kieSession.setGlobal("htmlTool",new HtmlTool());
        kieSession.fireAllRules();
        System.out.println("结果："+canGoCardBean.getCardName());
    }

}
