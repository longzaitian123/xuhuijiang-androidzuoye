package com.example.endzuoye.bean;

import com.example.endzuoye.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;

    public GoodsInfo(int pic_id, String title, String desc) {
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
    }

    private static int[] listImageArray = {R.drawable.public_01, R.drawable.public_02
            , R.drawable.public_03, R.drawable.public_04, R.drawable.public_05};
    private static String[] listTitleArray = {
            "小明", "水果超市", "某某服装", "参照消息", "挨踢杂志"};
    private static String[] listDescArray = {
            "你在干什么？",
            "今天水果大减价，快来品尝",
            "跳楼大甩卖，走过，路过，不要错过",
            "蒙内铁路建成通车，中国标准再下一城",
            "米6大战Mate10，千元智能机谁领风骚"};

    public static ArrayList<GoodsInfo> getDefaultList2() {
        ArrayList<GoodsInfo> listArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < listImageArray.length; i++) {
            listArray.add(new GoodsInfo(listImageArray[i], listTitleArray[i], listDescArray[i]));
        }
        return listArray;
    }

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList1() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }

    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};

    private static String[] gridTitleArray = {"日程表", "美食", "百货", "冷品",
            "首饰", "食杂店", "周边", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }

    private static int[] stagImageArray = {R.drawable.dian01, R.drawable.dian02, R.drawable.dian03
            , R.drawable.dian04, R.drawable.dian05, R.drawable.dian06, R.drawable.dian07
            , R.drawable.dian08, R.drawable.dian09, R.drawable.dian10};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价"};

    public static ArrayList<GoodsInfo> getDefaultStag() {
        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }

    private static int[] combineImageArray = {R.drawable.cainixihuan, R.drawable.dapaijiadao
            , R.drawable.trip_01, R.drawable.trip_02, R.drawable.trip_03, R.drawable.trip_04};
    private static String[] combineTitleArray = {
            "猜你喜欢", "大牌驾到", "买哪个", "别想了", "先下单", "包你满意"};

    public static ArrayList<GoodsInfo> getDefaultCombine() {
        ArrayList<GoodsInfo> combineArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < combineImageArray.length; i++) {
            combineArray.add(new GoodsInfo(combineImageArray[i], combineTitleArray[i], null));
        }
        return combineArray;
    }

    private static int[] appiImageArray = {R.drawable.dian01, R.drawable.dian02, R.drawable.dian03
            , R.drawable.dian04, R.drawable.dian05, R.drawable.dian06, R.drawable.dian07
            , R.drawable.dian08, R.drawable.dian09, R.drawable.dian10};
    private static String[] appiTitleArray = {"双十一", "大聚惠", "爆款价",
            "就一次", "手慢无", "快点击", "付定金", "享特权", "包安装", "再返券"};

    public static ArrayList<GoodsInfo> getDefaultAppi() {
        ArrayList<GoodsInfo> appiArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < appiImageArray.length; i++) {
            appiArray.add(new GoodsInfo(appiImageArray[i], appiTitleArray[i], null));
        }
        return appiArray;
    }

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "康夫", "飞利浦", "博朗", "放松一博", "云麦", "小适", "蓓慈", "飞科",
            "酷兮兮", "百草味", "黄山烧饼", "杉城", "麻油鸡", "铜锣烧", "螺蛳粉", "杉城pro",
            "马迭尔冰棍", "奶砖冰淇淋", "绿豆棒冰", "奶茶波波口味", "盐水棒", "碎碎冰", "森永三明治", "绿豆棒",
            "阿玛尼", "四叶草银项链", "满天星银手镯", "冠带", "黄金项链", "纯银项链", "森贝手链", "玫瑰花手链"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "康夫（CONFU）美发器KF-535A内扣大波浪直卷两用发夹梨花头卷发棒懒人神器女直发夹",
            "飞利浦(Philips)声波震动式电动牙刷HX6730 成人充电式牙刷31000转/分钟 敏感/清洁/亮白 三大模式",
            "博朗（BRAUN）电动剃须刀 3系 301s 进口三刀头 全身水洗 5分钟闪充 充电式 往复式 刮胡刀",
            "放松一博 SKG4098全新升奶砖冰淇淋级蓝牙款颈椎按摩器颈部按摩仪多功能脖子振动家用智能护颈仪",
            "云麦（YUNMAI）筋膜枪按摩抢小米有品同款按摩活络筋膜抢筋膜棒肌肉放松器材电动球便携",
            "小适（Showsee）小米有品同款 电动便携式鼻毛修剪器C1-BK 刀头水洗 全方位剃毛 无痛静音",
            "蓓慈（beici）按摩披肩BAP03A升级款 肩部腰部腿部颈部按摩 过热保护 敲击按摩捶打按摩香槟色按摩器",
            "飞科（FIYCO）电吹风FH6232 2000瓦功率快速干发六档调节可折叠家用电吹风",
            "酷兮兮 圣诞节礼物肉类休闲零食大礼包一整箱送女友女生儿童礼盒豆干美食品超市网红辣条好吃的礼物1500g",
            " 百草味 网红休闲零食特色小吃美食整箱蛋糕早餐手撕面包点心传统糕点 原味肉松饼1000g/箱",
            "黄山烧饼6袋90个 正宗五城芳嫂 安徽梅菜酥饼徽州特产糕点心小吃安徽零食网红美食 微辣45个+原味45个",
            "杉城 网红休闲零食大礼包一整箱送女友女生儿童礼盒美食品超市好吃的2000g",
            "买一送一 正宗德州麻油鸡500g 卤味鸡肉熟食烧鸡 山东特产 麻辣味扒鸡德州五香脱骨扒鸡下酒菜 麻油鸡",
            "葡记 铜锣烧蛋糕1000g 整箱礼盒装 日式风味特色美食 红豆味夹心面包糕点 网红办公室休闲零食饼干",
            "螺状元 螺蛳粉450g*4袋 整箱 方便面速食粉丝 网红美食原味",
            "杉城pro 圣诞节礼物肉类休闲零食大礼包一整箱送女友女生儿童礼盒美食品超市好吃的组合装1800g",
            "马迭尔冰棍 冰淇淋雪糕甜品 香草味85g*12支冰激凌冰棒",
            " 【满199减100】光明雪糕白雪中砖冷饮香草味冰激凌冰糕115g*24盒",
            "光明 精品重绿豆棒冰96g*10支 薄荷清凉口感冰棒雪糕冷饮 冰淇淋家庭装",
            "喜茶 奶茶波波口味 冰淇淋甜品冰激凌冰棒雪糕 95g*6支装",
            "光明冰淇淋雪糕 盐水棒冰 冰棍冷饮 冰激凌 冰激淋 冷饮 68g*36支",
            "马来西亚进口 可康cocon多口味棒棒冰碎碎冰吸吸冰冰棒 网红儿童零食40支 4袋组合装",
            "森永三明治夹心冰淇淋 日本进口香草三明治夹心饼干雪糕 纯味奶油美味清新日本零食冰棒 夹心冰淇淋10袋装",
            "光明冰淇淋 赤豆棒冰雪糕绿豆棒冰冷饮冰棍 冰激凌 92g*30 赤豆棒冰",
            "阿玛尼（Emporio Armani）明星同款女士项链925银项链女梯钻项链时尚平安扣项链圣诞礼物女友礼物 EG3457221",
            " 唯一（Winy）四叶草银项链女士时尚饰品锁骨链情侣吊坠999足银首饰学生项圈颈链送女友圣诞节礼物配证书",
            "唯一满天星银手镯女士款999足银镯子年轻款时尚情侣白银首饰品光面实心简约手环送女友圣诞节礼物30±1g配证书",
            "冠带一克拉莫桑钻四叶草项链女士莫桑石银吊坠时尚首饰品锁骨链情侣颈链求婚周年纪念日圣诞节送女友生日礼物 莫桑钻四叶草项链（证书+抽拉式玫瑰礼盒）",
            "18K黄金项链女士首饰品生日礼物女生情人节平安夜圣诞节礼物送女友女朋友老婆媳妇妈妈的礼品一鹿有你项链 一鹿有你钻石项链+玫瑰礼盒",
            "唯一（Winy）999纯银项链女镶施华洛世奇合成立方氧化锆女士吊坠锁骨链首饰时尚饰品送女友节生日礼物 精美玫瑰花礼盒包装",
            "森贝紫水晶手链圣诞节礼物送女友老婆女朋友生日礼物女生创意圣诞礼物平安夜礼品异地恋闺蜜浪漫表白情侣爱人 倾城之恋手链+小魔镜项链套餐",
            "生日礼物女生情人平安夜圣诞节礼物送女友女朋友老婆媳妇妈妈母亲结婚纪念日高档实用黄金玫瑰花手链首饰礼品 黄金玫瑰花+石榴石+4颗金珠"
    };


    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {
            56, 359, 269, 499, 1299, 31, 89, 49,
            79, 31, 19, 149, 39, 31, 69, 49,
            69, 21, 59, 49, 35, 21, 59, 69,
            1109, 1121, 359, 349, 1135, 121, 559, 1269
    };

    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8,
            R.drawable.p9, R.drawable.p10, R.drawable.p11,R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16 ,
            R.drawable.p17,R.drawable.p18, R.drawable.p19, R.drawable.p20 ,R.drawable.p21,R.drawable.p22,R.drawable.p23,R.drawable.p24,
            R.drawable.p25,R.drawable.p26, R.drawable.p27, R.drawable.p28 ,R.drawable.p29,R.drawable.p30,R.drawable.p31,R.drawable.p32
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7, R.drawable.p8,
            R.drawable.p9, R.drawable.p10, R.drawable.p11,R.drawable.p12, R.drawable.p13, R.drawable.p14, R.drawable.p15, R.drawable.p16 ,
            R.drawable.p17,R.drawable.p18, R.drawable.p19, R.drawable.p20 ,R.drawable.p21,R.drawable.p22,R.drawable.p23,R.drawable.p24,
            R.drawable.p25,R.drawable.p26, R.drawable.p27, R.drawable.p28 ,R.drawable.p29,R.drawable.p30,R.drawable.p31,R.drawable.p32
    };
}

