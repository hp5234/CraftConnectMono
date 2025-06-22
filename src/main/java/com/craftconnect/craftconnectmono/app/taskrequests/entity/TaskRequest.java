package com.craftconnect.craftconnectmono.app.taskrequests.entity;

import com.craftconnect.craftconnectmono.app.users.entity.User;
import com.craftconnect.craftconnectmono.app.taskhopes.entity.TaskHope;
import com.craftconnect.craftconnectmono.app.contracts.entity.Contract;
import com.craftconnect.craftconnectmono.app.images.entity.Image;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "TASK_REQUESTS")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TaskRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USERS_ID", nullable = false)
    private User user;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    private Integer amount;

    @Column(name = "WORKING_DAY")
    private Integer workingDay;

    @Builder.Default
    @OneToMany(mappedBy = "taskRequest")
    private List<TaskHope> taskHopes = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "taskRequest")
    private List<Contract> contracts = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "taskRequest")
    private List<Image> images = new ArrayList<>();
} 