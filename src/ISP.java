
/*ISP'ye göre büyük arayüzler küçük kod parçalarına bölünmelidirler.Böylece istemci kullanmadığı
 * arayüz üyelerine bağlı kalmayacaktır.Örneğimizde bir Parking Lot uygulaması vardır.
 * FreeParking arayüzü sayesinde free olan kısımda, bu arayüze alakasız olan ödeme
 * methoduna bağlı olmayacaktır.
 */
public interface ParkingLot{
    void parkCar();
    void unparkCar();
    void getCapacity();
    double calculateFree(Car car);
    void doPayment(Car car);
}

class Car {
 
}
public class FreeParking implements ParkingLot{
    @Override
    public void parkCar{

    }
    @Override
    public void unparkCar(){

    }
    @Override
    public void getCapacity(){

    }
    @Override
    public double calculateFree(Car car){
        return 0;
    }
    @Override
    public void doPayment(Car car){
        throw new Exception("Parking lot is free");
    }
    
}