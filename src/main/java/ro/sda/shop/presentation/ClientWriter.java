package ro.sda.shop.presentation;

import ro.sda.shop.model.Client;

public class ClientWriter implements ConsoleWriter<Client> {
    public void write(Client value){
        System.out.println("Name: " + value.getName());
        System.out.println("Address: " + value.getAddress());
    }
}
