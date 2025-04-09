package yarnwrap.client.util;
public class ClientPlayerTickable { public net.minecraft.client.util.ClientPlayerTickable wrapperContained; public ClientPlayerTickable(net.minecraft.client.util.ClientPlayerTickable wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick() { wrapperContained.tick(); }

}