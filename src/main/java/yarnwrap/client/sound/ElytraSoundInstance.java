package yarnwrap.client.sound;
public class ElytraSoundInstance { public net.minecraft.client.sound.ElytraSoundInstance wrapperContained; public ElytraSoundInstance(net.minecraft.client.sound.ElytraSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(net.minecraft.client.sound.ElytraSoundInstance.player); }
// public static void player(yarnwrap.client.network.ClientPlayerEntity value, ) { net.minecraft.client.sound.ElytraSoundInstance.player = value.wrapperContained; }

// public int tickCount() { return wrapperContained.tickCount; }
// public void tickCount(int value) { wrapperContained.tickCount = value; }
// public static int tickCount() { return net.minecraft.client.sound.ElytraSoundInstance.tickCount; }
// public static void tickCount(int value, ) { net.minecraft.client.sound.ElytraSoundInstance.tickCount = value; }

public ElytraSoundInstance(yarnwrap.client.network.ClientPlayerEntity player) { this.wrapperContained = new net.minecraft.client.sound.ElytraSoundInstance(player.wrapperContained); }

}