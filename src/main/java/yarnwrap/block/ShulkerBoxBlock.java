package yarnwrap.block;
public class ShulkerBoxBlock { public net.minecraft.block.ShulkerBoxBlock wrapperContained; public ShulkerBoxBlock(net.minecraft.block.ShulkerBoxBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(wrapperContained.color); }
// public void color(yarnwrap.util.DyeColor value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.DyeColor color() { return new yarnwrap.util.DyeColor(net.minecraft.block.ShulkerBoxBlock.color); }
// public static void color(yarnwrap.util.DyeColor value, ) { net.minecraft.block.ShulkerBoxBlock.color = value.wrapperContained; }

// public yarnwrap.util.Identifier CONTENTS_DYNAMIC_DROP_ID() { return new yarnwrap.util.Identifier(wrapperContained.CONTENTS_DYNAMIC_DROP_ID); }
// public void CONTENTS_DYNAMIC_DROP_ID(yarnwrap.util.Identifier value) { wrapperContained.CONTENTS_DYNAMIC_DROP_ID = value.wrapperContained; }
public static yarnwrap.util.Identifier CONTENTS_DYNAMIC_DROP_ID() { return new yarnwrap.util.Identifier(net.minecraft.block.ShulkerBoxBlock.CONTENTS_DYNAMIC_DROP_ID); }
// public static void CONTENTS_DYNAMIC_DROP_ID(yarnwrap.util.Identifier value, ) { net.minecraft.block.ShulkerBoxBlock.CONTENTS_DYNAMIC_DROP_ID = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.ShulkerBoxBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.ShulkerBoxBlock.FACING = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ShulkerBoxBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ShulkerBoxBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_DIRECTION() { return wrapperContained.SHAPES_BY_DIRECTION; }
// public void SHAPES_BY_DIRECTION(java.util.Map value) { wrapperContained.SHAPES_BY_DIRECTION = value; }
public static java.util.Map SHAPES_BY_DIRECTION() { return net.minecraft.block.ShulkerBoxBlock.SHAPES_BY_DIRECTION; }
// public static void SHAPES_BY_DIRECTION(java.util.Map value, ) { net.minecraft.block.ShulkerBoxBlock.SHAPES_BY_DIRECTION = value; }

// public ShulkerBoxBlock(yarnwrap.util.DyeColor color,Object settings) { this.wrapperContained = new net.minecraft.block.ShulkerBoxBlock(color.wrapperContained,settings); }
// public void method_10524(yarnwrap.block.entity.ShulkerBoxBlockEntity lootConsumer) { wrapperContained.method_10524(lootConsumer.wrapperContained); }
// public static void method_10524(yarnwrap.block.entity.ShulkerBoxBlockEntity lootConsumer, ) { net.minecraft.block.ShulkerBoxBlock.method_10524(lootConsumer.wrapperContained); }
// public yarnwrap.block.Block get(yarnwrap.util.DyeColor dyeColor) { return new yarnwrap.block.Block(wrapperContained.get(dyeColor.wrapperContained)); }
// public static yarnwrap.block.Block get(yarnwrap.util.DyeColor dyeColor, ) { return new yarnwrap.block.Block(net.minecraft.block.ShulkerBoxBlock.get(dyeColor.wrapperContained)); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public static yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(net.minecraft.block.ShulkerBoxBlock.getColor()); }
// public yarnwrap.item.ItemStack getItemStack(yarnwrap.util.DyeColor color) { return new yarnwrap.item.ItemStack(wrapperContained.getItemStack(color.wrapperContained)); }
// public static yarnwrap.item.ItemStack getItemStack(yarnwrap.util.DyeColor color, ) { return new yarnwrap.item.ItemStack(net.minecraft.block.ShulkerBoxBlock.getItemStack(color.wrapperContained)); }
// public boolean canOpen(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.ShulkerBoxBlockEntity entity) { return wrapperContained.canOpen(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public static boolean canOpen(yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.ShulkerBoxBlockEntity entity, ) { return net.minecraft.block.ShulkerBoxBlock.canOpen(state.wrapperContained,world.wrapperContained,pos.wrapperContained,entity.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_54040(Object instance) { return wrapperContained.method_54040(instance); }
// public static com.mojang.datafixers.kinds.App method_54040(Object instance, ) { return net.minecraft.block.ShulkerBoxBlock.method_54040(instance); }
// public java.util.Optional method_54041(yarnwrap.block.ShulkerBoxBlock block) { return wrapperContained.method_54041(block.wrapperContained); }
// public static java.util.Optional method_54041(yarnwrap.block.ShulkerBoxBlock block, ) { return net.minecraft.block.ShulkerBoxBlock.method_54041(block.wrapperContained); }
// public yarnwrap.block.ShulkerBoxBlock method_54042(java.util.Optional color,Object settings) { return new yarnwrap.block.ShulkerBoxBlock(wrapperContained.method_54042(color,settings)); }
// public static yarnwrap.block.ShulkerBoxBlock method_54042(java.util.Optional color,Object settings, ) { return new yarnwrap.block.ShulkerBoxBlock(net.minecraft.block.ShulkerBoxBlock.method_54042(color,settings)); }

}