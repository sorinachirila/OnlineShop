package ro.sda.shop.storage;

import org.junit.Before;
import org.junit.Test;
import ro.sda.shop.model.Client;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ClientDAOTest {

    private ClientDAO clientDAO;
    private static List<Client> clients;

    @Before
    public void setClientDao() {
        clientDAO = new ClientDAO();
        clients = new ArrayList<>();
    }

    //READ --- findById -- no element -- get
    @Test(expected = RuntimeException.class)
    public void testWhenTheListOfCientsIsEmptyFindByIdMethodThrowsRuntimeException() {
        System.out.println("testWhenTheListOfCientsIsEmptyFindByIdMethodThrowsRuntimeException");
        clientDAO.findById(0L);
        //testWhenTheListOfCientsIsEmptyFindByIdMethodThrowsRuntimeException
    }

    //READ --- findById -- one element
    @Test
    public void testWhenTheListOfClientsHasOneElementFindByIdMethodReturnsIt() {
        System.out.println("testWhenTheListOfClientsHasOneElementFindByIdMethodReturnsIt");
        Client client = new Client();
        client.setId(0L);
        client.setName("Sorina");
        client.setPhoneNumber("0232297784");
        client.setSocialId("28701334455");
        client.setAddress("Somewhere in Romania");
        clientDAO.add(client);
        assertEquals("Sorina", clientDAO.findById(0L).getName());
        assertEquals("0232297784", clientDAO.findById(0L).getPhoneNumber());
        assertEquals("28701334455", clientDAO.findById(0L).getSocialId());
        assertEquals("Somewhere in Romania", clientDAO.findById(0L).getAddress());
        assertEquals(0, clients.size());
        //testWhenTheListOfClientsHasOneElementFindByIdMethodReturnsIt
    }

    //READ --- findAll -- getAll -- no element
    @Test
    public void testWhenTheListOfClientsIsEmptyFindAllMethodReturnsEmptyList() {
        System.out.println("testWhenTheListOfClientsIsEmptyFindAllMethodReturnsEmptyList");
        assertEquals(0, clientDAO.findAll().size());
        //testWhenTheListOfClientsIsEmptyFindAllMethodReturnsEmptyList
    }
    //READ --- findAll -- one element
    @Test
    public void testWhenTheListOfClientsHasOneElementFindAllMethodReturnsListOfSizeOne() {
        System.out.println("testWhenTheListOfClientsHasOneElementFindAllMethodReturnsListOfSizeOne");
        Client client = new Client();
        client.setId(0L);
        client.setName("Sorina");
        client.setPhoneNumber("0232297784");
        client.setSocialId("28701334455");
        client.setAddress("Somewhere in Romania");
        clientDAO.add(client);
        assertEquals(1, clientDAO.findAll().size());
        //testWhenTheListOfClientsHasOneElementFindAllMethodReturnsListOfSizeOne
    }
    //READ --- findAll --  two elements
    @Test
    public void testWhenTheListOfClientsHasTwoElementsFindAllMethodReturnsListOfSizeTwo() {
        System.out.println("testWhenTheListOfClientsHasTwoElementsFindAllMethodReturnsListOfSizeTwo");
        Client client1 = new Client();
        client1.setId(0L);
        client1.setName("Sorina");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        Client client2 = new Client();
        client1.setId(1L);
        client1.setName("Georgiana");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        clientDAO.add(client1);
        clientDAO.add(client2);
        assertEquals(2, clientDAO.findAll().size());
        //testWhenTheListOfClientsHasTwoElementsFindAllMethodReturnsListOfSizeTwo
    }
    //CREATE --- add -- on empty list
    @Test
    public void testWhenTheListOfClientsIsEmptyAddMethodAddsOneClient() {
        System.out.println("testWhenTheListOfClientsIsEmptyAddMethodAddsOneClient");
        Client client = new Client();
        client.setId(0L);
        client.setName("Sorina");
        client.setPhoneNumber("0232297784");
        client.setSocialId("28701334455");
        client.setAddress("Somewhere in Romania");
        clientDAO.add(client);
        //!!! face add corect si nu prea pentru ca NU MODIFICA clients!!!!
        assertEquals("Sorina", clientDAO.findById(0L).getName());
        assertEquals("0232297784", clientDAO.findById(0L).getPhoneNumber());
        assertEquals("28701334455", clientDAO.findById(0L).getSocialId());
        assertEquals("Somewhere in Romania", clientDAO.findById(0L).getAddress());
        assertEquals(1, clientDAO.findAll().size());
        //testWhenTheListOfClientsIsEmptyAddMethodAddsOneClient
    }
    //CREATE --- add -- when list has one element, initially
    @Test
    public void testWhenTheListOfClientsHasOneElementAddMethodAddSecondClient() {
        System.out.println("testWhenTheListOfClientsHasOneElementAddMethodAddSecondClient");
        Client client1 = new Client();
        client1.setId(0L);
        client1.setName("Sorina");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        Client client2 = new Client();
        client1.setId(1L);
        client1.setName("Georgiana");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        clientDAO.add(client1);
        clientDAO.add(client2);
        assertEquals(2, clientDAO.findAll().size());//Am testat doar size()-ul, desi cred ca trebuia teste si pe valori
                                                             //pentru fiecare Client adaugat
        //testWhenTheListOfClientsHasOneElementAddMethodAddSecondClient
    }
    //DELETE --- delete -- when the list is empty
    @Test(expected = RuntimeException.class)
    public void testWhenTheListOfClientsIsEmptyDeleteMethodThrowsRuntimeException() {
        System.out.println("testWhenTheListOfClientsIsEmptyDeleteMethodThrowsRuntimeException");
        Client client1 = new Client();
        client1.setId(0L);
        client1.setName("Sorina");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        clientDAO.delete(client1);
        //testWhenTheListOfClientsIsEmptyDeleteMethodThrowsRuntimeException
    }

    //DELETE --- delete -- when the list has one element
    @Test
    public void testWhenTheListOfClientsHasOneElementDeleteMethodEraseThatElement() {
        System.out.println(" testWhenTheListOfClientsHasOneElementDeleteMethodEraseThatElement");
        Client client1 = new Client();
        client1.setId(0L);
        client1.setName("Sorina");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        clientDAO.add(client1);
        assertEquals(1, clientDAO.findAll().size());
        clientDAO.delete(client1);
        assertEquals(0, clientDAO.findAll().size());
        //testWhenTheListOfClientsHasOneElementDeleteMethodEraseThatElement
    }
    //UPDATE--- update -- no element in list
    @Test(expected = RuntimeException.class)
    public void testWhenTheListOfClientsHasNoElementUpdateMethodThrowsRuntimeException() {
        System.out.println("testWhenTheListOfClientsHasNoElementUpdateMethodThrowsRuntimeException");
        Client client1 = new Client();
        client1.setId(0L);
        client1.setName("Sorina");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        //client1 nu este adaugat!!!!!
        clientDAO.update(client1);
    }

    //UPDATE--- update -- one element in list
    @Test
    public void testWhenTheListOfClientsHasOneElementUpdateMethodReturnsObjectModified() {
        System.out.println("testWhenTheListOfClientsHasOneElementUpdateMethodReturnsObjectModified");
        Client client1 = new Client();
        client1.setId(0L);
        client1.setName("Sorina");
        client1.setPhoneNumber("0232297784");
        client1.setSocialId("28701334455");
        client1.setAddress("Somewhere in Romania");
        clientDAO.add(client1);
        //vad ca s-a adaugat corect
        assertEquals("Sorina", clientDAO.findById(0l).getName());
        assertEquals("Somewhere in Romania", clientDAO.findById(0l).getAddress());
        client1.setName("Georgiana");
        clientDAO.update(client1);//
        assertEquals("Georgiana", client1.getName());
        //testWhenTheListOfClientsHasOneElementUpdateMethodReturnsObjectModified
    }


}
