CREATE TABLE If NOT EXISTS `user`(
   `id` bigint comment 'id',
   `username` VARCHAR(128) comment '用户名',
   `name` VARCHAR(20) comment '姓名',
   `age` int comment '年龄',
   `balance` decimal(10,2) comment '工资（元）',
   PRIMARY KEY(`id`)
) Engine = InnoDB DEFAULT CHARSET = utf8 COMMENT '用户表';