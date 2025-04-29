package yarnwrap.client.sound;
public class MovingMinecartSoundInstance { public net.minecraft.client.sound.MovingMinecartSoundInstance wrapperContained; public MovingMinecartSoundInstance(net.minecraft.client.sound.MovingMinecartSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(wrapperContained.minecart); }
// public void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value) { wrapperContained.minecart = value.wrapperContained; }
// public static yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(net.minecraft.client.sound.MovingMinecartSoundInstance.minecart); }
// public static void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value, ) { net.minecraft.client.sound.MovingMinecartSoundInstance.minecart = value.wrapperContained; }

// public float distance() { return wrapperContained.distance; }
// public void distance(float value) { wrapperContained.distance = value; }
// public static float distance() { return net.minecraft.client.sound.MovingMinecartSoundInstance.distance; }
// public static void distance(float value, ) { net.minecraft.client.sound.MovingMinecartSoundInstance.distance = value; }

public MovingMinecartSoundInstance(yarnwrap.entity.vehicle.AbstractMinecartEntity minecart) { this.wrapperContained = new net.minecraft.client.sound.MovingMinecartSoundInstance(minecart.wrapperContained); }

}