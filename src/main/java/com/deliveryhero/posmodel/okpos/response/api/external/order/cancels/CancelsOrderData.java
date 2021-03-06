package com.deliveryhero.posmodel.okpos.response.api.external.order.cancels;

/**
 * [RESPONSE]
 * USE
 *  - CancelOrder (주문(결제) 취소) {Sheet.17}
 */

public class CancelsOrderData {

    private final String shopCd; // 매장 코드 (ex. DT0017)
    private final String mobileOrderFg; // 모바일 주문 구분 - 03: 덤, 04: 요기요, 05: 더 페이 (ex. 05)
    private final String mobileOrderNo; // 모바일 주문 번호 (ex. 99999999999999)
    private final String mobileRegNo; // 모바일 주문 접수 번호 - 주문 취소 시 필요 (ex. 0001)
    private final String stepCd; // 스탭 코드 -
    // 000: 접수 대기, 100: 접수, 200: 조리중, 300: 픽업 준비,
    // 500: 배송 요청, 550: 배송중, 700: 완료, 900: 취소 (ex. 900)
    private final String stepNm; // 스탭명 (ex. 취소)

    public CancelsOrderData(String shopCd, String mobileOrderFg, String mobileOrderNo, String mobileRegNo,
                            String stepCd, String stepNm) {
        this.shopCd = shopCd;
        this.mobileOrderFg = mobileOrderFg;
        this.mobileOrderNo = mobileOrderNo;
        this.mobileRegNo = mobileRegNo;
        this.stepCd = stepCd;
        this.stepNm = stepNm;
    }

    public String getShopCd() {
        return shopCd;
    }

    public String getMobileOrderFg() {
        return mobileOrderFg;
    }

    public String getMobileOrderNo() {
        return mobileOrderNo;
    }

    public String getMobileRegNo() {
        return mobileRegNo;
    }

    public String getStepCd() {
        return stepCd;
    }

    public String getStepNm() {
        return stepNm;
    }
}
