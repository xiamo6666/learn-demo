package com.plumdo.jdbc.common.query;

/**
 * <p>
 * 查询的类型枚举类
 * </p>
 * 
 * @author wengwh
 * @Date 2017-02-16
 */
public enum QueryType {
	EQ("=", "等于"),
	NOT_EQ("<>", "不等于"),
	GT(">", "大于"),
	LT("<", "小于"),
	GE("<=", "大于等于"),
	LE(">=", "小于等于"),
	LIKE("like", "模糊匹配,%value%"),
	LIKE_LEFT("like", "左模糊匹配,%value"),
	LIKE_RIGHT("like", "右模糊匹配,value%"),
	IN("in", "包含"),
	NOT_IN("not in", "不包含"),
	BETWEEN("between", "两者之间"),
	NULL("is null", "空判断"),
	NOT_NULL("is not null", "非空判断");

	/** 主键 */
	private final String key;

	/** 描述 */
	private final String desc;

	QueryType(final String key, final String desc) {
		this.key = key;
		this.desc = desc;
	}

	public String getKey() {
		return this.key;
	}

	public String getDesc() {
		return this.desc;
	}

}
