package com.yxc.websocket.rsa;

import android.util.Log;

import org.json.JSONObject;

public class RSATest {
    private static final String DEFAULT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDosvH1gCpQTTZLXGMcSeeqDjWuDVY0+Aab1VbtGJqWdkPd32D4hEUwFjVJ+FJbq7UpvFFDQ3k2y2n/1rzxWapFk/e+BNNCSKP9e6+Of1SLs83So27dgiAeAKmdQoxwfXrgvP1/QRMJJ0i6m3CRRyTlXO+cMGbYqRv1iTT9uaRolQIDAQAB";
    private static final String DEFAULT_PRIVATE_KEY = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAOiy8fWAKlBNNktcYxxJ56oONa4NVjT4BpvVVu0YmpZ2Q93fYPiERTAWNUn4UlurtSm8UUNDeTbLaf/WvPFZqkWT974E00JIo/17r45/VIuzzdKjbt2CIB4AqZ1CjHB9euC8/X9BEwknSLqbcJFHJOVc75wwZtipG/WJNP25pGiVAgMBAAECgYEAv4PXY8hyCtkhYHDPGU8yHWHIiFFtq/ad6c9x1X00bbU0Mf1Q3/hswSDmBtUbY1s0pP7amtODhbdwrCFeK/0yBrOegb2fQeJs/QL6/y4/DPzRB21k9N8cQjgmv5tQb72fwdY8nDROXnzKQceMo6b/xkWaIhvhdUq6nCqPvoIGRIECQQD+lOKTQk769G9BQd7HW+2H2NioPbxri+V27daC1M5uBfBj8Wt3NDJ5IyMvOHz5yTlm8FsE2Zz1/aFdLJ/Rv4IRAkEA6f7ZOMcuxlRsAiN708+r3q3sxAyBood+qAJ1MKhOrdR94RcAPUkcjFTZ8j1v0eclj6+w2RChcpb5Ath93ia6RQJBAP3b6x+axHUcn4A8NfEn6vFGu6zwet3nT3bLbddia0JtK6wNhfMFGruO3TvuITlXfaT3UlvAv/LP6kOmBuw6AnECQQDR3r29awjM4ZMuJ908EJs6Ugx1mjH7MEOtNOcfCRXoWxm79QFF9nkgdEo2NlxAi2zo/s9DIONs/3O/1aSux1VxAkBkkOdc0f2ogWZHqtCYfVfYjwbMvlW/6lnbq0B76V1SVqogoSubwnF7EUBdmqpzWmzqM4xURBh9QqDnUUfBzPMW";

    public static void main(String[] args) throws Exception {
        test();
        // testSign();
//		encodeRequest(null);
    }

    public static void test() throws Exception {
//        System.err.println("公钥加密——私钥解密");
//        String source = "这是一行没有任何意义的文字，你看完了等于没看士大夫反反复复反反复复反反复复反反复复多发时段发生的发生的发生的发生的发生的发生的发生的发生的发生的发生的发生的发生的发生的发生的发生，不是吗？这是一行没有任何意义的文字，asdfsdafsdafsfasdfdfsa你看完了等于没看，不是吗？这是一行没有任何意义的文字，你看完了等于没看，不是吗？这是一行没有任何意义的文字，你看完了等于没看，不是吗？这是一行没有任何意义的文字，你看完了等于没看，不是吗？这是一行没有任何意义的文字，你看完了等于没看，不是吗？这是一行没有任何意义的文字，你看完了等于没看，不是吗？";
//        System.out.println("\r加密前文字：\r\n" + source);
//        byte[] data = source.getBytes();
//        byte[] encodedData = RSAUtils.encryptByPublicKey(data, DEFAULT_PUBLIC_KEY);
//        System.out.println("加密后文字：\r\n" + Base64Utils.encode(encodedData));
//
//        byte[] decodedData = RSAUtils.decryptByPrivateKey(encodedData,
//                DEFAULT_PRIVATE_KEY);
//        String target = new String(decodedData);
//        System.out.println("解密后文字: \r\n" + target);
//
//        String encrypt = AESUtils.encrypt("123654", "{\"msgType\":2,\"pageNo\":1,\"pageSize\":10,\"sessionId\":4}");
//        Log.e("TAG", encrypt);
//        String decrypt = AESUtils.decrypt("123654", encrypt);
//        Log.e("TAG", decrypt);

        String sss = AESUtils.decrypt("123456789111", "wKbw9eL7wduMQDW57qiwQ+hhrBBgRIpxT9aaW1p1dSuVRYFMwAQ/Gb17PKc7IIiPB+1EzvnG0K3q1hn6zl4nwQ==");
        Log.e("TAG", " " + sss);
    }

    public static void encodeRequest(JSONObject json) throws Exception {
        JSONObject jsonObject = new JSONObject();
        for (int i = 0; i < 1000; i++) {
            jsonObject.put(i + "", "value" + i);
        }
        byte[] data = jsonObject.toString().getBytes();
        byte[] encodedData = RSAUtils.encryptByPublicKey(data, DEFAULT_PUBLIC_KEY);
        byte[] decodedData = RSAUtils.decryptByPrivateKey(encodedData,
                DEFAULT_PRIVATE_KEY);
        String target = new String(decodedData);
    }


}

	
	
