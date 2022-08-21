package rocks.basset.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import rocks.basset.msscbrewery.domain.Customer;
import rocks.basset.msscbrewery.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);
}
