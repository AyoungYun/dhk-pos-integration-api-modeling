package response.api.external.order.create;

/**
 * [RESPONSE]
 * Title: 주문(결제) 등록
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/create
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 제휴사에서 고객의 주문 내역을 전송해주면 등록하고 POS 내려줍니다.
 *               모바일 주분번호는 최대 14Byte의 숫자로 제휴사에서 유니크하게 생성하시면 됩니다.
 *               배송비가 있는 매장은 배송비 싯가 상품이 등록되어 있어야 합니다. (ASP 어드민 확인 필요)
 *               상품별로 할인금액 설정이 가능합니다.
 */

public class CreateOrder {

    String resultCode; // 성공 결과 코드 (ex. 000)
    String resultMsg; // 결과 메세지 (ex. success)
    Data data;
}
