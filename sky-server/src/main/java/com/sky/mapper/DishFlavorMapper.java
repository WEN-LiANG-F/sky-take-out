package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味
     * @param flavors 口味集合
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id查询口味
     * @param id 菜品id
     * @return 口味集合
     */
    @Delete("select * from dish_flavor where dish_id = #{id}")
    void deleteByDishId(Long id);
}
