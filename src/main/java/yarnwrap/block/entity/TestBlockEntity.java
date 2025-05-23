package yarnwrap.block.entity;
public class TestBlockEntity { public net.minecraft.block.entity.TestBlockEntity wrapperContained; public TestBlockEntity(net.minecraft.block.entity.TestBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.block.entity.TestBlockEntity.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.block.entity.TestBlockEntity.LOGGER = value; }

// public yarnwrap.block.enums.TestBlockMode mode() { return new yarnwrap.block.enums.TestBlockMode(wrapperContained.mode); }
// public void mode(yarnwrap.block.enums.TestBlockMode value) { wrapperContained.mode = value.wrapperContained; }
// public static yarnwrap.block.enums.TestBlockMode mode() { return new yarnwrap.block.enums.TestBlockMode(net.minecraft.block.entity.TestBlockEntity.mode); }
// public static void mode(yarnwrap.block.enums.TestBlockMode value, ) { net.minecraft.block.entity.TestBlockEntity.mode = value.wrapperContained; }

// public java.lang.String message() { return wrapperContained.message; }
// public void message(java.lang.String value) { wrapperContained.message = value; }
// public static java.lang.String message() { return net.minecraft.block.entity.TestBlockEntity.message; }
// public static void message(java.lang.String value, ) { net.minecraft.block.entity.TestBlockEntity.message = value; }

// public boolean powered() { return wrapperContained.powered; }
// public void powered(boolean value) { wrapperContained.powered = value; }
// public static boolean powered() { return net.minecraft.block.entity.TestBlockEntity.powered; }
// public static void powered(boolean value, ) { net.minecraft.block.entity.TestBlockEntity.powered = value; }

// public boolean triggered() { return wrapperContained.triggered; }
// public void triggered(boolean value) { wrapperContained.triggered = value; }
// public static boolean triggered() { return net.minecraft.block.entity.TestBlockEntity.triggered; }
// public static void triggered(boolean value, ) { net.minecraft.block.entity.TestBlockEntity.triggered = value; }

// public java.lang.String DEFAULT_MESSAGE() { return wrapperContained.DEFAULT_MESSAGE; }
// public void DEFAULT_MESSAGE(java.lang.String value) { wrapperContained.DEFAULT_MESSAGE = value; }
// public static java.lang.String DEFAULT_MESSAGE() { return net.minecraft.block.entity.TestBlockEntity.DEFAULT_MESSAGE; }
// public static void DEFAULT_MESSAGE(java.lang.String value, ) { net.minecraft.block.entity.TestBlockEntity.DEFAULT_MESSAGE = value; }

// public boolean DEFAULT_POWERED() { return wrapperContained.DEFAULT_POWERED; }
// public void DEFAULT_POWERED(boolean value) { wrapperContained.DEFAULT_POWERED = value; }
// public static boolean DEFAULT_POWERED() { return net.minecraft.block.entity.TestBlockEntity.DEFAULT_POWERED; }
// public static void DEFAULT_POWERED(boolean value, ) { net.minecraft.block.entity.TestBlockEntity.DEFAULT_POWERED = value; }

public TestBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.TestBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setMode(yarnwrap.block.enums.TestBlockMode mode) { wrapperContained.setMode(mode.wrapperContained); }
// public static void setMode(yarnwrap.block.enums.TestBlockMode mode, ) { net.minecraft.block.entity.TestBlockEntity.setMode(mode.wrapperContained); }
public void setMessage(java.lang.String message) { wrapperContained.setMessage(message); }
// public static void setMessage(java.lang.String message, ) { net.minecraft.block.entity.TestBlockEntity.setMessage(message); }
public void setPowered(boolean powered) { wrapperContained.setPowered(powered); }
// public static void setPowered(boolean powered, ) { net.minecraft.block.entity.TestBlockEntity.setPowered(powered); }
public boolean isPowered() { return wrapperContained.isPowered(); }
// public static boolean isPowered() { return net.minecraft.block.entity.TestBlockEntity.isPowered(); }
public yarnwrap.block.enums.TestBlockMode getMode() { return new yarnwrap.block.enums.TestBlockMode(wrapperContained.getMode()); }
// public static yarnwrap.block.enums.TestBlockMode getMode() { return new yarnwrap.block.enums.TestBlockMode(net.minecraft.block.entity.TestBlockEntity.getMode()); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.block.entity.TestBlockEntity.reset(); }
public void trigger() { wrapperContained.trigger(); }
// public static void trigger() { net.minecraft.block.entity.TestBlockEntity.trigger(); }
public void logMessage() { wrapperContained.logMessage(); }
// public static void logMessage() { net.minecraft.block.entity.TestBlockEntity.logMessage(); }
public boolean hasTriggered() { return wrapperContained.hasTriggered(); }
// public static boolean hasTriggered() { return net.minecraft.block.entity.TestBlockEntity.hasTriggered(); }
public java.lang.String getMessage() { return wrapperContained.getMessage(); }
// public static java.lang.String getMessage() { return net.minecraft.block.entity.TestBlockEntity.getMessage(); }
// public void update() { wrapperContained.update(); }
// public static void update() { net.minecraft.block.entity.TestBlockEntity.update(); }
// public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
// public static yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(net.minecraft.block.entity.TestBlockEntity.getBlock()); }

}