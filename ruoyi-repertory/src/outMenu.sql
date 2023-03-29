-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('出库管理', '2000', '1', '/repertory/out', 'C', '0', 'repertory:out:view', '#', 'admin', sysdate(), '', null, '出库管理菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('出库管理查询', @parentId, '1',  '#',  'F', '0', 'repertory:out:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('出库管理新增', @parentId, '2',  '#',  'F', '0', 'repertory:out:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('出库管理修改', @parentId, '3',  '#',  'F', '0', 'repertory:out:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('出库管理删除', @parentId, '4',  '#',  'F', '0', 'repertory:out:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('出库管理导出', @parentId, '5',  '#',  'F', '0', 'repertory:out:export',       '#', 'admin', sysdate(), '', null, '');
