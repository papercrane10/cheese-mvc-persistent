package org.launchcode.models.data;

import groovy.lang.Category;
import org.launchcode.models.Cheese;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by LaunchCode
 */
@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {
}
