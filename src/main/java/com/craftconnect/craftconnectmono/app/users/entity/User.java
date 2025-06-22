package com.craftconnect.craftconnectmono.app.users.entity;

import com.craftconnect.craftconnectmono.app.orders.entity.Order;
import com.craftconnect.craftconnectmono.app.taskrequests.entity.TaskRequest;
import com.craftconnect.craftconnectmono.app.taskhopes.entity.TaskHope;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "USERS")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nickname;

    @Column(nullable = false, length = 100)
    private String loginid;

    @Column(nullable = false, length = 200)
    private String password;

    @Column(nullable = false, length = 20)
    private String kind;

    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Order> orders = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<TaskRequest> taskRequests = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<TaskHope> taskHopes = new ArrayList<>();
} 