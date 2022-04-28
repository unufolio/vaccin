package com.unufolio.vaccin.vaccine.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@TableName("vaccine_factory")
public class VaccineFactoryDO extends BaseEntity {

    private String code;
    private String name;
    private String nameEn;
    private String shortName;
    private String shortNameEn;
    private String namePinyin;
    private String shortNamePinyin;

    public VaccineFactoryDO() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getShortNameEn() {
        return shortNameEn;
    }

    public void setShortNameEn(String shortNameEn) {
        this.shortNameEn = shortNameEn;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getShortNamePinyin() {
        return shortNamePinyin;
    }

    public void setShortNamePinyin(String shortNamePinyin) {
        this.shortNamePinyin = shortNamePinyin;
    }

    @Override
    public String toString() {
        return "VaccineFactoryDO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", shortName='" + shortName + '\'' +
                ", shortNameEn='" + shortNameEn + '\'' +
                ", namePinyin='" + namePinyin + '\'' +
                ", shortNamePinyin='" + shortNamePinyin + '\'' +
                "} " + super.toString();
    }
}
