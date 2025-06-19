package com.springswagger.Service;

import com.springswagger.models.Address;
import com.springswagger.repositorys.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddressById(Long id) {
        return addressRepository.findById(id);
    }

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(Long id, Address updatedAddress) {
        return addressRepository.findById(id)
                .map(existing -> {
                    existing.setStreet(updatedAddress.getStreet());
                    existing.setCity(updatedAddress.getCity());
                    existing.setZipCode(updatedAddress.getZipCode());
                    existing.setPerson(updatedAddress.getPerson());
                    return addressRepository.save(existing);
                }).orElse(null);
    }

    public void deleteAddress(Long id) {
        addressRepository.deleteById(id);
    }
}
