package yarnwrap.client.realms.task;
public class ResettingWorldTask { public net.minecraft.client.realms.task.ResettingWorldTask wrapperContained; public ResettingWorldTask(net.minecraft.client.realms.task.ResettingWorldTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long serverId() { return wrapperContained.serverId; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public java.lang.Runnable callback() { return wrapperContained.callback; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void resetWorld(yarnwrap.client.realms.RealmsClient client,long worldId) { wrapperContained.resetWorld(client.wrapperContained,worldId); }

}