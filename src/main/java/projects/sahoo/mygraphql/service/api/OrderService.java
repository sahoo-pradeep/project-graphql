package projects.sahoo.mygraphql.service.api;

import projects.sahoo.mygraphql.graphql_filter.OrderFilter;
import projects.sahoo.mygraphql.graphql_filter.OrderSort;
import projects.sahoo.mygraphql.graphql_filter.TransactionFilter;
import projects.sahoo.mygraphql.model.Order;

import java.util.List;

public interface OrderService {
    Long getOrderCount(List<OrderFilter> orderFilters, List<TransactionFilter> transactionFilters);

    List<Order> getOrders(List<OrderFilter> orderFilters,
            List<TransactionFilter> transactionFilters, List<OrderSort> sortList, int limit,
            int offset);
}
