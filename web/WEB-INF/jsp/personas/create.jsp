<%-- 
    Document   : create
    Created on : 03-nov-2015, 13:09:12
    Author     : Weiss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Persona(s)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath}/img/favicon.png"/>
        <link href="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <sj:head/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <s:a action="index" namespace="/base/personas" cssClass="btn btn-success">Regresar</s:a>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 col-md-offset-3">
                        <div class="page-header">
                            <h1 id="forms">Persona(s)</h1>
                        </div>
                    </div>
                </div>
                <div class="row">
                <s:if test="hasActionErrors()">
                    <div class="col-md-6 col-md-offset-3">
                        <div class="alert alert-dismissible alert-success">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            <p><strong>Éxito!</strong><p>
                        </div>
                        <div id="source-button" class="btn btn-primary btn-xs" style="display: none;">&lt; &gt;</div>
                    </div>
                </s:if>
                <s:if test="hasActionMessages()">
                    <div class="col-md-6 col-md-offset-3" >
                        <div class="alert alert-dismissible alert-danger">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            <p><strong>Error</strong></p>
                        </div>
                    </div>
                </s:if>
            </div>
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="well bs-component">
                        <s:form action="save" namespace="/base/personas" method="post" name="frm_captura" id="frm_captura" class="form-horizontal">
                            <fieldset>
                                <legend>Captura</legend>
                                <div class="form-group">
                                    <label for="cve_persona" class="col-lg-2 control-label">ID Persona</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="cve_persona" name="cve_persona" placeholder="ID Persona" readonly tabindex="1">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="nombre" class="col-lg-2 control-label">Nombre</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" tabindex="2">                                       
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ap_paterno" class="col-lg-2 control-label">Apellido paterno</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="ap_paterno" name="ap_paterno" placeholder="Apellido paterno" tabindex="3">                                       
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ap_materno" class="col-lg-2 control-label">Apellido materno</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="ap_materno" name="ap_materno" placeholder="Apellido materno" tabindex="4">                                       
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="fecha_nacimiento">Fecha de nacimiento:</label>
                                    <sj:datepicker name="fecha_nacimiento" id="fecha_nacimiento" label="Select a Date" displayFormat="dd/mm/yy" readonly="true" tabindex="5" size="20" maxlength="17" changeMonth="true" changeYear="true" yearRange="-100:+0"/>
                                </div>
                                <div class="form-group">
                                    <s:radio label="Sexo" name="sexo" list="#{'H':'Hombre','M':'Mujer'}" tabindex="6"/>
                                </div>
                                <div class="checkbox">
                                        <s:checkbox name="activo" id="activo" fieldValue="true" label="Activo" tabindex="7" />
                                </div>
                                <div class="form-group">
                                    <div class="col-lg-12">
                                        <s:submit cssClass="btn btn-primary" value="Enviar" tabindex="8"></s:submit> 
                                        </div>
                                    </div>
                                </fieldset>
                        </s:form>
                    </div>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    </body>
</html>