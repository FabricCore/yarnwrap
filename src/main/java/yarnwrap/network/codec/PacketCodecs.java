package yarnwrap.network.codec;
public class PacketCodecs { public net.minecraft.network.codec.PacketCodecs wrapperContained; public PacketCodecs(net.minecraft.network.codec.PacketCodecs wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec BOOL() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.BOOL); }
// public void BOOL(yarnwrap.network.codec.PacketCodec value) { wrapperContained.BOOL = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec BYTE() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.BYTE); }
// public void BYTE(yarnwrap.network.codec.PacketCodec value) { wrapperContained.BYTE = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec SHORT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.SHORT); }
// public void SHORT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.SHORT = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec VAR_INT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.VAR_INT); }
// public void VAR_INT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.VAR_INT = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec VAR_LONG() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.VAR_LONG); }
// public void VAR_LONG(yarnwrap.network.codec.PacketCodec value) { wrapperContained.VAR_LONG = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec FLOAT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.FLOAT); }
// public void FLOAT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.FLOAT = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec DOUBLE() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.DOUBLE); }
// public void DOUBLE(yarnwrap.network.codec.PacketCodec value) { wrapperContained.DOUBLE = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec STRING() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.STRING); }
// public void STRING(yarnwrap.network.codec.PacketCodec value) { wrapperContained.STRING = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec NBT_ELEMENT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.NBT_ELEMENT); }
// public void NBT_ELEMENT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.NBT_ELEMENT = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec NBT_COMPOUND() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.NBT_COMPOUND); }
// public void NBT_COMPOUND(yarnwrap.network.codec.PacketCodec value) { wrapperContained.NBT_COMPOUND = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec OPTIONAL_NBT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_NBT); }
// public void OPTIONAL_NBT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_NBT = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec VECTOR3F() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.VECTOR3F); }
// public void VECTOR3F(yarnwrap.network.codec.PacketCodec value) { wrapperContained.VECTOR3F = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec QUATERNIONF() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.QUATERNIONF); }
// public void QUATERNIONF(yarnwrap.network.codec.PacketCodec value) { wrapperContained.QUATERNIONF = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec BYTE_ARRAY() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.BYTE_ARRAY); }
// public void BYTE_ARRAY(yarnwrap.network.codec.PacketCodec value) { wrapperContained.BYTE_ARRAY = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec INTEGER() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.INTEGER); }
// public void INTEGER(yarnwrap.network.codec.PacketCodec value) { wrapperContained.INTEGER = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec UNLIMITED_NBT_ELEMENT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNLIMITED_NBT_ELEMENT); }
// public void UNLIMITED_NBT_ELEMENT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNLIMITED_NBT_ELEMENT = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec UNLIMITED_NBT_COMPOUND() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNLIMITED_NBT_COMPOUND); }
// public void UNLIMITED_NBT_COMPOUND(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNLIMITED_NBT_COMPOUND = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec PROPERTY_MAP() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PROPERTY_MAP); }
// public void PROPERTY_MAP(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PROPERTY_MAP = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec GAME_PROFILE() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.GAME_PROFILE); }
// public void GAME_PROFILE(yarnwrap.network.codec.PacketCodec value) { wrapperContained.GAME_PROFILE = value.wrapperContained; }
public yarnwrap.network.codec.PacketCodec UNSIGNED_SHORT() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.UNSIGNED_SHORT); }
// public void UNSIGNED_SHORT(yarnwrap.network.codec.PacketCodec value) { wrapperContained.UNSIGNED_SHORT = value.wrapperContained; }
// public Object toList() { return wrapperContained.toList(); }
// public yarnwrap.network.codec.PacketCodec string(int maxLength) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.string(maxLength)); }
// public yarnwrap.network.codec.PacketCodec registryValue(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryValue(registry.wrapperContained)); }
// // public yarnwrap.network.codec.PacketCodec registry(yarnwrap.registry.RegistryKey registry,java.util.function.Function registryTransformer) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registry(registry.wrapperContained,registryTransformer)); }
// public yarnwrap.network.codec.PacketCodec registryEntry(yarnwrap.registry.RegistryKey registry,yarnwrap.network.codec.PacketCodec directCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryEntry(registry.wrapperContained,directCodec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec codec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.codec(codec)); }
// public yarnwrap.nbt.NbtElement method_56369(com.mojang.serialization.Codec value) { return new yarnwrap.nbt.NbtElement(wrapperContained.method_56369(value)); }
// public java.lang.Object method_56370(com.mojang.serialization.Codec nbt) { return wrapperContained.method_56370(nbt); }
// public yarnwrap.network.codec.PacketCodec entryOf(yarnwrap.util.collection.IndexedIterable iterable) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.entryOf(iterable.wrapperContained)); }
// public yarnwrap.util.collection.IndexedIterable method_56372(yarnwrap.registry.Registry registry) { return new yarnwrap.util.collection.IndexedIterable(wrapperContained.method_56372(registry.wrapperContained)); }
// public io.netty.handler.codec.EncoderException method_56373(java.lang.Object error) { return wrapperContained.method_56373(error); }
// public Object toCollection(java.util.function.IntFunction collectionFactory) { return wrapperContained.toCollection(collectionFactory); }
// public yarnwrap.network.codec.PacketCodec indexed(java.util.function.IntFunction indexToValue,java.util.function.ToIntFunction valueToIndex) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.indexed(indexToValue,valueToIndex)); }
// public yarnwrap.network.codec.PacketCodec collection(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec elementCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.collection(factory,elementCodec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec map(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec keyCodec,yarnwrap.network.codec.PacketCodec valueCodec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.map(factory,keyCodec.wrapperContained,valueCodec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec nbt(java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.nbt(sizeTracker)); }
// public io.netty.handler.codec.DecoderException method_56381(yarnwrap.nbt.NbtElement error) { return wrapperContained.method_56381(error.wrapperContained); }
// public yarnwrap.network.codec.PacketCodec optional(yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.optional(codec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec registryEntry(yarnwrap.registry.RegistryKey registry) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryEntry(registry.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec method_56384(java.util.function.IntFunction codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56384(codec)); }
// public yarnwrap.network.codec.PacketCodec method_56385(yarnwrap.network.codec.PacketCodec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_56385(codec.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec byteArray(int maxLength) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.byteArray(maxLength)); }
// public yarnwrap.network.codec.PacketCodec registryCodec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryCodec(codec)); }
// public yarnwrap.network.codec.PacketCodec method_57986(int codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.method_57986(codec)); }
// public yarnwrap.network.codec.PacketCodec unlimitedCodec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.unlimitedCodec(codec)); }
// public yarnwrap.network.codec.PacketCodec codec(com.mojang.serialization.Codec codec,java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.codec(codec,sizeTracker)); }
// public int readCollectionSize(io.netty.buffer.ByteBuf buf,int maxSize) { return wrapperContained.readCollectionSize(buf,maxSize); }
// public void writeCollectionSize(io.netty.buffer.ByteBuf buf,int size,int maxSize) { wrapperContained.writeCollectionSize(buf,size,maxSize); }
// public yarnwrap.network.codec.PacketCodec collection(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec elementCodec,int maxSize) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.collection(factory,elementCodec.wrapperContained,maxSize)); }
// public yarnwrap.network.codec.PacketCodec map(java.util.function.IntFunction factory,yarnwrap.network.codec.PacketCodec keyCodec,yarnwrap.network.codec.PacketCodec valueCodec,int maxSize) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.map(factory,keyCodec.wrapperContained,valueCodec.wrapperContained,maxSize)); }
// public yarnwrap.nbt.NbtElement method_57993(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtElement(wrapperContained.method_57993(nbt.wrapperContained)); }
// public yarnwrap.nbt.NbtCompound method_57994(yarnwrap.nbt.NbtElement nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_57994(nbt.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec either(yarnwrap.network.codec.PacketCodec left,yarnwrap.network.codec.PacketCodec right) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.either(left.wrapperContained,right.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec registryCodec(com.mojang.serialization.Codec codec,java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryCodec(codec,sizeTracker)); }
// public yarnwrap.network.codec.PacketCodec nbtCompound(java.util.function.Supplier sizeTracker) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.nbtCompound(sizeTracker)); }
// public Object toList(int maxLength) { return wrapperContained.toList(maxLength); }
// public yarnwrap.network.codec.PacketCodec registryEntryList(yarnwrap.registry.RegistryKey registryRef) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.registryEntryList(registryRef.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec unlimitedRegistryCodec(com.mojang.serialization.Codec codec) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.unlimitedRegistryCodec(codec)); }

}