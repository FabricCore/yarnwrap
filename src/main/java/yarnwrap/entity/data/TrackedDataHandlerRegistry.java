package yarnwrap.entity.data;
public class TrackedDataHandlerRegistry { public net.minecraft.entity.data.TrackedDataHandlerRegistry wrapperContained; public TrackedDataHandlerRegistry(net.minecraft.entity.data.TrackedDataHandlerRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.data.TrackedDataHandler BLOCK_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BLOCK_STATE); }
// public void BLOCK_STATE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.BLOCK_STATE = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_UUID() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_UUID); }
// public void OPTIONAL_UUID(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.OPTIONAL_UUID = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler PARTICLE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.PARTICLE); }
// public void PARTICLE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.PARTICLE = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_BLOCK_POS() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_BLOCK_POS); }
// public void OPTIONAL_BLOCK_POS(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.OPTIONAL_BLOCK_POS = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler ROTATION() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ROTATION); }
// public void ROTATION(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.ROTATION = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler TEXT_COMPONENT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.TEXT_COMPONENT); }
// public void TEXT_COMPONENT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.TEXT_COMPONENT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler NBT_COMPOUND() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.NBT_COMPOUND); }
// public void NBT_COMPOUND(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.NBT_COMPOUND = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler BYTE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BYTE); }
// public void BYTE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.BYTE = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler FLOAT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.FLOAT); }
// public void FLOAT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.FLOAT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler FACING() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.FACING); }
// public void FACING(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.FACING = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler ITEM_STACK() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ITEM_STACK); }
// public void ITEM_STACK(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.ITEM_STACK = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler BOOLEAN() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BOOLEAN); }
// public void BOOLEAN(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.BOOLEAN = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler BLOCK_POS() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BLOCK_POS); }
// public void BLOCK_POS(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.BLOCK_POS = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_TEXT_COMPONENT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_TEXT_COMPONENT); }
// public void OPTIONAL_TEXT_COMPONENT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.OPTIONAL_TEXT_COMPONENT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler STRING() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.STRING); }
// public void STRING(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.STRING = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler INTEGER() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.INTEGER); }
// public void INTEGER(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.INTEGER = value.wrapperContained; }
// public yarnwrap.util.collection.Int2ObjectBiMap DATA_HANDLERS() { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.DATA_HANDLERS); }
// public void DATA_HANDLERS(yarnwrap.util.collection.Int2ObjectBiMap value) { wrapperContained.DATA_HANDLERS = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.VILLAGER_DATA); }
// public void VILLAGER_DATA(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.VILLAGER_DATA = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_INT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_INT); }
// public void OPTIONAL_INT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.OPTIONAL_INT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler ENTITY_POSE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ENTITY_POSE); }
// public void ENTITY_POSE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.ENTITY_POSE = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_GLOBAL_POS() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_GLOBAL_POS); }
// public void OPTIONAL_GLOBAL_POS(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.OPTIONAL_GLOBAL_POS = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler CAT_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.CAT_VARIANT); }
// public void CAT_VARIANT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.CAT_VARIANT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler FROG_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.FROG_VARIANT); }
// public void FROG_VARIANT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.FROG_VARIANT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler PAINTING_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.PAINTING_VARIANT); }
// public void PAINTING_VARIANT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.PAINTING_VARIANT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler LONG() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.LONG); }
// public void LONG(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.LONG = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler QUATERNIONF() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.QUATERNIONF); }
// public void QUATERNIONF(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.QUATERNIONF = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_BLOCK_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_BLOCK_STATE); }
// public void OPTIONAL_BLOCK_STATE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.OPTIONAL_BLOCK_STATE = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler VECTOR3F() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.VECTOR3F); }
// public void VECTOR3F(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.VECTOR3F = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler SNIFFER_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.SNIFFER_STATE); }
// public void SNIFFER_STATE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.SNIFFER_STATE = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler ARMADILLO_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ARMADILLO_STATE); }
// public void ARMADILLO_STATE(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.ARMADILLO_STATE = value.wrapperContained; }
// public yarnwrap.network.codec.PacketCodec OPTIONAL_BLOCK_STATE_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_BLOCK_STATE_CODEC); }
// public void OPTIONAL_BLOCK_STATE_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_BLOCK_STATE_CODEC = value.wrapperContained; }
// public yarnwrap.network.codec.PacketCodec OPTIONAL_INT_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_INT_CODEC); }
// public void OPTIONAL_INT_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.OPTIONAL_INT_CODEC = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler WOLF_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.WOLF_VARIANT); }
// public void WOLF_VARIANT(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.WOLF_VARIANT = value.wrapperContained; }
public yarnwrap.entity.data.TrackedDataHandler PARTICLE_LIST() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.PARTICLE_LIST); }
// public void PARTICLE_LIST(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.PARTICLE_LIST = value.wrapperContained; }
public int getId(yarnwrap.entity.data.TrackedDataHandler handler) { return wrapperContained.getId(handler.wrapperContained); }
public void register(yarnwrap.entity.data.TrackedDataHandler handler) { wrapperContained.register(handler.wrapperContained); }
public yarnwrap.entity.data.TrackedDataHandler get(int id) { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.get(id)); }

}