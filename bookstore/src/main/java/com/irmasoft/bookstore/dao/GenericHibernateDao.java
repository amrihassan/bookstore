package com.irmasoft.bookstore.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public abstract class GenericHibernateDao<T> implements IGenericHibernateDao<T> {

	private Class< T > clazz;
 
    public GenericHibernateDao(Class<T> class1) {
        this.clazz = class1;
    }
 
	@Autowired
	SessionFactory sessionFactory;

	public void setClazz( Class< T > clazzToSet ){
		this.clazz = clazzToSet;
	}
	
	public Class< T > getClazz(){
		return this.clazz;
	}

	@SuppressWarnings("unchecked")
	public T getById( final Long id ){
		return (T) this.getCurrentSession().get( this.clazz, id );
	}
	
	@SuppressWarnings("unchecked")
	public List< T > getAll(){
		return this.getCurrentSession().createQuery( "from " + this.clazz.getName() ).list();
	}

	public void create( final T entity ){
		this.getCurrentSession().persist( entity );
	}

	public void update( final T entity ){
		this.getCurrentSession().merge( entity );
	}

	public void delete( final T entity ){
		this.getCurrentSession().delete( entity );
	}
	
	public void deleteById( final Long entityId ){
		final T entity = this.getById( entityId );
		this.delete( entity );
	}

	protected final Session getCurrentSession(){
		return this.getSessionFactory().getCurrentSession();
	}

	public  SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	} 
}