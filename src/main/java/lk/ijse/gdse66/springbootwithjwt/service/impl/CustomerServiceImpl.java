package lk.ijse.gdse66.springbootwithjwt.service.impl;

import lk.ijse.gdse66.springbootwithjwt.dto.CustomerDTO;
import lk.ijse.gdse66.springbootwithjwt.entity.CustomerEntity;
import lk.ijse.gdse66.springbootwithjwt.repository.CustomerRepo;
import lk.ijse.gdse66.springbootwithjwt.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    CustomerRepo customerRepo;
    ModelMapper mapper;

    public CustomerServiceImpl(CustomerRepo customerRepo, ModelMapper mapper) {
        this.customerRepo = customerRepo;
        this.mapper = mapper;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream().map(
                customer -> mapper.map(customer, CustomerDTO.class)).toList();
    }

    @Override
    public CustomerDTO getCustomerDetails(String id) {
        return null;
    }

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        customerDTO.setId(UUID.randomUUID().toString());
        return mapper.map(customerRepo.save(mapper.map(
                customerDTO, CustomerEntity.class)), CustomerDTO.class);
    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {

    }
}
