-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('repertory', '2000', '1', '/repertory/repertory', 'C', '0', 'repertory:repertory:view', '#', 'admin', sysdate(), '', null, 'repertory菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('repertory查询', @parentId, '1',  '#',  'F', '0', 'repertory:repertory:list',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('repertory新增', @parentId, '2',  '#',  'F', '0', 'repertory:repertory:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('repertory修改', @parentId, '3',  '#',  'F', '0', 'repertory:repertory:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('repertory删除', @parentId, '4',  '#',  'F', '0', 'repertory:repertory:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, url, menu_type, visible, perms, icon, create_by, create_time, update_by, update_time, remark)
values('repertory导出', @parentId, '5',  '#',  'F', '0', 'repertory:repertory:export',       '#', 'admin', sysdate(), '', null, '');
