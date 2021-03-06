package com.zww.trade.repository;

import com.zww.trade.pojo.GoldPackagePojo;
import com.zww.trade.pojo.UserRechargeRecordsPojo;
import com.zww.trade.vo.PointExchangeRecordsOutputVo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 用户积分兑换功能Mapper
 *
 * @author kuang
 * @since 2018.01.30
 * @version 1.0
 */
@Component
public interface PointExchangeMapper {

	/**
	 * 查询出积分兑换套餐列表
	 * 
	 * @return
	 */
	List<GoldPackagePojo> queryGoldPackageList();

	/**
	 * 更新用户积分值
	 * @param map
	 * @return
	 */
	int updateUserPoint(Map<String, String> map);

	/**
	 * 查询用户当前金币数
	 * @param userId
	 * @return
	 */
	int queryUserGold(String userId);

	/**
	 * 更新用户金币、积分值
	 * @param map
	 * @return
	 */
	int updateUserGoldAndPoint(Map<String, String> map);

	/**
	 * 增加兑换积分记录
	 * @param pojo
	 */
	int insertUserRechargeRecords(UserRechargeRecordsPojo pojo);

	/**
	 * 更新个人资料表的字段【用户付费标记】为1-付费
	 * @param userId
	 * @return
	 */
	int updateUserBasePayFlag(String userId);

	/**
	 * 根据用户ID获取积分兑换记录
	 * @param map
	 * @return
	 */
	List<PointExchangeRecordsOutputVo> queryUserRechargeRecords(Map<String, String> map);
	
}
