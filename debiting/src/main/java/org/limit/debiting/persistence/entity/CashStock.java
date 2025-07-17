package org.limit.debiting.persistence.entity;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cash_stock")
@EqualsAndHashCode
@RequiredArgsConstructor
public class CashStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "draft")
    private Boolean draft;

    @Column(name = "amount")
    private Long amount;

}
