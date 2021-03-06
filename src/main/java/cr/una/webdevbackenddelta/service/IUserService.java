package cr.una.webdevbackenddelta.service;

import cr.una.webdevbackenddelta.exception.EntityNotFoundException;
import cr.una.webdevbackenddelta.model.User;

import java.util.List;

/**
 * IUserService
 *
 * The Service for Task
 */
public interface IUserService {
    /**
     * Method to find the entity by id
     * @param id the id of the entity to find
     * @return the corresponding UserDao
     */
    public User findById (final long id) throws EntityNotFoundException;
    public User findByUsername(String username) throws EntityNotFoundException;

    /**
     * Method to find all entities
     * @return the list of entities of UserDao
     */
    public List<User> findAll();

    /**
     * Method to create a new entity
     * @param user the entity to create in the database
     * @return the user created with the corresponding id
     */
    public User create (final User user);

    /**
     * Method to update the entity in the database
     * @param user the entity with new information to update
     * @return the updated user
     */
    public User update (final User user);

    /**
     * Method to delete a entity in the database
     * @param user the entity to deleted
     */
    public void delete (final User user);

    /**
     * Method to delete a entity in the database by id
     * @param id the id of the entity to delete
     */
    public void deleteById (final long id) throws EntityNotFoundException;
}
