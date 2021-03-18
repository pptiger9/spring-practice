package club.yuanzhongwei.service.impl;

import club.yuanzhongwei.service.RsaService;
import org.apache.tomcat.util.codec.binary.Base64;

import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;

import static club.yuanzhongwei.util.RsaUtil.RSA_ALGORITHM;

/**
 * @Author yuanzhongwei
 * @Date 2021/3/18 18:32
 * @Version 1.0
 * @Description
 */
public class RsaServiceImpl implements RsaService {
    /**
     * @Title: createKeys
     * @Description: 产生RSA公钥和私钥
     * @param keySize
     * @return
     */
    public Map<String, String> createKeys(int keySize){
        //为RSA算法创建一个KeyPairGenerator对象
        KeyPairGenerator kpg;
        try{
            kpg = KeyPairGenerator.getInstance(RSA_ALGORITHM);
        }catch(NoSuchAlgorithmException e){
            throw new IllegalArgumentException("No such algorithm-->[" + RSA_ALGORITHM + "]");
        }

        //初始化KeyPairGenerator对象,密钥长度
        kpg.initialize(keySize);
        //生成密匙对
        KeyPair keyPair = kpg.generateKeyPair();
        //得到公钥
        Key publicKey = keyPair.getPublic();
        String publicKeyStr = Base64.encodeBase64URLSafeString(publicKey.getEncoded());
        //得到私钥
        Key privateKey = keyPair.getPrivate();
        String privateKeyStr = Base64.encodeBase64URLSafeString(privateKey.getEncoded());
        Map<String, String> keyPairMap = new HashMap<String, String>();
        keyPairMap.put("publicKey", publicKeyStr);
        keyPairMap.put("privateKey", privateKeyStr);
        RSAPublicKey rsp= (RSAPublicKey)keyPair.getPublic();
        BigInteger bit= rsp.getModulus();
        byte[] b=bit.toByteArray();
        byte[] deBase64Value=Base64.encodeBase64(b);
        String retValue= new String(deBase64Value);
        keyPairMap.put("model",retValue);

        return keyPairMap;
    }


}
