package com.example.springboot.demo.echarts;

import com.github.abel533.echarts.code.Tool;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.TreeData;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Treemap;

public class TreemapExample {
	public static GsonOption getChart1() {
		//地址:http://echarts.baidu.com/doc/example/treemap.html
        GsonOption option = new GsonOption();
        option.title().text("手机占有率").subtext("虚构数据");
        option.tooltip().trigger(Trigger.item).formatter("{b}: {c}");
        option.toolbox().show(true).feature(
                Tool.mark,
                Tool.dataView,
                Tool.restore,
                Tool.saveAsImage);
        option.calculable(false);

        Treemap treemap = new Treemap("矩形图");
        treemap.itemStyle().normal().label().show(true).formatter("{b}");
        treemap.itemStyle().normal().borderWidth(1);

        treemap.itemStyle().emphasis().label().show(true);
        treemap.data(new TreeData("三星", 6),
                new TreeData("小米", 4),
                new TreeData("苹果", 4),
                new TreeData("华为", 2),
                new TreeData("联想", 2),
                new TreeData("魅族", 1),
                new TreeData("中兴", 1)
        );

        option.series(treemap);
        return option;
	}
}
