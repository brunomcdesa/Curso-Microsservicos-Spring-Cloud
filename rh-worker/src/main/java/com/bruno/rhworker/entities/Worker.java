package com.bruno.rhworker.entities;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "WORKER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements Serializable {
private static final long serialVersionUID = 1;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double dailyIncome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker)) return false;
        Worker worker = (Worker) o;
        return Objects.equals(getId(), worker.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
