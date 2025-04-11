package yarnwrap.world.dimension;
public class DimensionType { public net.minecraft.world.dimension.DimensionType wrapperContained; public DimensionType(net.minecraft.world.dimension.DimensionType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean ultrawarm() { return wrapperContained.ultrawarm; }
// public void ultrawarm(boolean value) { wrapperContained.ultrawarm = value; }
// public yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(wrapperContained.effects); }
// public void effects(yarnwrap.util.Identifier value) { wrapperContained.effects = value.wrapperContained; }
public float[] MOON_SIZES() { return wrapperContained.MOON_SIZES; }
// public void MOON_SIZES(float[] value) { wrapperContained.MOON_SIZES = value; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int SIZE_BITS_Y() { return wrapperContained.SIZE_BITS_Y; }
// public void SIZE_BITS_Y(int value) { wrapperContained.SIZE_BITS_Y = value; }
public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
// public void MAX_HEIGHT(int value) { wrapperContained.MAX_HEIGHT = value; }
public int MAX_COLUMN_HEIGHT() { return wrapperContained.MAX_COLUMN_HEIGHT; }
// public void MAX_COLUMN_HEIGHT(int value) { wrapperContained.MAX_COLUMN_HEIGHT = value; }
public int MIN_HEIGHT() { return wrapperContained.MIN_HEIGHT; }
// public void MIN_HEIGHT(int value) { wrapperContained.MIN_HEIGHT = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public DimensionType(java.util.OptionalLong fixedTime,boolean hasSkylight,boolean ultrawarm,boolean coordinateScale,boolean piglinSafe) { this.wrapperContained = new net.minecraft.world.dimension.DimensionType(fixedTime,hasSkylight,ultrawarm,coordinateScale,piglinSafe); }
// public boolean ultrawarm() { return wrapperContained.ultrawarm(); }
// public yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(wrapperContained.effects()); }
public java.nio.file.Path getSaveDirectory(yarnwrap.registry.RegistryKey worldRef,java.nio.file.Path worldDirectory) { return wrapperContained.getSaveDirectory(worldRef.wrapperContained,worldDirectory); }
public com.mojang.serialization.DataResult worldFromDimensionNbt(com.mojang.serialization.Dynamic nbt) { return wrapperContained.worldFromDimensionNbt(nbt); }
// public com.mojang.datafixers.kinds.App method_28522(Object instance) { return wrapperContained.method_28522(instance); }
public float getSkyAngle(long time) { return wrapperContained.getSkyAngle(time); }
public int getMoonPhase(long time) { return wrapperContained.getMoonPhase(time); }
public boolean hasFixedTime() { return wrapperContained.hasFixedTime(); }
public double getCoordinateScaleFactor(yarnwrap.world.dimension.DimensionType fromDimension,yarnwrap.world.dimension.DimensionType toDimension) { return wrapperContained.getCoordinateScaleFactor(fromDimension.wrapperContained,toDimension.wrapperContained); }
public boolean piglinSafe() { return wrapperContained.piglinSafe(); }
public boolean hasRaids() { return wrapperContained.hasRaids(); }
public yarnwrap.util.math.intprovider.IntProvider monsterSpawnLightTest() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.monsterSpawnLightTest()); }
public int monsterSpawnBlockLightLimit() { return wrapperContained.monsterSpawnBlockLightLimit(); }

}