package yarnwrap.block.entity;
public class BlockEntityType { public net.minecraft.block.entity.BlockEntityType wrapperContained; public BlockEntityType(net.minecraft.block.entity.BlockEntityType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object factory() { return wrapperContained.factory; }
// // public void factory(Object value) { wrapperContained.factory = value; }
// // public static Object factory() { return net.minecraft.block.entity.BlockEntityType.factory; }
// // public static void factory(Object value, ) { net.minecraft.block.entity.BlockEntityType.factory = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.BlockEntityType.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.BlockEntityType.LOGGER = value; }

// public com.mojang.datafixers.types.Type type() { return wrapperContained.type; }
// public void type(com.mojang.datafixers.types.Type value) { wrapperContained.type = value; }
// public static com.mojang.datafixers.types.Type type() { return net.minecraft.block.entity.BlockEntityType.type; }
// public static void type(com.mojang.datafixers.types.Type value, ) { net.minecraft.block.entity.BlockEntityType.type = value; }

// public java.util.Set blocks() { return wrapperContained.blocks; }
// public void blocks(java.util.Set value) { wrapperContained.blocks = value; }
// public static java.util.Set blocks() { return net.minecraft.block.entity.BlockEntityType.blocks; }
// public static void blocks(java.util.Set value, ) { net.minecraft.block.entity.BlockEntityType.blocks = value; }

// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
// // public static Object registryEntry() { return net.minecraft.block.entity.BlockEntityType.registryEntry; }
// // public static void registryEntry(Object value, ) { net.minecraft.block.entity.BlockEntityType.registryEntry = value; }

// public BlockEntityType(Object factory,java.util.Set blocks,com.mojang.datafixers.types.Type type) { this.wrapperContained = new net.minecraft.block.entity.BlockEntityType(factory,blocks,type); }
// public yarnwrap.block.entity.BlockEntityType create(java.lang.String id,Object builder) { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.create(id,builder)); }
// public static yarnwrap.block.entity.BlockEntityType create(java.lang.String id,Object builder, ) { return new yarnwrap.block.entity.BlockEntityType(net.minecraft.block.entity.BlockEntityType.create(id,builder)); }
public yarnwrap.block.entity.BlockEntity instantiate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.instantiate(pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.entity.BlockEntity instantiate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.entity.BlockEntityType.instantiate(pos.wrapperContained,state.wrapperContained)); }
// public yarnwrap.util.Identifier getId(yarnwrap.block.entity.BlockEntityType type) { return new yarnwrap.util.Identifier(wrapperContained.getId(type.wrapperContained)); }
// public static yarnwrap.util.Identifier getId(yarnwrap.block.entity.BlockEntityType type, ) { return new yarnwrap.util.Identifier(net.minecraft.block.entity.BlockEntityType.getId(type.wrapperContained)); }
public boolean supports(yarnwrap.block.BlockState state) { return wrapperContained.supports(state.wrapperContained); }
// public static boolean supports(yarnwrap.block.BlockState state, ) { return net.minecraft.block.entity.BlockEntityType.supports(state.wrapperContained); }
public yarnwrap.block.entity.BlockEntity get(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.get(world.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.entity.BlockEntity get(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.entity.BlockEntity(net.minecraft.block.entity.BlockEntityType.get(world.wrapperContained,pos.wrapperContained)); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }
// public static Object getRegistryEntry() { return net.minecraft.block.entity.BlockEntityType.getRegistryEntry(); }

}