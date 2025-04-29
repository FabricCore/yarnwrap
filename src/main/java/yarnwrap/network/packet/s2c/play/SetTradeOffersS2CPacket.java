package yarnwrap.network.packet.s2c.play;
public class SetTradeOffersS2CPacket { public net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket wrapperContained; public SetTradeOffersS2CPacket(net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int syncId() { return wrapperContained.syncId; }
// public void syncId(int value) { wrapperContained.syncId = value; }
// public static int syncId() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.syncId; }
// public static void syncId(int value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.syncId = value; }

// public yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(wrapperContained.offers); }
// public void offers(yarnwrap.village.TradeOfferList value) { wrapperContained.offers = value.wrapperContained; }
// public static yarnwrap.village.TradeOfferList offers() { return new yarnwrap.village.TradeOfferList(net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.offers); }
// public static void offers(yarnwrap.village.TradeOfferList value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.offers = value.wrapperContained; }

// public int levelProgress() { return wrapperContained.levelProgress; }
// public void levelProgress(int value) { wrapperContained.levelProgress = value; }
// public static int levelProgress() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.levelProgress; }
// public static void levelProgress(int value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.levelProgress = value; }

// public int experience() { return wrapperContained.experience; }
// public void experience(int value) { wrapperContained.experience = value; }
// public static int experience() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.experience; }
// public static void experience(int value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.experience = value; }

// public boolean leveled() { return wrapperContained.leveled; }
// public void leveled(boolean value) { wrapperContained.leveled = value; }
// public static boolean leveled() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.leveled; }
// public static void leveled(boolean value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.leveled = value; }

// public boolean refreshable() { return wrapperContained.refreshable; }
// public void refreshable(boolean value) { wrapperContained.refreshable = value; }
// public static boolean refreshable() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.refreshable; }
// public static void refreshable(boolean value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.refreshable = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.CODEC = value.wrapperContained; }

public SetTradeOffersS2CPacket(int syncId,yarnwrap.village.TradeOfferList offers,int levelProgress,int experience,boolean leveled,boolean refreshable) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket(syncId,offers.wrapperContained,levelProgress,experience,leveled,refreshable); }
// public SetTradeOffersS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket(buf.wrapperContained); }
public int getSyncId() { return wrapperContained.getSyncId(); }
// public static int getSyncId() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.getSyncId(); }
public yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(wrapperContained.getOffers()); }
// public static yarnwrap.village.TradeOfferList getOffers() { return new yarnwrap.village.TradeOfferList(net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.getOffers()); }
public int getLevelProgress() { return wrapperContained.getLevelProgress(); }
// public static int getLevelProgress() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.getLevelProgress(); }
public int getExperience() { return wrapperContained.getExperience(); }
// public static int getExperience() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.getExperience(); }
public boolean isLeveled() { return wrapperContained.isLeveled(); }
// public static boolean isLeveled() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.isLeveled(); }
public boolean isRefreshable() { return wrapperContained.isRefreshable(); }
// public static boolean isRefreshable() { return net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.isRefreshable(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.SetTradeOffersS2CPacket.write(buf.wrapperContained); }

}