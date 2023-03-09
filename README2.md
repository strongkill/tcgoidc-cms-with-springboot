
<img src="https://images.gitee.com/uploads/images/2018/0822/004608_c55d62a4_123301.jpeg">
### 前言
- SpringBoot_v2項目是努力打造springboot框架的極致細膩的腳手架。包括一套漂亮的前臺。無其他雜七雜八的功能，原生純淨。
- 服務器演示：http://47.99.218.99:8080/springboot_v2/ 賬號:admin 密碼:admin

### 項目介紹
基於springboot的一款純淨腳手架。努力打造一款免費開源、註釋全、文檔全適合新手學習、方便快速二次開發的框架。


##### 1. 沒有基礎版、沒有vip版本、沒有付費羣、沒有收費二維碼
##### 2. 遵循開源真諦，一切免費纔是真開源
##### 3. 不求回報，你使用快樂就是這個項目最大的快樂！



### 組織架構

```
Springboot
├─doc  項目SQL語句以及文檔
│
├─common 公共模塊
│  ├─base Base繼承通用類
│  ├─conf springBoot所有配置
│  ├─domain 前臺返回包
│  ├─druid druid連接池
│  ├─exception 異常處理包
│  ├─file 文件上傳
│  ├─interceptor 攔截器
│  ├─log 日誌記錄AOP
│  ├─domain 前臺返回包
│  ├─quartz Spring定時器
│  └─support 工具包
│
├─controller 請求訪問模塊
│  ├─admin 模版後臺請求包
│  ├─websocket websoket消息請求
│  └─HomeController.java 首頁訪問類
│
├─Mapper Dao模塊
│  ├─auto mybatis-generator.xml自動生成Dao
│  └─custom 自定義Dao
│
├─Model 實體類模塊
│  ├─auto mybatis-generator.xml自動生成實體包
│  └─custom 自定義實體
│
├─Service 服務層模塊[沒寫抽象模塊，因爲我覺得沒什麼用，可能我能力不足]
│
├─shiro 權限模塊
│  ├─config shiro配置
│  ├─service shiro服務層
│  └─util shiro通用方法
│
├─util 工具模塊
│
├─SpringbootSwagger2Application 啓動類
│ 
├─SpringbootWebInitializer tomcat啓動類
│
├─test 測試類
│
├─resources 配置文件夾
│  ├─ehcache shiro權限緩存配置
│  ├─generator 自動生成模板以及配置目錄
│  │   ├─MyBatisGenerator mybates半自動生成工具
│  │   │   ├─1.bat 執行批處理
│  │   │   ├─generator.xml generator配置文件
│  │   │   ├─mybatis-generator-core-1.3.2.jar generator1.3.2版本
│  │   │   ├─mybatis-generator-core-1.3.7.jar generator1.3.7版本【默認】
│  │   │   └─mysqldriver.jar mysql驅動【該驅動爲8.0一下的版本不支持8.0自行替換】
│  │   │
│  │   ├─template 模板文件假
│  │   │   ├─controller anction模板
│  │   │   ├─html html頁面模板
│  │   │   ├─mapper dao模板
│  │   │   ├─mapperxml daoxml模板
│  │   │   ├─model 實體模板
│  │   │   ├─service service模板
│  │   │   └─sql sql模板
│  │   │
│  │   └─generator.properties 自動生成配置文件
│  │
│  ├─mybatis mybatis Mapper.xml生成文件夾
│  │   ├─auto自動生成的Mapper.xml文件夾
│  │   └─custom 手寫Mapper.xml文件夾
│  │
│  ├─static 靜態文件存放文件夾[後臺模版就放在此文件夾下面。所有的模版頁面都在下面]
│  │   ├─admin 後臺目錄存放
│  │   │  ├─assets js、css存放路徑
│  │   │  ├─assets js、css存放路徑
│  │   │  └─bootstarp 後臺模板存放路徑
│  │   ├─js js存放
│  │   └─login 登錄頁面js、css、image
│  │
│  ├─templates 前臺HTML存放文件夾
│  │   ├─admin 動態後臺html模板
│  │   ├─error 錯誤頁面html模板
│  │   └─login.html 登錄html頁面
│  │
│  ├─application-dev.yml 開發環境配置
│  ├─application-prod.yml 生產環境配置
│  ├─application.yml springboot配置
│  ├─banner1.txt springboot 啓動動畫
│  ├─logback.xml log4j配置文件
│  └─mybatis-generator.xml mybates自動生成 xml、dao、model
│  
└─pom.xml   maven.xml


```

### 技術選項

技術|名稱|官網|備註
---|---|---|---
springboot|springboot框架 ||
Apache Shiro|權限框架||
MyBatis Generator|代碼生成||
PageHelper|MyBatis物理分頁插件||
hikari|數據庫連接池||
Thymeleaf|模板引擎||
Log4J|日誌組件||
Swagger2|接口測試框架||
Maven|項目構建管理||
Websocket|websocket消息通知||
velocity|模板引擎||
kaptcha|google驗證碼||
devtools|熱部署||
GSON|谷歌json||
druid|阿里連接池||
quartz|定時框架||




