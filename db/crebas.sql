/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     05/11/2015 10:52:02                          */
/*==============================================================*/


drop index INDEX_1 on ALUMNOS;

drop table if exists ALUMNOS;

drop index INDEX_1 on CALENDARIOS_CURSOS;

drop index INDEX_2 on CALENDARIOS_CURSOS;

drop index INDEX_3 on CALENDARIOS_CURSOS;

drop table if exists CALENDARIOS_CURSOS;

drop index INDEX_1 on CEF_PREGUNTAS;

drop index INDEX_2 on CEF_PREGUNTAS;

drop table if exists CEF_PREGUNTAS;

drop index INDEX_1 on CEF_RESPUESTAS;

drop index INDEX_2 on CEF_RESPUESTAS;

drop table if exists CEF_RESPUESTAS;

drop index INDEX_1 on CONTENIDOS_TEMAS;

drop index INDEX_2 on CONTENIDOS_TEMAS;

drop index INDEX_3 on CONTENIDOS_TEMAS;

drop table if exists CONTENIDOS_TEMAS;

drop index INDEX_1 on CURSOS;

drop index INDEX_2 on CURSOS;

drop table if exists CURSOS;

drop index INDEX_1 on CURSOS_EXAMEN_FINAL;

drop index INDEX_2 on CURSOS_EXAMEN_FINAL;

drop table if exists CURSOS_EXAMEN_FINAL;

drop index INDEX_1 on DOMICILIOS;

drop index INDEX_2 on DOMICILIOS;

drop index INDEX_3 on DOMICILIOS;

drop index INDEX_4 on DOMICILIOS;

drop index INDEX_5 on DOMICILIOS;

drop table if exists DOMICILIOS;

drop index INDEX_1 on ESPECIALIZACIONES;

drop index INDEX_2 on ESPECIALIZACIONES;

drop table if exists ESPECIALIZACIONES;

drop index INDEX_1 on ESPECIALIZACIONES_CURSOS;

drop index INDEX_2 on ESPECIALIZACIONES_CURSOS;

drop table if exists ESPECIALIZACIONES_CURSOS;

drop index INDEX_1 on ESTADOS;

drop table if exists ESTADOS;

drop index INDEX_1 on EXAMENES;

drop table if exists EXAMENES;

drop index INDEX_1 on INSCRIPCIONES;

drop index INDEX_2 on INSCRIPCIONES;

drop index INDEX_3 on INSCRIPCIONES;

drop index INDEX_4 on INSCRIPCIONES;

drop table if exists INSCRIPCIONES;

drop index INDEX_1 on INSTRUCTORES;

drop table if exists INSTRUCTORES;

drop index INDEX_1 on MEDIOS_COMUNICACION;

drop index INDEX_2 on MEDIOS_COMUNICACION;

drop index INDEX_3 on MEDIOS_COMUNICACION;

drop table if exists MEDIOS_COMUNICACION;

drop index INDEX_1 on ME_PREGUNTAS;

drop index INDEX_2 on ME_PREGUNTAS;

drop table if exists ME_PREGUNTAS;

drop index INDEX_1 on ME_RESPUESTAS;

drop index INDEX_2 on ME_RESPUESTAS;

drop table if exists ME_RESPUESTAS;

drop index INDEX_1 on MODALIDADES;

drop table if exists MODALIDADES;

drop index INDEX_1 on MODULOS;

drop index INDEX_2 on MODULOS;

drop index INDEX_3 on MODULOS;

drop table if exists MODULOS;

drop index INDEX_1 on MODULOS_EXAMENES;

drop index INDEX_2 on MODULOS_EXAMENES;

drop table if exists MODULOS_EXAMENES;

drop index INDEX_1 on MUNICIPIOS;

drop index INDEX_2 on MUNICIPIOS;

drop table if exists MUNICIPIOS;

drop index INDEX_1 on PERSONAS;

drop index INDEX_2 on PERSONAS;

drop table if exists PERSONAS;

drop index INDEX_1 on PREGUNTAS;

drop table if exists PREGUNTAS;

drop index INDEX_1 on RESPUESTAS;

drop table if exists RESPUESTAS;

drop index INDEX_1 on TC_PREGUNTAS;

drop index INDEX_2 on TC_PREGUNTAS;

drop table if exists TC_PREGUNTAS;

drop index INDEX_1 on TC_RESPUESTAS;

drop index INDEX_2 on TC_RESPUESTAS;

