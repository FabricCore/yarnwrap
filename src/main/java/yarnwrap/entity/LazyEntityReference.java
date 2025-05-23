package yarnwrap.entity;
public class LazyEntityReference { public net.minecraft.entity.LazyEntityReference wrapperContained; public LazyEntityReference(net.minecraft.entity.LazyEntityReference wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.datafixers.util.Either value() { return wrapperContained.value; }
// public void value(com.mojang.datafixers.util.Either value) { wrapperContained.value = value; }
// public static com.mojang.datafixers.util.Either value() { return net.minecraft.entity.LazyEntityReference.value; }
// public static void value(com.mojang.datafixers.util.Either value, ) { net.minecraft.entity.LazyEntityReference.value = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.LazyEntityReference.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.LazyEntityReference.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.LazyEntityReference.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.LazyEntityReference.PACKET_CODEC = value.wrapperContained; }

public LazyEntityReference(java.util.UUID value) { this.wrapperContained = new net.minecraft.entity.LazyEntityReference(value); }
public LazyEntityReference(yarnwrap.world.entity.UniquelyIdentifiable value) { this.wrapperContained = new net.minecraft.entity.LazyEntityReference(value.wrapperContained); }
// public com.mojang.serialization.Codec createCodec() { return wrapperContained.createCodec(); }
public static com.mojang.serialization.Codec createCodec() { return net.minecraft.entity.LazyEntityReference.createCodec(); }
// public yarnwrap.world.entity.UniquelyIdentifiable resolve(yarnwrap.entity.LazyEntityReference entity,yarnwrap.world.entity.EntityQueriable world,java.lang.Class type) { return new yarnwrap.world.entity.UniquelyIdentifiable(wrapperContained.resolve(entity.wrapperContained,world.wrapperContained,type)); }
// public static yarnwrap.world.entity.UniquelyIdentifiable resolve(yarnwrap.entity.LazyEntityReference entity,yarnwrap.world.entity.EntityQueriable world,java.lang.Class type, ) { return new yarnwrap.world.entity.UniquelyIdentifiable(net.minecraft.entity.LazyEntityReference.resolve(entity.wrapperContained,world.wrapperContained,type)); }
public yarnwrap.world.entity.UniquelyIdentifiable resolve(yarnwrap.world.entity.EntityQueriable world,java.lang.Class type) { return new yarnwrap.world.entity.UniquelyIdentifiable(wrapperContained.resolve(world.wrapperContained,type)); }
// public static yarnwrap.world.entity.UniquelyIdentifiable resolve(yarnwrap.world.entity.EntityQueriable world,java.lang.Class type, ) { return new yarnwrap.world.entity.UniquelyIdentifiable(net.minecraft.entity.LazyEntityReference.resolve(world.wrapperContained,type)); }
public boolean uuidEquals(yarnwrap.world.entity.UniquelyIdentifiable o) { return wrapperContained.uuidEquals(o.wrapperContained); }
// public static boolean uuidEquals(yarnwrap.world.entity.UniquelyIdentifiable o, ) { return net.minecraft.entity.LazyEntityReference.uuidEquals(o.wrapperContained); }
// public yarnwrap.world.entity.UniquelyIdentifiable cast(yarnwrap.world.entity.UniquelyIdentifiable entity,java.lang.Class clazz) { return new yarnwrap.world.entity.UniquelyIdentifiable(wrapperContained.cast(entity.wrapperContained,clazz)); }
// public static yarnwrap.world.entity.UniquelyIdentifiable cast(yarnwrap.world.entity.UniquelyIdentifiable entity,java.lang.Class clazz, ) { return new yarnwrap.world.entity.UniquelyIdentifiable(net.minecraft.entity.LazyEntityReference.cast(entity.wrapperContained,clazz)); }
// public java.util.UUID method_66258(java.util.UUID uuid) { return wrapperContained.method_66258(uuid); }
// public static java.util.UUID method_66258(java.util.UUID uuid, ) { return net.minecraft.entity.LazyEntityReference.method_66258(uuid); }
// public void writeData(yarnwrap.storage.WriteView view,java.lang.String key) { wrapperContained.writeData(view.wrapperContained,key); }
// public static void writeData(yarnwrap.storage.WriteView view,java.lang.String key, ) { net.minecraft.entity.LazyEntityReference.writeData(view.wrapperContained,key); }
// public yarnwrap.entity.LazyEntityReference fromDataOrPlayerName(yarnwrap.storage.ReadView view,java.lang.String key,yarnwrap.world.World world) { return new yarnwrap.entity.LazyEntityReference(wrapperContained.fromDataOrPlayerName(view.wrapperContained,key,world.wrapperContained)); }
// public static yarnwrap.entity.LazyEntityReference fromDataOrPlayerName(yarnwrap.storage.ReadView view,java.lang.String key,yarnwrap.world.World world, ) { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.LazyEntityReference.fromDataOrPlayerName(view.wrapperContained,key,world.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec()); }
public static yarnwrap.network.codec.PacketCodec createPacketCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.LazyEntityReference.createPacketCodec()); }
// public yarnwrap.entity.LazyEntityReference fromData(yarnwrap.storage.ReadView view,java.lang.String key) { return new yarnwrap.entity.LazyEntityReference(wrapperContained.fromData(view.wrapperContained,key)); }
// public static yarnwrap.entity.LazyEntityReference fromData(yarnwrap.storage.ReadView view,java.lang.String key, ) { return new yarnwrap.entity.LazyEntityReference(net.minecraft.entity.LazyEntityReference.fromData(view.wrapperContained,key)); }
public java.util.UUID getUuid() { return wrapperContained.getUuid(); }
// public static java.util.UUID getUuid() { return net.minecraft.entity.LazyEntityReference.getUuid(); }
// public java.util.UUID method_68262(yarnwrap.world.World name) { return wrapperContained.method_68262(name.wrapperContained); }
// public static java.util.UUID method_68262(yarnwrap.world.World name, ) { return net.minecraft.entity.LazyEntityReference.method_68262(name.wrapperContained); }
// public void writeData(yarnwrap.entity.LazyEntityReference entityRef,yarnwrap.storage.WriteView view,java.lang.String key) { wrapperContained.writeData(entityRef.wrapperContained,view.wrapperContained,key); }
// public static void writeData(yarnwrap.entity.LazyEntityReference entityRef,yarnwrap.storage.WriteView view,java.lang.String key, ) { net.minecraft.entity.LazyEntityReference.writeData(entityRef.wrapperContained,view.wrapperContained,key); }

}