# 简单理解23种设计模式

关于设计模式中涉及的原则与模式，项目使用java编码实现设计模式。

## 设计模式

- [策略模式](Strategy)

- [装饰器模式](Decorator)

- [代理模式](Proxy)


## 原则
### 单一职责原则  

 **单一职责原则(SRP)**，就一个类而言，应该**仅有一个**引起它变化的原因。
 
如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。这种耦合会导致脆弱的设计，当发生变化时，设计会遭受意想不到的破坏（ASD）。

### 开放-封闭原则

**开放-封闭原则**，是说软件实体（类、模块、函数等等）应该可以扩展，但是不可修改（ASD）。

这个原则有两个特征：对扩展是开放的（Open for extension）；对更改是封闭的（Closed for modification）。

### 依赖倒转原则

