package orm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import org.hibernate.annotations.Generated;

@Entity // marks a class as a persistent entity in the database

public class Comment {

    @Id // marks the primary key property of an entity
    @Generated // marks a property as generated by the database
    String id;
    String text;
    String datePosted;


    @ManyToOne || @OneToMany
    User author;
    Recipe associatedRecipe;
}