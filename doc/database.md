# 数据库文档

**basic_earthquake  基本地震信息表**

索引类型：唯一索引   

索引字段：`date`, `longitude`,`latitude`

| 字段           | 类型     | 注释     |
| -------------- | -------- | -------- |
| info_id        | Int      | 主键     |
| province       | varchar  | 省       |
| city           | varchar  | 市       |
| country        | varchar  | 区县     |
| town           | varchar  | 镇       |
| village        | varchar  | 村       |
| category       | varchar  | 分类     |
| date           | datetime | 时间     |
| location       | varchar  | 位置     |
| longitude      | float    | 经度     |
| latitude       | float    | 纬度     |
| depth          | int      | 震源深度 |
| magnitude      | float    | 震级     |
| reporting_unit | varchar  | 上报单位 |
| picture        | varchar  | 图片信息 |



**forecast 预测表**

索引类型：唯一索引   

索引字段：`date`, `grade`, `intensity`, `type`

| 字段      | 类型     | 注释     |
| --------- | -------- | -------- |
| info_id   | Int      | 主键     |
| date      | datetime | 时间     |
| grade     | smallint | 等级     |
| intensity | smallint | 剧烈程度 |
| type      | smallint | 类型     |
| picture   | varchar  | 图片信息 |



**house_destory 房屋受损信息表**

索引类型：唯一索引   

索引字段：`village`, `date`, `basically_intact_square`, `damaged_square`, `destroyed_square`

| 字段                    | 类型     | 注释     |
| ----------------------- | -------- | -------- |
| info_id                 | Int      | 主键     |
| province                | varchar  | 省       |
| city                    | varchar  | 市       |
| country                 | varchar  | 区县     |
| town                    | varchar  | 镇       |
| village                 | varchar  | 村       |
| category                | varchar  | 分类     |
| date                    | datetime | 时间     |
| location                | varchar  | 位置     |
| basically_intact_square | float    | 影响范围 |
| damaged_square          | float    | 受损范围 |
| destroyed_square        | float    | 破坏范围 |
| note                    | varchar  | 程度     |
| reporting_unit          | varchar  | 上报单位 |
| earthquake_id           | varchar  | 地震id   |



**life_line 生命线灾情表**

索引类型：唯一索引   

索引字段：`village`, `date`, `type`, `note`

| 字段           | 类型     | 注释     |
| -------------- | -------- | -------- |
| info_id        | Int      | 主键     |
| province       | varchar  | 省       |
| city           | varchar  | 市       |
| country        | varchar  | 区县     |
| town           | varchar  | 镇       |
| village        | varchar  | 村       |
| category       | varchar  | 分类     |
| date           | datetime | 时间     |
| location       | varchar  | 位置     |
| type           | smallint | 类型     |
| grade          | smallint | 等级     |
| picture        | varchar  | 图片信息 |
| note           | varchar  | 程度     |
| reporting_unit | varchar  | 上报单位 |
| earthquake_id  | varchar  | 地震id   |



**peo_loss 人员伤亡表**

索引类型：唯一索引   

索引字段：`village`, `date`, `number`

| 字段           | 类型     | 注释     |
| -------------- | -------- | -------- |
| info_id        | Int      | 主键     |
| province       | varchar  | 省       |
| city           | varchar  | 市       |
| country        | varchar  | 区县     |
| town           | varchar  | 镇       |
| village        | varchar  | 村       |
| category       | varchar  | 分类     |
| date           | datetime | 时间     |
| location       | varchar  | 位置     |
| number         | int      | 人数     |
| reporting_unit | varchar  | 上报单位 |
| earthquake_id  | varchar  | 地震id   |



**sec_disaster 次生灾害表**

索引类型：唯一索引   

索引字段：`village`, `date`, `type`, `note`

| 字段           | 类型     | 注释     |
| -------------- | -------- | -------- |
| info_id        | Int      | 主键     |
| province       | varchar  | 省       |
| city           | varchar  | 市       |
| country        | varchar  | 区县     |
| town           | varchar  | 镇       |
| village        | varchar  | 村       |
| category       | varchar  | 分类     |
| date           | datetime | 时间     |
| location       | varchar  | 位置     |
| status         | smallint | 状态     |
| type           | smallint | 等级     |
| picture        | varchar  | 图片信息 |
| note           | varchar  | 程度     |
| reporting_unit | varchar  | 上报单位 |
| earthquake_id  | varchar  | 地震id   |

