package com.example.demo.order;
import com.example.demo.member.domain.MemberEntity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private MemberEntity user;

    private String orderStatus;

    private LocalDateTime orderDate;

    private int orderItems;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MemberEntity getUser() {
        return user;
    }

    public void setUser(MemberEntity user) {
        this.user = user;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public int getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(int orderItems) {
        this.orderItems = orderItems;
    }
}
