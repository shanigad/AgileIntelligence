package com.sgad.ppmtool.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String projectName;
  private String projectIdentifier;
  private String description;
  private Date startDate;
  private Date endDate;

  private Date createdAt;
  private Date updatedAt;

  @PrePersist
  protected void  onCreate(){
    this.createdAt = new Date();
  }

  @PreUpdate
  protected void  onUpdate(){
    this.updatedAt = new Date();
  }

}
