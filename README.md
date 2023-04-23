# DBPlayerLaunch
普通App在Android TV中无法添加到桌面,只能在应用列表里打开,甚至有些要查看系统应用才能看到,帮此类App增加一个Launch做为跳板即可,本项目以当贝播放器为例

新建项目方法
- 创建TV App,加入ic_banner,取包名startActivity即可
- App瘦身,去掉主题,依赖等

更换App的步骤(图标及banner可以尝试从原包找)
- 改项目名
- 改包名
- 改banner
- 改ico