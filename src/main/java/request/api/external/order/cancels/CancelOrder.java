package request.api.external.order.cancels;

/**
 * [REQUEST]
 * Title: 주문(결제) 취소
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/cancels
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 고객의 주문 취소를 처리합니다.
 *               매장에서 접수한 주문은 취소가 가능하지 않습니다.
 */

public class CancelOrder {

    String shopCd; // 매장 코드 (ex. DT0017)
    String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    String mobileRegNo; // 모바일 주문 접수 번호 - 주문 등록 시에 리턴 받은 접수 번호 입력 (ex. 0001)
}
