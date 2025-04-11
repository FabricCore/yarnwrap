package yarnwrap.network.packet.s2c.play;
public class SetTradeOffersS2CPacket { public net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket wrapperContained; public SetTradeOffersS2CPacket(net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public void offers(yarnwrap.village.TradeOfferList value) { wrapperContained.offers = value.wrapperContained; }
// public int levelProgress() { return wrapperContained.levelProgress; }
// public void levelProgress(int value) { wrapperContained.levelProgress = value; }
// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public boolean leveled() { return wrapperContained.leveled; }
// public void leveled(boolean value) { wrapperContained.leveled = value; }
// public boolean refreshable() { return wrapperContained.refreshable; }
// public void refreshable(boolean value) { wrapperContained.refreshable = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public SetTradeOffersS2CPacket(int syncId,yarnwrap.village.TradeOfferList offers,int levelProgress,int experience,boolean leveled,boolean refreshable) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket(syncId,offers.wrapperContained,levelProgress,experience,leveled,refreshable); }
// public SetTradeOffersS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(wrapperContained.getOffers()); }
public int getLevelProgress() { return wrapperContained.getLevelProgress(); }
public int getExperience() { return wrapperContained.getExperience(); }
public boolean isLeveled() { return wrapperContained.isLeveled(); }
public boolean isRefreshable() { return wrapperContained.isRefreshable(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}