package pl.wsb.gympass.schedule.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "gym_class")
public class GymClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;                // np. "Crossfit"

    @Column(name = "instructor", nullable = false, length = 80)
    private String instructor;

    @Column(name = "starts_at", nullable = false)
    private LocalDateTime startsAt;

    @Column(name = "duration_minutes", nullable = false)
    private Integer durationMinutes;

    @Column(name = "capacity", nullable = false)
    private Integer capacity;           // limit miejsc na zajęciach

    protected GymClass() {
    }

    public GymClass(String name, String instructor, LocalDateTime startsAt, Integer durationMinutes, Integer capacity) {
        this.name = name;
        this.instructor = instructor;
        this.startsAt = startsAt;
        this.durationMinutes = durationMinutes;
        this.capacity = capacity;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public LocalDateTime getStartsAt() {
        return startsAt;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
