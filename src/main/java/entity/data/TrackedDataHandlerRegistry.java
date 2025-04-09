package yarnwrap.entity.data;
public class TrackedDataHandlerRegistry { public net.minecraft.entity.data.TrackedDataHandlerRegistry wrapperContained; public TrackedDataHandlerRegistry(net.minecraft.entity.data.TrackedDataHandlerRegistry wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.entity.data.TrackedDataHandler BLOCK_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BLOCK_STATE); }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_UUID() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_UUID); }
public yarnwrap.entity.data.TrackedDataHandler PARTICLE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.PARTICLE); }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_BLOCK_POS() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_BLOCK_POS); }
public yarnwrap.entity.data.TrackedDataHandler ROTATION() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ROTATION); }
public yarnwrap.entity.data.TrackedDataHandler TEXT_COMPONENT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.TEXT_COMPONENT); }
public yarnwrap.entity.data.TrackedDataHandler NBT_COMPOUND() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.NBT_COMPOUND); }
public yarnwrap.entity.data.TrackedDataHandler BYTE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BYTE); }
public yarnwrap.entity.data.TrackedDataHandler FLOAT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.FLOAT); }
public yarnwrap.entity.data.TrackedDataHandler FACING() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.FACING); }
public yarnwrap.entity.data.TrackedDataHandler ITEM_STACK() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ITEM_STACK); }
public yarnwrap.entity.data.TrackedDataHandler BOOLEAN() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BOOLEAN); }
public yarnwrap.entity.data.TrackedDataHandler BLOCK_POS() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.BLOCK_POS); }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_TEXT_COMPONENT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_TEXT_COMPONENT); }
public yarnwrap.entity.data.TrackedDataHandler STRING() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.STRING); }
public yarnwrap.entity.data.TrackedDataHandler INTEGER() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.INTEGER); }
// public yarnwrap.util.collection.Int2ObjectBiMap DATA_HANDLERS() { return new yarnwrap.util.collection.Int2ObjectBiMap(wrapperContained.DATA_HANDLERS); }
public yarnwrap.entity.data.TrackedDataHandler VILLAGER_DATA() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.VILLAGER_DATA); }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_INT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_INT); }
public yarnwrap.entity.data.TrackedDataHandler ENTITY_POSE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ENTITY_POSE); }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_GLOBAL_POS() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_GLOBAL_POS); }
public yarnwrap.entity.data.TrackedDataHandler CAT_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.CAT_VARIANT); }
public yarnwrap.entity.data.TrackedDataHandler FROG_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.FROG_VARIANT); }
public yarnwrap.entity.data.TrackedDataHandler PAINTING_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.PAINTING_VARIANT); }
public yarnwrap.entity.data.TrackedDataHandler LONG() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.LONG); }
public yarnwrap.entity.data.TrackedDataHandler QUATERNIONF() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.QUATERNIONF); }
public yarnwrap.entity.data.TrackedDataHandler OPTIONAL_BLOCK_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.OPTIONAL_BLOCK_STATE); }
public yarnwrap.entity.data.TrackedDataHandler VECTOR3F() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.VECTOR3F); }
public yarnwrap.entity.data.TrackedDataHandler SNIFFER_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.SNIFFER_STATE); }
public yarnwrap.entity.data.TrackedDataHandler ARMADILLO_STATE() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.ARMADILLO_STATE); }
// public yarnwrap.network.codec.PacketCodec OPTIONAL_BLOCK_STATE_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_BLOCK_STATE_CODEC); }
// public yarnwrap.network.codec.PacketCodec OPTIONAL_INT_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.OPTIONAL_INT_CODEC); }
public yarnwrap.entity.data.TrackedDataHandler WOLF_VARIANT() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.WOLF_VARIANT); }
public yarnwrap.entity.data.TrackedDataHandler PARTICLE_LIST() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.PARTICLE_LIST); }
public int getId(yarnwrap.entity.data.TrackedDataHandler handler) { return wrapperContained.getId(handler.wrapperContained); }
public void register(yarnwrap.entity.data.TrackedDataHandler handler) { wrapperContained.register(handler.wrapperContained); }
public yarnwrap.entity.data.TrackedDataHandler get(int id) { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.get(id)); }

}