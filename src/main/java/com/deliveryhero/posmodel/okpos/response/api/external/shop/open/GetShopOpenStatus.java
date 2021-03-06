package com.deliveryhero.posmodel.okpos.response.api.external.shop.open;

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

    private final String resultCode; // 성공 결과 코드 (ex. 000)
    private final String resultMsg; // 결과 메세지 (ex. success)
    private final GetShopOpenStatusData data;

    public GetShopOpenStatus(String resultCode, String resultMsg, GetShopOpenStatusData data) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
        this.data = data;
    }

    public String getResultCode() {
        return resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public GetShopOpenStatusData getData() {
        return data;
    }
}
