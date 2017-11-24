package com.yyxx.wechatfp;

import java.util.Locale;

/**
 * Created by Jason on 2017/9/17.
 */

public class Lang {

    private static int sLang;

    public static final int LANG_ZH_CN = 0;
    public static final int LANG_ZH_TW = 1;
    public static final int LANG_EN = 2;

    static {
        Locale locale = Locale.getDefault();
        if (locale.getLanguage().toLowerCase().contains("zh")) {
            String country = locale.getCountry().toLowerCase();
            if (country.contains("tw") || country.contains("hk")) {
                sLang = LANG_ZH_TW;
            } else {
                sLang = LANG_ZH_CN;
            }
        } else {
            sLang = LANG_EN;
        }
    }

    public static final int SETTINGS_TITLE_HELP_WECHAT = 0x00000001;
    public static final int SETTINGS_TITLE_HELP_ALIPAY = 0x00000002;
    public static final int SETTINGS_TITLE_HELP_TAOBAO = 0x00000003;
    public static final int SETTINGS_TITLE_HELP_QQ = 0x00000103;
    public static final int SETTINGS_TITLE_QQ_GROUP = 0x00000203;
    public static final int SETTINGS_TITLE_HELP_FAQ = 0x00000303;
    public static final int SETTINGS_TITLE_LICENSE = 0x00000403;
    public static final int SETTINGS_TITLE_CHECKUPDATE = 0x00000004;
    public static final int SETTINGS_TITLE_WEBSIDE = 0x00000005;
    public static final int SETTINGS_TITLE_VERSION = 0x00000006;
    public static final int SETTINGS_SUB_TITLE_HELP_WECHAT = 0x00000007;
    public static final int SETTINGS_SUB_TITLE_HELP_ALIPAY = 0x00000008;
    public static final int SETTINGS_SUB_TITLE_HELP_TAOBAO = 0x00000009;
    public static final int SETTINGS_SUB_TITLE_HELP_QQ = 0x00000109;
    public static final int SETTINGS_SUB_TITLE_QQ_GROUP = 0x00000209;
    public static final int SETTINGS_SUB_TITLE_HELP_FAQ = 0x00000309;
    public static final int SETTINGS_SUB_TITLE_LICENSE = 0x00000409;
    public static final int SETTINGS_SUB_TITLE_CHECKUPDATE = 0x00000010;
    public static final int SETTINGS_SUB_TITLE_WEBSIDE = 0x00000011;
    public static final int FOUND_NEW_VERSION = 0x00000012;
    public static final int SKIP_THIS_VERSION = 0x00000013;
    public static final int CANCEL = 0x00000014;
    public static final int GOTO_UPDATE_PAGE = 0x00000015;
    public static final int OK = 0x00000016;
    public static final int SETTINGS_TITLE_ALIPAY = 0x00000017;
    public static final int SETTINGS_TITLE_WECHAT = 0x00000018;
    public static final int SETTINGS_TITLE_QQ = 0x00000118;
    public static final int ENTER_PASSWORD = 0x00000019;
    public static final int SETTINGS_TITLE_SWITCH = 0x00000020;
    public static final int SETTINGS_TITLE_PASSWORD = 0x00000021;
    public static final int SETTINGS_TITLE_DONATE = 0x00000022;
    public static final int SETTINGS_SUB_TITLE_SWITCH_ALIPAY = 0x00000023;
    public static final int SETTINGS_SUB_TITLE_SWITCH_WECHAT = 0x00000024;
    public static final int SETTINGS_SUB_TITLE_SWITCH_QQ = 0x00000124;
    public static final int SETTINGS_SUB_TITLE_PASSWORD_ALIPAY = 0x00000025;
    public static final int SETTINGS_SUB_TITLE_PASSWORD_WECHAT = 0x00000026;
    public static final int SETTINGS_SUB_TITLE_PASSWORD_QQ = 0x00000126;
    public static final int SETTINGS_SUB_TITLE_DONATE = 0x00000027;
    public static final int FINGERPRINT_VERIFICATION = 0x00000028;
    public static final int WECHAT_GENERAL = 0x00000029;
    public static final int APP_SETTINGS_NAME = 0x00000030;
    public static final int WECHAT_PAYVIEW_PASSWORD_TITLE = 0x00000031;
    public static final int WECHAT_PAYVIEW_FINGERPRINT_TITLE = 0x00000032;
    public static final int WECHAT_PAYVIEW_PASSWORD_SWITCH_TEXT = 0x00000033;
    public static final int WECHAT_PAYVIEW_FINGERPRINT_SWITCH_TEXT = 0x00000034;
    public static final int QQ_PAYVIEW_PASSWORD_TITLE = 0x00000035;
    public static final int QQ_PAYVIEW_FINGERPRINT_TITLE = 0x00000036;
    public static final int QQ_PAYVIEW_PASSWORD_SWITCH_TEXT = 0x00000037;
    public static final int QQ_PAYVIEW_FINGERPRINT_SWITCH_TEXT = 0x00000038;
    public static final int DISAGREE = 0x00000039;
    public static final int AGREE = 0x00000040;

