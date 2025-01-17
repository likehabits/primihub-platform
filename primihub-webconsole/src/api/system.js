import request from '@/utils/request'

export function changeHomepage(data) {
  return request({
    url: `/sys/organ/changeHomepage`,
    method: 'post',
    data,
    type: 'json'
  })
}
export function getHomepage(params) {
  return request({
    url: `/sys/organ/getHomepage`,
    method: 'get',
    params
  })
}
