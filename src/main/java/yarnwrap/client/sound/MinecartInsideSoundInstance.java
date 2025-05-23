package yarnwrap.client.sound;
public class MinecartInsideSoundInstance { public net.minecraft.client.sound.MinecartInsideSoundInstance wrapperContained; public MinecartInsideSoundInstance(net.minecraft.client.sound.MinecartInsideSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(wrapperContained.minecart); }
// public void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value) { wrapperContained.minecart = value.wrapperContained; }
// public static yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(net.minecraft.client.sound.MinecartInsideSoundInstance.minecart); }
// public static void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value, ) { net.minecraft.client.sound.MinecartInsideSoundInstance.minecart = value.wrapperContained; }

// public yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.entity.player.PlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.entity.player.PlayerEntity player() { return new yarnwrap.entity.player.PlayerEntity(net.minecraft.client.sound.MinecartInsideSoundInstance.player); }
// public static void player(yarnwrap.entity.player.PlayerEntity value, ) { net.minecraft.client.sound.MinecartInsideSoundInstance.player = value.wrapperContained; }

// public boolean underwater() { return wrapperContained.underwater; }
// public void underwater(boolean value) { wrapperContained.underwater = value; }
// public static boolean underwater() { return net.minecraft.client.sound.MinecartInsideSoundInstance.underwater; }
// public static void underwater(boolean value, ) { net.minecraft.client.sound.MinecartInsideSoundInstance.underwater = value; }

public MinecartInsideSoundInstance(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.vehicle.AbstractMinecartEntity minecart,boolean underwater) { this.wrapperContained = new net.minecraft.client.sound.MinecartInsideSoundInstance(player.wrapperContained,minecart.wrapperContained,underwater); }

}