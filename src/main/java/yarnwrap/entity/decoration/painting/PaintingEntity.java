package yarnwrap.entity.decoration.painting;
public class PaintingEntity { public net.minecraft.entity.decoration.painting.PaintingEntity wrapperContained; public PaintingEntity(net.minecraft.entity.decoration.painting.PaintingEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.decoration.painting.PaintingEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.decoration.painting.PaintingEntity.VARIANT = value.wrapperContained; }

// public PaintingEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.entity.decoration.painting.PaintingEntity(world.wrapperContained,pos.wrapperContained); }
public PaintingEntity(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction,yarnwrap.registry.entry.RegistryEntry variant) { this.wrapperContained = new net.minecraft.entity.decoration.painting.PaintingEntity(world.wrapperContained,pos.wrapperContained,direction.wrapperContained,variant.wrapperContained); }
// public boolean method_43399(int variant) { return wrapperContained.method_43399(variant); }
// public static boolean method_43399(int variant, ) { return net.minecraft.entity.decoration.painting.PaintingEntity.method_43399(variant); }
// public boolean method_43400(yarnwrap.entity.decoration.painting.PaintingEntity variant) { return wrapperContained.method_43400(variant.wrapperContained); }
// public static boolean method_43400(yarnwrap.entity.decoration.painting.PaintingEntity variant, ) { return net.minecraft.entity.decoration.painting.PaintingEntity.method_43400(variant.wrapperContained); }
// public java.util.Optional placePainting(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing) { return wrapperContained.placePainting(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public static java.util.Optional placePainting(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction facing, ) { return net.minecraft.entity.decoration.painting.PaintingEntity.placePainting(world.wrapperContained,pos.wrapperContained,facing.wrapperContained); }
// public void setVariant(yarnwrap.registry.entry.RegistryEntry variant) { wrapperContained.setVariant(variant.wrapperContained); }
// public static void setVariant(yarnwrap.registry.entry.RegistryEntry variant, ) { net.minecraft.entity.decoration.painting.PaintingEntity.setVariant(variant.wrapperContained); }
// public int getSize(yarnwrap.registry.entry.RegistryEntry variant) { return wrapperContained.getSize(variant.wrapperContained); }
// public static int getSize(yarnwrap.registry.entry.RegistryEntry variant, ) { return net.minecraft.entity.decoration.painting.PaintingEntity.getSize(variant.wrapperContained); }
public yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getVariant()); }
// public static yarnwrap.registry.entry.RegistryEntry getVariant() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.decoration.painting.PaintingEntity.getVariant()); }
// public double getOffset(int length) { return wrapperContained.getOffset(length); }
// public static double getOffset(int length, ) { return net.minecraft.entity.decoration.painting.PaintingEntity.getOffset(length); }

}