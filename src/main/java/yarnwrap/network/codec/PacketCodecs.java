package yarnwrap.network.codec;
public class PacketCodecs { public net.minecraft.network.codec.PacketCodecs wrapperContained; public PacketCodecs(net.minecraft.network.codec.PacketCodecs wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec BOOLEAN() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.BOOLEAN); }
// public void BOOLEAN(yarnwrap.network.codec.PacketCodec value) { wrapperContained.BOOLEAN = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec BOOLEAN() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.BOOLEAN); }
// public static void BOOLEAN(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.BOOLEAN = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec BYTE() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.BYTE); }
// public void BYTE(yarnwrap.network.codec.PacketCodec value) { wrapperContained.BYTE = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec BYTE() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.BYTE); }
// public static void BYTE(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.BYTE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec SHORT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.SHORT); }
// public void SHORT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.SHORT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec SHORT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.SHORT); }
// public static void SHORT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.SHORT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec VAR_INT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.VAR_INT); }
// public void VAR_INT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.VAR_INT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec VAR_INT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.VAR_INT); }
// public static void VAR_INT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.VAR_INT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec VAR_LONG() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.VAR_LONG); }
// public void VAR_LONG(yarnwrap.network.codec.PacketCodec value) { wrapperContained.VAR_LONG = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec VAR_LONG() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.VAR_LONG); }
// public static void VAR_LONG(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.VAR_LONG = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec FLOAT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.FLOAT); }
// public void FLOAT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.FLOAT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec FLOAT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.FLOAT); }
// public static void FLOAT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.FLOAT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec DOUBLE() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.DOUBLE); }
// public void DOUBLE(yarnwrap.network.codec.PacketCodec value) { wrapperContained.DOUBLE = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec DOUBLE() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.DOUBLE); }
// public static void DOUBLE(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.DOUBLE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec STRING() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.STRING); }
// public void STRING(yarnwrap.network.codec.PacketCodec value) { wrapperContained.STRING = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec STRING() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.STRING); }
// public static void STRING(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.STRING = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec NBT_ELEMENT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.NBT_ELEMENT); }
// public void NBT_ELEMENT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.NBT_ELEMENT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec NBT_ELEMENT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.NBT_ELEMENT); }
// public static void NBT_ELEMENT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.NBT_ELEMENT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec NBT_COMPOUND() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.NBT_COMPOUND); }
// public void NBT_COMPOUND(yarnwrap.network.codec.PacketCodec value) { wrapperContained.NBT_COMPOUND = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec NBT_COMPOUND() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.NBT_COMPOUND); }
// public static void NBT_COMPOUND(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.NBT_COMPOUND = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_NBT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_NBT); }
// public void OPTIONAL_NBT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_NBT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_NBT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.OPTIONAL_NBT); }
// public static void OPTIONAL_NBT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.OPTIONAL_NBT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec VECTOR_3F() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.VECTOR_3F); }
// public void VECTOR_3F(yarnwrap.network.codec.PacketCodec value) { wrapperContained.VECTOR_3F = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec VECTOR_3F() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.VECTOR_3F); }
// public static void VECTOR_3F(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.VECTOR_3F = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec QUATERNION_F() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.QUATERNION_F); }
// public void QUATERNION_F(yarnwrap.network.codec.PacketCodec value) { wrapperContained.QUATERNION_F = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec QUATERNION_F() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.QUATERNION_F); }
// public static void QUATERNION_F(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.QUATERNION_F = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec BYTE_ARRAY() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.BYTE_ARRAY); }
// public void BYTE_ARRAY(yarnwrap.network.codec.PacketCodec value) { wrapperContained.BYTE_ARRAY = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec BYTE_ARRAY() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.BYTE_ARRAY); }
// public static void BYTE_ARRAY(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.BYTE_ARRAY = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec INTEGER() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.INTEGER); }
// public void INTEGER(yarnwrap.network.codec.PacketCodec value) { wrapperContained.INTEGER = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec INTEGER() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.INTEGER); }
// public static void INTEGER(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.INTEGER = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec UNLIMITED_NBT_ELEMENT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNLIMITED_NBT_ELEMENT); }
// public void UNLIMITED_NBT_ELEMENT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNLIMITED_NBT_ELEMENT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec UNLIMITED_NBT_ELEMENT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.UNLIMITED_NBT_ELEMENT); }
// public static void UNLIMITED_NBT_ELEMENT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.UNLIMITED_NBT_ELEMENT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec UNLIMITED_NBT_COMPOUND() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNLIMITED_NBT_COMPOUND); }
// public void UNLIMITED_NBT_COMPOUND(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNLIMITED_NBT_COMPOUND = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec UNLIMITED_NBT_COMPOUND() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.UNLIMITED_NBT_COMPOUND); }
// public static void UNLIMITED_NBT_COMPOUND(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.UNLIMITED_NBT_COMPOUND = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PROPERTY_MAP() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PROPERTY_MAP); }
// public void PROPERTY_MAP(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PROPERTY_MAP = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PROPERTY_MAP() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.PROPERTY_MAP); }
// public static void PROPERTY_MAP(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.PROPERTY_MAP = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec GAME_PROFILE() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.GAME_PROFILE); }
// public void GAME_PROFILE(yarnwrap.network.codec.PacketCodec value) { wrapperContained.GAME_PROFILE = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec GAME_PROFILE() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.GAME_PROFILE); }
// public static void GAME_PROFILE(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.GAME_PROFILE = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec UNSIGNED_SHORT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNSIGNED_SHORT); }
// public void UNSIGNED_SHORT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNSIGNED_SHORT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec UNSIGNED_SHORT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.UNSIGNED_SHORT); }
// public static void UNSIGNED_SHORT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.UNSIGNED_SHORT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec SYNC_ID() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.SYNC_ID); }
// public void SYNC_ID(yarnwrap.network.codec.PacketCodec value) { wrapperContained.SYNC_ID = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec SYNC_ID() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.SYNC_ID); }
// public static void SYNC_ID(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.SYNC_ID = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec DEGREES() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.DEGREES); }
// public void DEGREES(yarnwrap.network.codec.PacketCodec value) { wrapperContained.DEGREES = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec DEGREES() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.DEGREES); }
// public static void DEGREES(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.DEGREES = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec LONG() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LONG); }
// public void LONG(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LONG = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec LONG() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.LONG); }
// public static void LONG(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.LONG = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec OPTIONAL_INT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_INT); }
// public void OPTIONAL_INT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_INT = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec OPTIONAL_INT() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.OPTIONAL_INT); }
// public static void OPTIONAL_INT(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.OPTIONAL_INT = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec LONG_ARRAY() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.LONG_ARRAY); }
// public void LONG_ARRAY(yarnwrap.network.codec.PacketCodec value) { wrapperContained.LONG_ARRAY = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec LONG_ARRAY() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.LONG_ARRAY); }
// public static void LONG_ARRAY(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.LONG_ARRAY = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec RGB() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.RGB); }
// public void RGB(yarnwrap.network.codec.PacketCodec value) { wrapperContained.RGB = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec RGB() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.RGB); }
// public static void RGB(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.codec.PacketCodecs.RGB = value.wrapperContained; }

