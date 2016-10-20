/**
 * 
 */
package org.springframework.sdr.jpa;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * @author mzampetti
 *
 */
@Entity
@Table(name = "persons")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person
{
    @Id
    @GeneratedValue
    private Long id;
    
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String quote;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy="person")
    private Set<Address> addresses;

}
