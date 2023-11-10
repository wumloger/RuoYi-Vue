package com.ruoyi.jw.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.file.FileUploadUtils;
import com.ruoyi.common.utils.file.MimeTypeUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.jw.domain.Course;
import com.ruoyi.jw.service.ICourseService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 课程管理Controller
 *
 * @author mqxu
 * @date 2023-11-06
 */
@RestController
@RequestMapping("/jw/course")
public class CourseController extends BaseController {
    @Autowired
    private ICourseService courseService;

    /**
     * 查询课程管理列表
     */
    @PreAuthorize("@ss.hasPermi('jw:course:list')")
    @GetMapping("/list")
    public TableDataInfo list(Course course) {
        startPage();
        List<Course> list = courseService.selectCourseList(course);
        return getDataTable(list);
    }

    /**
     * 导出课程管理列表
     */
    @PreAuthorize("@ss.hasPermi('jw:course:export')")
    @Log(title = "课程管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Course course) {
        List<Course> list = courseService.selectCourseList(course);
        ExcelUtil<Course> util = new ExcelUtil<Course>(Course.class);
        util.exportExcel(response, list, "课程管理数据");
    }

    /**
     * 获取课程管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('jw:course:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return success(courseService.selectCourseById(id));
    }

    /**
     * 新增课程管理
     */
    @PreAuthorize("@ss.hasPermi('jw:course:add')")
    @Log(title = "课程管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Course course) {
        course.setCreateBy(SecurityUtils.getLoginUser().getUser().getUserName());
        return toAjax(courseService.insertCourse(course));
    }

    /**
     * 修改课程管理
     */
    @PreAuthorize("@ss.hasPermi('jw:course:edit')")
    @Log(title = "课程管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Course course) {
        course.setUpdateBy(SecurityUtils.getLoginUser().getUser().getUserName());
        return toAjax(courseService.updateCourse(course));
    }

    /**
     * 删除课程管理
     */
    @PreAuthorize("@ss.hasPermi('jw:course:remove')")
    @Log(title = "课程管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(courseService.deleteCourseByIds(ids));
    }

    @Anonymous
    @PostMapping("/uploadCover")
    public AjaxResult cover(MultipartFile file) throws Exception
    {
        System.out.println(file);
        if (!file.isEmpty())
        {
            String cover = FileUploadUtils.uploadMinioWithDir(file,RuoYiConfig.getCoverPath());
            System.out.println(cover);
            AjaxResult ajax = AjaxResult.success();
            ajax.put("coverUrl", cover);
            return ajax;
        }
        return error("上传图片异常，请联系管理员");
    }

    @GetMapping("/count")
    public int count(){
        return courseService.count();
    }
}
