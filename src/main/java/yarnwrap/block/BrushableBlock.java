package yarnwrap.block;
public class BrushableBlock { public net.minecraft.block.BrushableBlock wrapperContained; public BrushableBlock(net.minecraft.block.BrushableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.IntProperty DUSTED() { return new yarnwrap.state.property.IntProperty(wrapperContained.DUSTED); }
// public void DUSTED(yarnwrap.state.property.IntProperty value) { wrapperContained.DUSTED = value.wrapperContained; }
// public yarnwrap.block.Block baseBlock() { return new yarnwrap.block.Block(wrapperContained.baseBlock); }
// public void baseBlock(yarnwrap.block.Block value) { wrapperContained.baseBlock = value.wrapperContained; }
// public yarnwrap.sound.SoundEvent brushingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.brushingSound); }
// public void brushingSound(yarnwrap.sound.SoundEvent value) { wrapperContained.brushingSound = value.wrapperContained; }
// public yarnwrap.sound.SoundEvent brushingCompleteSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.brushingCompleteSound); }
// public void brushingCompleteSound(yarnwrap.sound.SoundEvent value) { wrapperContained.brushingCompleteSound = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public BrushableBlock(yarnwrap.block.Block baseBlock,yarnwrap.sound.SoundEvent brushingSound,yarnwrap.sound.SoundEvent brushingCompleteSound,Object settings) { this.wrapperContained = new net.minecraft.block.BrushableBlock(baseBlock.wrapperContained,brushingSound.wrapperContained,brushingCompleteSound.wrapperContained,settings); }
public yarnwrap.block.Block getBaseBlock() { return new yarnwrap.block.Block(wrapperContained.getBaseBlock()); }
public yarnwrap.sound.SoundEvent getBrushingSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBrushingSound()); }
public yarnwrap.sound.SoundEvent getBrushingCompleteSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBrushingCompleteSound()); }
// public com.mojang.datafixers.kinds.App method_53982(Object instance) { return wrapperContained.method_53982(instance); }

}