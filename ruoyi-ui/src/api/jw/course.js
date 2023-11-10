import request from "@/utils/request";

// 查询课程管理列表
export function listCourse(query) {
  return request({
    url: "/jw/course/list",
    method: "get",
    params: query,
  });
}

// 查询课程管理详细
export function getCourse(id) {
  return request({
    url: "/jw/course/" + id,
    method: "get",
  });
}

// 新增课程管理
export function addCourse(data) {
  return request({
    url: "/jw/course",
    method: "post",
    data: data,
  });
}

// 修改课程管理
export function updateCourse(data) {
  return request({
    url: "/jw/course",
    method: "put",
    data: data,
  });
}

// 删除课程管理
export function delCourse(id) {
  return request({
    url: "/jw/course/" + id,
    method: "delete",
  });
}

//上传封面
export function uploadCover(file) {
  const formData = new FormData();
  formData.append("file", file); // 使用 FormData 将文件添加到请求中

  return request({
    url: "/jw/course/uploadCover",
    method: "post",
    data: formData,
    headers: {
      "Content-Type": "multipart/form-data", // 设置请求头为 multipart/form-data
    },
  });
}

export function countCourse() {
  return request({
    url: "/jw/course/count",
    method: "get",
  });
}