drop table if exists TC_RESPUESTAS;

drop index INDEX_1 on TEMAS;

drop index INDEX_2 on TEMAS;

drop table if exists TEMAS;

drop index INDEX_1 on TEMAS_EXAMENES;

drop index INDEX_2 on TEMAS_EXAMENES;

drop table if exists TEMAS_EXAMENES;

drop index INDEX_1 on TIPOS_CONTENIDO;

drop table if exists TIPOS_CONTENIDO;

drop index INDEX_1 on TIPOS_MEDIOS_COMUNICACION;

drop table if exists TIPOS_MEDIOS_COMUNICACION;

/*==============================================================*/
/* Table: ALUMNOS                                               */
/*==============================================================*/
create table ALUMNOS
(
   CVE_PERSONA          int not null,
   MATRICULA            varchar(10),
   primary key (CVE_PERSONA)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on ALUMNOS
(
   CVE_PERSONA
);

/*==============================================================*/
/* Table: CALENDARIOS_CURSOS                                    */
/*==============================================================*/
create table CALENDARIOS_CURSOS
(
   CVE_CALENDARIO       int not null auto_increment,
   CVE_CURSO            int,
   CVE_INSTRUCTOR       int,
   FECHA_INICIO         datetime,
   FECHA_FIN            datetime,
   COSTO                double,
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_CALENDARIO)
);

