/**
 * 
 */
package org.springframework.sdr.jpa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * @author mzampetti
 *
 */
@Projection(name = "simple", types = {Address.class})
public interface AddressProjection
{
    @Value("#{target.line1} #{target.line2}")
    String getLine();
    
    String getCity();
    String getState();
    String getZipcode();
    
    PersonProjection getPerson();
}
