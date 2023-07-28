package br.inova.service;

import br.inova.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
