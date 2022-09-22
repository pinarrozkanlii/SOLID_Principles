/* Dependency Inversion'a high-level modüller low-level modüllere bağlı olmamalı, soyut
 * sınıflara bağlı olmalılardır.Örneğin aşağıda önceden bir monitor ve standart klavye ile
 * tanımlanmış bilgisayaramıza klavye arayüzü ekleyerek makineyi standart kalvyeden ayırdık
 * Bu arayüz sayesinde makine klavye türü kolaylıkla değiştirilebilir.
*/

public class interface Keyboard{}
public class Windows98Machine{
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard,Monitor monitor){
        this.keyboard = keyboard;
        this.monitor=monitor;
    }
}
public class StandarKeyboard implements Keyboard{}