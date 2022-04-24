package vaccin.vaccine.dataobject;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
public class VaccineFactoryDO extends BaseEntity{

    private String code;
    private String name;
    private String shortName;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
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
                ", shortName='" + shortName + '\'' +
                ", namePinyin='" + namePinyin + '\'' +
                ", shortNamePinyin='" + shortNamePinyin + '\'' +
                "} " + super.toString();
    }
}
