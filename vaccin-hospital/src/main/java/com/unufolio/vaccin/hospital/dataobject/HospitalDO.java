package com.unufolio.vaccin.hospital.dataobject;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/30
 */
public class HospitalDO extends TenantBaseEntity {

    private String code;
    private String name;
    private String telephone;
    private String longitude;
    private String latitude;
    private String address;
    private Integer sorting;
    private Boolean isPublic;
    private Boolean isOpen;

}
