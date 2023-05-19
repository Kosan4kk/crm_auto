public class PartService {
    private PartRepository partRepository;

    public PartService(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    public void addPart(Part part) {
        partRepository.addPart(part);
    }

    public void updatePart(Part part) {
        partRepository.updatePart(part);
    }

    public void deletePart(int partId) {
        partRepository.deletePart(partId);
    }

    public Part getPartById(int partId) {
        return partRepository.getPartById(partId);
    }

    public List<Part> getAllParts() {
        return partRepository.getAllParts();
    }

    // Дополнительные методы для фильтрации и поиска запчастей
}
