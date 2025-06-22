package com.craftconnect.craftconnectmono.app.taskhopes.entity;

import com.craftconnect.craftconnectmono.app.taskrequests.entity.TaskRequest;
import com.craftconnect.craftconnectmono.app.users.entity.User;
import com.craftconnect.craftconnectmono.app.contracts.entity.Contract;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "TASK_HOPES")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskHope {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TASK_REQUESTS_ID", nullable = false)
    private TaskRequest taskRequest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERS_ID", nullable = false)
    private User user;

    @Column(name = "MIN_AMOUNT", nullable = false)
    private Integer minAmount;

    @Column(name = "MAX_EDIT_COUNT")
    private Integer maxEditCount;

    @Column(name = "PRICE_PER_ONE", nullable = false)
    private Long pricePerOne;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Builder.Default
    @OneToMany(mappedBy = "taskHope")
    private List<Contract> contracts = new ArrayList<>();
} 