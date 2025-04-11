package yarnwrap.village;
public class SimpleMerchant { public net.minecraft.village.SimpleMerchant wrapperContained; public SimpleMerchant(net.minecraft.village.SimpleMerchant wrapperContained) { this.wrapperContained = wrapperContained; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public void offers(yarnwrap.village.TradeOfferList value) { wrapperContained.offers = value.wrapperContained; }
public SimpleMerchant(yarnwrap.entity.player.PlayerEntity player) { this.wrapperContained = new net.minecraft.village.SimpleMerchant(player.wrapperContained); }

}