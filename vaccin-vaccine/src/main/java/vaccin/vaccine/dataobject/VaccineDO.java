package vaccin.vaccine.dataobject;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
public class VaccineDO extends BaseEntity {
    /**
     * 疫苗编码（国标码）
     */
    private String code;
    /**
     * 疫苗全称
     */
    private String fullName;
    /**
     * 疫苗名称
     */
    private String name;
    /**
     * 疫苗简称
     */
    private String shortName;
    /**
     * 疫苗全称拼音
     */
    private String fullNamePinyin;
    /**
     * 疫苗名称拼音
     */
    private String namePinyin;
    /**
     * 疫苗简称拼音
     */
    private String shortNamePinyin;
    /**
     * 疫苗类型，1:一类疫苗，2:二类疫苗
     */
    private String classification;
    /**
     * 疫苗简介
     */
    private String instruction;
    /**
     * 包装盒图片
     */
    private String packagingBoxImage;
    /**
     * 疫苗接种起始年龄
     */
    private Integer minAge;
    /**
     * 疫苗接种截止年龄
     */
    private Integer maxAge;
    /**
     * 禁忌症
     */
    private String contraindications;
    /**
     * 接种须知
     */
    private String inoculationInformation;
    /**
     * 接种部位
     */
    private String inoculationSite;
    /**
     * 不良反应
     */
    private String AdverseEffects;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getFullNamePinyin() {
        return fullNamePinyin;
    }

    public void setFullNamePinyin(String fullNamePinyin) {
        this.fullNamePinyin = fullNamePinyin;
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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getPackagingBoxImage() {
        return packagingBoxImage;
    }

    public void setPackagingBoxImage(String packagingBoxImage) {
        this.packagingBoxImage = packagingBoxImage;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public Integer getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Integer maxAge) {
        this.maxAge = maxAge;
    }

    public String getContraindications() {
        return contraindications;
    }

    public void setContraindications(String contraindications) {
        this.contraindications = contraindications;
    }

    public String getInoculationInformation() {
        return inoculationInformation;
    }

    public void setInoculationInformation(String inoculationInformation) {
        this.inoculationInformation = inoculationInformation;
    }

    public String getInoculationSite() {
        return inoculationSite;
    }

    public void setInoculationSite(String inoculationSite) {
        this.inoculationSite = inoculationSite;
    }

    public String getAdverseEffects() {
        return AdverseEffects;
    }

    public void setAdverseEffects(String adverseEffects) {
        AdverseEffects = adverseEffects;
    }

    @Override
    public String toString() {
        return "VaccineDO{" +
                "code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", fullNamePinyin='" + fullNamePinyin + '\'' +
                ", namePinyin='" + namePinyin + '\'' +
                ", shortNamePinyin='" + shortNamePinyin + '\'' +
                ", classification='" + classification + '\'' +
                ", instruction='" + instruction + '\'' +
                ", packagingBoxImage='" + packagingBoxImage + '\'' +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", contraindications='" + contraindications + '\'' +
                ", inoculationInformation='" + inoculationInformation + '\'' +
                ", inoculationSite='" + inoculationSite + '\'' +
                ", AdverseEffects='" + AdverseEffects + '\'' +
                "} " + super.toString();
    }
}
