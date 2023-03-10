package com.project.myhometown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.myhometown.databinding.ActivityPlaceBinding

class PlaceActivity : AppCompatActivity() {
    private val places = ArrayList<Place>()
    private lateinit var apb: ActivityPlaceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        apb = ActivityPlaceBinding.inflate(layoutInflater)
        setContentView(apb.root)

        initPlace()

        val lm = LinearLayoutManager(this)
        val pa = PlaceAdapter(places)


        apb.apply {
            placeBack.setOnClickListener {
                val intent = Intent(this@PlaceActivity, MainActivity::class.java)
                startActivity(intent)
            }

            placeRecView.apply {
                layoutManager = lm
                adapter = pa
            }
        }

    }

    private fun initPlace() {
        places.apply {
            add(Place("开平碉楼文化旅游区", "开平市内，碉楼星罗棋布，城镇农村，举目皆是，多者一村十几座，" +
                    "少者一村二三座。从水口到百合，又从塘口到蚬冈、赤水，纵横数十公里连绵不断，" +
                    "蔚为大观。这一座座碉楼，是开平政治、经济和文化发展的见证，它不仅反映了侨乡人民艰苦奋斗、" +
                    "保家卫国的一段历史，同时也是活生生的近代建筑博物馆，一条别具特色的艺术长廊。可以说，开平作为华侨之乡、" +
                    "建筑之乡和艺术之乡，她的特色在碉楼上都得到了鲜明的体现。对碉楼资源进行保护和挖掘，对于研究华侨史和建筑艺术，" +
                    "对于开发旅游资源和开展集体主义、爱国主义、社会主义教育，都具有十分积极的意义。"))
            add(Place("圭峰山国家森林公园 ", "圭峰山国家森林公园是江门市新会区原劳动大学建立起来的，" +
                    "1997年经原林业部批准建立的国家级森林公园，是国家AAAA级旅游景区、广东省著名风景名胜区，经营面积3550公顷。" +
                    "圭峰山濒临南海，毗邻港澳，它坐拥青山翠岭，旅游资源丰厚奇趣，集自然景观、人文景观于一体，融高山湖泊森林于一身，" +
                    "旅游环境得天独厚。"))
            add(Place("泉林黄金小镇休闲旅游区", "恩平泉林黄金小镇休闲旅游区位于恩平市东成镇，紧邻恩平高铁站，" +
                    "不仅交通便捷，还是侨乡文化体验地，广东省户外体育运动特色小镇，拥有复星爱必侬、" +
                    "大河体育等知名品牌，集旅游业、体育产业、文化产业、旅居产业于一体，是休闲养生、" +
                    "户外运动、甜蜜度假、安养居家的理想之地。"))
            add(Place("川岛旅游度假区", "川岛旅游度假区,位于广东省台山市的南部川岛镇。其山咀港有广东西部沿海高速直达。" +
                    "距台城市区63公里。川岛旅游始于80年代初期，其中主要景点上川岛飞沙滩旅游区和下川岛王府洲旅游区分别创办于1984年和1988年，" +
                    "1992年7月17日广东省人民政府批准成立川岛旅游试验区，1994年被评为广东省首批省级旅游度假区。年接待旅游者60多万人次。"))
            add(Place("白水带风景名胜区", "白水带是江门市区的“肺部”。这里有40余座山峰，山峦岩谷之间有一溪流流经麻园乡，" +
                    "远远望去形似一条白色缎带，故称白水带。白水带有一溪、三泉、天山环抱，总面积有七百余亩。一溪即麻溪，三泉即红桃泉、" +
                    "龙口泉、涤净泉。五山即大华山、锄头山、松仔山、红桃山、葫芦山。山泉涌出的流水清凉洁净，" +
                    "带有甜味、乡人称为“仙水”。数百年来人们誉称该处为龙脉圣地，争相前来游览朝拜。"))
            add(Place("自力村", "自力村的特别之处在于它的田园风光，路边都是绿油油的稻田，风吹来稻香，" +
                    "村庄和农田和谐交融，绿色波涛中浮现出一两座或是一片灰色的碉楼或民居，是幅十分安静美好的画面。" +
                    "值得一提的是，有很多以民国时期为背景的电影在这里取景，《让子弹飞》便是其中之一，" +
                    "结合历史上开平的匪患，这部电影简直是为这个小城量身打造一般。"))
            add(Place("歇马举人村", "歇马，建村于元朝至正年间，已有670多年的历史。它位于中国温泉之乡恩平中部的锦江河畔，" +
                    "因为历史上出了众多的举人，成为闻名遐迩的“举人村”，是旅游教育之胜地，教育之胜地。"))
            add(Place("下川岛", "下川岛距台山市最近点4海里。岛上风光迷人，有沙质优良的天然海滩，" +
                    "有风光旖旎的小岛和海湾，有奇特山景石林，有引人入胜的名胜古迹，有茂密的原始次生森林和动植物奇观以及品种齐全的海鲜珍品，" +
                    "并具有有待建设的深水良港。下川岛于1992年定为广东省旅游开发综合试验区。王府洲旅游中心是省级旅游度假区，" +
                    "年接待国内、港澳台及国外游客10多万人次，旅游业发展方兴未艾，有“中国布吉岛”之美称。"))
            add(Place("宋元崖门海战文化旅游区", "新会宋元崖门海战文化旅游区是在700多年前宋元崖门海战遗址上兴建的我国首" +
                    "个古代海战文化主题景区。区内有历尽500多年历史沧桑、屡废屡兴的崖山祠。" +
                    "占地1100多亩，集浩气广场、崖山诗墙、慈元庙、大忠祠、义士祠、寝宫、诗碑廊、望崖楼、白鹇亭等10多个景点于一体，" +
                    "聚世界最大的传国玉玺主雕、全国最大的仿古战船标志性建筑、全国最大的一对姊妹锚、全国最大的“慈”字碑刻等众多亮点于一园的大型旅游区。"))
            add(Place("鳌峰公园", "鳌峰公园，是恩平市最大的综合性公园，也是恩平的龙头公园。" +
                    "自2013年鳌峰公园升级改造工程启动，恩平共投入近2000万元，对鳌峰公园正门出入口广场、百兽园、石雕园园路、" +
                    "公厕进行改造，新建东门出入口广场、潮人径、登山栈道、桃花园、樱花园、玉堂春林等一大批颇具特色的景点。"))
        }
    }
}