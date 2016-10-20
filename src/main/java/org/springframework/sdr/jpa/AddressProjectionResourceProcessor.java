/**
 * 
 */
package org.springframework.sdr.jpa;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

/**
 * @author mzampetti
 *
 */
@Component
public class AddressProjectionResourceProcessor implements ResourceProcessor<Resource<AddressProjection>>
{
    @Override
    public Resource<AddressProjection> process(Resource<AddressProjection> resource)
    {
        resource.add(new Link("http://www.microsoft.com", "microsoft"));
        return resource;
    }

}
