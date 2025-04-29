package yarnwrap.entity.passive;
public class TraderLlamaEntity { public net.minecraft.entity.passive.TraderLlamaEntity wrapperContained; public TraderLlamaEntity(net.minecraft.entity.passive.TraderLlamaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnDelay() { return wrapperContained.despawnDelay; }
// public void despawnDelay(int value) { wrapperContained.despawnDelay = value; }
// public static int despawnDelay() { return net.minecraft.entity.passive.TraderLlamaEntity.despawnDelay; }
// public static void despawnDelay(int value, ) { net.minecraft.entity.passive.TraderLlamaEntity.despawnDelay = value; }

// public void tryDespawn() { wrapperContained.tryDespawn(); }
// public static void tryDespawn() { net.minecraft.entity.passive.TraderLlamaEntity.tryDespawn(); }
// public boolean canDespawn() { return wrapperContained.canDespawn(); }
// public static boolean canDespawn() { return net.minecraft.entity.passive.TraderLlamaEntity.canDespawn(); }
// public boolean heldByTrader() { return wrapperContained.heldByTrader(); }
// public static boolean heldByTrader() { return net.minecraft.entity.passive.TraderLlamaEntity.heldByTrader(); }
// public boolean leashedByPlayer() { return wrapperContained.leashedByPlayer(); }
// public static boolean leashedByPlayer() { return net.minecraft.entity.passive.TraderLlamaEntity.leashedByPlayer(); }
public void setDespawnDelay(int despawnDelay) { wrapperContained.setDespawnDelay(despawnDelay); }
// public static void setDespawnDelay(int despawnDelay, ) { net.minecraft.entity.passive.TraderLlamaEntity.setDespawnDelay(despawnDelay); }

}