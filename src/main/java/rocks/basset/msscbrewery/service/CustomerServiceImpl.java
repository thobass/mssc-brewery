package rocks.basset.msscbrewery.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rocks.basset.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO Implement UPDATE
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting a customer by id...");
    }
}
