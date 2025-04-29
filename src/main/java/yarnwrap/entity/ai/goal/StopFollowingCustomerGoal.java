package yarnwrap.entity.ai.goal;
public class StopFollowingCustomerGoal { public net.minecraft.entity.ai.goal.StopFollowingCustomerGoal wrapperContained; public StopFollowingCustomerGoal(net.minecraft.entity.ai.goal.StopFollowingCustomerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.MerchantEntity merchant() { return new yarnwrap.entity.passive.MerchantEntity(wrapperContained.merchant); }
// public void merchant(yarnwrap.entity.passive.MerchantEntity value) { wrapperContained.merchant = value.wrapperContained; }
// public static yarnwrap.entity.passive.MerchantEntity merchant() { return new yarnwrap.entity.passive.MerchantEntity(net.minecraft.entity.ai.goal.StopFollowingCustomerGoal.merchant); }
// public static void merchant(yarnwrap.entity.passive.MerchantEntity value, ) { net.minecraft.entity.ai.goal.StopFollowingCustomerGoal.merchant = value.wrapperContained; }

public StopFollowingCustomerGoal(yarnwrap.entity.passive.MerchantEntity merchant) { this.wrapperContained = new net.minecraft.entity.ai.goal.StopFollowingCustomerGoal(merchant.wrapperContained); }

}