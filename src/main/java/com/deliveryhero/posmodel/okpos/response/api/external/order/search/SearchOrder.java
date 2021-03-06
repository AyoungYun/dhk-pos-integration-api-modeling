package com.deliveryhero.posmodel.okpos.response.api.external.order.search;

import com.deliveryhero.posmodel.okpos.response.api.external.order.action.ActionOrderData;

/**
 * [RESPONSE]
 * Title: 주문(결제) 조회 {Sheet.18}
 * Direction: 제휴사 -> OKPOS(DumAPI)
 * Method: POST
 * URL: /api/external/order/search
 * Contents-Type: JSON(application/json)
 * Charset: UTF-8
 * Descriptions: 주문 내역을 조회합니다.
 */

public class SearchOrder extends ActionOrderData {

    private final String resultCode; // 성공 결과 코드 (ex. 000)
    private final String resultMsg; // 결과 메세지 (ex. success)
    private final SearchOrderData data;

    public SearchOrder(String resultCode, String resultMsg, SearchOrderData data) {
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

    public SearchOrderData getData() {
        return data;
    }
}
