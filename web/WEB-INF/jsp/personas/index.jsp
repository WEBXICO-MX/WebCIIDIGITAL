<%-- 
    Document   : index
    Created on : 03-nov-2015, 14:17:45
    Author     : Weiss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Persona(s)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-10 col-md-offset-2">
                    <h1>Persona(s)</h1>
                    <s:a action="create" namespace="/base/personas" cssClass="btn btn-success">Crear Persona</s:a>
                    <hr>
                    <s:if test="personas.size > 0">
                    <table class="table table-striped table-bordered table-hover">
                        <thead>
                            <tr class="bg-info">
                                <th>Id</th>
                                <th>Nombre completo</th>
                                <th>Sexo</th>
                                <th>Fecha de nacimiento</th>
                                <th>Fecha de registro</th>
                                <th colspan="3">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <s:iterator value="personas" status="rowstatus">
                            <tr>
                                <td><s:property value="cve_persona" /></td>
                                <td><s:property value="nombre" /> <s:property value="ap_paterno" /> <s:property value="ap_materno" /></td>
                                <td><s:if test="sexo == true">Masculino</s:if><s:else>Femenino</s:else></td>
                                <td><s:property value="fecha_nacimiento"/></td>
                                <td><s:property value="fecha_reg" /></td>
                                <td><s:a action="show" namespace="/base/personas" cssClass="btn btn-primary">Read</s:a></td>
                                <td><s:a action="edits" namespace="/base/personas" cssClass="btn btn-warning">Update</s:a></td>
                                <td><s:form action="delete" namespace="/base/personas">
                                        <s:submit cssClass="btn btn-danger" value="Delete"></s:submit> 
                                    </s:form>
                                </td>
                            </tr>
                            </s:iterator>

                        </tbody>

                    </table>
                    </s:if>
                    <s:else>
                        <h2>No hay elementos para mostrar</h2>
                    </s:else>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jQuery/jquery-2.1.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
    </body>
</html>
