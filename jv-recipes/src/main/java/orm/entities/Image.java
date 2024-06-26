package orm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import org.hibernate.annotations.Generated;

@Entity // marks a class as a persistent entity in the database

public class Image {
    @Id // marks the primary key property of an entity
    @Generated // marks a property as generated by the database
    String id;
    String filename;
    String fileData;

    @OneToOne
    @JoinColumn(name = "recipe") //
    Recipe associatedRecipe;

}
