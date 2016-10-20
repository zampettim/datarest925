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
public class PersonResourceProcessor implements ResourceProcessor<Resource<Person>>
{
    @Override
    public Resource<Person> process(Resource<Person> resource)
    {
        resource.add(new Link("http://www.google.com", "google"));
        return resource;
    }

}
