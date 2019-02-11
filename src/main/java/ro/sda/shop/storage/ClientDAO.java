package ro.sda.shop.storage;

import ro.sda.shop.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO implements GenericDAO<Client> {
    //1.d. static
    static List<Client> clients = new ArrayList<Client>();

    public List<Client> findAll() {
        return clients;
    }

    public Client findById(Long id) {
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    public void update(Client client) {
        delete(client);
        add(client);
    }

    public Client add(Client client) {
        if (client.getId() == null) {
            client.setId(generateNewId());
        }
        clients.add(client);
        return client;
    }

    public void delete(Client client) {
        deleteById(client.getId());
    }

    public void deleteById(Long id) {
        Client deletedClient = null;
        for (Client client : clients) {
            if (client.getId().equals(id)) {
                deletedClient = client;
            }
        }
        clients.remove(deletedClient);
    }

    private Long generateNewId() {
        return findMaxId() + 1;
    }

    private Long findMaxId() {
        Long max = -1L;
        for (Client client : clients) {
            if (max < client.getId()) {
                max = client.getId();
            }
        }
        return max;
    }

}
