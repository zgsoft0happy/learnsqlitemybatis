package cn.ideacs.learn.mapper;

import cn.ideacs.learn.dos.Admin;
import org.springframework.stereotype.Repository;

/**
 * name:
 * date: 2021/6/8            time:  12:15 AM
 * author: Tomas Yang       email: zgsoft_happy@126.com
 * <p>
 * description:
 * <p>
 * version: 1.0.0
 */
@Repository
public interface AdminMapper {

    Admin findAdminById(String id);
}