/*==============================================================*/
/* Index: INDEX_3                                               */
/*==============================================================*/
create index INDEX_3 on CALENDARIOS_CURSOS
(
   CVE_INSTRUCTOR
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on CALENDARIOS_CURSOS
(
   CVE_CURSO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on CALENDARIOS_CURSOS
(
   CVE_CALENDARIO
);

/*==============================================================*/
/* Table: CEF_PREGUNTAS                                         */
/*==============================================================*/
create table CEF_PREGUNTAS
(
   CVE_PREGUNTA         int not null,
   CVE_EXAMEN           int,
   primary key (CVE_PREGUNTA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on CEF_PREGUNTAS
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on CEF_PREGUNTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Table: CEF_RESPUESTAS                                        */
/*==============================================================*/
create table CEF_RESPUESTAS
(
   CVE_RESPUESTA        int not null,
   CVE_PREGUNTA         int,
   primary key (CVE_RESPUESTA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on CEF_RESPUESTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on CEF_RESPUESTAS
(
   CVE_RESPUESTA
);

/*==============================================================*/
/* Table: CONTENIDOS_TEMAS                                      */
/*==============================================================*/
create table CONTENIDOS_TEMAS
(
   CVE_CONTENIDO        int not null auto_increment,
   CVE_TEMA             int,
   CVE_TIPO             int,
   VALOR                varchar(50),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_CONTENIDO)
);

/*==============================================================*/
/* Index: INDEX_3                                               */
/*==============================================================*/
create index INDEX_3 on CONTENIDOS_TEMAS
(
   CVE_TIPO
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on CONTENIDOS_TEMAS
(
   CVE_TEMA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on CONTENIDOS_TEMAS
(
   CVE_CONTENIDO
);

/*==============================================================*/
/* Table: CURSOS                                                */
/*==============================================================*/
create table CURSOS
(
   CVE_CURSO            int not null auto_increment,
   NOMBRE               varchar(50),
   DESCRIPCION          varchar(100),
   IMG                  varchar(20),
   VIDEO                varchar(50),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_CURSO)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on CURSOS
(
   NOMBRE
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on CURSOS
(
   CVE_CURSO
);

/*==============================================================*/
/* Table: CURSOS_EXAMEN_FINAL                                   */
/*==============================================================*/
create table CURSOS_EXAMEN_FINAL
(
   CVE_EXAMEN           int not null,
   CVE_CURSO            int,
   primary key (CVE_EXAMEN)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on CURSOS_EXAMEN_FINAL
(
   CVE_CURSO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on CURSOS_EXAMEN_FINAL
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Table: DOMICILIOS                                            */
/*==============================================================*/
create table DOMICILIOS
(
   CVE_DOMICILIO        int not null auto_increment,
   CVE_PERSONA          int,
   CVE_MUNICIPIO        int,
   CVE_ESTADO           int,
   COLONIA              varchar(50),
   CALLE                varchar(50),
   NUMERO               varchar(15),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_DOMICILIO)
);

/*==============================================================*/
/* Index: INDEX_5                                               */
/*==============================================================*/
create index INDEX_5 on DOMICILIOS
(
   COLONIA
);

/*==============================================================*/
/* Index: INDEX_4                                               */
/*==============================================================*/
create index INDEX_4 on DOMICILIOS
(
   CVE_ESTADO
);

/*==============================================================*/
/* Index: INDEX_3                                               */
/*==============================================================*/
create index INDEX_3 on DOMICILIOS
(
   CVE_MUNICIPIO
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on DOMICILIOS
(
   CVE_PERSONA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on DOMICILIOS
(
   CVE_DOMICILIO
);

/*==============================================================*/
/* Table: ESPECIALIZACIONES                                     */
/*==============================================================*/
create table ESPECIALIZACIONES
(
   CVE_ESPECIALIZACION  int not null auto_increment,
   NOMBRE               varchar(50),
   DESCRIPCION          varchar(100),
   IMG                  varchar(20),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_ESPECIALIZACION)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on ESPECIALIZACIONES
(
   NOMBRE
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on ESPECIALIZACIONES
(
   CVE_ESPECIALIZACION
);

/*==============================================================*/
/* Table: ESPECIALIZACIONES_CURSOS                              */
/*==============================================================*/
create table ESPECIALIZACIONES_CURSOS
(
   CVE_ESPECIALIZACION  int not null,
   CVE_CURSO            int not null,
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_ESPECIALIZACION, CVE_CURSO)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on ESPECIALIZACIONES_CURSOS
(
   CVE_CURSO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on ESPECIALIZACIONES_CURSOS
(
   CVE_ESPECIALIZACION
);

/*==============================================================*/
/* Table: ESTADOS                                               */
/*==============================================================*/
create table ESTADOS
(
   CVE_ESTADO           int not null,
   NOMBRE               varchar(20),
   primary key (CVE_ESTADO)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on ESTADOS
(
   CVE_ESTADO
);

/*==============================================================*/
/* Table: EXAMENES                                              */
/*==============================================================*/
create table EXAMENES
(
   CVE_EXAMEN           int not null auto_increment,
   NOMBRE               varchar(50),
   DESCRIPCION          varchar(100),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_EXAMEN)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on EXAMENES
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Table: INSCRIPCIONES                                         */
/*==============================================================*/
create table INSCRIPCIONES
(
   CVE_INSCRIPCION      int not null auto_increment,
   CVE_CALENDARIO       int,
   CVE_PERSONA          int,
   CVE_MODALIDAD        int,
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_INSCRIPCION)
);

/*==============================================================*/
/* Index: INDEX_4                                               */
/*==============================================================*/
create index INDEX_4 on INSCRIPCIONES
(
   CVE_MODALIDAD
);

/*==============================================================*/
/* Index: INDEX_3                                               */
/*==============================================================*/
create index INDEX_3 on INSCRIPCIONES
(
   CVE_PERSONA
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on INSCRIPCIONES
(
   CVE_CALENDARIO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on INSCRIPCIONES
(
   CVE_INSCRIPCION
);

/*==============================================================*/
/* Table: INSTRUCTORES                                          */
/*==============================================================*/
create table INSTRUCTORES
(
   CVE_PERSONA          int not null,
   CEDULA_PROFESIONAL   varchar(20),
   primary key (CVE_PERSONA)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on INSTRUCTORES
(
   CVE_PERSONA
);

/*==============================================================*/
/* Table: MEDIOS_COMUNICACION                                   */
/*==============================================================*/
create table MEDIOS_COMUNICACION
(
   CVE_MEDIO            int not null auto_increment,
   CVE_PERSONA          int,
   CVE_TIPO             int,
   VALOR                varchar(30),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_MEDIO)
);

/*==============================================================*/
/* Index: INDEX_3                                               */
/*==============================================================*/
create index INDEX_3 on MEDIOS_COMUNICACION
(
   CVE_TIPO
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on MEDIOS_COMUNICACION
(
   CVE_PERSONA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on MEDIOS_COMUNICACION
(
   CVE_MEDIO
);

/*==============================================================*/
/* Table: ME_PREGUNTAS                                          */
/*==============================================================*/
create table ME_PREGUNTAS
(
   CVE_PREGUNTA         int not null,
   CVE_EXAMEN           int,
   primary key (CVE_PREGUNTA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on ME_PREGUNTAS
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on ME_PREGUNTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Table: ME_RESPUESTAS                                         */
/*==============================================================*/
create table ME_RESPUESTAS
(
   CVE_RESPUESTA        int not null,
   CVE_PREGUNTA         int,
   primary key (CVE_RESPUESTA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on ME_RESPUESTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on ME_RESPUESTAS
(
   CVE_RESPUESTA
);

/*==============================================================*/
/* Table: MODALIDADES                                           */
/*==============================================================*/
create table MODALIDADES
(
   CVE_MODALIDAD        int not null auto_increment,
   NOMBRE               varchar(50),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_MODALIDAD)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on MODALIDADES
(
   CVE_MODALIDAD
);

/*==============================================================*/
/* Table: MODULOS                                               */
/*==============================================================*/
create table MODULOS
(
   CVE_MODULO           int not null auto_increment,
   CVE_CURSO            int,
   NOMBRE               varchar(50),
   IMG                  varchar(20),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_MODULO)
);

/*==============================================================*/
/* Index: INDEX_3                                               */
/*==============================================================*/
create index INDEX_3 on MODULOS
(
   NOMBRE
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on MODULOS
(
   CVE_CURSO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on MODULOS
(
   CVE_MODULO
);

/*==============================================================*/
/* Table: MODULOS_EXAMENES                                      */
/*==============================================================*/
create table MODULOS_EXAMENES
(
   CVE_EXAMEN           int not null,
   CVE_MODULO           int,
   primary key (CVE_EXAMEN)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on MODULOS_EXAMENES
(
   CVE_MODULO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on MODULOS_EXAMENES
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Table: MUNICIPIOS                                            */
/*==============================================================*/
create table MUNICIPIOS
(
   CVE_MUNICIPIO        int not null,
   CVE_ESTADO           int not null,
   NOMBRE               varchar(20),
   primary key (CVE_MUNICIPIO, CVE_ESTADO)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on MUNICIPIOS
(
   CVE_ESTADO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on MUNICIPIOS
(
   CVE_MUNICIPIO
);

/*==============================================================*/
/* Table: PERSONAS                                              */
/*==============================================================*/
create table PERSONAS
(
   CVE_PERSONA          int not null auto_increment,
   NOMBRE               varchar(50),
   AP_PATERNO           varchar(50),
   AP_MATERNO           varchar(50),
   SEXO                 varchar(1),
   FECHA_NACIMIENTO     datetime,
   FOTO                 varchar(20),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_PERSONA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on PERSONAS
(
   NOMBRE,
   AP_PATERNO,
   AP_MATERNO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on PERSONAS
(
   CVE_PERSONA
);

/*==============================================================*/
/* Table: PREGUNTAS                                             */
/*==============================================================*/
create table PREGUNTAS
(
   CVE_PREGUNTA         int not null auto_increment,
   DESCRIPCION          varchar(100),
   ABIERTA              bit,
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_PREGUNTA)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on PREGUNTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Table: RESPUESTAS                                            */
/*==============================================================*/
create table RESPUESTAS
(
   CVE_RESPUESTA        int not null auto_increment,
   DESCRIPCION          varchar(50),
   CORRECTA             bit,
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_RESPUESTA)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on RESPUESTAS
(
   CVE_RESPUESTA
);

/*==============================================================*/
/* Table: TC_PREGUNTAS                                          */
/*==============================================================*/
create table TC_PREGUNTAS
(
   CVE_PREGUNTA         int not null,
   CVE_EXAMEN           int,
   primary key (CVE_PREGUNTA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on TC_PREGUNTAS
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on TC_PREGUNTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Table: TC_RESPUESTAS                                         */
/*==============================================================*/
create table TC_RESPUESTAS
(
   CVE_RESPUESTA        int not null,
   CVE_PREGUNTA         int,
   primary key (CVE_RESPUESTA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on TC_RESPUESTAS
(
   CVE_PREGUNTA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on TC_RESPUESTAS
(
   CVE_RESPUESTA
);

/*==============================================================*/
/* Table: TEMAS                                                 */
/*==============================================================*/
create table TEMAS
(
   CVE_TEMA             int not null auto_increment,
   CVE_MODULO           int,
   NOMBRE               varchar(50),
   DESCRIPCION          varchar(100),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_TEMA)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on TEMAS
(
   CVE_MODULO
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on TEMAS
(
   CVE_TEMA
);

/*==============================================================*/
/* Table: TEMAS_EXAMENES                                        */
/*==============================================================*/
create table TEMAS_EXAMENES
(
   CVE_EXAMEN           int not null,
   CVE_TEMA             int,
   primary key (CVE_EXAMEN)
);

/*==============================================================*/
/* Index: INDEX_2                                               */
/*==============================================================*/
create index INDEX_2 on TEMAS_EXAMENES
(
   CVE_TEMA
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on TEMAS_EXAMENES
(
   CVE_EXAMEN
);

/*==============================================================*/
/* Table: TIPOS_CONTENIDO                                       */
/*==============================================================*/
create table TIPOS_CONTENIDO
(
   CVE_TIPO             int not null auto_increment,
   NOMBRE               varchar(20),
   IMG                  varchar(20),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_TIPO)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on TIPOS_CONTENIDO
(
   CVE_TIPO
);

/*==============================================================*/
/* Table: TIPOS_MEDIOS_COMUNICACION                             */
/*==============================================================*/
create table TIPOS_MEDIOS_COMUNICACION
(
   CVE_TIPO             int not null auto_increment,
   NOMBRE               varchar(20),
   IMG                  varchar(20),
   FECHA_REG            datetime,
   FECHA_MOD            datetime,
   ACTIVO               bit,
   primary key (CVE_TIPO)
);

/*==============================================================*/
/* Index: INDEX_1                                               */
/*==============================================================*/
create index INDEX_1 on TIPOS_MEDIOS_COMUNICACION
(
   CVE_TIPO
);

alter table ALUMNOS add constraint FK_REFERENCE_2 foreign key (CVE_PERSONA)
      references PERSONAS (CVE_PERSONA) on delete restrict on update restrict;

alter table CALENDARIOS_CURSOS add constraint FK_REFERENCE_10 foreign key (CVE_INSTRUCTOR)
      references INSTRUCTORES (CVE_PERSONA) on delete restrict on update restrict;

alter table CALENDARIOS_CURSOS add constraint FK_REFERENCE_11 foreign key (CVE_CURSO)
      references CURSOS (CVE_CURSO) on delete restrict on update restrict;

alter table CEF_PREGUNTAS add constraint FK_REFERENCE_30 foreign key (CVE_PREGUNTA)
      references PREGUNTAS (CVE_PREGUNTA) on delete restrict on update restrict;

alter table CEF_PREGUNTAS add constraint FK_REFERENCE_31 foreign key (CVE_EXAMEN)
      references CURSOS_EXAMEN_FINAL (CVE_EXAMEN) on delete restrict on update restrict;

alter table CEF_RESPUESTAS add constraint FK_REFERENCE_32 foreign key (CVE_RESPUESTA)
      references RESPUESTAS (CVE_RESPUESTA) on delete restrict on update restrict;

alter table CEF_RESPUESTAS add constraint FK_REFERENCE_33 foreign key (CVE_PREGUNTA)
      references CEF_PREGUNTAS (CVE_PREGUNTA) on delete restrict on update restrict;

alter table CONTENIDOS_TEMAS add constraint FK_REFERENCE_14 foreign key (CVE_TEMA)
      references TEMAS (CVE_TEMA) on delete restrict on update restrict;

alter table CONTENIDOS_TEMAS add constraint FK_REFERENCE_15 foreign key (CVE_TIPO)
      references TIPOS_CONTENIDO (CVE_TIPO) on delete restrict on update restrict;

alter table CURSOS_EXAMEN_FINAL add constraint FK_REFERENCE_28 foreign key (CVE_EXAMEN)
      references EXAMENES (CVE_EXAMEN) on delete restrict on update restrict;

alter table CURSOS_EXAMEN_FINAL add constraint FK_REFERENCE_29 foreign key (CVE_CURSO)
      references CURSOS (CVE_CURSO) on delete restrict on update restrict;

alter table DOMICILIOS add constraint FK_REFERENCE_4 foreign key (CVE_MUNICIPIO, CVE_ESTADO)
      references MUNICIPIOS (CVE_MUNICIPIO, CVE_ESTADO) on delete restrict on update restrict;

alter table DOMICILIOS add constraint FK_REFERENCE_5 foreign key (CVE_PERSONA)
      references PERSONAS (CVE_PERSONA) on delete restrict on update restrict;

alter table ESPECIALIZACIONES_CURSOS add constraint FK_REFERENCE_8 foreign key (CVE_ESPECIALIZACION)
      references ESPECIALIZACIONES (CVE_ESPECIALIZACION) on delete restrict on update restrict;

alter table ESPECIALIZACIONES_CURSOS add constraint FK_REFERENCE_9 foreign key (CVE_CURSO)
      references CURSOS (CVE_CURSO) on delete restrict on update restrict;

alter table INSCRIPCIONES add constraint FK_REFERENCE_25 foreign key (CVE_CALENDARIO)
      references CALENDARIOS_CURSOS (CVE_CALENDARIO) on delete restrict on update restrict;

alter table INSCRIPCIONES add constraint FK_REFERENCE_26 foreign key (CVE_PERSONA)
      references ALUMNOS (CVE_PERSONA) on delete restrict on update restrict;

alter table INSCRIPCIONES add constraint FK_REFERENCE_27 foreign key (CVE_MODALIDAD)
      references MODALIDADES (CVE_MODALIDAD) on delete restrict on update restrict;

alter table INSTRUCTORES add constraint FK_REFERENCE_1 foreign key (CVE_PERSONA)
      references PERSONAS (CVE_PERSONA) on delete restrict on update restrict;

alter table MEDIOS_COMUNICACION add constraint FK_REFERENCE_6 foreign key (CVE_TIPO)
      references TIPOS_MEDIOS_COMUNICACION (CVE_TIPO) on delete restrict on update restrict;

alter table MEDIOS_COMUNICACION add constraint FK_REFERENCE_7 foreign key (CVE_PERSONA)
      references PERSONAS (CVE_PERSONA) on delete restrict on update restrict;

alter table ME_PREGUNTAS add constraint FK_REFERENCE_36 foreign key (CVE_PREGUNTA)
      references PREGUNTAS (CVE_PREGUNTA) on delete restrict on update restrict;

alter table ME_PREGUNTAS add constraint FK_REFERENCE_37 foreign key (CVE_EXAMEN)
      references MODULOS_EXAMENES (CVE_EXAMEN) on delete restrict on update restrict;

alter table ME_RESPUESTAS add constraint FK_REFERENCE_38 foreign key (CVE_RESPUESTA)
      references RESPUESTAS (CVE_RESPUESTA) on delete restrict on update restrict;

alter table ME_RESPUESTAS add constraint FK_REFERENCE_39 foreign key (CVE_PREGUNTA)
      references ME_PREGUNTAS (CVE_PREGUNTA) on delete restrict on update restrict;

alter table MODULOS add constraint FK_REFERENCE_12 foreign key (CVE_CURSO)
      references CURSOS (CVE_CURSO) on delete restrict on update restrict;

alter table MODULOS_EXAMENES add constraint FK_REFERENCE_34 foreign key (CVE_EXAMEN)
      references EXAMENES (CVE_EXAMEN) on delete restrict on update restrict;

alter table MODULOS_EXAMENES add constraint FK_REFERENCE_35 foreign key (CVE_MODULO)
      references MODULOS (CVE_MODULO) on delete restrict on update restrict;

alter table MUNICIPIOS add constraint FK_REFERENCE_3 foreign key (CVE_ESTADO)
      references ESTADOS (CVE_ESTADO) on delete restrict on update restrict;

alter table TC_PREGUNTAS add constraint FK_REFERENCE_42 foreign key (CVE_PREGUNTA)
      references PREGUNTAS (CVE_PREGUNTA) on delete restrict on update restrict;

alter table TC_PREGUNTAS add constraint FK_REFERENCE_43 foreign key (CVE_EXAMEN)
      references TEMAS_EXAMENES (CVE_EXAMEN) on delete restrict on update restrict;

alter table TC_RESPUESTAS add constraint FK_REFERENCE_44 foreign key (CVE_RESPUESTA)
      references RESPUESTAS (CVE_RESPUESTA) on delete restrict on update restrict;

alter table TC_RESPUESTAS add constraint FK_REFERENCE_45 foreign key (CVE_PREGUNTA)
      references TC_PREGUNTAS (CVE_PREGUNTA) on delete restrict on update restrict;

alter table TEMAS add constraint FK_REFERENCE_13 foreign key (CVE_MODULO)
      references MODULOS (CVE_MODULO) on delete restrict on update restrict;

alter table TEMAS_EXAMENES add constraint FK_REFERENCE_40 foreign key (CVE_EXAMEN)
      references EXAMENES (CVE_EXAMEN) on delete restrict on update restrict;

alter table TEMAS_EXAMENES add constraint FK_REFERENCE_41 foreign key (CVE_TEMA)
      references TEMAS (CVE_TEMA) on delete restrict on update restrict;

