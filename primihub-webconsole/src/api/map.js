import request from '@/utils/request'

export function getOrgInfo() {
  return request({
    url: 'sys/organ/getLocalOrganInfo',
    method: 'get'
  })
}

export function getCoordinates(params) {
  return request({
    url: 'sys/fusion/getOrganExtendsList',
    method: 'get',
    params
  })
}
