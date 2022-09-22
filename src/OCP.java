/*OCP bir sınıfın uzantılara açık ama değişikliklere kapalı olması gerektiğini savunur.Örneğin
 * employee classımız var ve biz manager'a ve staff'a ödeme yapıyoruz. Manager'ın saatlik ödemesi
 * ve bonusu staff'tan farklı o zaman baz sınıfımızı extends keyword ile manager'a uygun şekilde uyarlıyoruz.
 */
import java.math.*;

/*abstract class Calculate_Salary{
    public abstract double calcSalary();
}*/
public class Employee{
    int EmplyeeId;
    String name;
    String position;
    int hours_of_working;
    int sales;

    public abstract double calcSalary(){
        
        return (hours_of_working*10)+((sales*20)/100); 
    }
}
public class Manager extends Employee{
    @Override
    public double calcSalary(){
        return (hours_of_working*20)+((sales*30)/100);
    }
}

 