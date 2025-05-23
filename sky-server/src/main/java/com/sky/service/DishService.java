package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;


public interface DishService {
    /**
     * 新增菜品
     * @param dishDTO 菜品信息
     */
    public void saveWithFlavor(DishDTO dishDTO);

    /**
     * 分页查询菜品
     * @param dishPageQueryDTO 分页查询条件
     * @return 分页结果
     */
    PageResult page(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 根据id删除菜品
     * @param ids 菜品id
     */
    void deleteById(List<Long> ids);

    /**
     * 获取菜品信息
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    void updateWithFlavor(DishDTO dishDTO);
}
