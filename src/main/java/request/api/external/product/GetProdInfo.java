package request.api.external.product;

/**
 * [REQUEST]
 * Title: 상품 정보 조회 (단품)
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/product/{shopCd}/{prodCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 입력한 상품 코드의 대한 상품 정보를 조회합니다.
 */

public class GetProdInfo {

    String shopCd; // 매장 코드 (ex. DT0017)
    String prodCd; // 상품 코드 (ex. 000109)
}
