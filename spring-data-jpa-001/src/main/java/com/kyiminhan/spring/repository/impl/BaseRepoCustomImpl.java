package com.kyiminhan.spring.repository.impl;

import java.io.Serializable;
import java.util.Map;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.kyiminhan.spring.repository.BaseRepoCustom;

@Lazy
@Repository
public abstract class BaseRepoCustomImpl<T extends Serializable> implements BaseRepoCustom<T> {

	private static final long serialVersionUID = 1L;

	@Override
	public T findByProperties(Map<String, Object> map) {
		return null;
	}
}
