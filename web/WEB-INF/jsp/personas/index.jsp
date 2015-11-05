<%-- 
    Document   : index
    Created on : 03-nov-2015, 14:17:45
    Author     : Weiss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Persona(s)</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href="${pageContext.request.contextPath}/img/favicon.png"/>
        <link href="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-10 col-md-offset-2">
                    <h1>Persona(s)</h1>
                    <s:a action="create" namespace="/base/personas" cssClass="btn btn-success"><span class="glyphicon glyphicon-user"></span> Crear Persona</s:a>
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
                                    <th>Activo</th>
                                    <th colspan="3">Actions</th>
                                </tr>
                            </thead>
                            <tbody>
                                <s:iterator value="personas" status="rowstatus">
                                    <tr>
                                        <td><s:property value="cve_persona" /></td>
                                        <td><s:property value="nombre" /> <s:property value="ap_paterno" /> <s:property value="ap_materno" /></td>
                                        <td><s:property value="sexo"/></td>
                                        <td><s:property value="fecha_nacimiento"/></td>
                                        <td><s:property value="fecha_reg" /></td>
                                        <td><s:if test="activo"><span class="glyphicon glyphicon-ok-circle"></span></s:if><s:else><span class="glyphicon glyphicon-remove-circle"></span></s:else></td>
                                        <td>
                                            <s:if test="foto == null">
                                                <s:url id="form_upload_url" action="form_upload" namespace="/base/personas" var="form_upload_url"><s:param name="cve_persona" value="%{cve_persona}"></s:param></s:url>
                                                <a href="javascript:void(0);" data-toggle="modal" data-remote="<s:property value="#form_upload_url"/>" data-target="#mUploadFile" class="btn btn-success"><span class="glyphicon glyphicon-cloud-upload"></span> Subir foto</a>
                                            </s:if>
                                            <s:else>
                                                <span class="glyphicon glyphicon-picture" data-toggle="popover" data-title="<s:property value="nombre_completo"/>" data-content="<img src='${pageContext.request.contextPath}<s:property value="foto"/>' alt='<s:property value="nombre_completo"/>' class='img-responsive'/>"></span>
                                                <br/>
                                                <br/>
                                                <s:url id="form_upload_url" action="form_upload" namespace="/base/personas" var="form_upload_url"><s:param name="cve_persona" value="%{cve_persona}"></s:param></s:url>
                                                <a href="javascript:void(0);" data-toggle="modal" data-remote="<s:property value="#form_upload_url"/>" data-target="#mUploadFile" class="btn btn-success"><span class="glyphicon glyphicon-refresh"></span> <span class="glyphicon glyphicon-cloud-upload"></span> Cambiar foto</a>
                                            </s:else>
                                        </td>
                                        <td>
                                            <s:url id="show_url" action="show" namespace="/base/personas">
                                                <s:param name="cve_persona" value="%{cve_persona}"></s:param>
                                            </s:url>
                                        <s:a href="%{show_url}" cssClass="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span> Show </s:a>
                                            </td>
                                            <td>
                                            <s:url id="delete_url" action="delete" namespace="/base/personas">
                                                <s:param name="cve_persona" value="%{cve_persona}"></s:param>
                                            </s:url>
                                            <s:a href="%{delete_url}" cssClass="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Delete </s:a>
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
            <div class="row">
                <div class="col-md-12">
                    <div class="modal fade" id="mUploadFile" tabindex="-1" role="dialog" aria-labelledby="mUploadFileLabel" aria-hidden="true">
                        <div class="modal-dialog">
                            <div class="modal-content"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="${pageContext.request.contextPath}/js/jQuery/jquery-2.1.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/twbs/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                
                $('[data-toggle="popover"]').popover({placement: 'top', html: true, trigger: 'hover'});
                
                /* Limpiar la ventana modal para volver a usar*/
                $('body').on('hidden.bs.modal', '.modal', function () {
                    $(this).removeData('bs.modal');
                });

            });
        </script>
    </body>
</html>
