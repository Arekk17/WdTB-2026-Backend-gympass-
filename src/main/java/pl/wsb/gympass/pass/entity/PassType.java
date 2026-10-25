package pl.wsb.gympass.pass.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "pass_type")
public class PassType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;                // np. "Open miesięczny"

    @Enumerated(EnumType.STRING)
    @Column(name = "kind", nullable = false, length = 20)
    private PassKind kind;              // TIME albo ENTRIES

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;           // cena w zł

    @Column(name = "duration_days")
    private Integer durationDays;       // tylko dla TIME, np. 30

    @Column(name = "entry_limit")
    private Integer entryLimit;         // tylko dla ENTRIES, np. 10

    protected PassType() {
    }

    public PassType(String name, PassKind kind, BigDecimal price, Integer durationDays, Integer entryLimit) {
        this.name = name;
        this.kind = kind;
        this.price = price;
        this.durationDays = durationDays;
        this.entryLimit = entryLimit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public PassKind getKind() {
        return kind;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getDurationDays() {
        return durationDays;
    }

    public Integer getEntryLimit() {
        return entryLimit;
    }
}
