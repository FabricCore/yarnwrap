package yarnwrap.client.gui.hud;
public class ClientBossBar { public net.minecraft.client.gui.hud.ClientBossBar wrapperContained; public ClientBossBar(net.minecraft.client.gui.hud.ClientBossBar wrapperContained) { this.wrapperContained = wrapperContained; }

// public long timeHealthSet() { return wrapperContained.timeHealthSet; }
// public void timeHealthSet(long value) { wrapperContained.timeHealthSet = value; }
// public float healthLatest() { return wrapperContained.healthLatest; }
// public void healthLatest(float value) { wrapperContained.healthLatest = value; }
// public long HEALTH_CHANGE_ANIMATION_MS() { return wrapperContained.HEALTH_CHANGE_ANIMATION_MS; }
// public void HEALTH_CHANGE_ANIMATION_MS(long value) { wrapperContained.HEALTH_CHANGE_ANIMATION_MS = value; }

}