package persistence.PostgresDAOs;

import domain.Category;

public interface CategoryDao {
	
	public Category findByCode(String code);

}
