package yarnwrap.block.entity;
public class SculkSpreadManager { public net.minecraft.block.entity.SculkSpreadManager wrapperContained; public SculkSpreadManager(net.minecraft.block.entity.SculkSpreadManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_CHARGE() { return wrapperContained.MAX_CHARGE; }
// public void MAX_CHARGE(int value) { wrapperContained.MAX_CHARGE = value; }
public static int MAX_CHARGE() { return net.minecraft.block.entity.SculkSpreadManager.MAX_CHARGE; }
// public static void MAX_CHARGE(int value, ) { net.minecraft.block.entity.SculkSpreadManager.MAX_CHARGE = value; }

// public int MAX_CURSORS() { return wrapperContained.MAX_CURSORS; }
// public void MAX_CURSORS(int value) { wrapperContained.MAX_CURSORS = value; }
// public static int MAX_CURSORS() { return net.minecraft.block.entity.SculkSpreadManager.MAX_CURSORS; }
// public static void MAX_CURSORS(int value, ) { net.minecraft.block.entity.SculkSpreadManager.MAX_CURSORS = value; }

// public boolean worldGen() { return wrapperContained.worldGen; }
// public void worldGen(boolean value) { wrapperContained.worldGen = value; }
// public static boolean worldGen() { return net.minecraft.block.entity.SculkSpreadManager.worldGen; }
// public static void worldGen(boolean value, ) { net.minecraft.block.entity.SculkSpreadManager.worldGen = value; }

// public yarnwrap.registry.tag.TagKey replaceableTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.replaceableTag); }
// public void replaceableTag(yarnwrap.registry.tag.TagKey value) { wrapperContained.replaceableTag = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey replaceableTag() { return new yarnwrap.registry.tag.TagKey(net.minecraft.block.entity.SculkSpreadManager.replaceableTag); }
// public static void replaceableTag(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.block.entity.SculkSpreadManager.replaceableTag = value.wrapperContained; }

// public int extraBlockChance() { return wrapperContained.extraBlockChance; }
// public void extraBlockChance(int value) { wrapperContained.extraBlockChance = value; }
// public static int extraBlockChance() { return net.minecraft.block.entity.SculkSpreadManager.extraBlockChance; }
// public static void extraBlockChance(int value, ) { net.minecraft.block.entity.SculkSpreadManager.extraBlockChance = value; }

// public int maxDistance() { return wrapperContained.maxDistance; }
// public void maxDistance(int value) { wrapperContained.maxDistance = value; }
// public static int maxDistance() { return net.minecraft.block.entity.SculkSpreadManager.maxDistance; }
// public static void maxDistance(int value, ) { net.minecraft.block.entity.SculkSpreadManager.maxDistance = value; }

// public int spreadChance() { return wrapperContained.spreadChance; }
// public void spreadChance(int value) { wrapperContained.spreadChance = value; }
// public static int spreadChance() { return net.minecraft.block.entity.SculkSpreadManager.spreadChance; }
// public static void spreadChance(int value, ) { net.minecraft.block.entity.SculkSpreadManager.spreadChance = value; }

// public int decayChance() { return wrapperContained.decayChance; }
// public void decayChance(int value) { wrapperContained.decayChance = value; }
// public static int decayChance() { return net.minecraft.block.entity.SculkSpreadManager.decayChance; }
// public static void decayChance(int value, ) { net.minecraft.block.entity.SculkSpreadManager.decayChance = value; }

// public java.util.List cursors() { return wrapperContained.cursors; }
// public void cursors(java.util.List value) { wrapperContained.cursors = value; }
// public static java.util.List cursors() { return net.minecraft.block.entity.SculkSpreadManager.cursors; }
// public static void cursors(java.util.List value, ) { net.minecraft.block.entity.SculkSpreadManager.cursors = value; }

// public int MAX_CURSOR_DISTANCE() { return wrapperContained.MAX_CURSOR_DISTANCE; }
// public void MAX_CURSOR_DISTANCE(int value) { wrapperContained.MAX_CURSOR_DISTANCE = value; }
public static int MAX_CURSOR_DISTANCE() { return net.minecraft.block.entity.SculkSpreadManager.MAX_CURSOR_DISTANCE; }
// public static void MAX_CURSOR_DISTANCE(int value, ) { net.minecraft.block.entity.SculkSpreadManager.MAX_CURSOR_DISTANCE = value; }

public SculkSpreadManager(boolean worldGen,yarnwrap.registry.tag.TagKey replaceableTag,int extraBlockChance,int maxDistance,int spreadChance,int decayChance) { this.wrapperContained = new net.minecraft.block.entity.SculkSpreadManager(worldGen,replaceableTag.wrapperContained,extraBlockChance,maxDistance,spreadChance,decayChance); }
// public yarnwrap.block.entity.SculkSpreadManager create() { return new yarnwrap.block.entity.SculkSpreadManager(wrapperContained.create()); }
public static yarnwrap.block.entity.SculkSpreadManager create() { return new yarnwrap.block.entity.SculkSpreadManager(net.minecraft.block.entity.SculkSpreadManager.create()); }
public void tick(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,boolean shouldConvertToBlock) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,random.wrapperContained,shouldConvertToBlock); }
// public static void tick(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,boolean shouldConvertToBlock, ) { net.minecraft.block.entity.SculkSpreadManager.tick(world.wrapperContained,pos.wrapperContained,random.wrapperContained,shouldConvertToBlock); }
// public void addCursor(Object cursor) { wrapperContained.addCursor(cursor); }
// public static void addCursor(Object cursor, ) { net.minecraft.block.entity.SculkSpreadManager.addCursor(cursor); }
// public java.lang.Integer method_41481(Object posx,yarnwrap.util.math.BlockPos charge) { return wrapperContained.method_41481(posx,charge.wrapperContained); }
// public static java.lang.Integer method_41481(Object posx,yarnwrap.util.math.BlockPos charge, ) { return net.minecraft.block.entity.SculkSpreadManager.method_41481(posx,charge.wrapperContained); }
public void spread(yarnwrap.util.math.BlockPos pos,int charge) { wrapperContained.spread(pos.wrapperContained,charge); }
// public static void spread(yarnwrap.util.math.BlockPos pos,int charge, ) { net.minecraft.block.entity.SculkSpreadManager.spread(pos.wrapperContained,charge); }
// public void readData(yarnwrap.storage.ReadView view) { wrapperContained.readData(view.wrapperContained); }
// public static void readData(yarnwrap.storage.ReadView view, ) { net.minecraft.block.entity.SculkSpreadManager.readData(view.wrapperContained); }
// public yarnwrap.block.entity.SculkSpreadManager createWorldGen() { return new yarnwrap.block.entity.SculkSpreadManager(wrapperContained.createWorldGen()); }
public static yarnwrap.block.entity.SculkSpreadManager createWorldGen() { return new yarnwrap.block.entity.SculkSpreadManager(net.minecraft.block.entity.SculkSpreadManager.createWorldGen()); }
// public void writeData(yarnwrap.storage.WriteView view) { wrapperContained.writeData(view.wrapperContained); }
// public static void writeData(yarnwrap.storage.WriteView view, ) { net.minecraft.block.entity.SculkSpreadManager.writeData(view.wrapperContained); }
public yarnwrap.registry.tag.TagKey getReplaceableTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.getReplaceableTag()); }
// public static yarnwrap.registry.tag.TagKey getReplaceableTag() { return new yarnwrap.registry.tag.TagKey(net.minecraft.block.entity.SculkSpreadManager.getReplaceableTag()); }
public int getExtraBlockChance() { return wrapperContained.getExtraBlockChance(); }
// public static int getExtraBlockChance() { return net.minecraft.block.entity.SculkSpreadManager.getExtraBlockChance(); }
public int getMaxDistance() { return wrapperContained.getMaxDistance(); }
// public static int getMaxDistance() { return net.minecraft.block.entity.SculkSpreadManager.getMaxDistance(); }
public int getSpreadChance() { return wrapperContained.getSpreadChance(); }
// public static int getSpreadChance() { return net.minecraft.block.entity.SculkSpreadManager.getSpreadChance(); }
public int getDecayChance() { return wrapperContained.getDecayChance(); }
// public static int getDecayChance() { return net.minecraft.block.entity.SculkSpreadManager.getDecayChance(); }
public boolean isWorldGen() { return wrapperContained.isWorldGen(); }
// public static boolean isWorldGen() { return net.minecraft.block.entity.SculkSpreadManager.isWorldGen(); }
public java.util.List getCursors() { return wrapperContained.getCursors(); }
// public static java.util.List getCursors() { return net.minecraft.block.entity.SculkSpreadManager.getCursors(); }
public void clearCursors() { wrapperContained.clearCursors(); }
// public static void clearCursors() { net.minecraft.block.entity.SculkSpreadManager.clearCursors(); }

}