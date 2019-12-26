package response.api.external.order.search;

/**
 * [RESPONSE]
 * Title: 주문(결제) 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/search
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 내역을 조회합니다.
 */

public class SearchOrder {

    String resultCode; // 성공 결과 코드 (ex. 000)
    String resultMsg; // 결과 메세지 (ex. success)
    Data data;
}
