某系统支持工作周报的快速克隆，极大提高了工作周报的编写效率，受到员工的一致好评。但有员工又发现一个问题，有些工作周报带有附件，例如经理助理“小龙女”的周报通常附有本周项目进展报告汇总表、本周客户反馈信息汇总表等，如果使用上述原型模式来复制周报，周报虽然可以复制，但是周报的附件并不能复制，这是由于什么原因导致的呢？如何才能实现周报和附件的同时复制呢？
在解决问题之前了解一下浅克隆与深克隆。

深克隆方法
一： 实现Cloneable接口 对象的引用类型的成员变量也需要实现克隆
二： serializable克隆 实现 Serializable 接口