    public static final int TOAST_GIVE_ME_STAR = 0x01000001;
    public static final int TOAST_CHECKING_UPDATE = 0x01000002;
    public static final int TOAST_NO_UPDATE = 0x01000003;
    public static final int TOAST_CHECK_UPDATE_FAIL_NET_ERR = 0x01000004;
    public static final int TOAST_FINGERPRINT_MATCH = 0x01000005;
    public static final int TOAST_FINGERPRINT_NOT_MATCH = 0x01000006;
    public static final int TOAST_FINGERPRINT_RETRY_ENDED = 0x01000007;
    public static final int TOAST_FINGERPRINT_UNLOCK_REBOOT = 0x01000008;
    public static final int TOAST_FINGERPRINT_NOT_ENABLE = 0x01000009;
    public static final int TOAST_PASSWORD_NOT_SET_ALIPAY = 0x01000010;
    public static final int TOAST_PASSWORD_NOT_SET_WECHAT = 0x01000011;
    public static final int TOAST_PASSWORD_NOT_SET_QQ = 0x01000012;
    public static final int TOAST_PASSWORD_NOT_SET_TAOBAO = 0x01000112;
    public static final int TOAST_PASSWORD_AUTO_ENTER_FAIL = 0x01000013;
    public static final int TOAST_GOTO_DONATE_PAGE_FAIL_ALIPAY = 0x01000014;
    public static final int TOAST_GOTO_DONATE_PAGE_FAIL_WECHAT = 0x01000015;
    public static final int TOAST_GOTO_DONATE_PAGE_FAIL_QQ = 0x01000016;
    public static final int TOAST_NEED_QQ_7_2_5 = 0x01000017;

    private static final int TEMPLATE = 0xFFFFFFFF;

