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
                        <form id="frm_captura" name="frm_captura" class="form-horizontal" method="post">
                            <fieldset>
                                <legend>Captura</legend>
                                <div class="form-group">
                                    <label for="cve_persona" class="col-lg-2 control-label">ID Persona</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="cve_persona" name="cve_persona" placeholder="ID Persona" readonly>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="nombre" class="col-lg-2 control-label">Nombre</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">                                       
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ap_paterno" class="col-lg-2 control-label">Apellido paterno</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="ap_paterno" name="ap_paterno" placeholder="Apellido paterno">                                       
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ap_materno" class="col-lg-2 control-label">Apellido materno</label>
                                    <div class="col-lg-10">
                                        <input type="text" class="form-control" id="ap_materno" name="ap_materno" placeholder="Apellido materno">                                       
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="txtFechaNacimiento">Fecha de nacimiento:</label>
                                    <sj:datepicker name="registro.fecha_nacimiento" id="txtFechaNacimiento" label="Select a Date" displayFormat="dd/mm/yy" readonly="true" tabindex="7" size="20" maxlength="17" changeMonth="true" changeYear="true" yearRange="-100:+0"/>
                                </div>
                                <div class="form-group">
                                    <s:radio label="Sexo" name="sexo" list="#{'M':'Hombre','F':'Mujer'}" tabindex="8"/>
                                </div>
                                <div class="checkbox">
                                    <label>
                                        <input type="checkbox" id="cbxActivo" name="cbxActivo"> Activo
                                    </label>
                                </div>
                                <div class="form-group">
                                    <div class="col-lg-12">
                                         <s:submit cssClass="btn btn-primary" value="Enviar"></s:submit> 
                                    </div>
                                </div>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    </body>
</html>
