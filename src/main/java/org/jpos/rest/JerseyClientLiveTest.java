//package org.jpos.rest;
//
//
//import Persons;
//
//import javax.net.ssl.HttpsURLConnection;
//import javax.net.ssl.SSLContext;
//import javax.net.ssl.TrustManager;
//import javax.net.ssl.X509TrustManager;
//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;
//import javax.ws.rs.client.Entity;
//import javax.ws.rs.client.Invocation;
//import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//import java.security.SecureRandom;
//import java.security.cert.X509Certificate;
//
//public class JerseyClientLiveTest {
//
//    public static void main(String[] args) {
////        getUsers();
//
//         createUser();
//
//    }
//
//    private static void createUser() {
//        Client client = ClientBuilder.newClient();
//        WebTarget webTarget = client.target("http://localhost:8085").path("Persons").path("personadd");
//
//        Persons person = new Persons();
//
//        person.setLastname("Ali");
//        person.setName("Ahmadi");
//
//
//        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
//        Entity<?> entity = Entity.entity(person, MediaType.APPLICATION_JSON);
//        System.out.println(entity);
//        Response response = invocationBuilder.post(entity);
//        System.out.println(response.getStatus());
//        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+response.readEntity(String.class)+"****************************");
//    }
//
//
//
//    private static void getUsers() {
//
//
//        // Create a trust manager that does not validate certificate chains
//        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager(){
//            public X509Certificate[] getAcceptedIssuers(){return null;}
//            public void checkClientTrusted(X509Certificate[] certs, String authType){}
//            public void checkServerTrusted(X509Certificate[] certs, String authType){}
//        }};
//
//// Install the all-trusting trust manager
//        try {
//            SSLContext sc = SSLContext.getInstance("TLS");
//            sc.init(null, trustAllCerts, new SecureRandom());
//            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
//        } catch (Exception e) {
//            ;
//        }
//        Client client = ClientBuilder.newClient();
//
//        String entity = client.target("http://192.168.43.96:5000").path("Shop").path("CheckPayment").path("zXCE8nzCH47PGtguxRad0wQi+HVM+F8Jdp7RNX6a3+gMwMe+XBRhESZ+vYFAegDM").request(MediaType.APPLICATION_JSON).header("some-header", "true").get(String.class);
//
//        System.out.println(entity);
//    }
//
//
//
//
//    }
//
//
//
//
//
//
