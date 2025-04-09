package yarnwrap.block.entity;
public class SculkSpreadManager { public net.minecraft.block.entity.SculkSpreadManager wrapperContained; public SculkSpreadManager(net.minecraft.block.entity.SculkSpreadManager wrapperContained) { this.wrapperContained = wrapperContained; }

public int MAX_CHARGE() { return wrapperContained.MAX_CHARGE; }
// public int MAX_CURSORS() { return wrapperContained.MAX_CURSORS; }
// public boolean worldGen() { return wrapperContained.worldGen; }
// public yarnwrap.registry.tag.TagKey replaceableTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.replaceableTag); }
// public int extraBlockChance() { return wrapperContained.extraBlockChance; }
// public int maxDistance() { return wrapperContained.maxDistance; }
// public int spreadChance() { return wrapperContained.spreadChance; }
// public int decayChance() { return wrapperContained.decayChance; }
// public java.util.List cursors() { return wrapperContained.cursors; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.block.entity.SculkSpreadManager create() { return new yarnwrap.block.entity.SculkSpreadManager(wrapperContained.create()); }
public void tick(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,boolean shouldConvertToBlock) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,random.wrapperContained,shouldConvertToBlock); }
// public void addCursor(Object cursor) { wrapperContained.addCursor(cursor); }
public void spread(yarnwrap.util.math.BlockPos pos,int charge) { wrapperContained.spread(pos.wrapperContained,charge); }
public void readNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readNbt(nbt.wrapperContained); }
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