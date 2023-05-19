public class ServiceRecordService {
    private ServiceRecordRepository serviceRecordRepository;

    public ServiceRecordService(ServiceRecordRepository serviceRecordRepository) {
        this.serviceRecordRepository = serviceRecordRepository;
    }

    public void addServiceRecord(ServiceRecord serviceRecord) {
        serviceRecordRepository.addServiceRecord(serviceRecord);
    }

    public void updateServiceRecord(ServiceRecord serviceRecord) {
        serviceRecordRepository.updateServiceRecord(serviceRecord);
    }

    public void deleteServiceRecord(int serviceRecordId) {
        serviceRecordRepository.deleteServiceRecord(serviceRecordId);
    }

    public ServiceRecord getServiceRecordById(int serviceRecordId) {
        return serviceRecordRepository.getServiceRecordById(serviceRecordId);
    }

    public List<ServiceRecord> getServiceRecordsByCarId(int carId) {
        return serviceRecordRepository.getServiceRecordsByCarId(carId);
    }

    // Дополнительные методы для фильтрации и поиска записей на сервис
}
