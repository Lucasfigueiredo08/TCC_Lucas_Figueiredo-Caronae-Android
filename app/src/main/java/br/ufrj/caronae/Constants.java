package br.ufrj.caronae;

public class Constants {

    public static final String BUILD_TYPE                   = "dev";
    public static final String API_BASE_URL                 = BUILD_TYPE.equals("prod")?"https://10.0.2.2:8000/":"http://10.0.2.2:8000/";
    public static final String CARONAE_URL_BASE             = BUILD_TYPE.equals("prod")?"https/://10.0.2.2:8000/":"http://10.0.2.2:8000/";
    public static final String SHARE_LINK                   = CARONAE_URL_BASE + "carona/";

}