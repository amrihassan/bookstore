package com.irmasoft.bookstore.dao;

import java.util.List;

public interface IGenericHibernateDao<T> {

	public void setClazz( final Class< T > clazzToSet );
	
	public T getById( final Long id );
	
	public List< T > getAll();

	public void create( final T entity );

	public void update( final T entity );

	public void delete( final T entity );
	
	public void deleteById( final Long entityId );

}
