package com.kyiminhan.spring.repository.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.entity.User;
import com.kyiminhan.spring.repository.UserRepoCustom;

@Lazy
@Repository
public class UserRepoCustomImpl extends BaseRepoCustomImpl<User> implements UserRepoCustom {

	private static final long serialVersionUID = 1L;

}
