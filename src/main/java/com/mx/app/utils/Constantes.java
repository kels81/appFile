/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.app.utils;

import com.vaadin.server.VaadinRequest;
import com.vaadin.util.CurrentInstance;

/**
 *
 * @author Edrd
 */
public class Constantes {

    //CARPETA DE ARCHIVOS PC
    public static final VaadinRequest VAADIN_REQUEST = CurrentInstance.get(VaadinRequest.class);
    public static final String ROOT_PATH = VAADIN_REQUEST.getService().getBaseDirectory().getAbsolutePath();       //CARPETA PROYECTO CONTENEDORA  Find the application directory
    public static final String ALL_FILES = ROOT_PATH.concat("\\Archivos");
    public static final String FAVOURITES = ROOT_PATH.concat("\\Favoritos");
    public static final String BIN = ROOT_PATH.concat("\\Papelera");
    public static final String SEPARADOR = "\\\\";
    public static final String ROOT_DIRECTORY = getRootDirectory();
    public static final String PATH_BASE = getPathBase();

    private static String getRootDirectory() {
        String[] directories = ALL_FILES.split(SEPARADOR);
        return directories[directories.length - 1];
    }
    
    private static String getPathBase() {
        return ALL_FILES.substring(0, ALL_FILES.indexOf(ROOT_DIRECTORY));
    }

}
