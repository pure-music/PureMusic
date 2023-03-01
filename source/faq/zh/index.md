## 最佳实践
### 文件排版设计
歌曲、歌词及歌手最佳实践.
#### 网盘歌曲（推荐）
暂时支持阿里云盘、WebDAV、OneDrive、Google Drive  
对于其他网盘可以参考 https://github.com/alist-org/alist （后续会出详细教程）

专辑名文件夹: 专辑名-歌手  
专辑封面图: 歌曲图片和专辑封面用同一张，放在专辑文件夹下命名为cover.png(jpg)  
歌手封面：新建artist文件夹，命名为歌手名.png(jpg)  
歌词: 存在在歌曲同一个目录，已经文件名保持一致，文件格式是lrc  

网盘歌曲播放时自动缓存，仅需下载一次。

![image](../file_folder_design.png)

### 本地手机歌曲
遵循google 官方规范，Android手机自动识别整理生成数据。


**所以文件改动后需要在app歌曲源内重新刷新同步数据**

