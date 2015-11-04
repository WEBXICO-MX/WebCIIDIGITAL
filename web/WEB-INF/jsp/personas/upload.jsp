<%-- 
    Document   : upload
    Created on : 04-nov-2015, 14:48:48
    Author     : Weiss
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="modal-header">
    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
    <h4 class="modal-title">Subir foto</h4>
</div>
<div class="modal-body">
    <div class="te">
        Nombre: <s:property value="nombre_completo"/><br/><br/>
        <s:form action="upload" namespace="/base/personas" method="post" enctype="multipart/form-data" >
            <s:file name="fileUpload" label="Select a File to upload" size="40" />
            <s:hidden name="cve_persona" value="%{cve_persona}" />
            <br/>
            <s:submit value="Upload" name="submit" cssClass="btn btn-lg btn-primary"/>
        </s:form>
        <br/>
        <br/>
        <s:if test="hasActionErrors()">
            <div class="alert alert-danger"><s:actionerror/></div>
        </s:if>
    </div>
</div> 
<div class="modal-footer">
    <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
</div>