package yarnwrap.world.dimension;
public class DimensionType { public net.minecraft.world.dimension.DimensionType wrapperContained; public DimensionType(net.minecraft.world.dimension.DimensionType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean ultrawarm() { return wrapperContained.ultrawarm; }
// public void ultrawarm(boolean value) { wrapperContained.ultrawarm = value; }
// public static boolean ultrawarm() { return net.minecraft.world.dimension.DimensionType.ultrawarm; }
// public static void ultrawarm(boolean value, ) { net.minecraft.world.dimension.DimensionType.ultrawarm = value; }

// public yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(wrapperContained.effects); }
// public void effects(yarnwrap.util.Identifier value) { wrapperContained.effects = value.wrapperContained; }
// public static yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(net.minecraft.world.dimension.DimensionType.effects); }
// public static void effects(yarnwrap.util.Identifier value, ) { net.minecraft.world.dimension.DimensionType.effects = value.wrapperContained; }

// public float[] MOON_SIZES() { return wrapperContained.MOON_SIZES; }
// public void MOON_SIZES(float[] value) { wrapperContained.MOON_SIZES = value; }
public static float[] MOON_SIZES() { return net.minecraft.world.dimension.DimensionType.MOON_SIZES; }
// public static void MOON_SIZES(float[] value, ) { net.minecraft.world.dimension.DimensionType.MOON_SIZES = value; }

// public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_CODEC() { return net.minecraft.world.dimension.DimensionType.REGISTRY_CODEC; }
// public static void REGISTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.dimension.DimensionType.REGISTRY_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.dimension.DimensionType.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.dimension.DimensionType.CODEC = value; }

// public int SIZE_BITS_Y() { return wrapperContained.SIZE_BITS_Y; }
// public void SIZE_BITS_Y(int value) { wrapperContained.SIZE_BITS_Y = value; }
public static int SIZE_BITS_Y() { return net.minecraft.world.dimension.DimensionType.SIZE_BITS_Y; }
// public static void SIZE_BITS_Y(int value, ) { net.minecraft.world.dimension.DimensionType.SIZE_BITS_Y = value; }

// public int MAX_HEIGHT() { return wrapperContained.MAX_HEIGHT; }
// public void MAX_HEIGHT(int value) { wrapperContained.MAX_HEIGHT = value; }
public static int MAX_HEIGHT() { return net.minecraft.world.dimension.DimensionType.MAX_HEIGHT; }
// public static void MAX_HEIGHT(int value, ) { net.minecraft.world.dimension.DimensionType.MAX_HEIGHT = value; }

// public int MAX_COLUMN_HEIGHT() { return wrapperContained.MAX_COLUMN_HEIGHT; }
// public void MAX_COLUMN_HEIGHT(int value) { wrapperContained.MAX_COLUMN_HEIGHT = value; }
public static int MAX_COLUMN_HEIGHT() { return net.minecraft.world.dimension.DimensionType.MAX_COLUMN_HEIGHT; }
// public static void MAX_COLUMN_HEIGHT(int value, ) { net.minecraft.world.dimension.DimensionType.MAX_COLUMN_HEIGHT = value; }

// public int MIN_HEIGHT() { return wrapperContained.MIN_HEIGHT; }
// public void MIN_HEIGHT(int value) { wrapperContained.MIN_HEIGHT = value; }
public static int MIN_HEIGHT() { return net.minecraft.world.dimension.DimensionType.MIN_HEIGHT; }
// public static void MIN_HEIGHT(int value, ) { net.minecraft.world.dimension.DimensionType.MIN_HEIGHT = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.world.dimension.DimensionType.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.world.dimension.DimensionType.PACKET_CODEC = value.wrapperContained; }

// public DimensionType(java.util.OptionalLong fixedTime,boolean hasSkylight,boolean ultrawarm,boolean coordinateScale,boolean piglinSafe) { this.wrapperContained = new net.minecraft.world.dimension.DimensionType(fixedTime,hasSkylight,ultrawarm,coordinateScale,piglinSafe); }
// public boolean ultrawarm() { return wrapperContained.ultrawarm(); }
// // public static boolean ultrawarm() { return net.minecraft.world.dimension.DimensionType.ultrawarm(); }
// public yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(wrapperContained.effects()); }
// // public static yarnwrap.util.Identifier effects() { return new yarnwrap.util.Identifier(net.minecraft.world.dimension.DimensionType.effects()); }
// public java.nio.file.Path getSaveDirectory(yarnwrap.registry.RegistryKey worldRef,java.nio.file.Path worldDirectory) { return wrapperContained.getSaveDirectory(worldRef.wrapperContained,worldDirectory); }
// public static java.nio.file.Path getSaveDirectory(yarnwrap.registry.RegistryKey worldRef,java.nio.file.Path worldDirectory, ) { return net.minecraft.world.dimension.DimensionType.getSaveDirectory(worldRef.wrapperContained,worldDirectory); }
// public com.mojang.serialization.DataResult worldFromDimensionNbt(com.mojang.serialization.Dynamic nbt) { return wrapperContained.worldFromDimensionNbt(nbt); }
// public static com.mojang.serialization.DataResult worldFromDimensionNbt(com.mojang.serialization.Dynamic nbt, ) { return net.minecraft.world.dimension.DimensionType.worldFromDimensionNbt(nbt); }
// public com.mojang.datafixers.kinds.App method_28522(Object instance) { return wrapperContained.method_28522(instance); }
// public static com.mojang.datafixers.kinds.App method_28522(Object instance, ) { return net.minecraft.world.dimension.DimensionType.method_28522(instance); }
public float getSkyAngle(long time) { return wrapperContained.getSkyAngle(time); }
// public static float getSkyAngle(long time, ) { return net.minecraft.world.dimension.DimensionType.getSkyAngle(time); }
public int getMoonPhase(long time) { return wrapperContained.getMoonPhase(time); }
// public static int getMoonPhase(long time, ) { return net.minecraft.world.dimension.DimensionType.getMoonPhase(time); }
public boolean hasFixedTime() { return wrapperContained.hasFixedTime(); }
// public static boolean hasFixedTime() { return net.minecraft.world.dimension.DimensionType.hasFixedTime(); }
// public double getCoordinateScaleFactor(yarnwrap.world.dimension.DimensionType fromDimension,yarnwrap.world.dimension.DimensionType toDimension) { return wrapperContained.getCoordinateScaleFactor(fromDimension.wrapperContained,toDimension.wrapperContained); }
// public static double getCoordinateScaleFactor(yarnwrap.world.dimension.DimensionType fromDimension,yarnwrap.world.dimension.DimensionType toDimension, ) { return net.minecraft.world.dimension.DimensionType.getCoordinateScaleFactor(fromDimension.wrapperContained,toDimension.wrapperContained); }
public boolean piglinSafe() { return wrapperContained.piglinSafe(); }
// public static boolean piglinSafe() { return net.minecraft.world.dimension.DimensionType.piglinSafe(); }
public boolean hasRaids() { return wrapperContained.hasRaids(); }
// public static boolean hasRaids() { return net.minecraft.world.dimension.DimensionType.hasRaids(); }
public yarnwrap.util.math.intprovider.IntProvider monsterSpawnLightTest() { return new yarnwrap.util.math.intprovider.IntProvider(wrapperContained.monsterSpawnLightTest()); }
// public static yarnwrap.util.math.intprovider.IntProvider monsterSpawnLightTest() { return new yarnwrap.util.math.intprovider.IntProvider(net.minecraft.world.dimension.DimensionType.monsterSpawnLightTest()); }
public int monsterSpawnBlockLightLimit() { return wrapperContained.monsterSpawnBlockLightLimit(); }
// public static int monsterSpawnBlockLightLimit() { return net.minecraft.world.dimension.DimensionType.monsterSpawnBlockLightLimit(); }

}