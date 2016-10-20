/**
 * 
 */
package org.springframework.sdr.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author mzampetti
 *
 */
public interface PersonRespository extends PagingAndSortingRepository<Person, Long>
{

}
