package com.github.abangopen.fastms.configcenterservice;

public class Dealer {
    // 从M种球中取N个，每种球有K个

    // https://docs.google.com/spreadsheets/d/1c2Uv9nThEkfbuJzqRiD__auLMNzCzsxBHLINrBqGqwA/edit#gid=0

    // https://docs.google.com/spreadsheets/d/103KXN-Dm-3iSBdCrzouHvUmgAnoMRTczXS_xNkRGdiQ/edit#gid=0

    // https://docs.google.com/spreadsheets/d/1E-5yGeiyJk8mEdUEFrKIVL7JV9JuOuQvK49nzigvpEg/edit#gid=0

    // https://docs.google.com/spreadsheets/d/1-tq4tuO0d3chw-oMqlWA0qC8EPZrJC5DaugivYQaS1o/edit#gid=0

    // https://docs.google.com/spreadsheets/d/1ORQocf3VMTgRsiQCXJqTniCDYeE2OWuZjXxCB8Ri4hY/edit#gid=0

    // https://docs.google.com/spreadsheets/d/1LGk-L2KGwkT3e0_T4UHiP_Am2S3ZFLbs6NffNu21bhw/edit#gid=0

    // https://docs.google.com/spreadsheets/d/1L4bJGZp-VZD8b6hi7cg_WoEqGnWu2Ja_FIW8PP6xwuA/edit#gid=0

//    package com.micro.game.util;
//
//import java.io.IOException;
//import java.net.URLDecoder;
//import java.net.URLEncoder;
//import java.nio.charset.StandardCharsets;
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
//
//    /**
//     * @author sam
//     * @ClassName: CodeUtils
//     * @Description: 与客户端的http传输协议
//     * @date 2018-07-31
//     */
//    public class CodeUtils {
//
//        private static String passWord="leyingguoji123456";
//
//        /**
//         * 加密
//         *
//         * @param source 未加密的字符串
//         * @return
//         */
//        public static String encode(String source) {
//            try {
//                //utf-8 编码
//                source = URLEncoder.encode(source, "utf-8");
//            }catch (Exception e){e.printStackTrace();}
//            byte[] arr1 = source.getBytes(StandardCharsets.UTF_8);
//            byte[] arr2 = passWord.getBytes(StandardCharsets.UTF_8);
//            //先进行异或运算
//            //在此前后进行其他个性化算法
//            byte[] bytes = xorByteArray(arr1, arr2);
//            //再进行Base64编码
//            String encodeStr = new BASE64Encoder().encode(bytes);
//            //据RFC 822规定，每76个字符，还需要加上一个回车换行,有时就因为这些换行弄得出了问题，解决办法如下，替换所有换行和回车
//            return encodeStr.replaceAll("[\\s*\t\n\r]", "");
//
//        }
//
//        /**
//         * 解密
//         *
//         * @param encodeStr 已经加密过的字符串
//         * @return
//         */
//        public static String decode(String encodeStr){
//            byte[] arr2 = passWord.getBytes(StandardCharsets.UTF_8);
//            byte[] arr1 = null;
//            try {
//                //先进行Base64解码
//                arr1 = new BASE64Decoder().decodeBuffer(encodeStr);
//                //再进行异或运算
//                byte[] bytes = xorByteArray(arr1, arr2);
//                String decodeStr =  new String(bytes, StandardCharsets.UTF_8);
//                //utf-8 解码
//                decodeStr = URLDecoder.decode(decodeStr, "utf-8");
//                return decodeStr;
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//            return null;
//        }
//
//        /**
//         * 对两个字节数组进行抑或运算
//         *
//         * @param arr1 基本数组
//         * @param arr2 运算数组
//         * @return
//         */
//        public static byte[] xorByteArray(byte[] arr1, byte[] arr2) {
//            int len2 = arr2.length;
//            byte[] arr3 = new byte[arr1.length];
//            for (int i = 0; i < arr1.length; i++) {
//                arr3[i] = (byte) (arr1[i] ^ arr2[i % len2]);
//            }
//            return arr3;
//        }
//
//        public static void main(String []args){
//
//            System.out.println(decode("F0cUGglFXVeH3s/UvYTRmrCLxfiA+v6P2sBIRRNfQFNhTxwAW1NMVldFXEhFE0FHVUFDH0dDS15FGg=="));
//        }
//
//    }

}
