package ro.sda.shop.storage;

import ro.sda.shop.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDAO implements GenericDAO<Order> {
    static List<Order> orders = new ArrayList<Order>();

    public List<Order> findAll() {
        return orders;
    }

    public Order findById(Long id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public void update(Order order) {
        delete(order);
        add(order);
    }

    public Order add(Order order) {
        if(order.getId() == null){
            order.setId(generateNewId());
        }
        orders.add(order);
        return order;
    }
    public void delete(Order order) {
        deleteById(order.getId());
    }

    public void deleteById(Long id) {
        Order deleteOrder = null;
        for(Order order : orders){
            if(order.getId().equals(id)){
                deleteOrder = order;
            }
        }
        orders.remove(deleteOrder);
    }

    private Long generateNewId() {
        return findMaxId() +1;
    }

    private Long findMaxId() {
        Long max = -1L;
        for(Order order : orders){
            if(max<order.getId()){
                max = order.getId();
            }
        }
        return max;
    }
}
