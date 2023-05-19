public class CarService {
    private CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public void updateCar(Car car) {
        carRepository.updateCar(car);
    }

    public void deleteCar(int carId) {
        carRepository.deleteCar(carId);
    }

    public Car getCarById(int carId) {
        return carRepository.getCarById(carId);
    }

    public List<Car> getCarsByClientId(int clientId) {
        return carRepository.getCarsByClientId(clientId);
    }

    // Дополнительные методы для фильтрации и поиска автомобилей
}
