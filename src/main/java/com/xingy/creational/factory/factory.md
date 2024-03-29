
参考：https://segmentfault.com/a/1190000015050674
菜鸟教程 https://www.runoob.com/design-pattern/

**简单工厂**

2.1 介绍
严格的说，简单工厂模式并不是23种常用的设计模式之一，它只算工厂模式的一个特殊实现。简单工厂模式在实际中的应用相对于其他2个工厂模式用的还是相对少得多，因为它只适应很多简单的情况。

最重要的是它违背了我们在概述中说的 开放-封闭原则 （虽然可以通过反射的机制来避免，后面我们会介绍到） 。因为每次你要新添加一个功能，都需要在生switch-case 语句（或者if-else 语句）中去修改代码，添加分支条件。

2.2 适用场景
（1）需要创建的对象较少。

（2）客户端不关心对象的创建过程。

2.3 简单工厂模式角色分配：
工厂(Factory)角色 :简单工厂模式的核心，它负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，创建所需的产品对象。
抽象产品(Product)角色 :简单工厂模式所创建的所有对象的父类，它负责描述所有实例所共有的公共接口。
具体产品(Concrete Product)角色:简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。

**工厂方法**

3.1 介绍
工厂方法模式应该是在工厂模式家族中是用的最多模式，一般项目中存在最多的就是这个模式。

工厂方法模式是简单工厂的仅一步深化， 在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，而是针对不同的对象提供不同的工厂。也就是说 每个对象都有一个与之对应的工厂 。

3.2 适用场景
一个类不知道它所需要的对象的类：在工厂方法模式中，客户端不需要知道具体产品类的类名，只需要知道所对应的工厂即可，具体的产品对象由具体工厂类创建；客户端需要知道创建具体产品的工厂类。
一个类通过其子类来指定创建哪个对象：在工厂方法模式中，对于抽象工厂类只需要提供一个创建产品的接口，而由其子类来确定具体要创建的对象，利用面向对象的多态性和里氏
将创建对象的任务委托给多个工厂子类中的某一个，客户端在使用时可以无需关心是哪一个工厂子类创建产品子类，需要时再动态指定，可将具体工厂类的类名存储在配置文件或数据库中。
3.3 工厂方法模式角色分配：
抽象工厂(Abstract Factory)角色：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
具体工厂(Concrete Factory)角色 ：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建某一种产品对象。
抽象产品(AbstractProduct)角色 ：工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
具体产品(Concrete Product)角色 ：这个角色实现了抽象产品角色所定义的接口。某具体产品有专门的具体工厂创建，它们之间往往一一对应


**抽象工厂方法**

4.1 介绍
在工厂方法模式中，其实我们有一个潜在意识的意识。那就是我们生产的都是同一类产品。抽象工厂模式是工厂方法的仅一步深化，在这个模式中的工厂类不单单可以创建一种产品，而是可以创建一组产品。

抽象工厂应该是比较最难理解的一个工厂模式了。

4.2 适用场景
和工厂方法一样客户端不需要知道它所创建的对象的类。
需要一组对象共同完成某种功能时，并且可能存在多组对象完成不同功能的情况。（同属于同一个产品族的产品）
系统结构稳定，不会频繁的增加对象。（因为一旦增加就需要修改原有代码，不符合开闭原则）
4.3 抽象工厂方法模式角色分配：
抽象工厂（AbstractFactory）角色 ：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
具体工厂类（ConreteFactory）角色 ：这是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且受到应用程序调用以创建某一种产品对象。
抽象产品（Abstract Product）角色 ：工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
具体产品（Concrete Product）角色 ：抽象工厂模式所创建的任何产品对象都是某一个具体产品类的实例。在抽象工厂中创建的产品属于同一产品族，这不同于工厂模式中的工厂只创建单一产品。
。


4.4 抽象工厂的工厂和工厂方法中的工厂有什么区别呢？
抽象工厂是生产一整套有产品的（至少要生产两个产品)，
这些产品必须相互是有关系或有依赖的，
而工厂方法中的工厂是生产单一产品的工厂。

小结

★工厂模式中，重要的是工厂类，而不是产品类。产品类可以是多种形式，多层继承或者是单个类都是可以的。但要明确的，工厂模式的接口只会返回一种类型的实例，这是在设计产品类的时候需要注意的，最好是有父类或者共同实现的接口。

★使用工厂模式，返回的实例一定是工厂创建的，而不是从其他对象中获取的。

★工厂模式返回的实例可以不是新创建的，返回由工厂创建好的实例也是可以的。

 

区别

简单工厂 ： 用来生产同一等级结构中的任意产品。（对于增加新的产品，无能为力）

工厂方法 ：用来生产同一等级结构中的固定产品。（支持增加任意产品）   
抽象工厂 ：用来生产不同产品族的全部产品。（对于增加新的产品，无能为力；支持增加产品族）  
