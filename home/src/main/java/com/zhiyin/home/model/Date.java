package com.zhiyin.home.model;

/**
 * 测试
 * 
 * @author zkl
 *
 */
public class Date {
	private Integer id;

	private String code;

	private String name;

	private String zs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getZs() {
		return zs;
	}

	public void setZs(String zs) {
		this.zs = zs == null ? null : zs.trim();
	}
}