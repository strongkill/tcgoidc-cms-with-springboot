### 公告

由於以前的v2有白屏bug（偶爾需要點擊2次才能展示內容，無法debug），個人無法解決，v2以前全新換皮膚。如果你要研究可以查看分支：【20210101v2】
sa-token爲最新皮膚


### 前言
- SpringBoot_v2項目是努力打造springboot框架的極致細膩的腳手架。包括一套漂亮的前臺。無其他雜七雜八的功能，原生純淨。
- 服務器演示：http://124.70.187.180:8080/springboot_v2/ 賬號:admin 密碼:admin
  老版本v2分支爲[20210101v2](https://gitee.com/bdj/SpringBoot_v2/tree/20210101v2/)
  目前mater爲新皮膚

### 項目介紹
基於springboot的一款純淨腳手架。努力打造一款免費開源、註釋全、文檔全適合新手學習、方便快速二次開發的框架。
##### 1. 沒有基礎版、沒有vip版本、沒有付費羣、沒有收費二維碼
##### 2. 遵循開源真諦，一切免費纔是真開源
##### 3. 不求回報，你使用快樂就是這個項目最大的快樂！

### 分支介紹

| 版本名稱 | 說明 | 地址 |
| :---: | :---: | :---: |
| master | 主分支 | https://gitee.com/bdj/SpringBoot_v2 |
| mybatis-plus | 持久層框架升級爲mybatis-plus | https://gitee.com/bdj/SpringBoot_v2/tree/mybatis-plus/ |
| 20210101v2 | 老版本v2 | https://gitee.com/bdj/SpringBoot_v2/tree/20210101v2/ |


### 開發環境
- JDK8.0
- mysql5.7以上
- eclipse

### 資源下載
- JDK8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Maven http://maven.apache.org/download.cgi
- minio http://www.minio.org.cn/ （文件存儲）


### 部署流程
1. 導入doc文件夾裏面的springbootv2.sql到數據庫
2. 確認自己的mysql版本 進行修改jar  在pom.xml 73-84行
3. 修改application-dev.yml 裏面自己數據庫版本對應的jdbc鏈接
4. 正常啓動run SpringbootSwagger2Application.java
- wiki地址:https://gitee.com/bdj/SpringBoot_v2/wikis

### 打包發佈編譯流程
- maven編譯安裝pom.xml文件即可打包成war

### 登陸地址
- 服務器:http://124.70.187.180:8080/springboot_v2/ 該數據庫只有查詢權限跟新增權限，所以修改以及刪除會報錯
- 本地 http://localhost:8080   默認帳號密碼: admin/admin
- swagger  http://localhost:8080/swagger-ui.html

### 啓動類
- SpringbootStart 啓動類



### 新界面風格
|![輸入圖片說明](https://images.gitee.com/uploads/images/2021/0101/134930_749be44d_123301.png "屏幕截圖.png")  | ![輸入圖片說明](https://images.gitee.com/uploads/images/2021/0101/135013_703123c3_123301.png "屏幕截圖.png")    |
| --- | --- |
|![輸入圖片說明](https://images.gitee.com/uploads/images/2021/0101/135035_24fdcafb_123301.png "屏幕截圖.png")    | ![輸入圖片說明](https://images.gitee.com/uploads/images/2021/0101/135102_7ba9097f_123301.png "屏幕截圖.png")     |

### 數據庫模型
![數據庫模型](https://images.gitee.com/uploads/images/2019/0701/001953_dd7a387e_123301.png "數據庫模型.png")


### 後臺代碼註釋風格

|![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203106_52eca8e3_123301.jpeg "1.jpg")   | ![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203112_278db2f4_123301.jpeg "2.jpg")  |
|---|---|
|![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203118_39d8b7cd_123301.jpeg "3.jpg")   |  ![後臺代碼](https://images.gitee.com/uploads/images/2018/0909/203125_a362822a_123301.jpeg "4.jpg") |


### 前端代碼註釋風格
![HTML代碼頁面](https://images.gitee.com/uploads/images/2018/0822/004608_c55d62a4_123301.jpeg "HTML代碼頁面.jpg")
![js引入](https://images.gitee.com/uploads/images/2018/0909/203322_6dc467c2_123301.jpeg "js引入.jpg")


### 情況說明
- 如果您喜歡Springboot_v2，可以clone下來使用，您的star將是本人前進的動力，如果您有技術疑問，可以加羣交流。
- 如果Springboot_v2對您有一點幫助，您可以點個star，就是對作者最大的支持了。
- Springboot_v2腳手架會一直更新下去。
- 需要進項目一起開發的請進羣私聊我，讓我們一起維護這個開發項目
- 很多人反應說404，那是因爲其他頁面根本沒做，因爲權限腳手架只在系統設置裏面。我留着其他鏈接，是方便你們根據需求自行添加頁面

### 開發者聯繫
- QQ：87766867
- QQ羣：1057709523
  <a target="_blank" href="https://jq.qq.com/?_wv=1027&k=EJrZ3wXI"><img border="0" src="https://images.gitee.com/uploads/images/2019/0530/203513_ac6773bf_123301.png" alt="SrpringBoot-v2" title="SrpringBoot-v2"></a>  進羣備註springbootv2

有任何問題可以提出


### 注意事項
- 所有的model字段解釋都在mysql的字段註釋裏面，請具體查看mysql的字段註解


### Github
- 所有的github代碼 以碼雲更新爲準
- https://github.com/fuce1314/Springboot_v2

### wiki
- https://gitee.com/bdj/SpringBoot_v2/wikis

### 項目視頻列表
- 自動生成代碼視頻：qq羣文件裏面

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




### 精品項目推薦

|項目名稱 | 項目地址 | 項目介紹 |
|---|---|---|
| Jpom GVP項目      | [https://gitee.com/dromara/Jpom](https://gitee.com/dromara/Jpom) | 一款簡而輕的低侵入式在線構建、自動部署、日常運維、項目監控軟件|
| AgileBPM GVP項目  | [https://gitee.com/agile-bpm](https://gitee.com/agile-bpm)  | 專注於解決企業工作流實施難的問題  |
| AlibabaCloud     | [https://gitee.com/matevip/matecloud](https://gitee.com/matevip/matecloud)  | MateCloud是一款基於Spring Cloud Alibaba的微服務架構 |
| ApiBoot | [https://gitee.com/minbox-projects/api-boot](https://gitee.com/minbox-projects/api-boot)    | 爲接口服務而生  |
| v2皮膚           | [https://gitee.com/Jmysy/Pear-Admin-Layui](https://gitee.com/pear-admin/Pear-Admin-Layui)                   |


### Java公衆號推薦:
![輸入圖片說明](https://images.gitee.com/uploads/images/2019/0515/105530_93e6ed60_123301.png "java葵花寶典.png")


### 使用v2做得系統

- SpringBoot_v2 極簡代碼生成器
  https://gitee.com/dubai03/Codegenerator_v2

###牛油果
[![Giteye chart](https://chart.giteye.net/gitee/bdj/SpringBoot_v2/Q9GZ48L3.png)](https://giteye.net/chart/Q9GZ48L3)
