package yarnwrap.entity.decoration.painting;
public class PaintingEntity { public net.minecraft.entity.decoration.painting.PaintingEntity wrapperContained; public PaintingEntity(net.minecraft.entity.decoration.painting.PaintingEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
public com.mojang.serialization.MapCodec VARIANT_MAP_CODEC() { return wrapperContained.VARIANT_MAP_CODEC; }
// public void VARIANT_MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.VARIANT_MAP_CODEC = value; }
public com.mojang.serialization.Codec VARIANT_ENTRY_CODEC() { return wrapperContained.VARIANT_ENTRY_CODEC; }
// public void VARIANT_ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.VARIANT_ENTRY_CODEC = value; }
public java.util.Optional placePainting(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { return wrapperContained.placePainting(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
public void setVariant(yarnwrap.registry.entry.RegistryEntry variant) { wrapperContained.setVariant(variant.wrapperContained); }
// public int getSize(yarnwrap.registry.entry.RegistryEntry variant) { return wrapperContained.getSize(variant.wrapperContained); }
// public double getOffset(int length) { return wrapperContained.getOffset(length); }

}