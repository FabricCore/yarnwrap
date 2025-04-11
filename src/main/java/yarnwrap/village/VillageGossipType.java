package yarnwrap.village;
public class VillageGossipType { public net.minecraft.village.VillageGossipType wrapperContained; public VillageGossipType(net.minecraft.village.VillageGossipType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
public int multiplier() { return wrapperContained.multiplier; }
// public void multiplier(int value) { wrapperContained.multiplier = value; }
public int maxValue() { return wrapperContained.maxValue; }
// public void maxValue(int value) { wrapperContained.maxValue = value; }
public int shareDecrement() { return wrapperContained.shareDecrement; }
// public void shareDecrement(int value) { wrapperContained.shareDecrement = value; }
public int decay() { return wrapperContained.decay; }
// public void decay(int value) { wrapperContained.decay = value; }
public int MAX_TRADING_REPUTATION() { return wrapperContained.MAX_TRADING_REPUTATION; }
// public void MAX_TRADING_REPUTATION(int value) { wrapperContained.MAX_TRADING_REPUTATION = value; }
public int TRADING_GOSSIP_SHARE_DECREMENT() { return wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT; }
// public void TRADING_GOSSIP_SHARE_DECREMENT(int value) { wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT = value; }
public int TRADING_GOSSIP_DECAY() { return wrapperContained.TRADING_GOSSIP_DECAY; }
// public void TRADING_GOSSIP_DECAY(int value) { wrapperContained.TRADING_GOSSIP_DECAY = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }

}