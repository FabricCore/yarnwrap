package yarnwrap.village;
public class VillagerGossipType { public net.minecraft.village.VillagerGossipType wrapperContained; public VillagerGossipType(net.minecraft.village.VillagerGossipType wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.village.VillagerGossipType.id; }
// public static void id(java.lang.String value, ) { net.minecraft.village.VillagerGossipType.id = value; }

public int multiplier() { return wrapperContained.multiplier; }
// public void multiplier(int value) { wrapperContained.multiplier = value; }
// public static int multiplier() { return net.minecraft.village.VillagerGossipType.multiplier; }
// public static void multiplier(int value, ) { net.minecraft.village.VillagerGossipType.multiplier = value; }

public int maxValue() { return wrapperContained.maxValue; }
// public void maxValue(int value) { wrapperContained.maxValue = value; }
// public static int maxValue() { return net.minecraft.village.VillagerGossipType.maxValue; }
// public static void maxValue(int value, ) { net.minecraft.village.VillagerGossipType.maxValue = value; }

public int shareDecrement() { return wrapperContained.shareDecrement; }
// public void shareDecrement(int value) { wrapperContained.shareDecrement = value; }
// public static int shareDecrement() { return net.minecraft.village.VillagerGossipType.shareDecrement; }
// public static void shareDecrement(int value, ) { net.minecraft.village.VillagerGossipType.shareDecrement = value; }

public int decay() { return wrapperContained.decay; }
// public void decay(int value) { wrapperContained.decay = value; }
// public static int decay() { return net.minecraft.village.VillagerGossipType.decay; }
// public static void decay(int value, ) { net.minecraft.village.VillagerGossipType.decay = value; }

// public int MAX_TRADING_REPUTATION() { return wrapperContained.MAX_TRADING_REPUTATION; }
// public void MAX_TRADING_REPUTATION(int value) { wrapperContained.MAX_TRADING_REPUTATION = value; }
public static int MAX_TRADING_REPUTATION() { return net.minecraft.village.VillagerGossipType.MAX_TRADING_REPUTATION; }
// public static void MAX_TRADING_REPUTATION(int value, ) { net.minecraft.village.VillagerGossipType.MAX_TRADING_REPUTATION = value; }

// public int TRADING_GOSSIP_SHARE_DECREMENT() { return wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT; }
// public void TRADING_GOSSIP_SHARE_DECREMENT(int value) { wrapperContained.TRADING_GOSSIP_SHARE_DECREMENT = value; }
public static int TRADING_GOSSIP_SHARE_DECREMENT() { return net.minecraft.village.VillagerGossipType.TRADING_GOSSIP_SHARE_DECREMENT; }
// public static void TRADING_GOSSIP_SHARE_DECREMENT(int value, ) { net.minecraft.village.VillagerGossipType.TRADING_GOSSIP_SHARE_DECREMENT = value; }

// public int TRADING_GOSSIP_DECAY() { return wrapperContained.TRADING_GOSSIP_DECAY; }
// public void TRADING_GOSSIP_DECAY(int value) { wrapperContained.TRADING_GOSSIP_DECAY = value; }
public static int TRADING_GOSSIP_DECAY() { return net.minecraft.village.VillagerGossipType.TRADING_GOSSIP_DECAY; }
// public static void TRADING_GOSSIP_DECAY(int value, ) { net.minecraft.village.VillagerGossipType.TRADING_GOSSIP_DECAY = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.village.VillagerGossipType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.village.VillagerGossipType.CODEC = value; }

// // public VillagerGossipType(java.lang.String id,int multiplier,java.lang.String maxReputation,int decay,int shareDecrement) { this.wrapperContained = new net.minecraft.village.VillagerGossipType(id,multiplier,maxReputation,decay,shareDecrement); }

}