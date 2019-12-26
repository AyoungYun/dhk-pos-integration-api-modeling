package request.api.external.shop.status;

/**
 * [REQUEST]
 * Title: 매장 상태 조회
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/shop/status/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장 POS의 개점 상태를 조회합니다.
 */

public class GetShopStatus {

    String shopCd; // 매장 코드 (ex. DT0017)
}
