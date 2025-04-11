package br.com.gustavoz.service.impl;

import br.com.gustavoz.domain.model.UserBank;
import br.com.gustavoz.domain.repository.UserRepository;
import br.com.gustavoz.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserBank findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public UserBank create(UserBank userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("User with account number " + userToCreate.getAccount().getNumber() + " already exists");
        }
        return userRepository.save(userToCreate);
    }
}