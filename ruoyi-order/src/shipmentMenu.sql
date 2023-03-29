-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单管理', '3', '1', '/order/shipment', 'C', '0', 'order:shipment:view', '#', 'admin', sysdate(), '', null, '订单管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单管理查询', @parentId, '1',  '#',  'F', '0', 'order:shipment:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单管理新增', @parentId, '2',  '#',  'F', '0', 'order:shipment:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单管理修改', @parentId, '3',  '#',  'F', '0', 'order:shipment:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单管理删除', @parentId, '4',  '#',  'F', '0', 'order:shipment:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('订单管理导出', @parentId, '5',  '#',  'F', '0', 'order:shipment:export',       '#', 'admin', sysdate(), '', null, '');
