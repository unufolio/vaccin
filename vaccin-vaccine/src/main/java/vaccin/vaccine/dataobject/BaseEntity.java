package vaccin.vaccine.dataobject;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/03/29
 */
public class BaseEntity {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createdAt;
    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime modifiedAt;
    /**
     * 是否删除
     */
    private Boolean isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "BaseDataObject{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", modifiedAt=" + modifiedAt +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
