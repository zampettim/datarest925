/**
 * 
 */
package org.springframework.sdr.jpa;

import org.springframework.data.rest.core.config.Projection;

/**
 * @author mzampetti
 *
 */
@Projection(name = "simple", types = {Person.class})
public interface PersonProjection
{
    String getFirstName();
    String getLastName();

}
