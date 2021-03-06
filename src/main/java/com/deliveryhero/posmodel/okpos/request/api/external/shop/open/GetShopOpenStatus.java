package com.deliveryhero.posmodel.okpos.request.api.external.shop.open;

/**
 * [REQUEST]
 * Title: 매장 개점 조회 {Sheet.12}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: GET
 * URL: /api/external/shop/open/{shopCd}
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 매장의 개점 상태를 조회합니다.
 */

public class GetShopOpenStatus {

    private final String shopCd; // 매장 코드 (ex. DT0017)

    public GetShopOpenStatus(String shopCd) {
        this.shopCd = shopCd;
    }

    public String getShopCd() {
        return shopCd;
    }
}
