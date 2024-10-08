package com.madeeasy.service;

import com.madeeasy.dto.request.UserPatchRequestDTO;
import com.madeeasy.dto.request.UserRequestDTO;
import com.madeeasy.dto.response.UserAuthResponseDTO;
import com.madeeasy.dto.response.UserResponseDTO;
import com.madeeasy.entity.Role;

import java.util.List;

public interface UserService {
    List<UserResponseDTO> getAllUsers();

    UserAuthResponseDTO createUser(UserRequestDTO user);

    UserAuthResponseDTO partiallyUpdateUser(String emailId, UserPatchRequestDTO userDetails);

    UserResponseDTO getUserByEmailId(String emailId);

    UserResponseDTO findByFullNameAndRole(String fullName, Role role);

    UserResponseDTO getUserById(Long id);
}
