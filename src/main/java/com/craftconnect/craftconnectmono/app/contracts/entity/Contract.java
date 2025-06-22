package com.craftconnect.craftconnectmono.app.contracts.entity;

import com.craftconnect.craftconnectmono.app.taskrequests.entity.TaskRequest;
import com.craftconnect.craftconnectmono.app.taskhopes.entity.TaskHope;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CONTRACTS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_REQUEST_ID", nullable = false)
    private TaskRequest taskRequest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_HOPE_ID", nullable = false)
    private TaskHope taskHope;

    @Column(nullable = false)
    private Integer amount;

    @Column(name = "START_TIME", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "END_TIME", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "MAX_EDIT_COUNT")
    private Integer maxEditCount;

    @Column(name = "PRICE_PER_ONE", nullable = false)
    private Long pricePerOne;

    @Column(nullable = false, length = 100)
    private String status;

    @Column(nullable = false, length = 100)
    private String type;
} 