### 前端技術
技術|名稱|官網|備註
---|---|---|---
jQuery|函式庫 ||
bootstrap|前端頁面框架||
Font-awesome|字體圖標||
jquery.validate|jquery驗證插件||
vue|漸進式框架||
ladda.min.js|按鈕加載js||
bootstrap-table|表格組件||
layer.js|彈窗組件||
jquery.blockUI.js|遮蔽層組件||
bootstrap-table-export.js|前臺導出組件||
bootstrap-treeview|樹結構組件||
bootstrap-colorpicker|顏色組件||
dropzone|文件上傳||
bootstrap-wysihtml5|富文本||
bootstrap-switch|開關按鈕||
UEditor|百度富文本||

### jar版本

| 名稱       | 版本          | 備註 |
|------------|---------------|------|
| springBoot | 2.0.0.RELEASE |      |
| mybatis-spring 1.3.2 | 1.3.2         |      |
| swagger2   | 2.7.0         |      |
| swagger-ui | 2.7.0         |      |
| gson       | 2.8.2         |      |
| pagehelper | 4.1.4         |      |
| mysql|5.1.40 OR   8.0.11      |      |
| shiro|1.4.0         |      |
| thymeleaf-extras-shiro|2.0.0         |      |
| thymeleaf|2.0.0.RELEASE         |      |
| commons-lang3|  3.7       |      |
| commons-lang|2.4         |      |
| commons-io|2.5         |      |
| commons-fileupload|1.3.3         |      |
| spring-boot-devtools|2.0.0.RELEASE         |      |
| hutool| 4.1.10        |      |
| druid| 1.1.10        |      |
| kaptcha| 2.3.2        |      |
| velocity| 1.7        |      |

### 開發環境
- JDK8.0
- mysql5.7以上
- eclipse

### 資源下載
- JDK8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Maven http://maven.apache.org/download.cgi


### 部署流程
1. 導入doc文件夾裏面的springbootv2.sql到數據庫
2. 確認自己的mysql版本 進行修改jar  在pom.xml 73-84行
3. 修改application-dev.yml 裏面自己數據庫版本對應的jdbc鏈接
4. 正常啓動run SpringbootSwagger2Application.java
- wiki地址:https://gitee.com/bdj/SpringBoot_v2/wikis

### 打包發佈編譯流程
- maven編譯安裝pom.xml文件即可打包成war

### 登陸地址
- 服務器:http://47.99.218.99:8080/springboot_v2/ 該數據庫只有查詢權限跟新增權限，所以修改以及刪除會報錯
- 本地 http://localhost:8080   默認帳號密碼: admin/admin
- swagger  http://localhost:8080/swagger-ui.html

### 啓動類
- SpringbootStart 啓動類


