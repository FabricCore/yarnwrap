package yarnwrap.entity;
public class Saddleable { public net.minecraft.entity.Saddleable wrapperContained; public Saddleable(net.minecraft.entity.Saddleable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.sound.SoundEvent getSaddleSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getSaddleSound()); }
// public static yarnwrap.sound.SoundEvent getSaddleSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.Saddleable.getSaddleSound()); }
public void saddle(yarnwrap.item.ItemStack stack,yarnwrap.sound.SoundCategory soundCategory) { wrapperContained.saddle(stack.wrapperContained,soundCategory.wrapperContained); }
// public static void saddle(yarnwrap.item.ItemStack stack,yarnwrap.sound.SoundCategory soundCategory, ) { net.minecraft.entity.Saddleable.saddle(stack.wrapperContained,soundCategory.wrapperContained); }
public boolean isSaddled() { return wrapperContained.isSaddled(); }
// public static boolean isSaddled() { return net.minecraft.entity.Saddleable.isSaddled(); }
public boolean canBeSaddled() { return wrapperContained.canBeSaddled(); }
// public static boolean canBeSaddled() { return net.minecraft.entity.Saddleable.canBeSaddled(); }

}