/* LSP bir üst sınıfın ve alt türlerinin davranışına odaklanarak Open-Closed Principle'ı genişletir.LSP'ye göre A sınıfı, B sınıfının bir alt türüyse, programımızın davranışını bozmadan B'yi A ile değiştirebilmeliyiz.
 * Örneğin, matematikte Kare, Dikdörtgendir.Bununla birlikte, kodda Kare'yi Dikdörtgen'den türetmişseniz, Dikdörtgen beklediğiniz 
 * her yerde Kare kullanılabilir olmalıdır. Bu, bazı garip davranışlara neden olur.

Rectangle temel sınıfımızda SetWidth ve SetHeight yöntemlerimiz olduğunu düşünelim. 
Ancak Dikdörtgen referansımız bir Kareye işaret ediyorsa, SetWidth ve SetHeight bir anlam ifade etmez çünkü birini ayarlamak diğerini buna 
uyacak şekilde değiştirir. Bu durumda Kare, Dikdörtgen ile Liskov Substitution Testinde başarısız olur ve Kare'nin Dikdörtgenden miras 
alması soyutlaması kötüdür. Bu durumu aşağıdaki gibi Square sınıfında super keyword ile setHeight'ı alıp tanımlarsak LSP'ye uygun hale getiririz.
 */

public interface Rectangle{
    private double height;
    private double width;
    
    public void setHeight(double height);
    public void setWidth(double width);
    
    public double area(){
        return height*width;
    }
    
}

public class Square implements Rectangle{
    public void setHeight(double height){
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(double width){
        setHeight(width);
    }
}