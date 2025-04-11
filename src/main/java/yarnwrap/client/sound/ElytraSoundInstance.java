package yarnwrap.client.sound;
public class ElytraSoundInstance { public net.minecraft.client.sound.ElytraSoundInstance wrapperContained; public ElytraSoundInstance(net.minecraft.client.sound.ElytraSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayerEntity player() { return new yarnwrap.client.network.ClientPlayerEntity(wrapperContained.player); }
// public void player(yarnwrap.client.network.ClientPlayerEntity value) { wrapperContained.player = value.wrapperContained; }
// public int tickCount() { return wrapperContained.tickCount; }
// public void tickCount(int value) { wrapperContained.tickCount = value; }

}