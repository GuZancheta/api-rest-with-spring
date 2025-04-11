package br.com.gustavoz.service;

import br.com.gustavoz.domain.model.UserBank;

public interface UserService {

    UserBank findById(Long id);

    UserBank create(UserBank userToCreate);
}