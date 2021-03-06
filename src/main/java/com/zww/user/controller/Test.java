package com.zww.user.controller;

import com.zww.constants.SignConstants;
import com.zww.util.EncodeUtils;
import com.zww.util.UUIDUtil;

/**
 * Created by kyou on 2018/1/23.
 */
public class Test {
    public static void main (String[] args) {
        String appKey = "0xac,0x71,0x8a,0x2a,0x91,0x1d,0x98,0x41,0x6b,0xaf,0x60,0x8f,0xa8,0x4d,0xf8,0x09,0x5c,0x7a,0xe6,0xcb,0x53,0xd6,0xc0,0xcb,0x4e,0xdd,0x5e,0x8b,0xab,0x3a,0x96,0xea";

        String app_key_32 = appKey.replaceAll("0x", "").replaceAll(",", "").substring(0, 32);
        System.out.println(app_key_32);
        System.out.println("操作GIT,测试");
        System.out.println("修改01.24");
        System.out.println("修改01.24，加入组织！");
        System.out.println("@$%$%^$##%^");

        System.out.println(EncodeUtils.getBase64(UUIDUtil.getUUID()));
        System.out.println(EncodeUtils.getBase64(SignConstants.SERVERSECRECT));
    }
}
