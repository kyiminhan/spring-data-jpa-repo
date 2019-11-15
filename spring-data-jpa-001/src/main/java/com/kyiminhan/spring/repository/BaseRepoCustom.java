package com.kyiminhan.spring.repository;

import java.io.Serializable;
import java.util.Map;

public interface BaseRepoCustom<T extends Serializable> extends Serializable {

	T findByProperties(Map<String, Object> map);
}
