 Github高级

# 常用词含义

## watch：会持续收到该项目的动态

## fork：复制某个项目到自己的Github仓库中

## star：可以理解为点赞

## clone：将项目下载至本地

## follow：关注你感兴趣的作者，会收到他们的动态

# IN限制搜索范围

## xxx关键词 in:name或description或readme

### xxx in:name 项目包含xxx的

### xxx in:description 项目描述包含xxx的

### xxx in:readme 项目的readme文件中包含xxx的

## 组合使用

### 搜索项目名或者readme中包含秒杀的项目

### seckill in:name,readme

# stars或fork数量关键词去查找

## 公式

### xxx关键词 stars 通配符

#### :> 或者:>=

### 区间范围数字

#### 数字1..数字2

### 查找stars数大于5000的springboot项目

#### springboot stars:>=5000

### 查找fork数大于500的springboot的项目

#### springboot:>500

### 查找fork在100到200之间并且stars数在80到100之间的springboot项目

#### springboot forks :100..200 stars:80..100

# awesome加强搜索

## 公式

### awesome 关键字

#### awesome系列一般是用来收集学习、工具、书籍类相关的项目

## 搜索优秀的redis相关的项目，包括框架、教程等

# 高亮显示GitHub上的代码

## 1行：地址后面紧跟#L数字

### 例子：https://github.com/ijolidino/leetCodeTest/blob/master/leetcodeTest/BublleSort.java#L6

## 地址后面紧跟#数字-L数字

### 例子：https://github.com/ijolidino/leetCodeTest/blob/master/leetcodeTest/BublleSort.java#L6-#L18

# 项目内搜索

## 英文字母t

## https://docs.github.com/en/free-pro-team@latest/github/getting-started-with-github/keyboard-shortcuts?algolia-query=short#about-keyboard-shortcuts

# 搜索某个地区内的大佬

## 北京地区的java开发大神

### location:beijing language:java
