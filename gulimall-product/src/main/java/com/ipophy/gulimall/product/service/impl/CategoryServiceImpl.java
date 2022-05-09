package com.ipophy.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ipophy.common.utils.PageUtils;
import com.ipophy.common.utils.Query;
import com.ipophy.gulimall.product.dao.CategoryDao;
import com.ipophy.gulimall.product.entity.CategoryEntity;
import com.ipophy.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listAsTree() {
        //1 get all category
        List<CategoryEntity> allCategories = baseMapper.selectList(null);
        //2 build tree structure
        List<CategoryEntity> levelOneList = allCategories.stream().filter((category) -> category.getCatLevel() == 1).map((category) -> {
                    category.setSubCategoryList(getSubCategoryList(category, allCategories));
                    return category;
                }).collect(Collectors.toList());


        return levelOneList;
    }

    /**
     * recursive call to generate sub-category list given category, sorted based on category sort order
     *
     * @param root          current Category
     * @param allCategories all categories
     * @return list of sub-categories
     */
    private List<CategoryEntity> getSubCategoryList(CategoryEntity root, List<CategoryEntity> allCategories) {
        List<CategoryEntity> subCategoryList = allCategories.stream()
                .filter((category) -> category.getParentCid() == root.getCatId())
                .map((category) -> {
                    category.setSubCategoryList(getSubCategoryList(category, allCategories));
                    return category;
                })
//                .sorted(Comparator.nullsFirst(Comparator.comparingInt(CategoryEntity::getSort)))
                .collect(Collectors.toList());
        return subCategoryList;
    }


}