### 數據庫模型
![數據庫模型](https://images.gitee.com/uploads/images/2019/0701/001953_dd7a387e_123301.png "數據庫模型.png")

### 界面風格
|![登錄界面](https://images.gitee.com/uploads/images/2019/0617/214247_d40363b4_123301.png "登錄界面.png")     | ![權限界面](https://images.gitee.com/uploads/images/2019/0921/134912_1fcad28d_123301.png "權限列表.png")    |
| --- | --- |
|![權限添加](https://images.gitee.com/uploads/images/2019/0701/002939_3514f4b9_123301.png "權限添加.png")     |![修改角色](https://images.gitee.com/uploads/images/2019/0701/003259_7c28607d_123301.png "屏幕截圖.png")     |
|![表單構建](https://images.gitee.com/uploads/images/2019/0610/014618_33e1edf9_123301.png "表單構建.png")     |![代碼生成界面](https://images.gitee.com/uploads/images/2019/0921/135051_b8acc5f6_123301.png "代碼生成.png")     |
|![字典表界面](https://images.gitee.com/uploads/images/2019/0921/135710_a09e8233_123301.png "字典表.png")     |![定時器界面](https://images.gitee.com/uploads/images/2019/0921/135755_19c23d8f_123301.png "定時器.png")     |
![公告界面](https://images.gitee.com/uploads/images/2019/0921/135843_3bc64939_123301.png "公告界面.png")     | ![郵件發送功能](https://images.gitee.com/uploads/images/2019/0701/003722_d73d40a5_123301.png "郵件發送功能.png")    |
|![首頁](https://images.gitee.com/uploads/images/2019/0609/210649_a934ea28_123301.png "首頁.png")     |![swagger2](https://images.gitee.com/uploads/images/2019/0609/210335_d3efad8c_123301.png "swagger2.png")     |


### 後臺代碼註釋風格

|![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203106_52eca8e3_123301.jpeg "1.jpg")   | ![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203112_278db2f4_123301.jpeg "2.jpg")  |
|---|---|
|![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203118_39d8b7cd_123301.jpeg "3.jpg")   |  ![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203125_a362822a_123301.jpeg "4.jpg") |


### 前端代碼註釋風格
![HTML代碼頁面](https://images.gitee.com/uploads/images/2018/0822/004608_c55d62a4_123301.jpeg "HTML代碼頁面.jpg")
![js引入](https://images.gitee.com/uploads/images/2018/0909/203322_6dc467c2_123301.jpeg "js引入.jpg")

### 代碼自動生成功能
![代碼生成界面](https://images.gitee.com/uploads/images/2019/0921/135051_b8acc5f6_123301.png "代碼生成.png")
全局配置想生成到什麼地方就生成到什麼地方，自動執行權限sql
![輸入圖片說明](https://images.gitee.com/uploads/images/2019/0921/142230_8f3730cc_123301.png "屏幕截圖.png")

### 後期功能

功能|描述
---|---
 字典表|完成
 部署文檔|完成
 文件上傳|完成
 再次優化|完成
 add跟eidt頁面js寫出js文件|完成
 500頁面|完成
 404頁面|完成
 權限錯誤頁面|完成

### 情況說明
- 如果您喜歡Springboot_v2，可以clone下來使用，您的star將是本人前進的動力，如果您有技術疑問，可以加羣交流。
- 如果Springboot_v2對您有一點幫助，您可以點個star，就是對作者最大的支持了。
- Springboot_v2腳手架會一直更新下去。
- 需要進項目一起開發的請進羣私聊我，讓我們一起維護這個開發項目
- 很多人反應說404，那是因爲其他頁面根本沒做，因爲權限腳手架只在系統設置裏面。我留着其他鏈接，是方便你們根據需求自行添加頁面

### 開發者聯繫
- QQ：87766867
- QQ羣：881799237
  <a target="_blank" href="http://shang.qq.com/wpa/qunwpa?idkey=a8770621a7c51a904d667db47312b320d30e5c5581bb46103c2d5a8486cb8dce"><img border="0" src="https://images.gitee.com/uploads/images/2019/0530/203513_ac6773bf_123301.png" alt="SrpringBoot-v2" title="SrpringBoot-v2"></a>  進羣備註springbootv2

有任何問題可以提出


### 注意事項
- 所有的model字段解釋都在mysql的字段註釋裏面，請具體查看mysql的字段註解


### Github
- 所有的github代碼 以碼雲更新爲準
- https://github.com/fuce1314/Springboot_v2

### wiki
- https://gitee.com/bdj/SpringBoot_v2/wikis

### 項目視頻列表
- 自動生成代碼視頻：https://www.ixigua.com/i6770180517477220875/

### 更新日誌
- https://gitee.com/bdj/SpringBoot_v2/wikis/%E6%9B%B4%E6%96%B0%E6%97%A5%E5%BF%97?sort_id=1452970


### 參與開源作者

![榮譽殿堂](https://images.gitee.com/uploads/images/2019/0903/224111_37b4d05e_123301.png "榮譽殿堂.png")


| 名字        | 聯繫方式                | 貢獻功能           | 其他                                   |
| ----------- | ----------------------- | ------------------ | -------------------------------------- |
| 霜花似雪                    |QQ2510736432             | bug修改                                         |                                      |
| modelc      |QQ1219171582             | 框架結構整理                                |                                        |
| ok 克里斯汀          |                         | 增加 druid 連接池                  |                                        |
| JanHezz     |QQ975532442              | 引入了 quartz 框架              | 個人博客推薦：http://www.luckyhe.com        |
| 一休                           |QQ438081243              | 添加字典表模塊                            | 碼雲地址：https://gitee.com/notutu      |
| 願得一人心               |QQ1065001748             | 修改 try 流 bug       | 個人博客推薦：https://www.songyaxu.com      |
| Aini-H      |QQ1057718016             | 七牛雲上傳                                   |                                        |


### 借鑑項目列表
- https://gitee.com/renrenio/renren-generator 人人得代碼自動生成，改成自動錄入數據庫
- https://gitee.com/y_project/RuoYi-fast 借鑑ry.js


### AgileBPM GVP項目
專注於解決企業工作流實施難的問題
https://gitee.com/agile-bpm


### Java公衆號推薦:
![輸入圖片說明](https://images.gitee.com/uploads/images/2019/0515/105530_93e6ed60_123301.png "java葵花寶典.png")



### 精品開源項目推薦
- [https://gitee.com/Jmysy/Pear-Admin-Layui](https://gitee.com/Jmysy/Pear-Admin-Layui)
- [ApiBoot爲接口服務而生](https://gitee.com/minbox-projects/api-boot?_from=gitee_search)

### 使用v2做得系統

![自動化運維](https://images.gitee.com/uploads/images/2020/0311/171512_69596856_123301.png "屏幕截圖.png")

![輸網絡法庭](https://images.gitee.com/uploads/images/2020/0311/171614_f30e1ac2_123301.png "屏幕截圖.png")


