package yarnwrap.world;
public class IdCountsState { public net.minecraft.world.IdCountsState wrapperContained; public IdCountsState(net.minecraft.world.IdCountsState wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.objects.Object2IntMap idCounts() { return wrapperContained.idCounts; }
// public void idCounts(it.unimi.dsi.fastutil.objects.Object2IntMap value) { wrapperContained.idCounts = value; }
// public static it.unimi.dsi.fastutil.objects.Object2IntMap idCounts() { return net.minecraft.world.IdCountsState.idCounts; }
// public static void idCounts(it.unimi.dsi.fastutil.objects.Object2IntMap value, ) { net.minecraft.world.IdCountsState.idCounts = value; }

// public java.lang.String IDCOUNTS_KEY() { return wrapperContained.IDCOUNTS_KEY; }
// public void IDCOUNTS_KEY(java.lang.String value) { wrapperContained.IDCOUNTS_KEY = value; }
public static java.lang.String IDCOUNTS_KEY() { return net.minecraft.world.IdCountsState.IDCOUNTS_KEY; }
// public static void IDCOUNTS_KEY(java.lang.String value, ) { net.minecraft.world.IdCountsState.IDCOUNTS_KEY = value; }

public yarnwrap.component.type.MapIdComponent increaseAndGetMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.increaseAndGetMapId()); }
// public static yarnwrap.component.type.MapIdComponent increaseAndGetMapId() { return new yarnwrap.component.type.MapIdComponent(net.minecraft.world.IdCountsState.increaseAndGetMapId()); }
// public yarnwrap.world.IdCountsState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup) { return new yarnwrap.world.IdCountsState(wrapperContained.fromNbt(nbt.wrapperContained,registryLookup)); }
// public static yarnwrap.world.IdCountsState fromNbt(yarnwrap.nbt.NbtCompound nbt,Object registryLookup, ) { return new yarnwrap.world.IdCountsState(net.minecraft.world.IdCountsState.fromNbt(nbt.wrapperContained,registryLookup)); }
// public Object getPersistentStateType() { return wrapperContained.getPersistentStateType(); }
public static Object getPersistentStateType() { return net.minecraft.world.IdCountsState.getPersistentStateType(); }

}