// public Object toList() { return wrapperContained.toList(); }
public static Object toList() { return net.minecraft.network.codec.PacketCodecs.toList(); }
// public yarnwrap.network.codec.PacketCodec string(int maxLength) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.string(maxLength)); }
// public static yarnwrap.network.codec.PacketCodec string(int maxLength, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.string(maxLength)); }
// public yarnwrap.network.codec.PacketCodec registryValue(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryValue(registry.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec registryValue(yarnwrap.registry.RegistryKey registry, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registryValue(registry.wrapperContained)); }
// // public yarnwrap.network.codec.PacketCodec registry(yarnwrap.registry.RegistryKey registry,java.util.function.Function registryTransformer) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registry(registry.wrapperContained,registryTransformer)); }
// public static yarnwrap.network.codec.PacketCodec registry(yarnwrap.registry.RegistryKey registry,java.util.function.Function registryTransformer, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registry(registry.wrapperContained,registryTransformer)); }
// public yarnwrap.network.codec.PacketCodec registryEntry(yarnwrap.registry.RegistryKey registry,yarnwrap.network.codec.PacketCodec directCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryEntry(registry.wrapperContained,directCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec registryEntry(yarnwrap.registry.RegistryKey registry,yarnwrap.network.codec.PacketCodec directCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registryEntry(registry.wrapperContained,directCodec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec codec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.codec(codec)); }
// public static yarnwrap.network.codec.PacketCodec codec(com.mojang.serialization.Codec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.codec(codec)); }
// public yarnwrap.network.codec.PacketCodec entryOf(yarnwrap.util.collection.IndexedIterable iterable) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.entryOf(iterable.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec entryOf(yarnwrap.util.collection.IndexedIterable iterable, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.entryOf(iterable.wrapperContained)); }
// public yarnwrap.util.collection.IndexedIterable method_56372(yarnwrap.registry.Registry registry) { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.method_56372(registry.wrapperContained)); }
// public static yarnwrap.util.collection.IndexedIterable method_56372(yarnwrap.registry.Registry registry, ) { return new yarnwrap.util.collection.IndexedIterable(net.minecraft.network.codec.PacketCodecs.method_56372(registry.wrapperContained)); }
// public Object toCollection(java.util.function.IntFunction collectionFactory) { return wrapperContained.toCollection(collectionFactory); }
// public static Object toCollection(java.util.function.IntFunction collectionFactory, ) { return net.minecraft.network.codec.PacketCodecs.toCollection(collectionFactory); }
// public yarnwrap.network.codec.PacketCodec indexed(java.util.function.IntFunction indexToValue,java.util.function.ToIntFunction valueToIndex) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.indexed(indexToValue,valueToIndex)); }
// public static yarnwrap.network.codec.PacketCodec indexed(java.util.function.IntFunction indexToValue,java.util.function.ToIntFunction valueToIndex, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.indexed(indexToValue,valueToIndex)); }
// public yarnwrap.network.codec.PacketCodec collection(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec elementCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.collection(factory,elementCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec collection(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec elementCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.collection(factory,elementCodec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec map(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec keyCodec,yarnwrap.network.codec.PacketCodec valueCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.map(factory,keyCodec.wrapperContained,valueCodec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec map(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec keyCodec,yarnwrap.network.codec.PacketCodec valueCodec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.map(factory,keyCodec.wrapperContained,valueCodec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec nbt(java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.nbt(sizeTracker)); }
// public static yarnwrap.network.codec.PacketCodec nbt(java.util.function.Supplier sizeTracker, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.nbt(sizeTracker)); }
// public yarnwrap.network.codec.PacketCodec optional(yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.optional(codec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec optional(yarnwrap.network.codec.PacketCodec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.optional(codec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec registryEntry(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryEntry(registry.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec registryEntry(yarnwrap.registry.RegistryKey registry, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registryEntry(registry.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56384(java.util.function.IntFunction codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56384(codec)); }
// public static yarnwrap.network.codec.PacketCodec method_56384(java.util.function.IntFunction codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.method_56384(codec)); }
// public yarnwrap.network.codec.PacketCodec method_56385(yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56385(codec.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec method_56385(yarnwrap.network.codec.PacketCodec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.method_56385(codec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec byteArray(int maxLength) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.byteArray(maxLength)); }
// public static yarnwrap.network.codec.PacketCodec byteArray(int maxLength, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.byteArray(maxLength)); }
// public yarnwrap.network.codec.PacketCodec registryCodec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryCodec(codec)); }
// public static yarnwrap.network.codec.PacketCodec registryCodec(com.mojang.serialization.Codec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registryCodec(codec)); }
// public yarnwrap.network.codec.PacketCodec method_57986(int codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_57986(codec)); }
// public static yarnwrap.network.codec.PacketCodec method_57986(int codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.method_57986(codec)); }
// public yarnwrap.network.codec.PacketCodec unlimitedCodec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.unlimitedCodec(codec)); }
// public static yarnwrap.network.codec.PacketCodec unlimitedCodec(com.mojang.serialization.Codec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.unlimitedCodec(codec)); }
// public yarnwrap.network.codec.PacketCodec codec(com.mojang.serialization.Codec codec,java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.codec(codec,sizeTracker)); }
// public static yarnwrap.network.codec.PacketCodec codec(com.mojang.serialization.Codec codec,java.util.function.Supplier sizeTracker, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.codec(codec,sizeTracker)); }
// public int readCollectionSize(io.netty.buffer.ByteBuf buf,int maxSize) { return wrapperContained.readCollectionSize(buf,maxSize); }
// public static int readCollectionSize(io.netty.buffer.ByteBuf buf,int maxSize, ) { return net.minecraft.network.codec.PacketCodecs.readCollectionSize(buf,maxSize); }
// public void writeCollectionSize(io.netty.buffer.ByteBuf buf,int size,int maxSize) { wrapperContained.writeCollectionSize(buf,size,maxSize); }
// public static void writeCollectionSize(io.netty.buffer.ByteBuf buf,int size,int maxSize, ) { net.minecraft.network.codec.PacketCodecs.writeCollectionSize(buf,size,maxSize); }
// public yarnwrap.network.codec.PacketCodec collection(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec elementCodec,int maxSize) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.collection(factory,elementCodec.wrapperContained,maxSize)); }
// public static yarnwrap.network.codec.PacketCodec collection(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec elementCodec,int maxSize, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.collection(factory,elementCodec.wrapperContained,maxSize)); }
// public yarnwrap.network.codec.PacketCodec map(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec keyCodec,yarnwrap.network.codec.PacketCodec valueCodec,int maxSize) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.map(factory,keyCodec.wrapperContained,valueCodec.wrapperContained,maxSize)); }
// public static yarnwrap.network.codec.PacketCodec map(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec keyCodec,yarnwrap.network.codec.PacketCodec valueCodec,int maxSize, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.map(factory,keyCodec.wrapperContained,valueCodec.wrapperContained,maxSize)); }
// public yarnwrap.nbt.NbtElement method_57993(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtElement(wrapperContained.method_57993(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtElement method_57993(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.network.codec.PacketCodecs.method_57993(nbt.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound method_57994(yarnwrap.nbt.NbtElement nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_57994(nbt.wrapperContained)); }
// public static yarnwrap.nbt.NbtCompound method_57994(yarnwrap.nbt.NbtElement nbt, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.network.codec.PacketCodecs.method_57994(nbt.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec either(yarnwrap.network.codec.PacketCodec left,yarnwrap.network.codec.PacketCodec right) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.either(left.wrapperContained,right.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec either(yarnwrap.network.codec.PacketCodec left,yarnwrap.network.codec.PacketCodec right, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.either(left.wrapperContained,right.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec registryCodec(com.mojang.serialization.Codec codec,java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryCodec(codec,sizeTracker)); }
// public static yarnwrap.network.codec.PacketCodec registryCodec(com.mojang.serialization.Codec codec,java.util.function.Supplier sizeTracker, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registryCodec(codec,sizeTracker)); }
// public yarnwrap.network.codec.PacketCodec nbtCompound(java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.nbtCompound(sizeTracker)); }
// public static yarnwrap.network.codec.PacketCodec nbtCompound(java.util.function.Supplier sizeTracker, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.nbtCompound(sizeTracker)); }
// public Object toList(int maxLength) { return wrapperContained.toList(maxLength); }
// public static Object toList(int maxLength, ) { return net.minecraft.network.codec.PacketCodecs.toList(maxLength); }
// public yarnwrap.network.codec.PacketCodec registryEntryList(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryEntryList(registryRef.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec registryEntryList(yarnwrap.registry.RegistryKey registryRef, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.registryEntryList(registryRef.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec unlimitedRegistryCodec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.unlimitedRegistryCodec(codec)); }
// public static yarnwrap.network.codec.PacketCodec unlimitedRegistryCodec(com.mojang.serialization.Codec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.unlimitedRegistryCodec(codec)); }
// public java.util.OptionalInt method_64959(java.lang.Integer value) { return wrapperContained.method_64959(value); }
// public static java.util.OptionalInt method_64959(java.lang.Integer value, ) { return net.minecraft.network.codec.PacketCodecs.method_64959(value); }
// public java.lang.Integer method_64960(java.util.OptionalInt value) { return wrapperContained.method_64960(value); }
// public static java.lang.Integer method_64960(java.util.OptionalInt value, ) { return net.minecraft.network.codec.PacketCodecs.method_64960(value); }
// public Object lengthPrepended(int maxSize,java.util.function.BiFunction bufWrapper) { return wrapperContained.lengthPrepended(maxSize,bufWrapper); }
// public static Object lengthPrepended(int maxSize,java.util.function.BiFunction bufWrapper, ) { return net.minecraft.network.codec.PacketCodecs.lengthPrepended(maxSize,bufWrapper); }
// public yarnwrap.network.codec.PacketCodec method_68862(int codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_68862(codec)); }
// public static yarnwrap.network.codec.PacketCodec method_68862(int codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.method_68862(codec)); }
// public yarnwrap.network.RegistryByteBuf method_68863(yarnwrap.network.RegistryByteBuf originalBuf,io.netty.buffer.ByteBuf bufToWrap) { return new yarnwrap.network.RegistryByteBuf(wrapperContained.method_68863(originalBuf.wrapperContained,bufToWrap)); }
// public static yarnwrap.network.RegistryByteBuf method_68863(yarnwrap.network.RegistryByteBuf originalBuf,io.netty.buffer.ByteBuf bufToWrap, ) { return new yarnwrap.network.RegistryByteBuf(net.minecraft.network.codec.PacketCodecs.method_68863(originalBuf.wrapperContained,bufToWrap)); }
// public Object lengthPrepended(int maxSize) { return wrapperContained.lengthPrepended(maxSize); }
// public static Object lengthPrepended(int maxSize, ) { return net.minecraft.network.codec.PacketCodecs.lengthPrepended(maxSize); }
// public yarnwrap.network.codec.PacketCodec method_71570(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_71570(codec)); }
// public static yarnwrap.network.codec.PacketCodec method_71570(com.mojang.serialization.Codec codec, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.method_71570(codec)); }
// public Object fromCodec(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec) { return wrapperContained.fromCodec(ops,codec); }
// public static Object fromCodec(com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Codec codec, ) { return net.minecraft.network.codec.PacketCodecs.fromCodec(ops,codec); }
// public yarnwrap.network.codec.PacketCodec lenientJson(int maxLength) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.lenientJson(maxLength)); }
// public static yarnwrap.network.codec.PacketCodec lenientJson(int maxLength, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.codec.PacketCodecs.lenientJson(maxLength)); }

}