package yarnwrap.client.sound;
public class MovingMinecartSoundInstance { public net.minecraft.client.sound.MovingMinecartSoundInstance wrapperContained; public MovingMinecartSoundInstance(net.minecraft.client.sound.MovingMinecartSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.vehicle.AbstractMinecartEntity minecart() { return new yarnwrap.entity.vehicle.AbstractMinecartEntity(wrapperContained.minecart); }
// public void minecart(yarnwrap.entity.vehicle.AbstractMinecartEntity value) { wrapperContained.minecart = value.wrapperContained; }
// public float distance() { return wrapperContained.distance; }
// public void distance(float value) { wrapperContained.distance = value; }
public MovingMinecartSoundInstance(yarnwrap.entity.vehicle.AbstractMinecartEntity minecart) { this.wrapperContained = new net.minecraft.client.sound.MovingMinecartSoundInstance(minecart.wrapperContained); }

}