import request from "@/utils/request";

// 查询成绩管理列表
export function listScore(query) {
  return request({
    url: "/jw/score/list",
    method: "get",
    params: query,
  });
}

// 查询成绩管理详细
export function getScore(id) {
  return request({
    url: "/jw/score/" + id,
    method: "get",
  });
}

// 新增成绩管理
export function addScore(data) {
  return request({
    url: "/jw/score",
    method: "post",
    data: data,
  });
}

// 修改成绩管理
export function updateScore(data) {
  return request({
    url: "/jw/score",
    method: "put",
    data: data,
  });
}

// 删除成绩管理
export function delScore(id) {
  return request({
    url: "/jw/score/" + id,
    method: "delete",
  });
}

// 获取角色为学生的数据
export function getAllStudent(query) {
  return request({
    url: "/system/user/getAllStudent",
    method: "get",
    params: query,
  });
}

// 获取状态为可用的课程数据
export function getNormalCourse(query) {
  return request({
    url: "/system/user/getNormalCourse",
    method: "get",
    params: query,
  });
}
export function countScore() {
  return request({
    url: "/jw/score/count",
    method: "get",
  });
}