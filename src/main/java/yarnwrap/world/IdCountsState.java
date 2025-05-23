package yarnwrap.world;
public class IdCountsState { public net.minecraft.world.IdCountsState wrapperContained; public IdCountsState(net.minecraft.world.IdCountsState wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.IdCountsState.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.IdCountsState.CODEC = value; }

// public yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(wrapperContained.STATE_TYPE); }
// public void STATE_TYPE(yarnwrap.world.PersistentStateType value) { wrapperContained.STATE_TYPE = value.wrapperContained; }
public static yarnwrap.world.PersistentStateType STATE_TYPE() { return new yarnwrap.world.PersistentStateType(net.minecraft.world.IdCountsState.STATE_TYPE); }
// public static void STATE_TYPE(yarnwrap.world.PersistentStateType value, ) { net.minecraft.world.IdCountsState.STATE_TYPE = value.wrapperContained; }

// public int map() { return wrapperContained.map; }
// public void map(int value) { wrapperContained.map = value; }
// public static int map() { return net.minecraft.world.IdCountsState.map; }
// public static void map(int value, ) { net.minecraft.world.IdCountsState.map = value; }

public IdCountsState(int map) { this.wrapperContained = new net.minecraft.world.IdCountsState(map); }
public yarnwrap.component.type.MapIdComponent createNextMapId() { return new yarnwrap.component.type.MapIdComponent(wrapperContained.createNextMapId()); }
// public static yarnwrap.component.type.MapIdComponent createNextMapId() { return new yarnwrap.component.type.MapIdComponent(net.minecraft.world.IdCountsState.createNextMapId()); }
// public com.mojang.datafixers.kinds.App method_67422(Object instance) { return wrapperContained.method_67422(instance); }
// public static com.mojang.datafixers.kinds.App method_67422(Object instance, ) { return net.minecraft.world.IdCountsState.method_67422(instance); }
// public java.lang.Integer method_67423(yarnwrap.world.IdCountsState state) { return wrapperContained.method_67423(state.wrapperContained); }
// public static java.lang.Integer method_67423(yarnwrap.world.IdCountsState state, ) { return net.minecraft.world.IdCountsState.method_67423(state.wrapperContained); }

}