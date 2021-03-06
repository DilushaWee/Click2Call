
package ws.cg.dialog.lk;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import lk.dialog.cg.ws.messages.jaws.ChargeBySpecialDebitRequest;
import lk.dialog.cg.ws.messages.jaws.ChargeBySpecialDebitResponse;
import lk.dialog.cg.ws.messages.jaws.ChargedToBillRequest;
import lk.dialog.cg.ws.messages.jaws.ChargedToBillResponse;
import lk.dialog.cg.ws.messages.jaws.CreditCheckRequest;
import lk.dialog.cg.ws.messages.jaws.CreditCheckResponse;
import lk.dialog.cg.ws.messages.jaws.PayByCardRequest;
import lk.dialog.cg.ws.messages.jaws.PayByCardResponse;
import lk.dialog.cg.ws.messages.jaws.PayByCashRequest;
import lk.dialog.cg.ws.messages.jaws.PayByCashResponse;
import lk.dialog.cg.ws.messages.jaws.PayByDirectDebitRequest;
import lk.dialog.cg.ws.messages.jaws.PayByDirectDebitResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CGWebServiceInterface", targetNamespace = "urn:lk.dialog.cg.ws")
@XmlSeeAlso({
    lk.dialog.cg.ws.messages.jaws.ObjectFactory.class,
    types.ws.cg.dialog.lk.ObjectFactory.class
})
public interface CGWebServiceInterface {


    /**
     * 
     * @param chargeBySpecialDebitRequest1
     * @return
     *     returns lk.dialog.cg.ws.messages.jaws.ChargeBySpecialDebitResponse
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "chargeBySpecialDebit", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.ChargeBySpecialDebit")
    @ResponseWrapper(localName = "chargeBySpecialDebitResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.ChargeBySpecialDebitResponse")
    public ChargeBySpecialDebitResponse chargeBySpecialDebit(
        @WebParam(name = "ChargeBySpecialDebitRequest_1", targetNamespace = "")
        ChargeBySpecialDebitRequest chargeBySpecialDebitRequest1);

    /**
     * 
     * @param chargedToBillRequest1
     * @return
     *     returns lk.dialog.cg.ws.messages.jaws.ChargedToBillResponse
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "chargeToBill", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.ChargeToBill")
    @ResponseWrapper(localName = "chargeToBillResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.ChargeToBillResponse")
    public ChargedToBillResponse chargeToBill(
        @WebParam(name = "ChargedToBillRequest_1", targetNamespace = "")
        ChargedToBillRequest chargedToBillRequest1);

    /**
     * 
     * @param string1
     * @param arrayOfbyte2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "getSessionKey", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.GetSessionKey")
    @ResponseWrapper(localName = "getSessionKeyResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.GetSessionKeyResponse")
    public String getSessionKey(
        @WebParam(name = "String_1", targetNamespace = "")
        String string1,
        @WebParam(name = "arrayOfbyte_2", targetNamespace = "")
        byte[] arrayOfbyte2);

    /**
     * 
     * @param payByCardRequest1
     * @return
     *     returns lk.dialog.cg.ws.messages.jaws.PayByCardResponse
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "payByCard", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PayByCard")
    @ResponseWrapper(localName = "payByCardResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PayByCardResponse")
    public PayByCardResponse payByCard(
        @WebParam(name = "PayByCardRequest_1", targetNamespace = "")
        PayByCardRequest payByCardRequest1);

    /**
     * 
     * @param payByCashRequest1
     * @return
     *     returns lk.dialog.cg.ws.messages.jaws.PayByCashResponse
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "payByCash", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PayByCash")
    @ResponseWrapper(localName = "payByCashResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PayByCashResponse")
    public PayByCashResponse payByCash(
        @WebParam(name = "PayByCashRequest_1", targetNamespace = "")
        PayByCashRequest payByCashRequest1);

    /**
     * 
     * @param payByDirectDebitRequest1
     * @return
     *     returns lk.dialog.cg.ws.messages.jaws.PayByDirectDebitResponse
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "payByDirectDebit", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PayByDirectDebit")
    @ResponseWrapper(localName = "payByDirectDebitResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PayByDirectDebitResponse")
    public PayByDirectDebitResponse payByDirectDebit(
        @WebParam(name = "PayByDirectDebitRequest_1", targetNamespace = "")
        PayByDirectDebitRequest payByDirectDebitRequest1);

    /**
     * 
     * @param creditCheckRequest1
     * @return
     *     returns lk.dialog.cg.ws.messages.jaws.CreditCheckResponse
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "performCreditCheck", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PerformCreditCheck")
    @ResponseWrapper(localName = "performCreditCheckResponse", targetNamespace = "urn:lk.dialog.cg.ws.types", className = "types.ws.cg.dialog.lk.PerformCreditCheckResponse")
    public CreditCheckResponse performCreditCheck(
        @WebParam(name = "CreditCheckRequest_1", targetNamespace = "")
        CreditCheckRequest creditCheckRequest1);

}
