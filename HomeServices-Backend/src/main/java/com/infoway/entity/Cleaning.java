package com.infoway.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
public class Cleaning {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @ManyToOne
        @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
        private User user;
        @Column
        private String mobilenumber;

        @Column
        private String address;
        @Column
        private String rooms;
        @Column
        private String date;

        private String status;
        

}
