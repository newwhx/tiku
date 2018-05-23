package com.tamguo.util;

public class TamguoConstant {
	
	public static final String WEBSITE_NAME = "探果网";

	public static final String REDIS_PRE_KEY = "TAMGUO:";

	/** 高考SubjectId*/
	public static final String GAOKAO_SUBJECT_ID = "13";
	
	/** 高考专区缓存KEY*/
	public static final String GAOKAO_COURSE_AREA = "GAOKAO_COURSE_AREA";
	
	/** 首页菜单缓存KEY*/
	public static final String INDEX_MENU = "index_menu";
	
	/** 首页菜单缓存KEY*/
	public static final String ALL_INDEX_MENU = "all_index_menu";
	
	/** 首页左侧菜单缓存KEY*/
	public static final String LEFT_INDEX_MENU = "left_index_menu";
	
	/** 首页底部菜单缓存KEY*/
	public static final String FOOTER_INDEX_MENU = "footer_index_menu";
	
	/** 北京地区ID*/
	public static final String BEIJING_AREA_ID = "1";
	
	/** 真题类型ID*/
	public static final String ZHENGTI_PAPER_ID = "1";
	
	/** 模拟类型ID */
	public static final String SIMULATION_PAPER_ID = "2";
	
	/** 首页历年真题缓存KEY*/
	public static final String HISTORY_PAPER = "HistoryPaper:";
	
	/** 首页模拟试卷缓存KEY*/
	public static final String SIMULATION_PAPER = "SimulationPaper:";
	
	/** 首页热门试卷缓存KEY*/
	public static final String HOT_PAPER = "HOT_PAPER";
	
	/** 名校试卷缓存KEY*/
	public static final String ELITE_SCHOOL_PAPER = "EliteSchoolPaper:";
	
	/** 所有广告缓存KEY*/
	public static final String ALL_AD = "AllAd:";
	
	/** 名校缓存KEY*/
	public static final String ELITE_PAPER = "ElitePaper:";
	
	/** 章节科目为空*/
	public static final String CHAPTER_COURSE_EMPTY = "all";
	
	/** 默认分页大笑*/
	public static final Integer DEFAULT_PAGE_SIZE = 10;
	
	/** 单选题*/
	public static final String QUESTION_TYOE_DANXUANTI = "1";
	
	/** 简答题*/
	public static final String QUESTION_TYOE_JIANDATI = "2";
	
	/** 书面表达*/
	public static final String QUESTION_TYOE_SHUMIANBIAODA = "3";
	
	/** 默认会员头像*/
	public static final String DEFAULT_MEMBER_AVATAR = "images/avatar.png";
	
	/** 重置密码KEY*/
	public static final String RESET_PASSWORD_KEY = "ResetPasswordKey";
	
	/** ALIYUN */
	public static final String ALIYUN_ACCESS_KEY_ID = "LTAINGkheMeWtxUR";
	
	/** ALIYUN*/
	public static final String ALIYUN_ACCESS_KEY_SECRET = "ONUKuCz85kU4In07y4dvpM28mfWOGa";
	
	/** ALIYUN*/
	public static final String ALIYUN_SMTP_HOST_NAME = "smtp.aliyun.com";
	
	/** ALIYUN*/
	public static final int ALIYUN_SMTP_HOST_PORT = 465;
	
	/** ALIYUN*/
	public static final String ALIYUN_MAIL_ACCOUNT = "candy.tam@aliyun.com";
	
	/** ALIYUN*/
	public static final String ALIYUN_MAIL_PASSWORD = "tanguo520pig";
	
	/** 邮件主题*/
	public static final String ALIYUN_MAIL_SUBJECT_FINDPASSWORD = "探果网找回密码";

	/** 邮箱找回密码前缀*/
	public static final String ALIYUN_MAIL_FIND_PASSWORD_PREFIX = "EMAIL_FIND_PASSWORD_";
	
	/** 短信找回密码前缀*/
	public static final String ALIYUN_MOBILE_SMS_PREFIX = "MOBILE_SMS_PREKEY_";
	
	/** 安全验证前缀*/
	public static final String SECURITY_CHECK_PREFIX = "securityCheck:";
	
	/** 默认的章节根目录*/
	public static final String CHAPTER_DEFAULT_ROOT_UID = "-1";
	
	/** 登录错误次数*/
	public static final String LOGIN_FAILURE_COUNT = "loginFailureCount:";
	
	/** 题目未审核*/
	public static final String QUESTION_NOTHING_AUDIT_STATUS = "0";
	
	/** 题目审核成功*/
	public static final String QUESTION_SUCCESS_AUDIT_STATUS = "1";

	/** 题目审核失败*/
	public static final String QUESTION_FAILED_AUDIT_STATUS = "2";
	
}
