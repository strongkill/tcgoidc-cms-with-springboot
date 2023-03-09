### 公告


### 版本
20230308增加i18n多國語言支持


### 項目介紹
基於springboot的一款純淨腳手架。努力打造一款免費開源、註釋全、文檔全適合新手學習、方便快速二次開發的框架。
##### 1. 沒有基礎版、沒有vip版本、沒有付費羣、沒有收費二維碼
##### 2. 遵循開源真諦，一切免費纔是真開源
##### 3. 不求回報，你使用快樂就是這個項目最大的快樂！

### 分支介紹

### 開發環境
- JDK8.0
- mysql5.7以上
- eclipse



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


### 資源下載
- JDK8 http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
- Maven http://maven.apache.org/download.cgi
- minio http://www.minio.org.cn/ （文件存儲）


### 部署流程
1. 導入doc文件夾裏面的v2.sql到數據庫
2. 確認自己的mysql版本 進行修改jar  在pom.xml 73-84行
3. 修改application-dev.yml 裏面自己數據庫版本對應的jdbc鏈接
4. 正常啓動run SpringbootSwagger2Application.java

### 打包發佈編譯流程
- maven編譯安裝pom.xml文件即可打包成war

### 登陸地址


### 啓動類
- SpringbootStart 啓動類



### 新界面風格

### 數據庫模型


### 後臺代碼註釋風格


### 前端代碼註釋風格


### 情況說明

### 開發者聯繫
