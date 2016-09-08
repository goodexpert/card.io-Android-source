package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.179573 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsZH_HANS implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<>();
    private static Map<String, String> mAdapted = new HashMap<>();

    @Override
    public String getName() {
        return "zh-Hans";
    }

    @Override
    public String getAdaptedDisplay(StringKey key, String country) {
        String adaptedKey = key.toString() + "|" + country;
        if (mAdapted.containsKey(adaptedKey)) {
            return mAdapted.get(adaptedKey);
        } else {
            return mDisplay.get(key);
        }
    }

    public LocalizedStringsZH_HANS() {
        mDisplay.put(StringKey.CANCEL, "取消");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_UATP, "UATP");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "完成");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "邮政编码");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "持卡人姓名");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "有效期限：");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/YY");
        mDisplay.put(StringKey.SCAN_GUIDE, "持卡置于此处。\n设备会自动扫描卡。");
        mDisplay.put(StringKey.KEYBOARD, "键盘…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "卡号");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "卡详细信息");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "此设备无法使用摄像头读取卡号。");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "设备摄像头不可用。");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "设备打开摄像头时出现意外错误。");

        // no adapted_translations found
    }
}
