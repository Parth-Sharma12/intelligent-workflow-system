    package com.example.paypal_demo.Repositories;

    import com.example.paypal_demo.Models.Order;
    import org.springframework.stereotype.Repository;

    import java.util.ArrayList;
    import java.util.List;

    @Repository
    public class HardCodedOrderRepo implements OrderRepo{
        private final List<Order> orders = new ArrayList<Order>();
        private int nextId = 1;

        // optional: initialize with dummy data
        public HardCodedOrderRepo() {
            orders.add(new Order(nextId++, "Alice", "Bob", 250.0f, "Test Order", "PAID"));
            orders.add(new Order(nextId++, "John", "Jane", 150.0f, "Demo Order", "PENDING"));
        }

        @Override
        public Integer create_order(Order order) {
            order.setOrder_id(nextId++);
            orders.add(order);
            return order.getOrder_id();
        }

        @Override
        public Order get_order_by_id(Integer id) {
            return orders.stream()
                    .filter(o -> o.getOrder_id() == id)
                    .findFirst()
                    .orElse(null);
        }
    }
