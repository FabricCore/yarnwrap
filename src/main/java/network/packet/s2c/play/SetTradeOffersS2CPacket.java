package yarnwrap.network.packet.s2c.play;
public class SetTradeOffersS2CPacket { public net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket wrapperContained; public SetTradeOffersS2CPacket(net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public int levelProgress() { return wrapperContained.levelProgress; }
// public int experience() { return wrapperContained.experience; }
// public boolean leveled() { return wrapperContained.leveled; }
// public boolean refreshable() { return wrapperContained.refreshable; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public int getSyncId() { return wrapperContained.getSyncId(); }
public yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(wrapperContained.getOffers()); }
public int getLevelProgress() { return wrapperContained.getLevelProgress(); }
public int getExperience() { return wrapperContained.getExperience(); }
public boolean isLeveled() { return wrapperContained.isLeveled(); }
public boolean isRefreshable() { return wrapperContained.isRefreshable(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}