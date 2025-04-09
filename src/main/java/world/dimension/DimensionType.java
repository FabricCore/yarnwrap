package yarnwrap.world.dimension;
public class DimensionType { public net.minecraft.world.dimension.DimensionType wrapperContained; public DimensionType(net.minecraft.world.dimension.DimensionType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean ultrawarm() { return wrapperContained.ultrawarm; }
// public yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(wrapperContained.effects); }
public float[] MOON_SIZES() { return wrapperContained.MOON_SIZES; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public int SIZE_BITS_Y() { return wrapperContained.SIZE_BITS_Y; }
public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
public int MAX_COLUMN_HEIGHT() { return wrapperContained.MAX_COLUMN_HEIGHT; }
public int MIN_HEIGHT() { return wrapperContained.MIN_HEIGHT; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public boolean ultrawarm() { return wrapperContained.ultrawarm(); }
// public yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(wrapperContained.effects()); }
public java.nio.file.Path getSaveDirectory(yarnwrap.registry.RegistryKey worldRef,java.nio.file.Path worldDirectory) { return wrapperContained.getSaveDirectory(worldRef.wrapperContained,worldDirectory); }
public com.mojang.serialization.DataResult worldFromDimensionNbt(com.mojang.serialization.Dynamic nbt) { return wrapperContained.worldFromDimensionNbt(nbt); }
public float getSkyAngle(long time) { return wrapperContained.getSkyAngle(time); }
public int getMoonPhase(long time) { return wrapperContained.getMoonPhase(time); }
public boolean hasFixedTime() { return wrapperContained.hasFixedTime(); }
public double getCoordinateScaleFactor(yarnwrap.world.dimension.DimensionType fromDimension,yarnwrap.world.dimension.DimensionType toDimension) { return wrapperContained.getCoordinateScaleFactor(fromDimension.wrapperContained,toDimension.wrapperContained); }
public boolean piglinSafe() { return wrapperContained.piglinSafe(); }
public boolean hasRaids() { return wrapperContained.hasRaids(); }
public yarnwrap.util.math.intprovider.IntProvider monsterSpawnLightTest() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.monsterSpawnLightTest()); }
public int monsterSpawnBlockLightLimit() { return wrapperContained.monsterSpawnBlockLightLimit(); }

}