package com.clr.common.security.sm4;

import com.clr.common.file.FileIOHandler;

public class SM4EncryptHandler implements FileIOHandler {
    private SM4Tools sm4;

    public SM4EncryptHandler(){
        sm4 = new SM4Tools();
        sm4.setHexString(false);
    }

    public void setKey(String key){
        sm4.setSecretKey(key);
    }

    public void before() {

    }

    public byte[] process(byte[] buffer) throws Exception {
        //ecb模式加密
        byte[] enc = sm4.encryptData_ECB(buffer);
        return enc;
    }

    public void after() {

    }
}
