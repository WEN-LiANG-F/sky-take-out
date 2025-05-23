package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味
     * @param flavors 口味集合
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     * 根据菜品id删除口味
     * @param id 菜品id
     */
    @Delete("delete from dish_flavor where id = #{id}")
    void deleteByDishId(Long id);

    /**
     * 根据菜品ids批量删除口味
     * @param dishIds 菜品id
     * @return 口味集合
     */
    void deleteByDishIds(List<Long> dishIds);

    /**
     * 根据菜品id查询口味
     * @param dishId 菜品id
     * @return 口味集合
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);

}
