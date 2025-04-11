package yarnwrap.world;
public class IdCountsState { public net.minecraft.world.IdCountsState wrapperContained; public IdCountsState(net.minecraft.world.IdCountsState wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap idCounts() { return wrapperContained.idCounts; }
// public void idCounts(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.idCounts = value; }
public java.lang.String IDCOUNTS_KEY() { return wrapperContained.IDCOUNTS_KEY; }
// public void IDCOUNTS_KEY(java.lang.String value) { wrapperContained.IDCOUNTS_KEY = value; }
public yarnwrap.component.type.MapIdComponent increaseAndGetMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.increaseAndGetMapId()); }
// public yarnwrap.world.IdCountsState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.world.IdCountsState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }

}