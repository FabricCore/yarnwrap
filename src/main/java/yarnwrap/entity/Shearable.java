package yarnwrap.entity;
public class Shearable { public net.minecraft.entity.Shearable wrapperContained; public Shearable(net.minecraft.entity.Shearable wrapperContained) { this.wrapperContained = wrapperContained; }

public void sheared(yarnwrap.server.world.ServerWorld world,yarnwrap.sound.SoundCategory shearedSoundCategory,yarnwrap.item.ItemStack shears) { wrapperContained.sheared(world.wrapperContained,shearedSoundCategory.wrapperContained,shears.wrapperContained); }
// public static void sheared(yarnwrap.server.world.ServerWorld world,yarnwrap.sound.SoundCategory shearedSoundCategory,yarnwrap.item.ItemStack shears, ) { net.minecraft.entity.Shearable.sheared(world.wrapperContained,shearedSoundCategory.wrapperContained,shears.wrapperContained); }
public boolean isShearable() { return wrapperContained.isShearable(); }
// public static boolean isShearable() { return net.minecraft.entity.Shearable.isShearable(); }

}