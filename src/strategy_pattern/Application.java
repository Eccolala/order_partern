package strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 入口函数
 */
public class Application {

    public static void main(String args[]) throws IOException {
        //初始化上下文对象
        DiscountContext mContext = new DiscountContext();
        //存储输入的序号
        List<Integer> mList = new ArrayList<>();
        //保存总价待输出
        double sum = 0;
        System.out.println("1代表计算机类书籍,原价70,打7折;2代表英语类书籍原价35,打6折;3代表历史类书籍,原价40,不打折;4代表文学类书籍,原价50,减1元,输入0退出");
        while (true) {
            System.out.println("请依次输入购买书的序号：");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int numInput = Integer.parseInt(br.readLine());
            if (numInput == 0) {
                break;
            }
            mList.add(numInput);

        }
        //遍历列表计算出总价
        for (Integer item : mList) {
            if (item == 1) {
                //使用策略一
                double cs_book = 70;
                mContext.setStrategy(new StrategyThree());
                sum += mContext.getTotalPrice(cs_book);
            } else if (item == 2) {
                //使用策略二
                double english_book = 35;
                mContext.setStrategy(new StrategyFour());
                sum += mContext.getTotalPrice(english_book);
            } else if (item == 3) {
                //使用策略三
                double history_book = 40;
                mContext.setStrategy(new StrategyOne());
                sum += mContext.getTotalPrice(history_book);
            } else {
                //使用策略四
                double literature_book = 50;
                mContext.setStrategy(new StrategyTwo());
                sum += mContext.getTotalPrice(literature_book);
            }
        }
        System.out.print("图书总价是 ：" + sum + "元");

    }


}
