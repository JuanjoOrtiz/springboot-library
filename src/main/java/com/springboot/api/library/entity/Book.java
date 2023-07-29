package com.springboot.api.library.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "libros")
public class




Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    //  @ManyToMany
  //  @JoinColumn(name = "authorId")
  //  private Author author;

    @CreatedDate
    private LocalDateTime publicationDate;

    //    @ManyToMany
//    @JoinColumn(name = "genderId")
 //   private Gender gender;

    //   @OneToMany
 //   @JoinColumn(name = "editorialId")
  //  private Editorial editorial;

    //  @OneToMany
 //   @JoinColumn(name = "shelfId")
//    private Shelf shelf;

    //   @ManyToMany
 //   @JoinColumn(name = "categoryId")
 //   private Category category;



}
