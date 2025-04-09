package yarnwrap.village;
public class VillageGossipType { public net.minecraft.village.VillageGossipType wrapperContained; public VillageGossipType(net.minecraft.village.VillageGossipType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String key() { return wrapperContained.key; }
public int multiplier() { return wrapperContained.multiplier; }
public int maxValue() { return wrapperContained.maxValue; }
public int shareDecrement() { return wrapperContained.shareDecrement; }
public int decay() { return wrapperContained.decay; }
public int MAX_TRADING_REPUTATION() { return wrapperContained.MAX_TRADING_REPUTATION; }
public int TRADING_GOSSIP_SHARE_DECREMENT() { return wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT; }
public int TRADING_GOSSIP_DECAY() { return wrapperContained.TRADING_GOSSIP_DECAY; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }

}