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
public class AddressResourceProcessor implements ResourceProcessor<Resource<Address>>
{
    @Override
    public Resource<Address> process(Resource<Address> resource)
    {
        resource.add(new Link("http://www.microsoft.com", "microsoft"));
        return resource;
    }

}
