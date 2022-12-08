package com.project.hareexpress.domain.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "pedido", schema = "hareexpress")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "id_endereco_entrega")
    private Endereco entrega;

    @ManyToOne
    @JoinColumn(name = "id_endereco_retirada")
    private Endereco retirada;

    @ManyToOne
    @JoinColumn(name = "id_solicitante")
    private Pessoa solicitante;


    @ManyToOne
    @JoinColumn(name = "id_entregador")
    private Pessoa entregador;


    @Column(name = "ds_pedido")
    private String pedido;




}
