package com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin;

import jakarta.validation.constraints.NotBlank;

/**
 * @author yeke yeke@healthych.com
 * @since 2022/04/28
 */
public class CreateVaccineFactoryRequestDTO {

    @NotBlank
    private String code;
    @NotBlank
    private String name;
    private String nameEn;
    private String shortName;
    private String shortNameEn;
    private String namePinyin;
    private String shortNamePinyin;

    public CreateVaccineFactoryRequestDTO() {
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
        return "CreateVaccineFactoryRequestDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", shortName='" + shortName + '\'' +
                ", shortNameEn='" + shortNameEn + '\'' +
                ", namePinyin='" + namePinyin + '\'' +
                ", shortNamePinyin='" + shortNamePinyin + '\'' +
                '}';
    }
}
