# Copyright (c) HashiCorp, Inc.
# SPDX-License-Identifier: MPL-2.0

variable "region" {
  description = "AWS region"
  type        = string
  default     = "ap-northeast-2"
}
variable "access_key" {
  default  = "d"
}
variable "secret_key" {
  default  = "d"
}
