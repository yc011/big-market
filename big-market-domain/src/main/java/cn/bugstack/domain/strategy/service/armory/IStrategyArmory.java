package cn.bugstack.domain.strategy.service.armory;

/**
 * @description 策略装配库(兵工厂)，负责初始化策略计算
 */
public interface IStrategyArmory {



    /**
     * 获取抽奖策略装配的随机结果
     *
     * @param strategyId 策略ID
     * @return 抽奖结果
     */
    Integer getRandomAwardId(Long strategyId);

}
