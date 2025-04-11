package yarnwrap.block.entity;
public class SculkSpreadManager { public net.minecraft.block.entity.SculkSpreadManager wrapperContained; public SculkSpreadManager(net.minecraft.block.entity.SculkSpreadManager wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_CHARGE() { return wrapperContained.MAX_CHARGE; }
// public void MAX_CHARGE(int value) { wrapperContained.MAX_CHARGE = value; }
// public int MAX_CURSORS() { return wrapperContained.MAX_CURSORS; }
// public void MAX_CURSORS(int value) { wrapperContained.MAX_CURSORS = value; }
// public boolean worldGen() { return wrapperContained.worldGen; }
// public void worldGen(boolean value) { wrapperContained.worldGen = value; }
// public yarnwrap.registry.tag.TagKey replaceableTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.replaceableTag); }
// public void replaceableTag(yarnwrap.registry.tag.TagKey value) { wrapperContained.replaceableTag = value.wrapperContained; }
// public int extraBlockChance() { return wrapperContained.extraBlockChance; }
// public void extraBlockChance(int value) { wrapperContained.extraBlockChance = value; }
// public int maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(int value) { wrapperContained.maxDistance = value; }
// public int spreadChance() { return wrapperContained.spreadChance; }
// public void spreadChance(int value) { wrapperContained.spreadChance = value; }
// public int decayChance() { return wrapperContained.decayChance; }
// public void decayChance(int value) { wrapperContained.decayChance = value; }
// public java.util.List cursors() { return wrapperContained.cursors; }
// public void cursors(java.util.List value) { wrapperContained.cursors = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public SculkSpreadManager(boolean worldGen,yarnwrap.registry.tag.TagKey replaceableTag,int extraBlockChance,int maxDistance,int spreadChance,int decayChance) { this.wrapperContained = new net.minecraft.block.entity.SculkSpreadManager(worldGen,replaceableTag.wrapperContained,extraBlockChance,maxDistance,spreadChance,decayChance); }
public yarnwrap.block.entity.SculkSpreadManager create() { return new yarnwrap.block.entity.SculkSpreadManager(wrapperContained.create()); }
public void tick(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,boolean shouldConvertToBlock) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,random.wrapperContained,shouldConvertToBlock); }
// public void addCursor(Object cursor) { wrapperContained.addCursor(cursor); }
// public java.lang.Integer method_41481(Object posx,yarnwrap.util.math.BlockPos charge) { return wrapperContained.method_41481(posx,charge.wrapperContained); }
public void spread(yarnwrap.util.math.BlockPos pos,int charge) { wrapperContained.spread(pos.wrapperContained,charge); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
// public void method_41484(yarnwrap.nbt.NbtCompound cursorsNbt) { wrapperContained.method_41484(cursorsNbt.wrapperContained); }
public yarnwrap.block.entity.SculkSpreadManager createWorldGen() { return new yarnwrap.block.entity.SculkSpreadManager(wrapperContained.createWorldGen()); }
public void writeNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.writeNbt(nbt.wrapperContained); }
public yarnwrap.registry.tag.TagKey getReplaceableTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.getReplaceableTag()); }
public int getExtraBlockChance() { return wrapperContained.getExtraBlockChance(); }
public int getMaxDistance() { return wrapperContained.getMaxDistance(); }
public int getSpreadChance() { return wrapperContained.getSpreadChance(); }
public int getDecayChance() { return wrapperContained.getDecayChance(); }
public boolean isWorldGen() { return wrapperContained.isWorldGen(); }
public java.util.List getCursors() { return wrapperContained.getCursors(); }
public void clearCursors() { wrapperContained.clearCursors(); }

}