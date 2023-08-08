package com.springboot.api.library.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prestamos")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



   /* @OneToMany
   @JoinColumn(name = "bookId")
      private Book book;*/

 /*  @OneToMany
  @JoinColumn(name = "userId")
    User user;*/

    @CreatedDate
    private LocalDateTime loanDate;

    @CreatedDate
    private LocalDateTime returnDate;

}
