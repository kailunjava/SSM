package com.zhiyin.home.model;

public class Dynasty {
    private Integer id;

    private String name;

    private String code;

    private String zs;

    private String zs2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getZs() {
        return zs;
    }

    public void setZs(String zs) {
        this.zs = zs == null ? null : zs.trim();
    }

    public String getZs2() {
        return zs2;
    }

    public void setZs2(String zs2) {
        this.zs2 = zs2 == null ? null : zs2.trim();
    }

	@Override
	public String toString() {
		return "Dynasty [id=" + id + ", name=" + name + ", code=" + code
				+ ", zs=" + zs + ", zs2=" + zs2 + "]";
	}
    
}