public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void addClient(Client client) {
        clientRepository.addClient(client);
    }

    public void updateClient(Client client) {
        clientRepository.updateClient(client);
    }

    public void deleteClient(int clientId) {
        clientRepository.deleteClient(clientId);
    }

    public Client getClientById(int clientId) {
        return clientRepository.getClientById(clientId);
    }

    public List<Client> getAllClients() {
        return clientRepository.getAllClients();
    }

    // Дополнительные методы для фильтрации и поиска клиентов
}
