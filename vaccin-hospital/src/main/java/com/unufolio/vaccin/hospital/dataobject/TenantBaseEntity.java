package com.unufolio.vaccin.hospital.dataobject;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/30
 */
public class TenantBaseEntity extends BaseEntity {

    private Long tenantId;

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "TenantBaseEntity{" +
                "tenantId=" + tenantId +
                "} " + super.toString();
    }
}
