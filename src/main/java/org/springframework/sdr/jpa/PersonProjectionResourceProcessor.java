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
public class PersonProjectionResourceProcessor implements ResourceProcessor<Resource<PersonProjection>>
{
    @Override
    public Resource<PersonProjection> process(Resource<PersonProjection> resource)
    {
        resource.add(new Link("http://www.google.com", "google"));
        return resource;
    }

}
