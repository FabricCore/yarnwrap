package yarnwrap.world.chunk;
public class ChunkSection { public net.minecraft.world.chunk.ChunkSection wrapperContained; public ChunkSection(net.minecraft.world.chunk.ChunkSection wrapperContained) { this.wrapperContained = wrapperContained; }

// public short nonEmptyBlockCount() { return wrapperContained.nonEmptyBlockCount; }
// public void nonEmptyBlockCount(short value) { wrapperContained.nonEmptyBlockCount = value; }
// public yarnwrap.world.chunk.PalettedContainer blockStateContainer() { return new yarnwrap.world.chunk.PalettedContainer(wrapperContained.blockStateContainer); }
// public void blockStateContainer(yarnwrap.world.chunk.PalettedContainer value) { wrapperContained.blockStateContainer = value.wrapperContained; }
// public short nonEmptyFluidCount() { return wrapperContained.nonEmptyFluidCount; }
// public void nonEmptyFluidCount(short value) { wrapperContained.nonEmptyFluidCount = value; }
// public short randomTickableBlockCount() { return wrapperContained.randomTickableBlockCount; }
// public void randomTickableBlockCount(short value) { wrapperContained.randomTickableBlockCount = value; }
// public yarnwrap.world.chunk.ReadableContainer biomeContainer() { return new yarnwrap.world.chunk.ReadableContainer(wrapperContained.biomeContainer); }
// public void biomeContainer(yarnwrap.world.chunk.ReadableContainer value) { wrapperContained.biomeContainer = value.wrapperContained; }
public ChunkSection(yarnwrap.registry.Registry biomeRegistry) { this.wrapperContained = new net.minecraft.world.chunk.ChunkSection(biomeRegistry.wrapperContained); }
public ChunkSection(yarnwrap.world.chunk.PalettedContainer blockStateContainer,yarnwrap.world.chunk.ReadableContainer biomeContainer) { this.wrapperContained = new net.minecraft.world.chunk.ChunkSection(blockStateContainer.wrapperContained,biomeContainer.wrapperContained); }
public void calculateCounts() { wrapperContained.calculateCounts(); }
public yarnwrap.block.BlockState getBlockState(int x,int y,int z) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(x,y,z)); }
public yarnwrap.fluid.FluidState getFluidState(int x,int y,int z) { return new yarnwrap.fluid.FluidState(wrapperContained.getFluidState(x,y,z)); }
public yarnwrap.block.BlockState setBlockState(int x,int y,int z,yarnwrap.block.BlockState state,boolean lock) { return new yarnwrap.block.BlockState(wrapperContained.setBlockState(x,y,z,state.wrapperContained,lock)); }
public void toPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.toPacket(buf.wrapperContained); }
public void readDataPacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.readDataPacket(buf.wrapperContained); }
public int getPacketSize() { return wrapperContained.getPacketSize(); }
public boolean hasRandomTicks() { return wrapperContained.hasRandomTicks(); }
public boolean hasRandomBlockTicks() { return wrapperContained.hasRandomBlockTicks(); }
public boolean hasRandomFluidTicks() { return wrapperContained.hasRandomFluidTicks(); }
public yarnwrap.world.chunk.PalettedContainer getBlockStateContainer() { return new yarnwrap.world.chunk.PalettedContainer(wrapperContained.getBlockStateContainer()); }
public yarnwrap.block.BlockState setBlockState(int x,int y,int z,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.setBlockState(x,y,z,state.wrapperContained)); }
public void lock() { wrapperContained.lock(); }
public void unlock() { wrapperContained.unlock(); }
public boolean hasAny(java.util.function.Predicate predicate) { return wrapperContained.hasAny(predicate); }
// public void populateBiomes(yarnwrap.world.biome.source.BiomeSupplier biomeSupplier,Object sampler,int x,int y,int z) { wrapperContained.populateBiomes(biomeSupplier.wrapperContained,sampler,x,y,z); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public yarnwrap.registry.entry.RegistryEntry getBiome(int x,int y,int z) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getBiome(x,y,z)); }
public yarnwrap.world.chunk.ReadableContainer getBiomeContainer() { return new yarnwrap.world.chunk.ReadableContainer(wrapperContained.getBiomeContainer()); }
public void readBiomePacket(yarnwrap.network.PacketByteBuf buf) { wrapperContained.readBiomePacket(buf.wrapperContained); }

}