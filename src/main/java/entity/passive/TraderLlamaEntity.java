package yarnwrap.entity.passive;
public class TraderLlamaEntity { public net.minecraft.entity.passive.TraderLlamaEntity wrapperContained; public TraderLlamaEntity(net.minecraft.entity.passive.TraderLlamaEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public int despawnDelay() { return wrapperContained.despawnDelay; }
// public void tryDespawn() { wrapperContained.tryDespawn(); }
// public boolean canDespawn() { return wrapperContained.canDespawn(); }
// public boolean heldByTrader() { return wrapperContained.heldByTrader(); }
// public boolean leashedByPlayer() { return wrapperContained.leashedByPlayer(); }
public void setDespawnDelay(int despawnDelay) { wrapperContained.setDespawnDelay(despawnDelay); }

}