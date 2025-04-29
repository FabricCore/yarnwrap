package yarnwrap.village;
public class VillageGossipType { public net.minecraft.village.VillageGossipType wrapperContained; public VillageGossipType(net.minecraft.village.VillageGossipType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
// public static java.lang.String key() { return net.minecraft.village.VillageGossipType.key; }
// public static void key(java.lang.String value, ) { net.minecraft.village.VillageGossipType.key = value; }

public int multiplier() { return wrapperContained.multiplier; }
// public void multiplier(int value) { wrapperContained.multiplier = value; }
// public static int multiplier() { return net.minecraft.village.VillageGossipType.multiplier; }
// public static void multiplier(int value, ) { net.minecraft.village.VillageGossipType.multiplier = value; }

public int maxValue() { return wrapperContained.maxValue; }
// public void maxValue(int value) { wrapperContained.maxValue = value; }
// public static int maxValue() { return net.minecraft.village.VillageGossipType.maxValue; }
// public static void maxValue(int value, ) { net.minecraft.village.VillageGossipType.maxValue = value; }

public int shareDecrement() { return wrapperContained.shareDecrement; }
// public void shareDecrement(int value) { wrapperContained.shareDecrement = value; }
// public static int shareDecrement() { return net.minecraft.village.VillageGossipType.shareDecrement; }
// public static void shareDecrement(int value, ) { net.minecraft.village.VillageGossipType.shareDecrement = value; }

public int decay() { return wrapperContained.decay; }
// public void decay(int value) { wrapperContained.decay = value; }
// public static int decay() { return net.minecraft.village.VillageGossipType.decay; }
// public static void decay(int value, ) { net.minecraft.village.VillageGossipType.decay = value; }

// public int MAX_TRADING_REPUTATION() { return wrapperContained.MAX_TRADING_REPUTATION; }
// public void MAX_TRADING_REPUTATION(int value) { wrapperContained.MAX_TRADING_REPUTATION = value; }
public static int MAX_TRADING_REPUTATION() { return net.minecraft.village.VillageGossipType.MAX_TRADING_REPUTATION; }
// public static void MAX_TRADING_REPUTATION(int value, ) { net.minecraft.village.VillageGossipType.MAX_TRADING_REPUTATION = value; }

// public int TRADING_GOSSIP_SHARE_DECREMENT() { return wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT; }
// public void TRADING_GOSSIP_SHARE_DECREMENT(int value) { wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT = value; }
public static int TRADING_GOSSIP_SHARE_DECREMENT() { return net.minecraft.village.VillageGossipType.TRADING_GOSSIP_SHARE_DECREMENT; }
// public static void TRADING_GOSSIP_SHARE_DECREMENT(int value, ) { net.minecraft.village.VillageGossipType.TRADING_GOSSIP_SHARE_DECREMENT = value; }

// public int TRADING_GOSSIP_DECAY() { return wrapperContained.TRADING_GOSSIP_DECAY; }
// public void TRADING_GOSSIP_DECAY(int value) { wrapperContained.TRADING_GOSSIP_DECAY = value; }
public static int TRADING_GOSSIP_DECAY() { return net.minecraft.village.VillageGossipType.TRADING_GOSSIP_DECAY; }
// public static void TRADING_GOSSIP_DECAY(int value, ) { net.minecraft.village.VillageGossipType.TRADING_GOSSIP_DECAY = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.VillageGossipType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.VillageGossipType.CODEC = value; }

// // public VillageGossipType(java.lang.String key,int multiplier,java.lang.String maxReputation,int decay,int shareDecrement) { this.wrapperContained = new net.minecraft.village.VillageGossipType(key,multiplier,maxReputation,decay,shareDecrement); }

}