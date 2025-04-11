package yarnwrap.item;
public class PowderSnowBucketItem { public net.minecraft.item.PowderSnowBucketItem wrapperContained; public PowderSnowBucketItem(net.minecraft.item.PowderSnowBucketItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.sound.SoundEvent placeSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.placeSound); }
// public void placeSound(yarnwrap.sound.SoundEvent value) { wrapperContained.placeSound = value.wrapperContained; }
// public PowderSnowBucketItem(yarnwrap.block.Block block,yarnwrap.sound.SoundEvent placeSound,Object settings) { this.wrapperContained = new net.minecraft.item.PowderSnowBucketItem(block.wrapperContained,placeSound.wrapperContained,settings); }

}