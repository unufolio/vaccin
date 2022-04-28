package com.unufolio.vaccin.vaccine.dal.mapper

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import com.unufolio.vaccin.vaccine.dataobject.VaccineDO
import org.apache.ibatis.annotations.Mapper

/**
 * @author Unufolio unufolio@gmail.com
 * @since 2022/04/24
 */
@Mapper
interface VaccineMapper : BaseMapper<VaccineDO> {
}