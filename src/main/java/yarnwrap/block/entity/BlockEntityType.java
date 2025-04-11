package yarnwrap.block.entity;
public class BlockEntityType { public net.minecraft.block.entity.BlockEntityType wrapperContained; public BlockEntityType(net.minecraft.block.entity.BlockEntityType wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object factory() { return wrapperContained.factory; }
// // public void factory(Object value) { wrapperContained.factory = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public com.mojang.datafixers.types.Type type() { return wrapperContained.type; }
// public void type(com.mojang.datafixers.types.Type value) { wrapperContained.type = value; }
// public java.util.Set blocks() { return wrapperContained.blocks; }
// public void blocks(java.util.Set value) { wrapperContained.blocks = value; }
// public Object registryEntry() { return wrapperContained.registryEntry; }
// // public void registryEntry(Object value) { wrapperContained.registryEntry = value; }
// public BlockEntityType(Object factory,java.util.Set blocks,com.mojang.datafixers.types.Type type) { this.wrapperContained = new net.minecraft.block.entity.BlockEntityType(factory,blocks,type); }
// public yarnwrap.block.entity.BlockEntityType create(java.lang.String id,Object builder) { return new yarnwrap.block.entity.BlockEntityType(wrapperContained.create(id,builder)); }
public yarnwrap.block.entity.BlockEntity instantiate(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.instantiate(pos.wrapperContained,state.wrapperContained)); }
public yarnwrap.util.Identifier getId(yarnwrap.block.entity.BlockEntityType type) { return new yarnwrap.util.Identifier(wrapperContained.getId(type.wrapperContained)); }
public boolean supports(yarnwrap.block.BlockState state) { return wrapperContained.supports(state.wrapperContained); }
public yarnwrap.block.entity.BlockEntity get(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.get(world.wrapperContained,pos.wrapperContained)); }
public Object getRegistryEntry() { return wrapperContained.getRegistryEntry(); }

}