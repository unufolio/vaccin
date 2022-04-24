package com.unufolio.vaccin.vaccine.dal.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper
import vaccin.vaccine.dataobject.VaccineDO

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Mapper
interface VaccineFactoryMapper : BaseMapper<VaccineDO> {
}