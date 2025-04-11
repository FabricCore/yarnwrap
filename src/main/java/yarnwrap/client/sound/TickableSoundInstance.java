package yarnwrap.client.sound;
public class TickableSoundInstance { public net.minecraft.client.sound.TickableSoundInstance wrapperContained; public TickableSoundInstance(net.minecraft.client.sound.TickableSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick() { wrapperContained.tick(); }
public boolean isDone() { return wrapperContained.isDone(); }

}