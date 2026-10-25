package pl.wsb.gympass.member.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "gym_member")
public class GymMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "full_name", nullable = false, length = 80)
    private String fullName;

    @Column(name = "email", nullable = false, unique = true, length = 120)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;               // opcjonalny

    @Column(name = "joined_on", nullable = false)
    private LocalDate joinedOn;

    @Embedded
    private Address address;            // kolumny street, city, postal_code w tabeli gym_member

    protected GymMember() {
    }

    public GymMember(String fullName, String email, String phone, LocalDate joinedOn, Address address) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.joinedOn = joinedOn;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getJoinedOn() {
        return joinedOn;
    }

    public Address getAddress() {
        return address;
    }
}
