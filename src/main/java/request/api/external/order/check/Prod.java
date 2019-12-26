package request.api.external.order.check;

/**
 * [REQUEST]
 * USE
 *  - CheckOrderProd (주문 상품 확인)
 */

public class Prod {

    String prodCd; // 상품 코드 (ex. 000001)
    String prodNm; // 상품명 - 선택: 값이 없으면 상품명 일치 여부 체크 안함 (ex. 간짜장)
    Option option; // 상품 속성
    Side sides; // 사이드(선택) 상품
}
