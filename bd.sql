drop database if exists mvc;
create database if not exists mvc;
use mvc;

create table Serie (
codSerie int auto_increment not null,
titulo varchar(50),
genero varchar(14),
horario varchar(30),
resumo varchar(70),
quantidadep varchar(50),
primary key (codSerie));

create table Desenho (
codDesenho int auto_increment not null,
titulo varchar(20),
genero varchar(15),
resumo varchar(50),
horario varchar(15),
idademin varchar(40),
primary key (codDesenho));

create table Filme(
codFilme int auto_increment not null,
titulo varchar(20),
genero varchar(15),
resumo varchar(50),
horario varchar(15),
diretor varchar(20),
primary key (codFilme));

create table Canal (
codCanal int auto_increment not null,
nome varchar(20),
primary key (codCanal));
