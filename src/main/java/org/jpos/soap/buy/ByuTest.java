//package org.jpos.soap.buy;
//
//
//import org.datacontract.schemas._2004._07.localservices.Result;
//import org.tempuri.IBuy;
//
//import javax.xml.namespace.QName;
//import javax.xml.ws.Service;
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
//import java.net.URL;
//
//
//public class ByuTest {
//    public static void main(String[] args) throws Exception {
//
//        Authenticator myAuth = new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication("h@y.com", "1234567890H.m".toCharArray());
//            }
//        };
//        Authenticator.setDefault(myAuth);
//
//        //hamoon
//        URL url = new URL("http://192.168.1.52:8090/Buy?wsdl");
//
//        QName qName = new QName("http://tempuri.org/", "Buy");
//        Service service = Service.create(url, qName);
//        IBuy buy = service.getPort(IBuy.class);
//        Result result = buy.buyItem("1ddb3a33-af31-4a05-9af4-fac9b120c48c", "BHiORu1YxYVVdJ2P6CwwbwW8lQEdj50ZFKuTBPb2mYaoGj7TQyP/TynWfroBrEDe");
//        String responseValue = result.getDesc().getValue();
//        boolean responseSuccess = result.isSuccess();
//
//
//        System.out.println(result);
//        System.out.println(responseValue);
//        System.out.println("---");
//
//    }
//}
