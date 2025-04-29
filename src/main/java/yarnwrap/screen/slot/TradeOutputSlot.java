package yarnwrap.screen.slot;
public class TradeOutputSlot { public net.minecraft.screen.slot.TradeOutputSlot wrapperContained; public TradeOutputSlot(net.minecraft.screen.slot.TradeOutputSlot wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.screen.slot.TradeOutputSlot.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.screen.slot.TradeOutputSlot.player = value.wrapperContained; }

// public yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(wrapperContained.merchant); }
// public void merchant(yarnwrap.village.Merchant value) { wrapperContained.merchant = value.wrapperContained; }
// public static yarnwrap.village.Merchant merchant() { return new yarnwrap.village.Merchant(net.minecraft.screen.slot.TradeOutputSlot.merchant); }
// public static void merchant(yarnwrap.village.Merchant value, ) { net.minecraft.screen.slot.TradeOutputSlot.merchant = value.wrapperContained; }

// public int amount() { return wrapperContained.amount; }
// public void amount(int value) { wrapperContained.amount = value; }
// public static int amount() { return net.minecraft.screen.slot.TradeOutputSlot.amount; }
// public static void amount(int value, ) { net.minecraft.screen.slot.TradeOutputSlot.amount = value; }

// public yarnwrap.village.MerchantInventory merchantInventory() { return new yarnwrap.village.MerchantInventory(wrapperContained.merchantInventory); }
// public void merchantInventory(yarnwrap.village.MerchantInventory value) { wrapperContained.merchantInventory = value.wrapperContained; }
// public static yarnwrap.village.MerchantInventory merchantInventory() { return new yarnwrap.village.MerchantInventory(net.minecraft.screen.slot.TradeOutputSlot.merchantInventory); }
// public static void merchantInventory(yarnwrap.village.MerchantInventory value, ) { net.minecraft.screen.slot.TradeOutputSlot.merchantInventory = value.wrapperContained; }

public TradeOutputSlot(yarnwrap.entity.player.PlayerEntity player,yarnwrap.village.Merchant merchant,yarnwrap.village.MerchantInventory merchantInventory,int index,int x,int y) { this.wrapperContained = new net.minecraft.screen.slot.TradeOutputSlot(player.wrapperContained,merchant.wrapperContained,merchantInventory.wrapperContained,index,x,y); }

}