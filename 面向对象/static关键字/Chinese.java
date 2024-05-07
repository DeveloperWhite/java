package static关键字;
//static关键字
/*
所有的中国人类中的国籍都是中国，这里声明实例变量显然是不合适的，太浪费内存空间，没必要让每一个对象都保留一份"国籍"内存
所有对象国籍一样，这种特征属于类级别的特征，可以提升为整个模版的特征，可以在变量前增加static关键字修饰
加上static修饰的变量被称为静态变量，静态变量在类加载的时候初始化，不需要创建对象，内存就开辟了
静态变量存储在方法区内存当中
所有对象都有这个属性，但是这个属性的值会随着对象的变化而变化，变量声明为实例变量
所有对象都有这个属性，但是所有对象的这个属性的值都一样，变量声明为静态变量，节省内存开销
静态变量在类加载的时候初始化，不需要创建对象，访问的时候直接类名.静态变量名的方式访问
static修饰的所有元素都是类级别的特征，和具体对象无关，也可以使用引用.访问，但与对象无关
 */
//中国人类
public class Chinese {
  //身份证号（每个对象身份证号不同）
   String id;
  //姓名（每个对象姓名不同）
   String name;
  //国籍（由于是中国人类，所以国籍相同）
  //静态变量
   static String country="中国";
//无参构造
  public Chinese() {
  }
//有参构造
  public Chinese(String id, String name) {
    this.id = id;
    this.name = name;
  }
}
