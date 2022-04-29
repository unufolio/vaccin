package com.unufolio.vaccin.vaccine.dto.vaccinefactory.admin;

import jakarta.validation.constraints.NotBlank;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/28
 */
public class UpdateVaccineFactoryRequestDTO {

    @NotBlank(message = "VACCINE_FACTORY_NAME_NOT_BLANK")
    private String name;
    private String nameEn;
    private String shortName;
    private String shortNameEn;
    private String namePinyin;
    private String shortNamePinyin;

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
        return "UpdateVaccineFactoryRequestDTO{" +
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