    public static String getString(int res) {
        switch (res) {
            case SETTINGS_TITLE_HELP_WECHAT:
                return tr("微信指纹", "微信指纹", "WeChat fingerprint pay");
            case SETTINGS_TITLE_HELP_ALIPAY:
                return tr("支付宝指纹", "支付寶指纹", "Alipay fingerprint pay");
            case SETTINGS_TITLE_HELP_TAOBAO:
                return tr("淘宝指纹", "淘宝指纹", "Taobao fingerprint pay");
            case SETTINGS_TITLE_HELP_QQ:
                return tr("QQ指纹", "QQ指纹", "QQ fingerprint pay");
            case SETTINGS_TITLE_QQ_GROUP:
                return tr("QQ交流群", "QQ交流群", "QQ Group");
            case SETTINGS_TITLE_HELP_FAQ:
                return tr("常见问题", "常見問題", "FAQ");
            case SETTINGS_TITLE_LICENSE:
                return tr("许可协议", "許可協議", "License");
            case SETTINGS_TITLE_CHECKUPDATE:
                return tr("检查更新", "檢查更新", "Check for update");
            case SETTINGS_TITLE_WEBSIDE:
                return tr("项目主页", "項目主頁", "Project homepage");
            case SETTINGS_TITLE_VERSION:
                return tr("当前版本", "当前版本", "Version");
            case SETTINGS_SUB_TITLE_HELP_WECHAT:
                return tr("查看使用教程", "查看使用教程", "Tutorial");
            case SETTINGS_SUB_TITLE_HELP_ALIPAY:
                return tr("查看使用教程", "查看使用教程", "Tutorial");
            case SETTINGS_SUB_TITLE_HELP_TAOBAO:
                return tr("查看使用教程", "查看使用教程", "Tutorial");
            case SETTINGS_SUB_TITLE_HELP_QQ:
                return tr("查看使用教程", "查看使用教程", "Tutorial");
            case SETTINGS_SUB_TITLE_QQ_GROUP:
                return tr("665167891", "665167891", "665167891");
            case SETTINGS_SUB_TITLE_HELP_FAQ:
                return tr("出现问题请看这里", "出現問題請看這裏", "Having a problem?");
            case SETTINGS_SUB_TITLE_LICENSE:
                return tr("查看许可协议", "查看許可協議", "Check the License Agreement");
            case SETTINGS_SUB_TITLE_CHECKUPDATE:
                return tr("点击检查软件更新", "點擊檢查软件更新", "Press to begin");
            case SETTINGS_SUB_TITLE_WEBSIDE:
                return tr("访问項目主页", "訪問項目主頁", "Home page");
            case FOUND_NEW_VERSION:
                return tr("发现新版本", "發現新版本 ", "New version: ");
            case SKIP_THIS_VERSION:
                return tr("跳过这个版本", "跳過這個版本 ", "Skip");
            case CANCEL:
                return tr("取消", "取消", "Cancel");
            case GOTO_UPDATE_PAGE:
                return tr("前往更新页", "前往更新頁 ", "Go");
            case OK:
                return tr("确定", "确定", "OK");
            case SETTINGS_TITLE_ALIPAY:
                return tr("支付宝", "支付寶", "Alipay");
            case SETTINGS_TITLE_WECHAT:
                return tr("微信", "微信", "WeChat");
            case SETTINGS_TITLE_QQ:
                return tr("腾讯QQ", "騰訊QQ", "Tencent QQ");
            case ENTER_PASSWORD:
                return tr("输入密码", "輸入密碼", "Enter password");
            case SETTINGS_TITLE_SWITCH:
                return tr("启用", "啟用", "Enable");
            case SETTINGS_TITLE_PASSWORD:
                return tr("密码", "密碼", "Password");
            case SETTINGS_TITLE_DONATE:
                return tr("赞助我", "贊助我", "Donate me");
            case SETTINGS_SUB_TITLE_SWITCH_ALIPAY:
                return tr("启用支付宝指纹支付", "啟用支付宝指紋支付", "Enable fingerprint payment for Alipay");
            case SETTINGS_SUB_TITLE_SWITCH_WECHAT:
                return tr("启用微信指纹支付", "啟用微信指紋支付", "Enable fingerprint payment for WeChat");
            case SETTINGS_SUB_TITLE_SWITCH_QQ:
                return tr("启用QQ指纹支付", "啟用QQ指紋支付", "Enable fingerprint payment for QQ");
            case SETTINGS_SUB_TITLE_PASSWORD_ALIPAY:
                return tr("请输入支付宝的支付密码, 密码会加密后保存, 请放心", "請輸入支付宝的支付密碼, 密碼會加密后保存, 請放心", "Please enter your Payment password");
            case SETTINGS_SUB_TITLE_PASSWORD_WECHAT:
                return tr("请输入微信的支付密码, 密码会加密后保存, 请放心", "請輸入微信的支付密碼, 密碼會加密后保存, 請放心", "Please enter your Payment password");
            case SETTINGS_SUB_TITLE_PASSWORD_QQ:
                return tr("请输入QQ的支付密码, 密码会加密后保存, 请放心", "請輸入QQ的支付密碼, 密碼會加密后保存, 請放心", "Please enter your Payment password");
            case SETTINGS_SUB_TITLE_DONATE:
                return tr("如果您觉得本软件好用, 欢迎赞助, 多少都是心意", "如果您覺得本軟件好用, 歡迎贊助, 多少都是心意", "Donate me, If you like this project");
            case FINGERPRINT_VERIFICATION:
                return tr("请验证已有指纹", "請驗證已有指紋", "Fingerprint verification");
            case WECHAT_GENERAL:
                return tr("通用", "一般", "General");
            case APP_SETTINGS_NAME:
                return tr("指纹设置 - xuxu 会员提供版", "指紋設置 - xuxu 會員提供版", "Fingerprint - xuxu vip");
            case WECHAT_PAYVIEW_FINGERPRINT_TITLE:
                return tr("请验证指纹", "請驗證指紋", "Verify fingerprint");
            case WECHAT_PAYVIEW_PASSWORD_TITLE:
                return tr("请输入支付密码", "請輸入付款密碼", "Enter payment password");
            case WECHAT_PAYVIEW_PASSWORD_SWITCH_TEXT:
                return tr("使用密码", "使用密碼", "Password");
            case WECHAT_PAYVIEW_FINGERPRINT_SWITCH_TEXT:
                return tr("使用指纹", "使用指紋", "Fingerprint");
            case QQ_PAYVIEW_FINGERPRINT_TITLE:
                return tr("请验证指纹", "請驗證指紋", "Verify fingerprint");
            case QQ_PAYVIEW_PASSWORD_TITLE:
                return tr("请输入支付密码", "請輸入付款密碼", "Enter payment password");
            case QQ_PAYVIEW_PASSWORD_SWITCH_TEXT:
                return tr("使用密码", "使用密碼", "Password");
            case QQ_PAYVIEW_FINGERPRINT_SWITCH_TEXT:
                return tr("使用指纹", "使用指紋", "Fingerprint");
            case DISAGREE:
                return tr("不同意", "不同意", "Disagree");
            case AGREE:
                return tr("同意", "同意", "I agree");

            case TOAST_GIVE_ME_STAR:
                return tr("如果您拥有Github账户, 别忘了给我的项目+个Star噢", "如果您擁有Github賬戶, 別忘了給我的項目+個Star噢", "Give me a star, if you like this project");
            case TOAST_CHECKING_UPDATE:
                return tr("正在检查更新", "正在檢查更新", "Checking");
            case TOAST_NO_UPDATE:
                return tr("已经是最新版本了", "暫無更新", "You already have the latest version");
            case TOAST_CHECK_UPDATE_FAIL_NET_ERR:
                return tr("网络错误, 检查更新失败", "網絡錯誤, 檢查更新失敗", "Network error");
            case TOAST_FINGERPRINT_MATCH:
                return tr("指纹识别成功", "指紋識別成功", "Fingerprint MATCH");
            case TOAST_FINGERPRINT_NOT_MATCH:
                return tr("指纹识别失败", "指紋識別失敗", "Fingerprint NOT MATCH");
            case TOAST_FINGERPRINT_RETRY_ENDED:
                return tr("多次尝试错误，请使用密码输入", "多次嘗試錯誤，請使用密碼輸入", "Too many incorrect verification attempts, switch to password verification");
            case TOAST_FINGERPRINT_UNLOCK_REBOOT:
                return tr("系统限制，重启后必须验证密码后才能使用指纹验证", "系統限制，重啟後必須驗證密碼後才能使用指紋驗證", "Reboot and enable fingerprint verification with your PIN");
            case TOAST_FINGERPRINT_NOT_ENABLE:
                return tr("系统指纹功能未启用", "系統指紋功能未啟用", "Fingerprint verification has been closed by system");
            case TOAST_PASSWORD_NOT_SET_ALIPAY:
                return tr("未设定支付密码，请前往設置->指紋設置中设定支付宝的支付密码", "未設定支付密碼，請前往設置 -> 指紋設置中設定支付寶的支付密碼", "Payment password not set, please goto Settings -> Fingerprint to enter you payment password");
            case TOAST_PASSWORD_NOT_SET_TAOBAO:
                return tr("未设定支付密码，请前往設置->指紋設置中设定淘宝的支付密码", "未設定支付密碼，請前往設置 -> 指紋設置中設定淘寶的支付密碼", "Payment password not set, please goto Settings -> Fingerprint to enter you payment password");
            case TOAST_PASSWORD_NOT_SET_WECHAT:
                return tr("未设定支付密码，请前往設置->指紋設置中设定微信的支付密码", "未設定支付密碼，請前往設置 -> 指紋設置中設定微信的支付密碼", "Payment password not set, please goto Settings -> Fingerprint to enter you payment password");
            case TOAST_PASSWORD_NOT_SET_QQ:
                return tr("未设定支付密码，请前往設置->指紋設置中设定QQ的支付密码", "未設定支付密碼，請前往設置 -> 指紋設置中設定QQ的支付密碼", "Payment password not set, please goto Settings -> Fingerprint to enter you payment password");
            case TOAST_PASSWORD_AUTO_ENTER_FAIL:
                return tr("Oops.. 输入失败了. 请手动输入密码", "Oops.. 輸入失敗了. 請手動輸入密碼", "Oops... auto input failure, switch to manual input");
            case TOAST_GOTO_DONATE_PAGE_FAIL_ALIPAY:
                return tr("调用支付宝捐赠页失败, 您可以手动转账捐赠哦, 帐号: " + Constant.AUTHOR_ALIPAY, "調用支付寶捐贈頁失敗, 您可以手動轉賬捐贈哦, 帳號: " + Constant.AUTHOR_ALIPAY, "Can't jump to Alipay donate page, You can do it manually by transfer to account: " + Constant.AUTHOR_ALIPAY);
            case TOAST_GOTO_DONATE_PAGE_FAIL_WECHAT:
                return tr("调用微信捐赠页失败, 您可以手动转账捐赠哦, 帐号: " + Constant.AUTHOR_WECHAT, "調用微信捐贈頁失敗, 您可以手動轉賬捐贈哦, 帳號: " + Constant.AUTHOR_WECHAT, "Can't jump to WeChat donate page, You can do it manually by transfer to account: " + Constant.AUTHOR_WECHAT);
            case TOAST_GOTO_DONATE_PAGE_FAIL_QQ:
                return tr("调用QQ捐赠页失败, 您可以手动转账捐赠哦, 帐号: " + Constant.AUTHOR_QQ, "調用QQ捐贈頁失敗, 您可以手動轉賬捐贈哦, 帳號: " + Constant.AUTHOR_QQ, "Can't jump to QQ donate page, You can do it manually by transfer to account: " + Constant.AUTHOR_QQ);
            case TOAST_NEED_QQ_7_2_5:
                return tr("您的QQ版本过低, 不支持指纹功能, 请升级至7.2.5以上的版本", "您的QQ版本過低, 不支持指紋功能, 請升級至7.2.5以上的版本", "Your QQ version is too low, does not support the fingerprint function, please upgrade to version 7.2.5 and above");
            case TEMPLATE:
                return tr("", "", "");
        }
        return "";
    }

    private static String tr(String ...c) {
        return c[sLang];
    }
}
