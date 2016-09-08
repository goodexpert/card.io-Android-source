package io.card.payment.i18n.locales;

import java.util.HashMap;
import java.util.Map;

import io.card.payment.i18n.StringKey;
import io.card.payment.i18n.SupportedLocale;

// Class autogenerated!  Do not modify.
// Generated on 2014-12-10 11:29:25.149443 via script:
// /Users/twhipple/Documents/buffalo/lib-i18n/i18n/script/generate_android_i18n.py -java_src_path src/ -java_gen_path gen/ -stringkey_path io/card/payment/i18n/ -strings_path ../strings/projects/card.io/strings/ --strict

public class LocalizedStringsIT implements SupportedLocale<StringKey> {

    private static Map<StringKey, String> mDisplay = new HashMap<>();
    private static Map<String, String> mAdapted = new HashMap<>();

    @Override
    public String getName() {
        return "it";
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

    public LocalizedStringsIT() {
        mDisplay.put(StringKey.CANCEL, "Annulla");
        mDisplay.put(StringKey.CARDTYPE_AMERICANEXPRESS, "American Express");
        mDisplay.put(StringKey.CARDTYPE_DISCOVER, "Discover");
        mDisplay.put(StringKey.CARDTYPE_JCB, "JCB");
        mDisplay.put(StringKey.CARDTYPE_MASTERCARD, "MasterCard");
        mDisplay.put(StringKey.CARDTYPE_UATP, "UATP");
        mDisplay.put(StringKey.CARDTYPE_VISA, "Visa");
        mDisplay.put(StringKey.DONE, "OK");
        mDisplay.put(StringKey.ENTRY_CVV, "CVV");
        mDisplay.put(StringKey.ENTRY_POSTAL_CODE, "CAP");
        mDisplay.put(StringKey.ENTRY_CARDHOLDER_NAME, "Titolare della carta");
        mDisplay.put(StringKey.ENTRY_EXPIRES, "Scadenza");
        mDisplay.put(StringKey.EXPIRES_PLACEHOLDER, "MM/AA");
        mDisplay.put(StringKey.SCAN_GUIDE, "Inquadra la carta.\nLa scansione è automatica.");
        mDisplay.put(StringKey.KEYBOARD, "Tastiera…");
        mDisplay.put(StringKey.ENTRY_CARD_NUMBER, "Numero di carta");
        mDisplay.put(StringKey.MANUAL_ENTRY_TITLE, "Dati carta");
        mDisplay.put(StringKey.ERROR_NO_DEVICE_SUPPORT, "La fotocamera non legge il numero di carta.");
        mDisplay.put(StringKey.ERROR_CAMERA_CONNECT_FAIL, "Fotocamera non disponibile.");
        mDisplay.put(StringKey.ERROR_CAMERA_UNEXPECTED_FAIL, "Errore inatteso nell’apertura della fotocamera.");

        // no adapted_translations found
    }
}
