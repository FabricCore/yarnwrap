package yarnwrap.entity.ai.goal;
public class LookAtCustomerGoal { public net.minecraft.entity.ai.goal.LookAtCustomerGoal wrapperContained; public LookAtCustomerGoal(net.minecraft.entity.ai.goal.LookAtCustomerGoal wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.MerchantEntity merchant() { return new yarnwrap.entity.passive.MerchantEntity(wrapperContained.merchant); }
// public void merchant(yarnwrap.entity.passive.MerchantEntity value) { wrapperContained.merchant = value.wrapperContained; }
// public static yarnwrap.entity.passive.MerchantEntity merchant() { return new yarnwrap.entity.passive.MerchantEntity(net.minecraft.entity.ai.goal.LookAtCustomerGoal.merchant); }
// public static void merchant(yarnwrap.entity.passive.MerchantEntity value, ) { net.minecraft.entity.ai.goal.LookAtCustomerGoal.merchant = value.wrapperContained; }

public LookAtCustomerGoal(yarnwrap.entity.passive.MerchantEntity merchant) { this.wrapperContained = new net.minecraft.entity.ai.goal.LookAtCustomerGoal(merchant.wrapperContained); }

}